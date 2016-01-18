package com.m4thg33k.m4ththings.items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidContainerItem;

import java.util.List;

public class ItemBaseTank extends ItemBlock implements IFluidContainerItem {

    protected int capacity;

    public ItemBaseTank(Block block)
    {
        super(block);
        capacity = 8000;
        setMaxStackSize(16);
    }

    public ItemBaseTank setCapacity(int capacity)
    {
        this.capacity = capacity;
        return this;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        if (stack.hasTagCompound() && stack.getTagCompound().hasKey("FluidName"))
        {
            NBTTagCompound tagCompound = stack.getTagCompound();

            tooltip.add(FluidRegistry.getFluid(tagCompound.getString("FluidName")).getLocalizedName(null));
            tooltip.add(tagCompound.getInteger("Amount") + "/" + capacity + "mb");
        }
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }

    @Override
    public FluidStack getFluid(ItemStack container) {
        if (!container.hasTagCompound() || !container.getTagCompound().hasKey("FluidName"))
        {
            return null;
        }
        return FluidStack.loadFluidStackFromNBT(container.getTagCompound());
    }

    @Override
    public int getCapacity(ItemStack container) {
        return capacity;
    }

    @Override
    public int fill(ItemStack container, FluidStack resource, boolean doFill) {
        if (resource==null || resource.amount==0)
        {
            return 0;
        }

        NBTTagCompound inputTag = resource.writeToNBT(new NBTTagCompound());

        if (!doFill)
        {
            if (!container.hasTagCompound() || container.getTagCompound().hasKey("Empty"))
            {
                return Math.min(capacity,resource.amount);
            }

            //at this point, we know there is a stackTagCompound and the tank is non-empty ==> it has the key FluidName
            if (!container.getTagCompound().getString("FluidName").equals(inputTag.getString("FluidName")))
            {
                return 0;
            }

            int filling = capacity - container.getTagCompound().getInteger("Amount");
            return Math.min(filling,resource.amount);
        }

        if (!container.hasTagCompound() || container.getTagCompound().hasKey("Empty"))
        {
            if (!container.hasTagCompound())
            {
                container.setTagCompound(new NBTTagCompound());
            }
            if (container.getTagCompound().hasKey("Empty"))
            {
                container.getTagCompound().removeTag("Empty");
            }

            container.getTagCompound().setString("FluidName",inputTag.getString("FluidName"));
            container.getTagCompound().setInteger("Amount",Math.min(capacity,resource.amount));
            return Math.min(capacity,resource.amount);
        }

        if (!container.getTagCompound().getString("FluidName").equals(inputTag.getString("FluidName")))
        {
            return 0;
        }

        int filling = capacity-container.getTagCompound().getInteger("Amount");
        if (resource.amount <= filling)
        {
            container.getTagCompound().setInteger("Amount", container.getTagCompound().getInteger("Amount")+resource.amount);
        }

        container.getTagCompound().setInteger("Amount",capacity);
        return filling;
    }

    @Override
    public FluidStack drain(ItemStack container, int maxDrain, boolean doDrain) {
        NBTTagCompound tag = container.getTagCompound();

        if (tag == null || tag.hasKey("Empty"))
        {
            return null;
        }

        FluidStack ret = FluidStack.loadFluidStackFromNBT(tag);
        if (ret==null)
        {
            return null;
        }

        int currentAmount = ret.amount;
        ret.amount = Math.min(currentAmount,maxDrain);
        if (doDrain)
        {
            if (currentAmount == ret.amount)
            {
                tag.removeTag("FluidName");
                tag.removeTag("Amount");
                tag.setString("Empty","");

                return ret;
            }

            tag.setInteger("Amount",currentAmount-ret.amount);
        }
        return ret;
    }
}
