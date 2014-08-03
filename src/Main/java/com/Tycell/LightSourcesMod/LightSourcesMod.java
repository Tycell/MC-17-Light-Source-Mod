package com.tycell.lightsourcesmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("unused")
@Mod(modid="lightsourcesmod", name="LightSources", version="1.7.1-1.0")
public class LightSourcesMod {
    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
        //preinit
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //init
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //postinit
    }
}
