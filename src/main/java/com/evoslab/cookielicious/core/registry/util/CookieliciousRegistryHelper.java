package com.evoslab.cookielicious.core.registry.util;

import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;

public class CookieliciousRegistryHelper extends RegistryHelper {

	public CookieliciousRegistryHelper(String modId) {
		super(modId);
	}
	
	public <B extends Block> RegistryObject<B> createTwoCompatBlock(String modId, String modId2, String name, Supplier<? extends B> supplier, @Nullable ItemGroup group) {
		ItemGroup determinedGroup = (ModList.get().isLoaded(modId) || modId == "indev") && (ModList.get().isLoaded(modId2) || modId2 == "indev") ? group : null;
	    return createBlock(name, supplier, determinedGroup);
	}

}
