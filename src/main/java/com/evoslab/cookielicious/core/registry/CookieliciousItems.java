package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.common.properties.CookieliciousItemProperties;
import com.evoslab.cookielicious.core.Cookielicious;
import com.evoslab.cookielicious.core.registry.util.CookieliciousRegistryHelper;
import com.minecraftabnormals.neapolitan.common.item.HealingItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousItems {
	
	public static final CookieliciousRegistryHelper HELPER = Cookielicious.REGISTRY_HELPER;
	
    public static final RegistryObject<Item> STRAWBERRY_COOKIE = HELPER.createItem("strawberry_cookie", () -> new HealingItem(1F, CookieliciousItemProperties.STRAWBERRY));
    public static final RegistryObject<Item> VANILLA_COOKIE = HELPER.createItem("vanilla_cookie", () -> new Item(CookieliciousItemProperties.VANILLA));
    public static final RegistryObject<Item> SANDWICH_COOKIE = HELPER.createItem("sandwich_cookie", () -> new Item(CookieliciousItemProperties.SANDWICH));

}
