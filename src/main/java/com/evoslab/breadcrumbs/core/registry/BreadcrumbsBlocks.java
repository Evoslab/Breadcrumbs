package com.evoslab.breadcrumbs.core.registry;

import com.evoslab.breadcrumbs.core.Breadcrumbs;
import com.evoslab.breadcrumbs.core.other.BreadcrumbsMods;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

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

    public static final BlockSubRegistryHelper HELPER = Breadcrumbs.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> BREAD_BLOCK = HELPER.createBlock("bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BLOCK = HELPER.createCompatBlock(BreadcrumbsMods.AUTUMNITY, "pumpkin_bread_block", () -> new Block(Properties.BREAD), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BREAD_BRICKS = HELPER.createBlock("bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_SLAB = HELPER.createBlock("bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_STAIRS = HELPER.createBlock("bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BREAD_BRICK_WALL = HELPER.createBlock("bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.QUARK, "bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> HONEY_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.BUZZIER_BEES, "honey_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> HONEY_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("honey_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS, BreadcrumbsMods.BUZZIER_BEES, BreadcrumbsMods.QUARK);
    
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.UPGRADE_AQUATIC, "mulberry_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> MULBERRY_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("mulberry_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS, BreadcrumbsMods.UPGRADE_AQUATIC, BreadcrumbsMods.QUARK);
    
    public static final RegistryObject<Block> BANANA_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.NEAPOLITAN, "banana_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BANANA_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("banana_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS, BreadcrumbsMods.NEAPOLITAN, BreadcrumbsMods.QUARK);
    
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICKS = HELPER.createCompatBlock(BreadcrumbsMods.AUTUMNITY, "pumpkin_bread_bricks", () -> new Block(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_SLAB = HELPER.createCompatBlock(BreadcrumbsMods.AUTUMNITY, "pumpkin_bread_brick_slab", () -> new SlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_STAIRS = HELPER.createCompatBlock(BreadcrumbsMods.AUTUMNITY, "pumpkin_bread_brick_stairs", () -> new AbnormalsStairsBlock(BREAD_BRICKS.get().getDefaultState(), Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_WALL = HELPER.createCompatBlock(BreadcrumbsMods.AUTUMNITY, "pumpkin_bread_brick_wall", () -> new WallBlock(Properties.BREAD_BRICKS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> PUMPKIN_BREAD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("pumpkin_bread_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BREAD_BRICKS), ItemGroup.BUILDING_BLOCKS, BreadcrumbsMods.AUTUMNITY, BreadcrumbsMods.QUARK);
    
    
    public static class Properties {
    	public static final Block.Properties BREAD = Block.Properties.create(Material.WOOL)
    			.hardnessAndResistance(1.0f, 1.0f)
    			.sound(SoundType.CLOTH)
    			.harvestTool(ToolType.HOE);
    	public static final Block.Properties BREAD_BRICKS = Block.Properties.create(Material.WOOL)
        		.hardnessAndResistance(1.0f, 1.0f)
        		.sound(SoundType.CLOTH)
        		.harvestTool(ToolType.HOE);
    }
    
}
