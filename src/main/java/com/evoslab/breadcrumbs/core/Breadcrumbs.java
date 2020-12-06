package com.evoslab.breadcrumbs.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("breadcrumbs")
public class Breadcrumbs {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "breadcrumbs";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static Breadcrumbs instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Breadcrumbs() {
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        REGISTRY_HELPER.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}