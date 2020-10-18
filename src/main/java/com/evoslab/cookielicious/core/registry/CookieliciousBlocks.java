package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.common.properties.CookieliciousBlockProperties;
import com.evoslab.cookielicious.core.Cookielicious;
import com.evoslab.cookielicious.core.compat.CookieliciousMods;
import com.evoslab.cookielicious.core.registry.util.CookieliciousRegistryHelper;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousBlocks {
	
	public static final CookieliciousRegistryHelper HELPER = Cookielicious.REGISTRY_HELPER;

    // Strawberry
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILES = HELPER.createBlock("strawberry_cookie_tiles", () -> new Block(CookieliciousBlockProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_SLAB = HELPER.createBlock("strawberry_cookie_tile_slab", () -> new SlabBlock(CookieliciousBlockProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_STAIRS = HELPER.createBlock("strawberry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), CookieliciousBlockProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "strawberry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousBlockProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "strawberry_cookie_crate", () -> new Block(CookieliciousBlockProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);

    // Chocolate
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILES = HELPER.createBlock("chocolate_cookie_tiles", () -> new Block(CookieliciousBlockProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_SLAB = HELPER.createBlock("chocolate_cookie_tile_slab", () -> new SlabBlock(CookieliciousBlockProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_STAIRS = HELPER.createBlock("chocolate_cookie_tile_stairs", () -> new AbnormalsStairsBlock(CHOCOLATE_COOKIE_TILES.get().getDefaultState(), CookieliciousBlockProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "chocolate_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousBlockProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "chocolate_cookie_crate", () -> new Block(CookieliciousBlockProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);

    // Vanilla
    public static final RegistryObject<Block> VANILLA_COOKIE_TILES = HELPER.createBlock("vanilla_cookie_tiles", () -> new Block(CookieliciousBlockProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_SLAB = HELPER.createBlock("vanilla_cookie_tile_slab", () -> new SlabBlock(CookieliciousBlockProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_STAIRS = HELPER.createBlock("vanilla_cookie_tile_stairs", () -> new AbnormalsStairsBlock(VANILLA_COOKIE_TILES.get().getDefaultState(), CookieliciousBlockProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "vanilla_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousBlockProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "vanilla_cookie_crate", () -> new Block(CookieliciousBlockProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);

    // Sandwich
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILES = HELPER.createBlock("sandwich_cookie_tiles", () -> new Block(CookieliciousBlockProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_SLAB = HELPER.createBlock("sandwich_cookie_tile_slab", () -> new SlabBlock(CookieliciousBlockProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_STAIRS = HELPER.createBlock("sandwich_cookie_tile_stairs", () -> new AbnormalsStairsBlock(SANDWICH_COOKIE_TILES.get().getDefaultState(), CookieliciousBlockProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sandwich_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousBlockProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sandwich_cookie_crate", () -> new Block(CookieliciousBlockProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);

    // Honey
    public static final RegistryObject<Block> HONEY_COOKIE_TILES = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "honey_cookie_tiles", () -> new Block(CookieliciousBlockProperties.HONEY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_SLAB = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "honey_cookie_tile_slab", () -> new SlabBlock(CookieliciousBlockProperties.HONEY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_STAIRS = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "honey_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), CookieliciousBlockProperties.HONEY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(CookieliciousMods.FARMERS_DELIGHT, CookieliciousMods.QUARK, "honey_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousBlockProperties.HONEY), ItemGroup.BUILDING_BLOCKS);

    // Sweet Berry
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILES = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "sweet_berry_cookie_tiles", () -> new Block(CookieliciousBlockProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_SLAB = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "sweet_berry_cookie_tile_slab", () -> new SlabBlock(CookieliciousBlockProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_STAIRS = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "sweet_berry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), CookieliciousBlockProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_TILE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(CookieliciousMods.FARMERS_DELIGHT, CookieliciousMods.QUARK, "sweet_berry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousBlockProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    
}
