package com.evoslab.cookielicious.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.evoslab.cookielicious.core.registry.util.CookieliciousRegistryHelper;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("cookielicious")
public class Cookielicious {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cookielicious";
    public static final CookieliciousRegistryHelper REGISTRY_HELPER = new CookieliciousRegistryHelper(MOD_ID);
    public static Cookielicious instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Cookielicious() {
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