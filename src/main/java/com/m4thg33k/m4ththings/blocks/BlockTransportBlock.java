package com.m4thg33k.m4ththings.blocks;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.api.block.IDismantleable;
import com.m4thg33k.m4ththings.api.item.IToolHammer;
import com.m4thg33k.m4ththings.init.ModBlocks;
import com.m4thg33k.m4ththings.interfaces.IM4thTransportBlock;
import com.m4thg33k.m4ththings.items.ItemWrench;
import com.m4thg33k.m4ththings.tiles.TileTransportBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockTransportBlock extends Block implements ITileEntityProvider, IDismantleable {

    public BlockTransportBlock(Material material)
    {
        super(material);
        setHardness(0.5f);
        setResistance(0.5f);
        //setBlockName(NameHelper.blockItemName("blockTransportBlock"));
        setUnlocalizedName("blockTransportBlock");
        setBlockUnbreakable();
        setCreativeTab(M4thThings.mainM4thTab);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileTransportBlock();
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
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return false;
    }

    @Override
    public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List<AxisAlignedBB> list, Entity collidingEntity) {
        if (collidingEntity instanceof EntityPlayer && ((EntityPlayer)collidingEntity).getHeldItem() != null && (((EntityPlayer)collidingEntity).getHeldItem().getItem() instanceof IToolHammer))
        {
            super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state) {
        if (!world.isRemote)
        {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            if (player.getHeldItem()==null)
            {
                return AxisAlignedBB.fromBounds(0,0,0,0,0,0);
            }
            else
            {
                return super.getCollisionBoundingBox(world, pos, state);
            }
        }
        return super.getCollisionBoundingBox(world, pos, state);
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBox(World world, BlockPos pos) {
        ItemStack held = Minecraft.getMinecraft().thePlayer.getHeldItem();
        if (held!=null && (held.getItem() instanceof IToolHammer || held.getItem() == Item.getItemFromBlock(ModBlocks.blockTransportBlock)))
        {
            return super.getSelectedBoundingBox(world, pos);
        }
        return AxisAlignedBB.fromBounds(0,0,0,0,0,0);
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) {
        this.setBlockBounds(0.45f,0.45f,0.45f,0.55f,0.55f,0.55f);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (world.isRemote)
        {
            return true;
        }
        ItemStack held = player.getHeldItem();
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity != null && tileEntity instanceof TileTransportBlock && held!=null && held.getItem() !=null && held.getItem() instanceof IToolHammer)
        {
            if (held.getItem() instanceof ItemWrench && held.getItemDamage()==1)
            {
                ((TileTransportBlock) tileEntity).toggleConnection(side.getOpposite(),true);
            }
            else
            {
                ((TileTransportBlock) tileEntity).toggleConnection(side,true);
            }
        }
        return true;
    }
//
//    @Override
//    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer entityPlayer) {
//        //entityPlayer.rayTrace(30,0.1f).sideHit
//        this.onBlockActivated(world,x,y,z,entityPlayer,ForgeDirection.VALID_DIRECTIONS[entityPlayer.rayTrace(30,0.1f).sideHit].getOpposite().ordinal(),0,0,0);
//    }


    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        TileEntity tileEntity = world.getTileEntity(pos);

        if (tileEntity!=null && tileEntity instanceof TileTransportBlock)
        {
            //LogHelper.info("Attempting to connect to neighbors");
            ((TileTransportBlock) tileEntity).connectToAllTransportBlocks();
            ((TileTransportBlock) tileEntity).connectToAllIFluidHandlers();
        }

        return this.getDefaultState();
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity!=null && tileEntity instanceof TileTransportBlock)
        {
            ((TileTransportBlock) tileEntity).breakAllConnections();
        }
        super.breakBlock(world, pos,state);
    }

    @Override
    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity != null && tileEntity instanceof IM4thTransportBlock)
        {
            ((IM4thTransportBlock)tileEntity).breakInvalidConnections();
        }
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        return super.getDrops(world, pos, state, fortune);
    }

    //IDismantleable


    @Override
    public List<ItemStack> dismantleBlock(EntityPlayer player, World world, BlockPos blockPos, boolean bool) {
        List<ItemStack> toReturn = getDrops(world,blockPos,world.getBlockState(blockPos),0);

        world.removeTileEntity(blockPos);
        world.setBlockToAir(blockPos);

        for (ItemStack itemStack : toReturn)
        {
            EntityItem entityItem = new EntityItem(world, (float)blockPos.getX() + 0.5f, (float)blockPos.getY() + 0.5f, (float)blockPos.getZ() + 0.5f, itemStack);
            float f = 0.05F;
            entityItem.motionX = (double)((float)world.rand.nextGaussian() * f);
            entityItem.motionY = (double)((float)world.rand.nextGaussian() * f + 0.2F);
            entityItem.motionZ = (double)((float)world.rand.nextGaussian() * f);

            world.spawnEntityInWorld(entityItem);
        }

        return toReturn;
    }

    @Override
    public boolean canDismantle(EntityPlayer player, World world, BlockPos blockPos) {
        return true;
    }

}
