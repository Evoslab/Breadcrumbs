package com.evoslab.breadcrumbs.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.evoslab.breadcrumbs.core.registry.util.BreadcrumbsRegistryHelper;

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
    public static final BreadcrumbsRegistryHelper REGISTRY_HELPER = new BreadcrumbsRegistryHelper(MOD_ID);
    public static Breadcrumbs instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Breadcrumbs() {
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);
        REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}