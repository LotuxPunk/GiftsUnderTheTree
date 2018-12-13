package com.vandendaelen.giftsunderthetree.common.item;

import com.vandendaelen.giftsunderthetree.common.blocks.PresentType;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Locale;

public class ItemPresent extends ItemBlock {
    public ItemPresent(Block block) {
        super(block);
        this.setRegistryName(block.getRegistryName());
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        int meta = itemstack.getMetadata();

        if (meta < PresentType.VALUES.length)
        {
            return "tile.giftsunderthetree.present." + PresentType.VALUES[itemstack.getMetadata()].name().toLowerCase(Locale.US);
        }
        else
        {
            return super.getUnlocalizedName(itemstack);
        }
    }

}
