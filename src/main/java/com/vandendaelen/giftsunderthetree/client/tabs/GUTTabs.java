package com.vandendaelen.giftsunderthetree.client.tabs;

import com.vandendaelen.giftsunderthetree.common.blocks.GUTBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GUTTabs {
    public static CreativeTabs GUTTab = new CreativeTabs("gut_blocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(GUTBlocks.tree);
        }
    };
}
