package com.evoslab.breadcrumbs.core.registry;

import com.evoslab.breadcrumbs.core.Breadcrumbs;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Breadcrumbs.MOD_ID, bus = Bus.MOD)
public class BreadcrumbsItems {
	
	public static final RegistryHelper HELPER = Breadcrumbs.REGISTRY_HELPER;
	
}
