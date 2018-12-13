package com.vandendaelen.giftsunderthetree;

import com.vandendaelen.giftsunderthetree.common.proxy.IProxy;
import com.vandendaelen.giftsunderthetree.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name =Reference.NAME , version =Reference.Version.VERSION, dependencies = Reference.DEPENDENCIES)
public class GiftsUnderTheTree {

    @Mod.Instance(Reference.MODID)
    public static GiftsUnderTheTree instance;
    public static Logger logger;
    public static SimpleNetworkWrapper NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);

    @SidedProxy(modId =Reference.MODID,clientSide = Reference.CLIENT_PROXY,serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        //Registries.tree = RegUtils.createBlock(new Tree(),"tree");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
}
