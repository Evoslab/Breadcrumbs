package com.evoslab.cookielicious.common.properties;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public final class CookieliciousBlockProperties {
	
	public static final Block.Properties CHOCOLATE = Block.Properties.create(Material.WOOD)
			.hardnessAndResistance(1.0f, 1.0f)
            .sound(SoundType.WOOD)
            .harvestTool(ToolType.AXE);
	
	public static final Block.Properties SANDWICH = Properties.create(Material.WOOD)
            .hardnessAndResistance(1.0f, 1.0f)
            .sound(SoundType.WOOD)
            .harvestTool(ToolType.AXE);
	
	public static final Block.Properties STRAWBERRY = Properties.create(Material.WOOD)
            .hardnessAndResistance(1.0f, 1.0f)
            .sound(SoundType.WOOD)
            .harvestTool(ToolType.AXE);
	
	public static final Block.Properties VANILLA = Properties.create(Material.WOOD)
            .hardnessAndResistance(1.0f, 1.0f)
            .sound(SoundType.WOOD)
            .harvestTool(ToolType.AXE);
	
	public static final Block.Properties HONEY = STRAWBERRY;
	public static final Block.Properties SWEET_BERRY = STRAWBERRY;
	
}
