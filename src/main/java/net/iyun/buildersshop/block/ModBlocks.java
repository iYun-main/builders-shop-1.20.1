package net.iyun.buildersshop.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.iyun.buildersshop.BuildersShop;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block PLACE = registerBlock("placeholder", new Block(FabricBlockSettings.copyOf(DIRT)));

    public static final Block OAK_VERTICAL_SLAB = registerBlock("vertical_oak_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(OAK_PLANKS)));
    public static final Block DIRT_VERTICAL_SLAB = registerBlock("vertical_dirt_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(DIRT)));
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

    public static final Block DIRT_WALL = registerBlock("dirt_wall", new WallBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_FENCE = registerBlock("dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs", new StairsBlock(Blocks.DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DIRT)));
    // public static final Block DIRT_BUTTON = registerBlock("dirt_button", new ButtonBlock(FabricBlockSettings.copyOf(DIRT).sounds(BlockSoundGroup.ROOTED_DIRT),BlockSetType.STONE,90, false));

    public static final Block CDIRT_WALL = registerBlock("coarse_dirt_wall", new WallBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_SLAB = registerBlock("coarse_dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_FENCE = registerBlock("coarse_dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(COARSE_DIRT)));
    public static final Block CDIRT_STAIRS = registerBlock("coarse_dirt_stairs", new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)));
    // public static final Block CDIRT_BUTTON = registerBlock("coarse_dirt_button", new ButtonBlock(FabricBlockSettings.copyOf(COARSE_DIRT).sounds(BlockSoundGroup.ROOTED_DIRT),BlockSetType.STONE,90, false));

    public static final Block RDIRT_WALL = registerBlock("rooted_dirt_wall", new WallBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_SLAB = registerBlock("rooted_dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_FENCE = registerBlock("rooted_dirt_fence", new FenceBlock(FabricBlockSettings.copyOf(ROOTED_DIRT)));
    public static final Block RDIRT_STAIRS = registerBlock("rooted_dirt_stairs", new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
   // public static final Block RDIRT_BUTTON = registerBlock("rooted_dirt_button", new ButtonBlock(FabricBlockSettings.copyOf(ROOTED_DIRT).sounds(BlockSoundGroup.ROOTED_DIRT),BlockSetType.STONE,90, false));

    public static final Block MUD_WALL = registerBlock("mud_wall", new WallBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_SLAB = registerBlock("mud_slab", new SlabBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_FENCE = registerBlock("mud_fence", new FenceBlock(FabricBlockSettings.copyOf(MUD)));
    public static final Block MUD_STAIRS = registerBlock("mud_stairs", new StairsBlock(Blocks.MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MUD)));

    public static final Block PMUD_WALL = registerBlock("packed_mud_wall", new WallBlock(FabricBlockSettings.copyOf(PACKED_MUD)));
    public static final Block PMUD_SLAB = registerBlock("packed_mud_slab", new SlabBlock(FabricBlockSettings.copyOf(PACKED_MUD)));
    public static final Block PMUD_FENCE = registerBlock("packed_mud_fence", new FenceBlock(FabricBlockSettings.copyOf(PACKED_MUD)));
    public static final Block PMUD_STAIRS = registerBlock("packed_mud_stairs", new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));

    public static final Block CLAY_WALL = registerBlock("clay_wall", new WallBlock(FabricBlockSettings.copyOf(CLAY)));
    public static final Block CLAY_SLAB = registerBlock("clay_slab", new SlabBlock(FabricBlockSettings.copyOf(CLAY)));
    public static final Block CLAY_FENCE = registerBlock("clay_fence", new FenceBlock(FabricBlockSettings.copyOf(CLAY)));
    public static final Block CLAY_STAIRS = registerBlock("clay_stairs", new StairsBlock(Blocks.CLAY.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CLAY)));

    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", new WallBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(WHITE_WOOL)));
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_FENCE = registerBlock("light_gray_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall", new WallBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_FENCE = registerBlock("gray_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(GRAY_WOOL)));
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)));

    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", new WallBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_FENCE = registerBlock("black_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(BLACK_WOOL)));
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));

    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", new WallBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_FENCE = registerBlock("brown_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(BROWN_WOOL)));
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));

    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall", new WallBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_FENCE = registerBlock("red_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(RED_WOOL)));
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs", new StairsBlock(Blocks.RED_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_WOOL)));

    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", new WallBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)));

    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", new WallBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)));

    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall", new WallBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_FENCE = registerBlock("lime_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(LIME_WOOL)));
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_WOOL)));

    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall", new WallBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_FENCE = registerBlock("green_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(GREEN_WOOL)));
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)));

    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", new WallBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(CYAN_WOOL)));
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)));

    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", new WallBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)));

    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall", new WallBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_FENCE = registerBlock("blue_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(BLUE_WOOL)));
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)));

    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", new WallBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)));

    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall", new WallBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_FENCE = registerBlock("magenta_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)));

    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", new WallBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_FENCE = registerBlock("pink_wool_fence", new FenceBlock(FabricBlockSettings.copyOf(PINK_WOOL)));
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));


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

