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
    public static final Block PLACE = registerBlock("placeholder", new Block(FabricBlockSettings.copyOf(DIRT)));

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

    public static final Block HORIZONTAL_OAK_PLANK = registerBlock("horizontal_oak_planks", new Block(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block HORIZONTAL_OAK_PLANK_SLAB = registerBlock("horizontal_oak_slab", new SlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block HORIZONTAL_OAK_PLANK_VERTICAL_SLAB = registerBlock("horizontal_oak_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block HORIZONTAL_OAK_PLANK_STAIRS = registerBlock("horizontal_oak_stairs", new StairsBlock(ModBlocks.HORIZONTAL_OAK_PLANK.getDefaultState(), FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block HORIZONTAL_OAK_PLANK_FENCE = registerBlock("horizontal_oak_fence", new FenceBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block HORIZONTAL_OAK_PLANK_WALL = registerBlock("horizontal_oak_wall", new WallBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block HORIZONTAL_OAK_PLANK_FENCE_GATE = registerBlock("horizontal_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(OAK_PLANKS), WoodType.OAK));

    public static final Block HORIZONTAL_BIRCH_PLANK = registerBlock("horizontal_birch_planks", new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_BIRCH_PLANK_SLAB = registerBlock("horizontal_birch_slab", new SlabBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_BIRCH_PLANK_VERTICAL_SLAB = registerBlock("horizontal_birch_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_BIRCH_PLANK_STAIRS = registerBlock("horizontal_birch_stairs", new StairsBlock(ModBlocks.HORIZONTAL_BIRCH_PLANK.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_BIRCH_PLANK_FENCE = registerBlock("horizontal_birch_fence", new FenceBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_BIRCH_PLANK_WALL = registerBlock("horizontal_birch_wall", new WallBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_BIRCH_PLANK_FENCE_GATE = registerBlock("horizontal_birch_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(BIRCH_PLANKS), WoodType.BIRCH));

    public static final Block HORIZONTAL_SPRUCE_PLANK = registerBlock("horizontal_spruce_planks", new Block(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block HORIZONTAL_SPRUCE_PLANK_SLAB = registerBlock("horizontal_spruce_slab", new SlabBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block HORIZONTAL_SPRUCE_PLANK_VERTICAL_SLAB = registerBlock("horizontal_spruce_vertical_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block HORIZONTAL_SPRUCE_PLANK_STAIRS = registerBlock("horizontal_spruce_stairs", new StairsBlock(ModBlocks.HORIZONTAL_SPRUCE_PLANK.getDefaultState(), FabricBlockSettings.copyOf(BIRCH_PLANKS)));
    public static final Block HORIZONTAL_SPRUCE_PLANK_FENCE = registerBlock("horizontal_spruce_fence", new FenceBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block HORIZONTAL_SPRUCE_PLANK_WALL = registerBlock("horizontal_spruce_wall", new WallBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS)));
    public static final Block HORIZONTAL_SPRUCE_PLANK_FENCE_GATE = registerBlock("horizontal_spruce_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(SPRUCE_PLANKS), WoodType.SPRUCE));


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

    public static final Block CHISELED_DEEPSLATE_WALL = registerBlock("chiseled_deepslate_wall", new WallBlock(FabricBlockSettings.copyOf(CHISELED_DEEPSLATE)));
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
    public static final Block TILES_OBSIDIAN_STAIRS = registerBlock("obsidian_tiles_stairs", new StairsBlock(ModBlocks.TILES_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_SLAB = registerBlock("obsidian_tiles_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_tiles_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TILES_CRACKED_OBSIDIAN = registerBlock("obsidian_tiles_cracked", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_WALL = registerBlock("obsidian_tiles_cracked_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_STAIRS = registerBlock("obsidian_tiles_cracked_stairs", new StairsBlock(ModBlocks.TILES_CRACKED_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_SLAB = registerBlock("obsidian_tiles_cracked_slab", new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB = registerBlock("vertical_obsidian_tiles_cracked_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TILES_MOSSY_OBSIDIAN = registerBlock("obsidian_tiles_mossy", new Block(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block TILES_MOSSY_OBSIDIAN_WALL = registerBlock("obsidian_tiles_mossy_wall", new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
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

