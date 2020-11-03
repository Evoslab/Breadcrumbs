package com.evoslab.breadcrumbs.common.properties;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public final class BreadcrumbsBlockProperties {
    public static final Block.Properties BREAD = Block.Properties.create(Material.WOOD)
            .hardnessAndResistance(1.0f, 1.0f)
            .sound(SoundType.WOOD)
            .harvestTool(ToolType.HOE);
    public static final Block.Properties BREAD_BRICKS = Block.Properties.create(Material.ROCK)
    		.hardnessAndResistance(1.0f, 1.0f)
    		.sound(SoundType.STONE)
    		.harvestTool(ToolType.PICKAXE);
}
