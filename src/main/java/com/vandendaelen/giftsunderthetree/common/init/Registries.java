package com.vandendaelen.giftsunderthetree.common.init;

import com.vandendaelen.giftsunderthetree.common.blocks.Present;
import com.vandendaelen.giftsunderthetree.common.blocks.PresentType;
import com.vandendaelen.giftsunderthetree.common.item.ItemPresent;
import com.vandendaelen.giftsunderthetree.utils.BlockNames;
import com.vandendaelen.giftsunderthetree.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID)

public class Registries {

    public static Block tree;
    @GameRegistry.ObjectHolder(BlockNames.PRESENT)
    public static Present present;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        IForgeRegistry<Block> reg = e.getRegistry();

        reg.register(new Present());
        regTiles();

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        IForgeRegistry<Item> itemRegistry = e.getRegistry();

        // present Start
        itemRegistry.register(new ItemPresent(present));
        // present End
    }

    private static void regTiles() {
        //RegUtils.addTile(TreeTileEntity.class, "TileTree");
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        Item presentItem = Item.getItemFromBlock(present);

        for(PresentType type : PresentType.VALUES){
            ModelLoader.setCustomModelResourceLocation(presentItem, type.ordinal(), new ModelResourceLocation(present.getRegistryName(), "color="+type));
        }
    }
}
