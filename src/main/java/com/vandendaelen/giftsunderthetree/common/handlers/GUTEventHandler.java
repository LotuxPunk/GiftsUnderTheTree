package com.vandendaelen.giftsunderthetree.common.handlers;

import com.vandendaelen.giftsunderthetree.common.blocks.GUTBlocks;
import com.vandendaelen.giftsunderthetree.common.items.GUTItems;
import com.vandendaelen.giftsunderthetree.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class GUTEventHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // Blocks
        for (Block block : GUTBlocks.BLOCKS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "normal"));
        }
        for (Item item : GUTItems.ITEMS) {
            if (item.getHasSubtypes()) {
                NonNullList<ItemStack> list = NonNullList.create();
                item.getSubItems(item.getCreativeTab(), list);
                for (int i = 0; i < list.size(); i++) {
                    ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(item.getRegistryName(), "type=" + i));
                }
            }
            else
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block block : GUTBlocks.BLOCKS) {
            event.getRegistry().register(block);
        }
    }
}
