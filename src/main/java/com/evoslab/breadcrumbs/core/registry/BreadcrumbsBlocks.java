package com.evoslab.breadcrumbs.core.registry;

import com.evoslab.breadcrumbs.common.properties.BreadcrumbsBlockProperties;
import com.evoslab.breadcrumbs.core.Breadcrumbs;
import com.evoslab.breadcrumbs.core.registry.util.BreadcrumbsRegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Breadcrumbs.MOD_ID, bus = Bus.MOD)
public class BreadcrumbsBlocks {

    public static final BreadcrumbsRegistryHelper HELPER = Breadcrumbs.REGISTRY_HELPER;

    public static final RegistryObject<Block> BREAD_BLOCK = HELPER.createBlock("bread_block", () -> new Block(BreadcrumbsBlockProperties.BREAD), ItemGroup.BUILDING_BLOCKS);

}
