package com.evoslab.breadcrumbs.core.registry;

import com.evoslab.breadcrumbs.core.Breadcrumbs;
import com.evoslab.breadcrumbs.core.other.BreadcrumbsMods;
import com.evoslab.breadcrumbs.core.registry.util.BreadcrumbsRegistryHelper;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Breadcrumbs.MOD_ID, bus = Bus.MOD)
public class BreadcrumbsBlocks {

    public static final BreadcrumbsRegistryHelper HELPER = Breadcrumbs.REGISTRY_HELPER;

    public static final RegistryObject<Block> BREAD_BLOCK = HELPER.createBlock("bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BREAD_BRICKS = HELPER.createBlock("bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_SLAB = HELPER.createBlock("bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_STAIRS = HELPER.createBlock("bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_WALL = HELPER.createBlock("bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.QUARK, "bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> HONEY_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_VERTICAL_SLAB = HELPER.createTwoCompatBlock(BreadcrumbsMods.BUZZIER_BEES, BreadcrumbsMods.QUARK, "honey_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_VERTICAL_SLAB = HELPER.createTwoCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, BreadcrumbsMods.QUARK, "mulberry_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BANANA_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_VERTICAL_SLAB = HELPER.createTwoCompatBlock(BreadcrumbsMods.NEAPOLITAN, BreadcrumbsMods.QUARK, "banana_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    
    public static class Properties {
    	public static final Block.Properties BREAD = Block.Properties.create(Material.WOOD)
    			.hardnessAndResistance(1.0f, 1.0f)
    			.sound(SoundType.WOOD)
    			.harvestTool(ToolType.HOE);
    	public static final Block.Properties BREAD_BRICKS = Block.Properties.create(Material.ROCK)
        		.hardnessAndResistance(1.0f, 1.0f)
        		.sound(SoundType.STONE)
        		.harvestTool(ToolType.PICKAXE);
    }
    
}
