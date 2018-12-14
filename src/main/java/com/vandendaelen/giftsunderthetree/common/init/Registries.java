package com.vandendaelen.giftsunderthetree.common.init;

import com.vandendaelen.giftsunderthetree.common.blocks.Present;
import com.vandendaelen.giftsunderthetree.common.blocks.PresentType;
import com.vandendaelen.giftsunderthetree.common.blocks.Tree;
import com.vandendaelen.giftsunderthetree.common.item.ItemPresent;
import com.vandendaelen.giftsunderthetree.common.item.ItemTree;
import com.vandendaelen.giftsunderthetree.common.tileentities.TreeTileEntity;
import com.vandendaelen.giftsunderthetree.utils.BlockNames;
import com.vandendaelen.giftsunderthetree.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID)

public class Registries {

    @GameRegistry.ObjectHolder(BlockNames.TREE)
    public static Block tree;
    @GameRegistry.ObjectHolder(BlockNames.PRESENT)
    public static Present present;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        IForgeRegistry<Block> reg = e.getRegistry();

        reg.register(new Present());
        reg.register(new Tree());
        GameRegistry.registerTileEntity(TreeTileEntity.class, new ResourceLocation(Reference.MODID, "TreeTile"));

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        IForgeRegistry<Item> itemRegistry = e.getRegistry();


        itemRegistry.register(new ItemPresent(present));
        itemRegistry.register(new ItemTree(tree));
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        Item presentItem = Item.getItemFromBlock(present);
        Item treeItem = Item.getItemFromBlock(tree);

        for(PresentType type : PresentType.VALUES){
            ModelLoader.setCustomModelResourceLocation(presentItem, type.ordinal(), new ModelResourceLocation(present.getRegistryName(), "color="+type));
        }

        ModelLoader.setCustomModelResourceLocation(treeItem,0,new ModelResourceLocation(tree.getRegistryName(), "inventory"));


    }
}
