package com.vandendaelen.giftsunderthetree.common.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemTree extends ItemBlock {
    public ItemTree(Block block) {
        super(block);
        this.setRegistryName(block.getRegistryName());
        this.setMaxDamage(0);
        this.setHasSubtypes(false);
    }
}
