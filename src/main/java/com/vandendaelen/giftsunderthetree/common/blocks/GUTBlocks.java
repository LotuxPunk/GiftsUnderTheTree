package com.vandendaelen.giftsunderthetree.common.blocks;

import com.vandendaelen.giftsunderthetree.client.tabs.GUTTabs;
import com.vandendaelen.giftsunderthetree.common.items.GUTItems;
import com.vandendaelen.giftsunderthetree.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class GUTBlocks {
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static Block tree = register(new Tree(),"tree");
    public static Block present = register(new Gift(),"present");

    public static Block register(Block block, String name) {
        ResourceLocation rl = new ResourceLocation(Reference.MODID, name);
        block.setRegistryName(rl);

        BLOCKS.add(block);
        GUTItems.ITEMS.add(new ItemBlock(block).setRegistryName(rl));

        block.setCreativeTab(GUTTabs.GUTTab);

        return block;
    }
}
