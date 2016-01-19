package com.m4thg33k.m4ththings.blocks.tanks;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.Utility.ChatHelper;
import com.m4thg33k.m4ththings.api.block.IDismantleable;
import com.m4thg33k.m4ththings.api.item.IToolHammer;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidContainerItem;

import java.util.ArrayList;
import java.util.List;

public class BlockBaseTank extends Block implements ITileEntityProvider, IDismantleable {

    public static final String blockName = "blockBaseTank";

    public BlockBaseTank(Material material)
    {
        super(material);
        setHardness(2.0F);
        setResistance(5.0F);
        setUnlocalizedName(blockName);
        setStepSound(Blocks.glass.stepSound);
        setHarvestLevel("pickaxe",2);
        setCreativeTab(M4thThings.mainM4thTab);
    }

    public String getBlockName()
    {
        return blockName;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileBaseTank();
    }

    @Override
    public boolean isBlockNormalCube() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean isFullBlock() {
        return false;
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean isNormalCube() {
        return false;
    }

    @Override
    public boolean isLadder(IBlockAccess world, BlockPos pos, EntityLivingBase entity) {
        return true;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) {
        this.setBlockBounds(0.333f,0,0.333f,0.667f,1,0.667f);
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        TileEntity tileEntity = world.getTileEntity(pos);

        if (tileEntity != null && tileEntity instanceof TileBaseTank)
        {
            TileBaseTank tank = (TileBaseTank)tileEntity;

            NBTTagCompound tagCompound = new NBTTagCompound();
            tank.writeAllButLocationToNBT(tagCompound);

            ItemStack ret = new ItemStack(world.getBlockState(pos).getBlock(),1,getMetaFromState(state));

            if (!tagCompound.hasKey("Empty"))
            {
                ret.setTagCompound(tagCompound);
                ret.getTagCompound().setInteger("Mode",0);
            }

            List<ItemStack> stacks = new ArrayList<ItemStack>();
            stacks.add(ret);
            return stacks;
        }

        return super.getDrops(world,pos, state, fortune);
    }

    @Override
    public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        return willHarvest || super.removedByPlayer(world, pos, player, false);
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
        super.harvestBlock(worldIn, player, pos, state, te);
        worldIn.setBlockToAir(pos);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);

        if (tileEntity!=null && tileEntity instanceof TileBaseTank && stack.hasTagCompound())
        {
            tileEntity.readFromNBT(stack.getTagCompound());
        }

        //if the block above this one is another BlockBaseTank, we should set it to drain mode
        TileEntity tEnt = worldIn.getTileEntity(pos.up());
        if (tEnt != null && tEnt instanceof TileBaseTank)
        {
            ((TileBaseTank)tEnt).setMode(1);
        }

        //if the block below the placed one is another BlockBaseTank, we should set this one to drain mode
        Block below = worldIn.getBlockState(pos.down()).getBlock();
        if (below!=null && below instanceof BlockBaseTank && tileEntity!=null && tileEntity instanceof TileBaseTank)
        {
            ((TileBaseTank)tileEntity).setMode(1);
        }
    }

    @Override
    public List<ItemStack> dismantleBlock(EntityPlayer player, World world, BlockPos blockPos, boolean bool) {

        List<ItemStack> ret = this.getDrops(world,blockPos,world.getBlockState(blockPos),0);

        world.removeTileEntity(blockPos);
        world.setBlockToAir(blockPos);

        for (ItemStack stack : ret)
        {
            EntityItem entityItem = new EntityItem(world, blockPos.getX() + 0.5f, blockPos.getY() + 0.5f, blockPos.getZ() + 0.5f, stack);
            float f = 0.05f;
            entityItem.motionX = (double)((float)world.rand.nextGaussian() * f);
            entityItem.motionY = (double)((float)world.rand.nextGaussian() * f + 0.2f);
            entityItem.motionZ = (double)((float)world.rand.nextGaussian() * f);

            world.spawnEntityInWorld(entityItem);
        }

        return ret;
    }

    @Override
    public boolean canDismantle(EntityPlayer player, World world, BlockPos blockPos) {
        return true;
    }

    @Override
    public int getRenderType() {
        return super.getRenderType();
//        return -1;
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {

        if (world.isRemote)
        {
            return true;
        }

        ItemStack held = player.getHeldItem();
        FluidStack fluidHeld = FluidContainerRegistry.getFluidForFilledItem(held);
        TileEntity tileEntity = world.getTileEntity(pos);

        if (held!=null && held.stackSize==1 && held.getItem() instanceof IFluidContainerItem && tileEntity != null && tileEntity instanceof  TileBaseTank)
        {
            IFluidContainerItem fluidItem = (IFluidContainerItem)held.getItem();
            if (((TileBaseTank)tileEntity).fill(null,fluidItem.getFluid(held),false) >= 1000)
            {
                ((TileBaseTank)tileEntity).fill(null,new FluidStack(fluidItem.getFluid(held),1000),true);
                fluidItem.drain(held,1000,true);
                return true;
            }
            else
            {
                FluidStack inTank = ((TileBaseTank)tileEntity).drain(null,1000,false);
                if ((fluidItem.getFluid(held)==null || fluidItem.getFluid(held).amount==0) && fluidItem.getCapacity(held)>=1000 && inTank!=null && inTank.amount >= 1000)
                {
                    fluidItem.fill(held,((TileBaseTank)tileEntity).drain(null,1000,true),true);
                    return true;
                }
            }
            return true;
        }

        if (fluidHeld != null && tileEntity != null && tileEntity instanceof TileBaseTank)
        {
            TileBaseTank tank = (TileBaseTank)tileEntity;
            if (tank.fill(null, fluidHeld,false)==fluidHeld.amount)
            {
                tank.fill(null,fluidHeld,true);

                if (!player.capabilities.isCreativeMode && FluidContainerRegistry.isBucket(held))
                {
                    int heldLocation = player.inventory.currentItem;
                    player.inventory.decrStackSize(heldLocation,1);
                    world.spawnEntityInWorld(new EntityItem(world,player.posX,player.posY,player.posZ,new ItemStack(Items.bucket,1)));
                }
                //else cry
            }
            return true;
        }

        if (held!=null && held.getItem() == Items.bucket && tileEntity instanceof  TileBaseTank)
        {
            TileBaseTank tank = (TileBaseTank)tileEntity;
            if (tank.getPercentFilled()==0)
            {
                return false;
            }
            if (tank.drain(null,1000,false).amount != 1000)
            {
                return true;
            }
            FluidStack toFill = tank.drain(null,1000,true);
            if (!player.capabilities.isCreativeMode)
            {
                ItemStack filledBucket = FluidContainerRegistry.fillFluidContainer(toFill, new ItemStack(Items.bucket,1));
                player.inventory.decrStackSize(player.inventory.currentItem,1);
                world.spawnEntityInWorld(new EntityItem(world,player.posX,player.posY,player.posZ,filledBucket));
            }
            return true;
        }

        if (held!=null && held.getItem() instanceof IToolHammer & ((IToolHammer)held.getItem()).isUsable(held,player,pos.getX(),pos.getY(),pos.getZ()) && !player.isSneaking() && tileEntity instanceof TileBaseTank)
        {
            ((TileBaseTank)tileEntity).switchMode(this.amAdvanced());
            int mode = ((TileBaseTank) tileEntity).getMode();

            displayMode(world,player,mode);
            return true;
        }

        if (held==null && tileEntity instanceof TileBaseTank)
        {
            int mode;
            if (player.isSneaking())
            {
                mode = ((TileBaseTank)tileEntity).switchMode(false);
            }
            else
            {
                mode = ((TileBaseTank) tileEntity).getMode();
                int amount = ((TileBaseTank) tileEntity).getAmount();
                if (amount > 0)
                {
                    FluidStack fluidStack = ((TileBaseTank) tileEntity).getFluid();
                    ChatHelper.sayMessage(world,player,fluidStack.getLocalizedName() + ": " + amount + "/" + ((TileBaseTank) tileEntity).getCap() + "mb");
                }
                else
                {
                    ChatHelper.sayMessage(world,player,"The tank is empty!");
                }
            }
            displayMode(world,player,mode);
            return true;
        }

        return false;
    }

    public void displayMode(World world, EntityPlayer player, int mode)
    {
        String message;
        switch (mode)
        {
            case 1:
                message = "drain";
                break;
            case 2:
                message = "place";
                break;
            default:
                message = "default";
        }
        ChatHelper.sayMessage(world,player,"Currently in " + message + " mode");
    }

    public boolean amAdvanced()
    {
        return false;
    }
}
