package net.iyun.buildersshop.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.iyun.buildersshop.BuildersShop;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block OAK_VERTICAL_SLAB = registerBlock("vertical_oak_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_SLAB = registerBlock("vertical_spruce_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block BIRCH_VERTICAL_SLAB = registerBlock("vertical_birch_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block JUNGLE_VERTICAL_SLAB = registerBlock("vertical_jungle_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block ACA_VERTICAL_SLAB = registerBlock("vertical_acacia_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerBlock("vertical_dark_oak_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block MANGROVE_VERTICAL_SLAB = registerBlock("vertical_mangrove_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block CHERRY_VERTICAL_SLAB = registerBlock("vertical_cherry_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block BAMBOO_VERTICAL_SLAB = registerBlock("vertical_bamboo_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block CRIMSON_VERTICAL_SLAB = registerBlock("vertical_crimson_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block WARPED_VERTICAL_SLAB = registerBlock("vertical_warped_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));

    public static final Block VERTICAL_OAK_PLANK = registerBlock("vertical_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_OAK_PLANK_SLAB = registerBlock("vertical_oak_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_OAK_PLANK_VERTICAL_SLAB = registerBlock("vertical_oak_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_OAK_PLANK_STAIRS = registerBlock("vertical_oak_stairs", new StairsBlock(ModBlocks.VERTICAL_OAK_PLANK.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_OAK_PLANK_FENCE = registerBlock("vertical_oak_fence", new FenceBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_OAK_PLANK_WALL = registerBlock("vertical_oak_wall", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block VERTICAL_OAK_PLANK_FENCE_GATE = registerBlock("vertical_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(OAK_PLANKS), WoodType.OAK));

    public static final Block VERTICAL_BIRCH_PLANK = registerBlock("vertical_birch_planks", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANK_SLAB = registerBlock("vertical_birch_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANK_VERTICAL_SLAB = registerBlock("vertical_birch_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANK_STAIRS = registerBlock("vertical_birch_stairs", new StairsBlock(ModBlocks.VERTICAL_BIRCH_PLANK.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANK_FENCE = registerBlock("vertical_birch_fence", new FenceBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANK_WALL = registerBlock("vertical_birch_wall", new WallBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_PLANK_FENCE_GATE = registerBlock("vertical_birch_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS), WoodType.BIRCH));

    public static final Block VERTICAL_SPRUCE_PLANK = registerBlock("vertical_spruce_planks", new Block(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANK_SLAB = registerBlock("vertical_spruce_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANK_VERTICAL_SLAB = registerBlock("vertical_spruce_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANK_STAIRS = registerBlock("vertical_spruce_stairs", new StairsBlock(ModBlocks.VERTICAL_SPRUCE_PLANK.getDefaultState(), FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANK_FENCE = registerBlock("vertical_spruce_fence", new FenceBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANK_WALL = registerBlock("vertical_spruce_wall", new WallBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_PLANK_FENCE_GATE = registerBlock("vertical_spruce_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS), WoodType.SPRUCE));

    public static final Block VERTICAL_JUNGLE_PLANK = registerBlock("vertical_jungle_planks", new Block(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANK_SLAB = registerBlock("vertical_jungle_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANK_VERTICAL_SLAB = registerBlock("vertical_jungle_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANK_STAIRS = registerBlock("vertical_jungle_stairs", new StairsBlock(ModBlocks.VERTICAL_JUNGLE_PLANK.getDefaultState(), FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANK_FENCE = registerBlock("vertical_jungle_fence", new FenceBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANK_WALL = registerBlock("vertical_jungle_wall", new WallBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_PLANK_FENCE_GATE = registerBlock("vertical_jungle_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(JUNGLE_PLANKS), WoodType.JUNGLE));

    public static final Block VERTICAL_ACACIA_PLANK = registerBlock("vertical_acacia_planks", new Block(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANK_SLAB = registerBlock("vertical_acacia_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANK_VERTICAL_SLAB = registerBlock("vertical_acacia_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANK_STAIRS = registerBlock("vertical_acacia_stairs", new StairsBlock(ModBlocks.VERTICAL_ACACIA_PLANK.getDefaultState(), FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANK_FENCE = registerBlock("vertical_acacia_fence", new FenceBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANK_WALL = registerBlock("vertical_acacia_wall", new WallBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_PLANK_FENCE_GATE = registerBlock("vertical_acacia_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(ACACIA_PLANKS), WoodType.ACACIA));

    public static final Block VERTICAL_CHERRY_PLANK = registerBlock("vertical_cherry_planks", new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANK_SLAB = registerBlock("vertical_cherry_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANK_VERTICAL_SLAB = registerBlock("vertical_cherry_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANK_STAIRS = registerBlock("vertical_cherry_stairs", new StairsBlock(ModBlocks.VERTICAL_CHERRY_PLANK.getDefaultState(), FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANK_FENCE = registerBlock("vertical_cherry_fence", new FenceBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANK_WALL = registerBlock("vertical_cherry_wall", new WallBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_PLANK_FENCE_GATE = registerBlock("vertical_cherry_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(CHERRY_PLANKS), WoodType.CHERRY));

    public static final Block VERTICAL_DARK_OAK_PLANK = registerBlock("vertical_dark_oak_planks", new Block(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANK_SLAB = registerBlock("vertical_dark_oak_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANK_VERTICAL_SLAB = registerBlock("vertical_dark_oak_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANK_STAIRS = registerBlock("vertical_dark_oak_stairs", new StairsBlock(ModBlocks.VERTICAL_DARK_OAK_PLANK.getDefaultState(), FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANK_FENCE = registerBlock("vertical_dark_oak_fence", new FenceBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANK_WALL = registerBlock("vertical_dark_oak_wall", new WallBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_PLANK_FENCE_GATE = registerBlock("vertical_dark_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(DARK_OAK_PLANKS), WoodType.DARK_OAK));

    public static final Block VERTICAL_MANGROVE_PLANK = registerBlock("vertical_mangrove_planks", new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANK_SLAB = registerBlock("vertical_mangrove_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANK_VERTICAL_SLAB = registerBlock("vertical_mangrove_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANK_STAIRS = registerBlock("vertical_mangrove_stairs", new StairsBlock(ModBlocks.VERTICAL_MANGROVE_PLANK.getDefaultState(), FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANK_FENCE = registerBlock("vertical_mangrove_fence", new FenceBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANK_WALL = registerBlock("vertical_mangrove_wall", new WallBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_PLANK_FENCE_GATE = registerBlock("vertical_mangrove_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(MANGROVE_PLANKS), WoodType.MANGROVE));

    public static final Block VERTICAL_BAMBOO_PLANK = registerBlock("vertical_bamboo_planks", new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANK_SLAB = registerBlock("vertical_bamboo_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANK_VERTICAL_SLAB = registerBlock("vertical_bamboo_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANK_STAIRS = registerBlock("vertical_bamboo_stairs", new StairsBlock(ModBlocks.VERTICAL_BAMBOO_PLANK.getDefaultState(), FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANK_FENCE = registerBlock("vertical_bamboo_fence", new FenceBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANK_WALL = registerBlock("vertical_bamboo_wall", new WallBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_PLANK_FENCE_GATE = registerBlock("vertical_bamboo_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(BAMBOO_PLANKS), WoodType.BAMBOO));

    public static final Block VERTICAL_CRIMSON_PLANK = registerBlock("vertical_crimson_planks", new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANK_SLAB = registerBlock("vertical_crimson_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANK_VERTICAL_SLAB = registerBlock("vertical_crimson_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANK_STAIRS = registerBlock("vertical_crimson_stairs", new StairsBlock(ModBlocks.VERTICAL_CRIMSON_PLANK.getDefaultState(), FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANK_FENCE = registerBlock("vertical_crimson_fence", new FenceBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANK_WALL = registerBlock("vertical_crimson_wall", new WallBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_PLANK_FENCE_GATE = registerBlock("vertical_crimson_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(CRIMSON_PLANKS), WoodType.CRIMSON));

    public static final Block VERTICAL_WARPED_PLANK = registerBlock("vertical_warped_planks", new Block(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANK_SLAB = registerBlock("vertical_warped_slab_plank", new SlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANK_VERTICAL_SLAB = registerBlock("vertical_warped_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANK_STAIRS = registerBlock("vertical_warped_stairs", new StairsBlock(ModBlocks.VERTICAL_WARPED_PLANK.getDefaultState(), FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANK_FENCE = registerBlock("vertical_warped_fence", new FenceBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANK_WALL = registerBlock("vertical_warped_wall", new WallBlock(FabricBlockSettings.copyOf(WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_PLANK_FENCE_GATE = registerBlock("vertical_warped_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(WARPED_PLANKS), WoodType.WARPED));

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_WALL = registerBlock("andesite_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs", new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_VERTICAL_SLAB = registerBlock("andesite_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_FENCE = registerBlock("andesite_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block ANDESITE_BRICKS_CRACKED = registerBlock("andesite_bricks_cracked", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_CRACKED_WALL = registerBlock("andesite_bricks_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_CRACKED_SLAB = registerBlock("andesite_bricks_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("andesite_bricks_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_CRACKED_STAIRS = registerBlock("andesite_bricks_cracked_stairs", new StairsBlock(ModBlocks.ANDESITE_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_CRACKED_FENCE = registerBlock("andesite_bricks_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block ANDESITE_BRICKS_MOSSY = registerBlock("andesite_bricks_mossy", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_MOSSY_WALL = registerBlock("andesite_bricks_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_MOSSY_STAIRS = registerBlock("andesite_bricks_mossy_stairs", new StairsBlock(ModBlocks.ANDESITE_BRICKS_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_MOSSY_SLAB = registerBlock("andesite_bricks_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_MOSSY_FENCE = registerBlock("andesite_bricks_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("andesite_bricks_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_VERTICAL_SLAB = registerBlock("diorite_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_SLAB = registerBlock("diorite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_FENCE = registerBlock("diorite_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_WALL = registerBlock("diorite_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_STAIRS = registerBlock("diorite_bricks_stairs", new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));

    public static final Block DIORITE_BRICKS_CRACKED = registerBlock("diorite_bricks_cracked", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("diorite_bricks_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_CRACKED_SLAB = registerBlock("diorite_bricks_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_CRACKED_STAIRS = registerBlock("diorite_bricks_cracked_stairs", new StairsBlock(ModBlocks.DIORITE_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_CRACKED_FENCE = registerBlock("diorite_bricks_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_CRACKED_WALL = registerBlock("diorite_bricks_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block DIORITE_BRICKS_MOSSY = registerBlock("diorite_bricks_mossy", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("diorite_bricks_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_MOSSY_STAIRS = registerBlock("diorite_bricks_mossy_stairs", new StairsBlock(ModBlocks.DIORITE_BRICKS_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_MOSSY_SLAB = registerBlock("diorite_bricks_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_MOSSY_FENCE = registerBlock("diorite_bricks_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_BRICKS_MOSSY_WALL = registerBlock("diorite_bricks_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_WALL = registerBlock("granite_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_FENCE = registerBlock("granite_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_SLAB = registerBlock("granite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_STAIRS = registerBlock("granite_bricks_stairs", new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_VERTICAL_SLAB = registerBlock("granite_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block GRANITE_BRICKS_CRACKED = registerBlock("granite_bricks_cracked", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_CRACKED_FENCE = registerBlock("granite_bricks_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_CRACKED_WALL = registerBlock("granite_bricks_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_CRACKED_SLAB = registerBlock("granite_bricks_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_CRACKED_STAIRS = registerBlock("granite_bricks_cracked_stairs", new StairsBlock(ModBlocks.GRANITE_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(GRANITE_BRICKS_CRACKED)));
    public static final Block GRANITE_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("granite_bricks_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block GRANITE_BRICKS_MOSSY = registerBlock("granite_bricks_mossy", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_MOSSY_STAIRS = registerBlock("granite_bricks_mossy_stairs", new StairsBlock(Blocks.GRANITE.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_MOSSY_SLAB = registerBlock("granite_bricks_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_MOSSY_FENCE = registerBlock("granite_bricks_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_MOSSY_WALL = registerBlock("granite_bricks_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("granite_bricks_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_FENCE = registerBlock("obsidian_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_WALL = registerBlock("obsidian_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_SLAB = registerBlock("obsidian_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_STAIRS = registerBlock("obsidian_bricks_stairs", new StairsBlock(ModBlocks.OBSIDIAN_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_VERTICAL_SLAB = registerBlock("obsidian_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block OBSIDIAN_BRICKS_CRACKED = registerBlock("obsidian_bricks_cracked", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_CRACKED_WALL = registerBlock("obsidian_bricks_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_CRACKED_STAIRS = registerBlock("obsidian_bricks_cracked_stairs", new StairsBlock(ModBlocks.OBSIDIAN_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_CRACKED_SLAB = registerBlock("obsidian_bricks_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_CRACKED_FENCE = registerBlock("obsidian_bricks_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("obsidian_bricks_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block OBSIDIAN_BRICKS_MOSSY = registerBlock("obsidian_bricks_mossy", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_MOSSY_WALL = registerBlock("obsidian_bricks_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_MOSSY_SLAB = registerBlock("obsidian_bricks_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_MOSSY_STAIRS = registerBlock("obsidian_bricks_mossy_stairs", new StairsBlock(ModBlocks.OBSIDIAN_BRICKS_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_MOSSY_FENCE = registerBlock("obsidian_bricks_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("obsidian_bricks_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block COBSIDIAN_BRICKS = registerBlock("obsidian_bricks_crying", new CryingObsidianBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block COBSIDIAN_BRICKS_STAIRS = registerBlock("obsidian_bricks_crying_stairs", new StairsBlock(ModBlocks.COBSIDIAN_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block COBSIDIAN_BRICKS_SLAB = registerBlock("obsidian_bricks_crying_slab", new SlabBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block COBSIDIAN_BRICKS_VERTICAL_SLAB = registerBlock("obsidian_bricks_crying_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block COBSIDIAN_BRICKS_WALL = registerBlock("obsidian_bricks_crying_wall", new WallBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block COBSIDIAN_BRICKS_FENCE = registerBlock("obsidian_bricks_crying_fence", new FenceBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block DIRT_WALL = registerBlock("dirt_wall", new WallBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_FENCE = registerBlock("dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_VERTICAL_SLAB = registerBlock("dirt_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs", new StairsBlock(Blocks.DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block CDIRT_WALL = registerBlock("coarse_dirt_wall", new WallBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_SLAB = registerBlock("coarse_dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_FENCE = registerBlock("coarse_dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_VERTICAL_SLAB = registerBlock("coarse_dirt_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_STAIRS = registerBlock("coarse_dirt_stairs", new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)));

    public static final Block RDIRT_WALL = registerBlock("rooted_dirt_wall", new WallBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_SLAB = registerBlock("rooted_dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_FENCE = registerBlock("rooted_dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_VERTICAL_SLAB = registerBlock("rooted_dirt_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_STAIRS = registerBlock("rooted_dirt_stairs", new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    public static final Block MUD_WALL = registerBlock("mud_wall", new WallBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_SLAB = registerBlock("mud_slab", new SlabBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_FENCE = registerBlock("mud_fence", new FenceBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_VERTICAL_SLAB = registerBlock("mud_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_STAIRS = registerBlock("mud_stairs", new StairsBlock(Blocks.MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MUD)));

    public static final Block PMUD_WALL = registerBlock("packed_mud_wall", new WallBlock(FabricBlockSettings.copyOf(PACKED_MUD)));
    public static final Block PMUD_SLAB = registerBlock("packed_mud_slab", new SlabBlock(FabricBlockSettings.copyOf(PACKED_MUD)));
    public static final Block PMUD_FENCE = registerBlock("packed_mud_fence", new FenceBlock(FabricBlockSettings.copyOf(PACKED_MUD)));
    public static final Block PMUD_STAIRS = registerBlock("packed_mud_stairs", new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));
    public static final Block PMUD_VERTICAL_SLAB = registerBlock("packed_mud_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PACKED_MUD)));

    public static final Block CLAY_WALL = registerBlock("clay_wall", new WallBlock(FabricBlockSettings.copyOf(CLAY)));
    public static final Block CLAY_SLAB = registerBlock("clay_slab", new SlabBlock(FabricBlockSettings.copyOf(CLAY)));
    public static final Block CLAY_FENCE = registerBlock("clay_fence", new FenceBlock(FabricBlockSettings.copyOf(CLAY)));
    public static final Block CLAY_STAIRS = registerBlock("clay_stairs", new StairsBlock(Blocks.CLAY.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CLAY)));
    public static final Block CLAY_VERTICAL_SLAB = registerBlock("clay_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CLAY)));

    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", new WallBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_VERTICAL_SLAB = registerBlock("white_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_VERTICAL_SLAB = registerBlock("light_gray_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_FENCE = registerBlock("light_gray_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall", new WallBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_VERTICAL_SLAB = registerBlock("gray_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_FENCE = registerBlock("gray_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)));

    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", new WallBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_VERTICAL_SLAB = registerBlock("black_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_FENCE = registerBlock("black_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));

    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", new WallBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_VERTICAL_SLAB = registerBlock("brown_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_FENCE = registerBlock("brown_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));

    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall", new WallBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_VERTICAL_SLAB = registerBlock("red_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_FENCE = registerBlock("red_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs", new StairsBlock(Blocks.RED_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_WOOL)));

    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", new WallBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_VERTICAL_SLAB = registerBlock("orange_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)));

    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", new WallBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_VERTICAL_SLAB = registerBlock("yellow_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)));

    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall", new WallBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_VERTICAL_SLAB = registerBlock("lime_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_FENCE = registerBlock("lime_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_WOOL)));

    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall", new WallBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_VERTICAL_SLAB = registerBlock("green_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_FENCE = registerBlock("green_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)));

    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", new WallBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_VERTICAL_SLAB = registerBlock("cyan_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)));

    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_VERTICAL_SLAB = registerBlock("light_blue_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)));

    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall", new WallBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_VERTICAL_SLAB = registerBlock("blue_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_FENCE = registerBlock("blue_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)));

    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", new WallBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_VERTICAL_SLAB = registerBlock("purple_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)));

    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall", new WallBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_VERTICAL_SLAB = registerBlock("magenta_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_FENCE = registerBlock("magenta_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)));

    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", new WallBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_VERTICAL_SLAB = registerBlock("pink_wool_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_FENCE = registerBlock("pink_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));

    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence", new FenceBlock(FabricBlockSettings.copyOf(COBBLESTONE)));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerBlock("cobblestone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(COBBLESTONE)));

    public static final Block MOSSY_COBBLESTONE_FENCE = registerBlock("mossy_cobblestone_fence", new FenceBlock(FabricBlockSettings.copyOf(MOSSY_COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerBlock("mossy_cobblestone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MOSSY_COBBLESTONE)));

    public static final Block SMOOTH_STONE_FENCE = registerBlock("smooth_stone_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerBlock("smooth_stone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block STONE_BRICKS_VERTICAL_SLAB = registerBlock("stone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(STONE_BRICKS)));
    public static final Block STONE_BRICKS_FENCE = registerBlock("stone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(STONE_BRICKS)));

    public static final Block STONE_WALL = registerBlock("stone_wall", new WallBlock(FabricBlockSettings.copyOf(STONE)));
    public static final Block STONE_FENCE = registerBlock("stone_fence", new FenceBlock(FabricBlockSettings.copyOf(STONE)));
    public static final Block STONE_VERTICAL_SLAB = registerBlock("stone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(STONE)));

    public static final Block CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_FENCE = registerBlock("cracked_stone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_VERTICAL_SLAB = registerBlock("cracked_stone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));

    public static final Block CHISELED_STONE_BRICKS_SLAB = registerBlock("chiseled_stone_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(CHISELED_STONE_BRICKS)));
    public static final Block CHISELED_STONE_BRICKS_VERTICAL_SLAB = registerBlock("chiseled_stone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CHISELED_STONE_BRICKS)));
    public static final Block CHISELED_STONE_BRICKS_STAIRS = registerBlock("chiseled_stone_bricks_stairs", new StairsBlock(Blocks.CHISELED_STONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CHISELED_STONE_BRICKS)));

    public static final Block MOSSY_STONE_BRICKS_FENCE = registerBlock("mossy_stone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(MOSSY_STONE_BRICKS)));
    public static final Block MOSSY_STONE_BRICKS_VERTICAL_SLAB = registerBlock("mossy_stone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MOSSY_STONE_BRICKS)));

    public static final Block GRANITE_FENCE = registerBlock("granite_fence", new FenceBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block GRANITE_VERTICAL_SLAB = registerBlock("granite_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block DIORITE_FENCE = registerBlock("diorite_fence", new FenceBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block DIORITE_VERTICAL_SLAB = registerBlock("diorite_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block ANDESITE_FENCE = registerBlock("andesite_fence", new FenceBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block ANDESITE_VERTICAL_SLAB = registerBlock("andesite_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block COBBLED_DEEPSLATE_FENCE = registerBlock("cobbled_deepslate_fence", new FenceBlock(FabricBlockSettings.copyOf(COBBLED_DEEPSLATE)));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerBlock("cobbled_deepslate_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(COBBLED_DEEPSLATE)));

    public static final Block CHISELED_DEEPSLATE_SLAB = registerBlock("chiseled_deepslate_slab", new SlabBlock(FabricBlockSettings.copyOf(CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_STAIRS = registerBlock("chiseled_deepslate_stairs", new StairsBlock(Blocks.CHISELED_DEEPSLATE.getDefaultState(),FabricBlockSettings.copyOf(CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_VERTICAL_SLAB = registerBlock("chiseled_deepslate_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CHISELED_DEEPSLATE)));

    public static final Block POLISHED_DEEPSLATE_FENCE = registerBlock("polished_deepslate_fence", new FenceBlock(FabricBlockSettings.copyOf(POLISHED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerBlock("polished_deepslate_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(POLISHED_DEEPSLATE)));

    public static final Block DEEPSLATE_BRICKS_FENCE = registerBlock("deepslate_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_VERTICAL_SLAB = registerBlock("deepslate_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DEEPSLATE_BRICKS)));

    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE = registerBlock("cracked_deepslate_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_WALL = registerBlock("cracked_deepslate_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("cracked_deepslate_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("cracked_deepslate_bricks_stairs", new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_VERTICAL_SLAB = registerBlock("cracked_deepslate_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_BRICKS)));

    public static final Block DEEPSLATE_TILES_FENCE = registerBlock("deepslate_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_WALL = registerBlock("deepslate_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_SLAB = registerBlock("deepslate_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_STAIRS = registerBlock("deepslate_tiles_stairs", new StairsBlock(Blocks.DEEPSLATE_TILES.getDefaultState(),FabricBlockSettings.copyOf(DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_VERTICAL_SLAB = registerBlock("deepslate_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));

    public static final Block CRACKED_DEEPSLATE_TILES_FENCE = registerBlock("cracked_deepslate_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_WALL = registerBlock("cracked_deepslate_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("cracked_deepslate_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("cracked_deepslate_tiles_stairs", new StairsBlock(Blocks.CRACKED_DEEPSLATE_TILES.getDefaultState(),FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_VERTICAL_SLAB = registerBlock("cracked_deepslate_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRACKED_DEEPSLATE_TILES)));

    public static final Block BRICKS_FENCE = registerBlock("bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(BRICKS)));
    public static final Block BRICKS_VERTICAL_SLAB = registerBlock("bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BRICKS)));

    public static final Block CHISELED_ANDESITE = registerBlock("andesite_chiseled", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_ANDESITE_STAIRS = registerBlock("andesite_chiseled_stairs", new StairsBlock(ModBlocks.CHISELED_ANDESITE.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_ANDESITE_SLAB = registerBlock("andesite_chiseled_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_ANDESITE_VERTICAL_SLAB = registerBlock("vertical_andesite_chiseled_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block CHISELED_CRACKED_ANDESITE = registerBlock("andesite_chiseled_cracked", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_CRACKED_ANDESITE_STAIRS = registerBlock("andesite_chiseled_cracked_stairs", new StairsBlock(ModBlocks.CHISELED_CRACKED_ANDESITE.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_CRACKED_ANDESITE_SLAB = registerBlock("andesite_chiseled_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_CRACKED_ANDESITE_VERTICAL_SLAB = registerBlock("vertical_andesite_chiseled_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block CHISELED_ANDESITE_MOSSY = registerBlock("andesite_chiseled_mossy", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_ANDESITE_MOSSY_STAIRS = registerBlock("andesite_chiseled_mossy_stairs", new StairsBlock(ModBlocks.CHISELED_ANDESITE_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_ANDESITE_MOSSY_SLAB = registerBlock("andesite_chiseled_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block CHISELED_ANDESITE_MOSSY_VERTICAL_SLAB = registerBlock("vertical_andesite_chiseled_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block TILES_ANDESITE = registerBlock("andesite_tiles", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_ANDESITE_WALL = registerBlock("andesite_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_ANDESITE_STAIRS = registerBlock("andesite_tiles_stairs", new StairsBlock(ModBlocks.TILES_ANDESITE.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_ANDESITE_SLAB = registerBlock("andesite_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_ANDESITE_VERTICAL_SLAB = registerBlock("vertical_andesite_tiles_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block TILES_CRACKED_ANDESITE = registerBlock("andesite_tiles_cracked", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_CRACKED_ANDESITE_WALL = registerBlock("andesite_tiles_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_CRACKED_ANDESITE_STAIRS = registerBlock("andesite_tiles_cracked_stairs", new StairsBlock(ModBlocks.TILES_CRACKED_ANDESITE.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_CRACKED_ANDESITE_SLAB = registerBlock("andesite_tiles_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_CRACKED_ANDESITE_VERTICAL_SLAB = registerBlock("vertical_andesite_tiles_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block TILES_MOSSY_ANDESITE = registerBlock("andesite_tiles_mossy", new Block(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_MOSSY_ANDESITE_WALL = registerBlock("andesite_tiles_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_MOSSY_ANDESITE_STAIRS = registerBlock("andesite_tiles_mossy_stairs", new StairsBlock(ModBlocks.TILES_MOSSY_ANDESITE.getDefaultState(),FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_MOSSY_ANDESITE_SLAB = registerBlock("andesite_tiles_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(ANDESITE)));
    public static final Block TILES_MOSSY_ANDESITE_VERTICAL_SLAB = registerBlock("vertical_andesite_tiles_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block TILES_DIORITE = registerBlock("diorite_tiles", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_DIORITE_WALL = registerBlock("diorite_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_DIORITE_STAIRS = registerBlock("diorite_tiles_stairs", new StairsBlock(ModBlocks.TILES_DIORITE.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_DIORITE_SLAB = registerBlock("diorite_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_DIORITE_VERTICAL_SLAB = registerBlock("vertical_diorite_tiles_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block TILES_CRACKED_DIORITE = registerBlock("diorite_tiles_cracked", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_CRACKED_DIORITE_WALL = registerBlock("diorite_tiles_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_CRACKED_DIORITE_STAIRS = registerBlock("diorite_tiles_cracked_stairs", new StairsBlock(ModBlocks.TILES_CRACKED_DIORITE.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_CRACKED_DIORITE_SLAB = registerBlock("diorite_tiles_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_CRACKED_DIORITE_VERTICAL_SLAB = registerBlock("vertical_diorite_tiles_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block TILES_MOSSY_DIORITE = registerBlock("diorite_tiles_mossy", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_MOSSY_DIORITE_WALL = registerBlock("diorite_tiles_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_MOSSY_DIORITE_STAIRS = registerBlock("diorite_tiles_mossy_stairs", new StairsBlock(ModBlocks.TILES_MOSSY_DIORITE.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_MOSSY_DIORITE_SLAB = registerBlock("diorite_tiles_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block TILES_MOSSY_DIORITE_VERTICAL_SLAB = registerBlock("vertical_diorite_tiles_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block CHISELED_DIORITE = registerBlock("diorite_chiseled", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_DIORITE_STAIRS = registerBlock("diorite_chiseled_stairs", new StairsBlock(ModBlocks.CHISELED_DIORITE.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_DIORITE_SLAB = registerBlock("diorite_chiseled_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_DIORITE_VERTICAL_SLAB = registerBlock("vertical_diorite_chiseled_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block CHISELED_CRACKED_DIORITE = registerBlock("diorite_chiseled_cracked", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_CRACKED_DIORITE_STAIRS = registerBlock("diorite_chiseled_cracked_stairs", new StairsBlock(ModBlocks.CHISELED_CRACKED_DIORITE.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_CRACKED_DIORITE_SLAB = registerBlock("diorite_chiseled_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_CRACKED_DIORITE_VERTICAL_SLAB = registerBlock("vertical_diorite_chiseled_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block CHISELED_DIORITE_MOSSY = registerBlock("diorite_chiseled_mossy", new Block(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_DIORITE_MOSSY_STAIRS = registerBlock("diorite_chiseled_mossy_stairs", new StairsBlock(ModBlocks.CHISELED_DIORITE_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_DIORITE_MOSSY_SLAB = registerBlock("diorite_chiseled_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(DIORITE)));
    public static final Block CHISELED_DIORITE_MOSSY_VERTICAL_SLAB = registerBlock("vertical_diorite_chiseled_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block TILES_GRANITE = registerBlock("granite_tiles", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_GRANITE_WALL = registerBlock("granite_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_GRANITE_STAIRS = registerBlock("granite_tiles_stairs", new StairsBlock(ModBlocks.TILES_GRANITE.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_GRANITE_SLAB = registerBlock("granite_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_GRANITE_VERTICAL_SLAB = registerBlock("vertical_granite_tiles_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block TILES_CRACKED_GRANITE = registerBlock("granite_tiles_cracked", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_CRACKED_GRANITE_WALL = registerBlock("granite_tiles_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_CRACKED_GRANITE_STAIRS = registerBlock("granite_tiles_cracked_stairs", new StairsBlock(ModBlocks.TILES_CRACKED_GRANITE.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_CRACKED_GRANITE_SLAB = registerBlock("granite_tiles_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_CRACKED_GRANITE_VERTICAL_SLAB = registerBlock("vertical_granite_tiles_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block TILES_MOSSY_GRANITE = registerBlock("granite_tiles_mossy", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_MOSSY_GRANITE_WALL = registerBlock("granite_tiles_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_MOSSY_GRANITE_STAIRS = registerBlock("granite_tiles_mossy_stairs", new StairsBlock(ModBlocks.TILES_MOSSY_GRANITE.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_MOSSY_GRANITE_SLAB = registerBlock("granite_tiles_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block TILES_MOSSY_GRANITE_VERTICAL_SLAB = registerBlock("vertical_granite_tiles_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block CHISELED_GRANITE = registerBlock("granite_chiseled", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_GRANITE_STAIRS = registerBlock("granite_chiseled_stairs", new StairsBlock(ModBlocks.CHISELED_GRANITE.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_GRANITE_SLAB = registerBlock("granite_chiseled_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_GRANITE_VERTICAL_SLAB = registerBlock("vertical_granite_chiseled_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block CHISELED_CRACKED_GRANITE = registerBlock("granite_chiseled_cracked", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_CRACKED_GRANITE_STAIRS = registerBlock("granite_chiseled_cracked_stairs", new StairsBlock(ModBlocks.CHISELED_CRACKED_GRANITE.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_CRACKED_GRANITE_SLAB = registerBlock("granite_chiseled_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_CRACKED_GRANITE_VERTICAL_SLAB = registerBlock("vertical_granite_chiseled_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block CHISELED_GRANITE_MOSSY = registerBlock("granite_chiseled_mossy", new Block(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_GRANITE_MOSSY_STAIRS = registerBlock("granite_chiseled_mossy_stairs", new StairsBlock(ModBlocks.CHISELED_GRANITE_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_GRANITE_MOSSY_SLAB = registerBlock("granite_chiseled_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(GRANITE)));
    public static final Block CHISELED_GRANITE_MOSSY_VERTICAL_SLAB = registerBlock("vertical_granite_chiseled_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block TILES_OBSIDIAN = registerBlock("obsidian_tiles", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_WALL = registerBlock("obsidian_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_FENCE = registerBlock("obsidian_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_STAIRS = registerBlock("obsidian_tiles_stairs", new StairsBlock(ModBlocks.TILES_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_SLAB = registerBlock("obsidian_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_tiles_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TILES_CRACKED_OBSIDIAN = registerBlock("obsidian_tiles_cracked", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_WALL = registerBlock("obsidian_tiles_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_FENCE = registerBlock("obsidian_tiles_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_STAIRS = registerBlock("obsidian_tiles_cracked_stairs", new StairsBlock(ModBlocks.TILES_CRACKED_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_SLAB = registerBlock("obsidian_tiles_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_tiles_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TILES_MOSSY_OBSIDIAN = registerBlock("obsidian_tiles_mossy", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_MOSSY_OBSIDIAN_WALL = registerBlock("obsidian_tiles_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_MOSSY_OBSIDIAN_FENCE = registerBlock("obsidian_tiles_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_MOSSY_OBSIDIAN_STAIRS = registerBlock("obsidian_tiles_mossy_stairs", new StairsBlock(ModBlocks.TILES_MOSSY_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_MOSSY_OBSIDIAN_SLAB = registerBlock("obsidian_tiles_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_MOSSY_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_tiles_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block CHISELED_OBSIDIAN = registerBlock("obsidian_chiseled", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_OBSIDIAN_STAIRS = registerBlock("obsidian_chiseled_stairs", new StairsBlock(ModBlocks.CHISELED_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_OBSIDIAN_SLAB = registerBlock("obsidian_chiseled_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_chiseled_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block CHISELED_CRACKED_OBSIDIAN = registerBlock("obsidian_chiseled_cracked", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_CRACKED_OBSIDIAN_STAIRS = registerBlock("obsidian_chiseled_cracked_stairs", new StairsBlock(ModBlocks.CHISELED_CRACKED_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_CRACKED_OBSIDIAN_SLAB = registerBlock("obsidian_chiseled_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PRESSURE_PLATE).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_CRACKED_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_chiseled_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block CHISELED_OBSIDIAN_MOSSY = registerBlock("obsidian_chiseled_mossy", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_OBSIDIAN_MOSSY_STAIRS = registerBlock("obsidian_chiseled_mossy_stairs", new StairsBlock(ModBlocks.CHISELED_OBSIDIAN_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_OBSIDIAN_MOSSY_SLAB = registerBlock("obsidian_chiseled_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_OBSIDIAN_MOSSY_VERTICAL_SLAB = registerBlock("vertical_obsidian_chiseled_mossy_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block CHISELED_COBSIDIAN_RUNIC = registerBlock("crying_obsidian_chiseled_runic", new CryingObsidianBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_COBSIDIAN_RUNIC_STAIRS = registerBlock("crying_obsidian_chiseled_runic_stairs", new StairsBlock(ModBlocks.CHISELED_COBSIDIAN_RUNIC.getDefaultState(),FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_COBSIDIAN_RUNIC_SLAB = registerBlock("crying_obsidian_chiseled_runic_slab", new SlabBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CHISELED_COBSIDIAN_RUNIC_VERTICAL_SLAB = registerBlock("vertical_crying_obsidian_chiseled_runic_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRYING_OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_FENCE = registerBlock("smooth_stone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_WALL = registerBlock("smooth_stone_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_SLAB = registerBlock("smooth_stone_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_STAIRS = registerBlock("smooth_stone_bricks_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_VERTICAL_SLAB = registerBlock("smooth_stone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_BRICKS_CRACKED = registerBlock("smooth_stone_bricks_cracked", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_CRACKED_FENCE = registerBlock("smooth_stone_bricks_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_CRACKED_WALL = registerBlock("smooth_stone_bricks_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_CRACKED_SLAB = registerBlock("smooth_stone_bricks_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_CRACKED_STAIRS = registerBlock("smooth_stone_bricks_cracked_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("smooth_stone_bricks_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_BRICKS_MOSSY = registerBlock("smooth_stone_bricks_mossy", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_MOSSY_FENCE = registerBlock("smooth_stone_bricks_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_MOSSY_WALL = registerBlock("smooth_stone_bricks_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_MOSSY_SLAB = registerBlock("smooth_stone_bricks_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_MOSSY_STAIRS = registerBlock("smooth_stone_bricks_mossy_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("smooth_stone_bricks_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_CHISELED = registerBlock("smooth_stone_chiseled", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_SLAB = registerBlock("smooth_stone_chiseled_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_STAIRS = registerBlock("smooth_stone_chiseled_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_CHISELED.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_VERTICAL_SLAB = registerBlock("smooth_stone_chiseled_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_CHISELED_CRACKED = registerBlock("smooth_stone_chiseled_cracked", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_CRACKED_SLAB = registerBlock("smooth_stone_chiseled_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_CRACKED_STAIRS = registerBlock("smooth_stone_chiseled_cracked_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_CRACKED_VERTICAL_SLAB = registerBlock("smooth_stone_chiseled_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_CHISELED_MOSSY = registerBlock("smooth_stone_chiseled_mossy", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_MOSSY_SLAB = registerBlock("smooth_stone_chiseled_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_MOSSY_STAIRS = registerBlock("smooth_stone_chiseled_mossy_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_CHISELED_MOSSY_VERTICAL_SLAB = registerBlock("smooth_stone_chiseled_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_FENCE = registerBlock("smooth_stone_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_WALL = registerBlock("smooth_stone_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_SLAB = registerBlock("smooth_stone_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_STAIRS = registerBlock("smooth_stone_tiles_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_TILES.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_VERTICAL_SLAB = registerBlock("smooth_stone_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_TILES_CRACKED = registerBlock("smooth_stone_tiles_cracked", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_CRACKED_FENCE = registerBlock("smooth_stone_tiles_cracked_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_CRACKED_WALL = registerBlock("smooth_stone_tiles_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_CRACKED_SLAB = registerBlock("smooth_stone_tiles_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_CRACKED_STAIRS = registerBlock("smooth_stone_tiles_cracked_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_TILES_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_CRACKED_VERTICAL_SLAB = registerBlock("smooth_stone_tiles_cracked_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_STONE_TILES_MOSSY = registerBlock("smooth_stone_tiles_mossy", new Block(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_MOSSY_FENCE = registerBlock("smooth_stone_tiles_mossy_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_MOSSY_WALL = registerBlock("smooth_stone_tiles_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_MOSSY_SLAB = registerBlock("smooth_stone_tiles_mossy_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_MOSSY_STAIRS = registerBlock("smooth_stone_tiles_mossy_stairs", new StairsBlock(ModBlocks.SMOOTH_STONE_TILES_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TILES_MOSSY_VERTICAL_SLAB = registerBlock("smooth_stone_tiles_mossy_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_STONE)));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_FENCE = registerBlock("smooth_sandstone_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_SANDSTONE)));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE = registerBlock("smooth_red_sandstone_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_RED_SANDSTONE)));

    public static final Block SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab", new SlabBlock(FabricBlockSettings.copyOf(SEA_LANTERN)));
    public static final Block SEA_LANTERN_VERTICAL_SLAB = registerBlock("sea_lantern_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SEA_LANTERN)));
    public static final Block SEA_LANTERN_WALL = registerBlock("sea_lantern_wall", new WallBlock(FabricBlockSettings.copyOf(SEA_LANTERN)));
    public static final Block SEA_LANTERN_FENCE = registerBlock("sea_lantern_fence", new FenceBlock(FabricBlockSettings.copyOf(SEA_LANTERN)));
    public static final Block SEA_LANTERN_STAIRS = registerBlock("sea_lantern_stairs", new StairsBlock(SEA_LANTERN.getDefaultState(),FabricBlockSettings.copyOf(SEA_LANTERN)));

    public static final Block PRISMARINE_FENCE = registerBlock("prismarine_fence", new FenceBlock(FabricBlockSettings.copyOf(PRISMARINE)));
    public static final Block PRISMARINE_VERTICAL_SLAB = registerBlock("prismarine_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PRISMARINE)));

    public static final Block PRISMARINE_BRICKS_FENCE = registerBlock("prismarine_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WALL = registerBlock("prismarine_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_VERTICAL_SLAB = registerBlock("prismarine_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PRISMARINE_BRICKS)));

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall", new WallBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_FENCE = registerBlock("dark_prismarine_fence", new FenceBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerBlock("dark_prismarine_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE)));

    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab", new SlabBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block NETHERRACK_VERTICAL_SLAB = registerBlock("netherrack_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", new WallBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block NETHERRACK_FENCE = registerBlock("netherrack_fence", new FenceBlock(FabricBlockSettings.copyOf(NETHERRACK)));
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs", new StairsBlock(NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(NETHERRACK)));

    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerBlock("nether_brick_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(NETHER_BRICKS)));

    public static final Block CRACKED_NETHER_BRICK_VERTICAL_SLAB = registerBlock("cracked_nether_brick_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs", new StairsBlock(CRACKED_NETHER_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall", new WallBlock(FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS)));

    public static final Block CHISELED_NETHER_BRICK_SLAB = registerBlock("chiseled_nether_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(CHISELED_NETHER_BRICKS)));
    public static final Block CHISELED_NETHER_BRICK_VERTICAL_SLAB = registerBlock("chiseled_nether_brick_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CHISELED_NETHER_BRICKS)));
    public static final Block CHISELED_NETHER_BRICK_STAIRS = registerBlock("chiseled_nether_brick_stairs", new StairsBlock(CHISELED_NETHER_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CHISELED_NETHER_BRICKS)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_SLAB = registerBlock("calcite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_VERTICAL_SLAB = registerBlock("calcite_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_STAIRS = registerBlock("calcite_bricks_stairs", new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_WALL = registerBlock("calcite_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_FENCE = registerBlock("calcite_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CALCITE_TILES  = registerBlock("calcite_tiles", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_SLAB = registerBlock("calcite_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_VERTICAL_SLAB = registerBlock("calcite_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_STAIRS = registerBlock("calcite_tiles_stairs", new StairsBlock(ModBlocks.CALCITE_TILES.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_WALL = registerBlock("calcite_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_FENCE = registerBlock("calcite_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_SLAB = registerBlock("chiseled_calcite_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_VERTICAL_SLAB = registerBlock("chiseled_calcite_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_STAIRS = registerBlock("chiseled_calcite_stairs", new StairsBlock(CHISELED_CALCITE.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CHISELED_CALCITE_CRACKED = registerBlock("cracked_chiseled_calcite", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_CRACKED_SLAB = registerBlock("cracked_chiseled_calcite_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_CRACKED_VERTICAL_SLAB = registerBlock("cracked_chiseled_calcite_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_CRACKED_STAIRS = registerBlock("cracked_chiseled_calcite_stairs", new StairsBlock(CHISELED_CALCITE_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CHISELED_CALCITE_MOSSY = registerBlock("mossy_chiseled_calcite", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_MOSSY_SLAB = registerBlock("mossy_chiseled_calcite_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_MOSSY_VERTICAL_SLAB = registerBlock("mossy_chiseled_calcite_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CHISELED_CALCITE_MOSSY_STAIRS = registerBlock("mossy_chiseled_calcite_stairs", new StairsBlock(CHISELED_CALCITE_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CALCITE_BRICKS_CRACKED = registerBlock("cracked_calcite_bricks", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_CRACKED_SLAB = registerBlock("cracked_calcite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("cracked_calcite_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_CRACKED_STAIRS = registerBlock("cracked_calcite_bricks_stairs", new StairsBlock(ModBlocks.CALCITE_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_CRACKED_WALL = registerBlock("cracked_calcite_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_CRACKED_FENCE = registerBlock("cracked_calcite_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CALCITE_TILES_CRACKED = registerBlock("cracked_calcite_tiles", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_CRACKED_SLAB = registerBlock("cracked_calcite_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_CRACKED_VERTICAL_SLAB = registerBlock("cracked_calcite_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_CRACKED_STAIRS = registerBlock("cracked_calcite_tiles_stairs", new StairsBlock(ModBlocks.CALCITE_TILES_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_CRACKED_WALL = registerBlock("cracked_calcite_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_CRACKED_FENCE = registerBlock("cracked_calcite_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CALCITE_BRICKS_MOSSY = registerBlock("mossy_calcite_bricks", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_MOSSY_SLAB = registerBlock("mossy_calcite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("mossy_calcite_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_MOSSY_STAIRS = registerBlock("mossy_calcite_bricks_stairs", new StairsBlock(ModBlocks.CALCITE_BRICKS_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_MOSSY_WALL = registerBlock("mossy_calcite_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_BRICKS_MOSSY_FENCE = registerBlock("mossy_calcite_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(CALCITE)));

    public static final Block CALCITE_TILES_MOSSY = registerBlock("mossy_calcite_tiles", new Block(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_MOSSY_SLAB = registerBlock("mossy_calcite_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_MOSSY_VERTICAL_SLAB = registerBlock("mossy_calcite_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_MOSSY_STAIRS = registerBlock("mossy_calcite_tiles_stairs", new StairsBlock(ModBlocks.CALCITE_TILES_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_MOSSY_WALL = registerBlock("mossy_calcite_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(CALCITE)));
    public static final Block CALCITE_TILES_MOSSY_FENCE = registerBlock("mossy_calcite_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(CALCITE)));

    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_SLAB = registerBlock("tuff_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_VERTICAL_SLAB = registerBlock("tuff_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_STAIRS = registerBlock("tuff_bricks_stairs", new StairsBlock(ModBlocks.TUFF_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_WALL = registerBlock("tuff_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_FENCE = registerBlock("tuff_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(TUFF)));

    public static final Block TUFF_TILES  = registerBlock("tuff_tiles", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_SLAB = registerBlock("tuff_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_VERTICAL_SLAB = registerBlock("tuff_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_STAIRS = registerBlock("tuff_tiles_stairs", new StairsBlock(ModBlocks.TUFF_TILES.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_WALL = registerBlock("tuff_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_FENCE = registerBlock("tuff_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(TUFF)));

    public static final Block CHISELED_TUFF = registerBlock("chiseled_tuff", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_SLAB = registerBlock("chiseled_tuff_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_VERTICAL_SLAB = registerBlock("chiseled_tuff_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_STAIRS = registerBlock("chiseled_tuff_stairs", new StairsBlock(CHISELED_TUFF.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));

    public static final Block CHISELED_TUFF_CRACKED = registerBlock("cracked_chiseled_tuff", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_CRACKED_SLAB = registerBlock("cracked_chiseled_tuff_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_CRACKED_VERTICAL_SLAB = registerBlock("cracked_chiseled_tuff_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_CRACKED_STAIRS = registerBlock("cracked_chiseled_tuff_stairs", new StairsBlock(CHISELED_TUFF_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));

    public static final Block CHISELED_TUFF_MOSSY = registerBlock("mossy_chiseled_tuff", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_MOSSY_SLAB = registerBlock("mossy_chiseled_tuff_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_MOSSY_VERTICAL_SLAB = registerBlock("mossy_chiseled_tuff_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block CHISELED_TUFF_MOSSY_STAIRS = registerBlock("mossy_chiseled_tuff_stairs", new StairsBlock(CHISELED_TUFF_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));

    public static final Block TUFF_BRICKS_CRACKED = registerBlock("cracked_tuff_bricks", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_CRACKED_SLAB = registerBlock("cracked_tuff_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_CRACKED_VERTICAL_SLAB = registerBlock("cracked_tuff_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_CRACKED_STAIRS = registerBlock("cracked_tuff_bricks_stairs", new StairsBlock(ModBlocks.TUFF_BRICKS_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_CRACKED_WALL = registerBlock("cracked_tuff_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_CRACKED_FENCE = registerBlock("cracked_tuff_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(TUFF)));

    public static final Block TUFF_TILES_CRACKED = registerBlock("cracked_tuff_tiles", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_CRACKED_SLAB = registerBlock("cracked_tuff_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_CRACKED_VERTICAL_SLAB = registerBlock("cracked_tuff_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_CRACKED_STAIRS = registerBlock("cracked_tuff_tiles_stairs", new StairsBlock(ModBlocks.TUFF_TILES_CRACKED.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_CRACKED_WALL = registerBlock("cracked_tuff_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_CRACKED_FENCE = registerBlock("cracked_tuff_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(TUFF)));

    public static final Block TUFF_BRICKS_MOSSY = registerBlock("mossy_tuff_bricks", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_MOSSY_SLAB = registerBlock("mossy_tuff_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_MOSSY_VERTICAL_SLAB = registerBlock("mossy_tuff_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_MOSSY_STAIRS = registerBlock("mossy_tuff_bricks_stairs", new StairsBlock(ModBlocks.TUFF_BRICKS_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_MOSSY_WALL = registerBlock("mossy_tuff_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_BRICKS_MOSSY_FENCE = registerBlock("mossy_tuff_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(TUFF)));

    public static final Block TUFF_TILES_MOSSY = registerBlock("mossy_tuff_tiles", new Block(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_MOSSY_SLAB = registerBlock("mossy_tuff_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_MOSSY_VERTICAL_SLAB = registerBlock("mossy_tuff_tiles_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_MOSSY_STAIRS = registerBlock("mossy_tuff_tiles_stairs", new StairsBlock(ModBlocks.TUFF_TILES_MOSSY.getDefaultState(),FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_MOSSY_WALL = registerBlock("mossy_tuff_tiles_wall", new WallBlock(FabricBlockSettings.copyOf(TUFF)));
    public static final Block TUFF_TILES_MOSSY_FENCE = registerBlock("mossy_tuff_tiles_fence", new FenceBlock(FabricBlockSettings.copyOf(TUFF)));

    public static final Block RED_NETHER_BRICKS_FENCE = registerBlock("red_nether_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICKS_VERTICAL_SLAB = registerBlock("red_nether_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(RED_NETHER_BRICKS)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", new StairsBlock(SMOOTH_BASALT.getDefaultState(),FabricBlockSettings.copyOf(SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_VERTICAL_SLAB = registerBlock("smooth_basalt_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_BASALT)));

    public static final Block BLACKSTONE_FENCE = registerBlock("blackstone_fence", new FenceBlock(FabricBlockSettings.copyOf(BLACKSTONE)));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerBlock("blackstone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BLACKSTONE)));

    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab", new SlabBlock(FabricBlockSettings.copyOf(GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs", new StairsBlock(GILDED_BLACKSTONE.getDefaultState(),FabricBlockSettings.copyOf(GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall", new WallBlock(FabricBlockSettings.copyOf(GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_FENCE = registerBlock("gilded_blackstone_fence", new FenceBlock(FabricBlockSettings.copyOf(GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_VERTICAL_SLAB = registerBlock("gilded_blackstone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GILDED_BLACKSTONE)));

    public static final Block CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("chiseled_polished_blackstone_slab", new SlabBlock(FabricBlockSettings.copyOf(CHISELED_POLISHED_BLACKSTONE)));
    public static final Block CHISELED_POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlock("chiseled_polished_blackstone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CHISELED_POLISHED_BLACKSTONE)));
    public static final Block CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock("chiseled_polished_blackstone_stairs", new StairsBlock(CHISELED_POLISHED_BLACKSTONE.getDefaultState(),FabricBlockSettings.copyOf(CHISELED_POLISHED_BLACKSTONE)));

    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlock("polished_blackstone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_FENCE = registerBlock("polished_blackstone_fence", new FenceBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE)));

    public static final Block POLISHED_BLACKSTONE_BRICKS_VERTICAL_SLAB = registerBlock("polished_blackstone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_FENCE = registerBlock("polished_blackstone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE = registerBlock("cracked_polished_blackstone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("cracked_polished_blackstone_bricks_stairs", new StairsBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL = registerBlock("cracked_polished_blackstone_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("cracked_polished_blackstone_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_VERTICAL_SLAB = registerBlock("cracked_polished_blackstone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(POLISHED_BLACKSTONE_BRICKS)));

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(END_STONE)));
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs", new StairsBlock(END_STONE.getDefaultState(),FabricBlockSettings.copyOf(END_STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall", new WallBlock(FabricBlockSettings.copyOf(END_STONE)));
    public static final Block END_STONE_FENCE = registerBlock("end_stone_fence", new FenceBlock(FabricBlockSettings.copyOf(END_STONE)));
    public static final Block END_STONE_VERTICAL_SLAB = registerBlock("end_stone_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(END_STONE)));

    public static final Block END_STONE_BRICKS_VERTICAL_SLAB = registerBlock("end_stone_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_FENCE = registerBlock("end_stone_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(END_STONE_BRICKS)));

    public static final Block PURPUR_WALL = registerBlock("purpur_wall", new WallBlock(FabricBlockSettings.copyOf(PURPUR_BLOCK)));
    public static final Block PURPUR_FENCE = registerBlock("purpur_fence", new FenceBlock(FabricBlockSettings.copyOf(PURPUR_BLOCK)));
    public static final Block PURPUR_VERTICAL_SLAB = registerBlock("purpur_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PURPUR_BLOCK)));

    public static final Block QUARTZ_BRICKS_VERTICAL_SLAB = registerBlock("quartz_bricks_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WALL = registerBlock("quartz_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(QUARTZ_BLOCK)));
    public static final Block QUARTZ_BRICKS_FENCE = registerBlock("quartz_bricks_fence", new FenceBlock(FabricBlockSettings.copyOf(QUARTZ_BLOCK)));

    public static final Block SMOOTH_QUARTZ_FENCE = registerBlock("smooth_quartz_fence", new FenceBlock(FabricBlockSettings.copyOf(SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall", new WallBlock(FabricBlockSettings.copyOf(SMOOTH_QUARTZ)));

    public static final Block AMETHYST_SLAB = registerBlock("amethyst_block_slab", new SlabBlock(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs", new StairsBlock(AMETHYST_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(AMETHYST_BLOCK)));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall", new WallBlock(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));
    public static final Block AMETHYST_FENCE = registerBlock("amethyst_fence", new FenceBlock(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));
    public static final Block AMETHYST_VERTICAL_SLAB = registerBlock("amethyst_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(TERRACOTTA)));
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", new StairsBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(TERRACOTTA)));
    public static final Block TERRACOTTA_FENCE = registerBlock("terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(TERRACOTTA)));
    public static final Block TERRACOTTA_VERTICAL_SLAB = registerBlock("terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", new StairsBlock(WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_VERTICAL_SLAB = registerBlock("white_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(WHITE_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", new StairsBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_VERTICAL_SLAB = registerBlock("light_gray_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", new StairsBlock(GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_FENCE = registerBlock("gray_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_VERTICAL_SLAB = registerBlock("gray_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GRAY_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", new StairsBlock(BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_VERTICAL_SLAB = registerBlock("black_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BLACK_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", new StairsBlock(BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_FENCE = registerBlock("brown_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_VERTICAL_SLAB = registerBlock("brown_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BROWN_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", new StairsBlock(RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_VERTICAL_SLAB = registerBlock("red_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(RED_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", new StairsBlock(ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_VERTICAL_SLAB = registerBlock("orange_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(ORANGE_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", new StairsBlock(YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_FENCE = registerBlock("yellow_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_VERTICAL_SLAB = registerBlock("yellow_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(YELLOW_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", new StairsBlock(LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_FENCE = registerBlock("lime_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_VERTICAL_SLAB = registerBlock("lime_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(LIME_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", new StairsBlock(GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_FENCE = registerBlock("green_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_VERTICAL_SLAB = registerBlock("green_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(GREEN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", new StairsBlock(CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_FENCE = registerBlock("cyan_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_VERTICAL_SLAB = registerBlock("cyan_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(CYAN_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", new StairsBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_VERTICAL_SLAB = registerBlock("light_blue_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", new StairsBlock(BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_FENCE = registerBlock("blue_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_VERTICAL_SLAB = registerBlock("blue_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BLUE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", new StairsBlock(PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_FENCE = registerBlock("purple_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_VERTICAL_SLAB = registerBlock("purple_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PURPLE_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", new StairsBlock(MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_FENCE = registerBlock("magenta_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_VERTICAL_SLAB = registerBlock("magenta_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(MAGENTA_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_block_slab", new SlabBlock(FabricBlockSettings.copyOf(PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", new StairsBlock(PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", new WallBlock(FabricBlockSettings.copyOf(PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_FENCE = registerBlock("pink_terracotta_fence", new FenceBlock(FabricBlockSettings.copyOf(PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_VERTICAL_SLAB = registerBlock("pink_terracotta_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(PINK_TERRACOTTA)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BuildersShop.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BuildersShop.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BuildersShop.LOGGER.info("Adding cool blocks from " + BuildersShop.MOD_ID);
    }
}

