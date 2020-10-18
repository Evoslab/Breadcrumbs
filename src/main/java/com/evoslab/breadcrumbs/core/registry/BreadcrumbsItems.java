package com.evoslab.breadcrumbs.core.registry;

import com.evoslab.breadcrumbs.core.Breadcrumbs;
import com.evoslab.breadcrumbs.core.registry.util.BreadcrumbsRegistryHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Breadcrumbs.MOD_ID, bus = Bus.MOD)
public class BreadcrumbsItems {
	
	public static final BreadcrumbsRegistryHelper HELPER = Breadcrumbs.REGISTRY_HELPER;
	
}
