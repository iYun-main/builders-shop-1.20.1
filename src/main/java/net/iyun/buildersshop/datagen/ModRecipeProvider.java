package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.iyun.buildersshop.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        verticalslab(ModBlocks.DIRT_VERTICAL_SLAB, Blocks.DIRT,exporter);
        verticalslab(ModBlocks.CDIRT_VERTICAL_SLAB, Blocks.COARSE_DIRT,exporter);
        verticalslab(ModBlocks.RDIRT_VERTICAL_SLAB, Blocks.ROOTED_DIRT,exporter);
        verticalslab(ModBlocks.MUD_VERTICAL_SLAB, Blocks.MUD,exporter);
        verticalslab(ModBlocks.CLAY_VERTICAL_SLAB, Blocks.CLAY,exporter);
        verticalslab(ModBlocks.PMUD_VERTICAL_SLAB, Blocks.PACKED_MUD,exporter);
        verticalslab(ModBlocks.WHITE_WOOL_VERTICAL_SLAB, Blocks.WHITE_WOOL,exporter);
        verticalslab(ModBlocks.GRAY_WOOL_VERTICAL_SLAB, Blocks.GRAY_WOOL,exporter);
        verticalslab(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB, Blocks.LIGHT_GRAY_WOOL,exporter);
        verticalslab(ModBlocks.BLACK_WOOL_VERTICAL_SLAB, Blocks.BLACK_WOOL,exporter);
        verticalslab(ModBlocks.BROWN_WOOL_VERTICAL_SLAB, Blocks.BROWN_WOOL,exporter);
        verticalslab(ModBlocks.RED_WOOL_VERTICAL_SLAB, Blocks.RED_WOOL,exporter);
        verticalslab(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB, Blocks.ORANGE_WOOL,exporter);
        verticalslab(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB, Blocks.YELLOW_WOOL,exporter);
        verticalslab(ModBlocks.LIME_WOOL_VERTICAL_SLAB, Blocks.LIME_WOOL,exporter);
        verticalslab(ModBlocks.GREEN_WOOL_VERTICAL_SLAB, Blocks.GREEN_WOOL,exporter);
        verticalslab(ModBlocks.CYAN_WOOL_VERTICAL_SLAB, Blocks.CYAN_WOOL,exporter);
        verticalslab(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB, Blocks.LIGHT_BLUE_WOOL,exporter);
        verticalslab(ModBlocks.BLUE_WOOL_VERTICAL_SLAB, Blocks.BLUE_WOOL,exporter);
        verticalslab(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB, Blocks.PURPLE_WOOL,exporter);
        verticalslab(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB, Blocks.MAGENTA_WOOL,exporter);
        verticalslab(ModBlocks.PINK_WOOL_VERTICAL_SLAB, Blocks.PINK_WOOL,exporter);
        verticalslab(ModBlocks.OAK_VERTICAL_SLAB, Blocks.OAK_PLANKS,exporter);
        verticalslab(ModBlocks.BIRCH_VERTICAL_SLAB, Blocks.BIRCH_PLANKS,exporter);
        verticalslab(ModBlocks.SPRUCE_VERTICAL_SLAB, Blocks.SPRUCE_PLANKS,exporter);
        verticalslab(ModBlocks.JUNGLE_VERTICAL_SLAB, Blocks.JUNGLE_PLANKS,exporter);
        verticalslab(ModBlocks.ACA_VERTICAL_SLAB, Blocks.ACACIA_PLANKS,exporter);
        verticalslab(ModBlocks.DARK_OAK_VERTICAL_SLAB, Blocks.DARK_OAK_PLANKS,exporter);
        verticalslab(ModBlocks.MANGROVE_VERTICAL_SLAB, Blocks.MANGROVE_PLANKS,exporter);
        verticalslab(ModBlocks.CHERRY_VERTICAL_SLAB, Blocks.CHERRY_PLANKS,exporter);
        verticalslab(ModBlocks.BAMBOO_VERTICAL_SLAB, Blocks.BAMBOO_PLANKS,exporter);
        verticalslab(ModBlocks.WARPED_VERTICAL_SLAB, Blocks.WARPED_PLANKS,exporter);
        verticalslab(ModBlocks.CRIMSON_VERTICAL_SLAB, Blocks.CRIMSON_PLANKS,exporter);
        verticalslab(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS,exporter);
        verticalslab(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS,exporter);
        verticalslab(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS,exporter);
        verticalslab(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS,exporter);
        verticalslab(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS,exporter);
        verticalslab(ModBlocks.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE,exporter);
        verticalslab(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, Blocks.MOSSY_COBBLESTONE,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, Blocks.SMOOTH_STONE,exporter);
        verticalslab(ModBlocks.STONE_VERTICAL_SLAB, Blocks.STONE,exporter);
        verticalslab(ModBlocks.CRACKED_STONE_BRICKS_VERTICAL_SLAB, Blocks.CRACKED_STONE_BRICKS,exporter);
        verticalslab(ModBlocks.STONE_BRICKS_VERTICAL_SLAB, Blocks.STONE_BRICKS,exporter);
        verticalslab(ModBlocks.CHISELED_STONE_BRICKS_VERTICAL_SLAB, Blocks.CHISELED_STONE_BRICKS,exporter);
        verticalslab(ModBlocks.MOSSY_STONE_BRICKS_VERTICAL_SLAB, Blocks.MOSSY_STONE_BRICKS,exporter);
        verticalslab(ModBlocks.GRANITE_VERTICAL_SLAB, Blocks.GRANITE,exporter);
        verticalslab(ModBlocks.ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE,exporter);
        verticalslab(ModBlocks.DIORITE_VERTICAL_SLAB, Blocks.DIORITE,exporter);
        verticalslab(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE,exporter);
        verticalslab(ModBlocks.CHISELED_DEEPSLATE_VERTICAL_SLAB, Blocks.CHISELED_DEEPSLATE,exporter);
        verticalslab(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE,exporter);
        verticalslab(ModBlocks.DEEPSLATE_BRICKS_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS,exporter);
        verticalslab(ModBlocks.CRACKED_DEEPSLATE_BRICKS_VERTICAL_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS,exporter);
        verticalslab(ModBlocks.CRACKED_DEEPSLATE_TILES_VERTICAL_SLAB, Blocks.CRACKED_DEEPSLATE_TILES,exporter);
        verticalslab(ModBlocks.DEEPSLATE_TILES_VERTICAL_SLAB, Blocks.DEEPSLATE_TILES,exporter);
        verticalslab(ModBlocks.BRICKS_VERTICAL_SLAB, Blocks.BRICKS,exporter);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIRT_SLAB, Blocks.DIRT);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CDIRT_SLAB, Blocks.COARSE_DIRT);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.RDIRT_SLAB, Blocks.ROOTED_DIRT);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.MUD_SLAB, Blocks.MUD);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CLAY_SLAB, Blocks.CLAY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.PMUD_SLAB, Blocks.PACKED_MUD);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICKS_SLAB, ModBlocks.ANDESITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB, ModBlocks.ANDESITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB, ModBlocks.ANDESITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICKS_SLAB, ModBlocks.GRANITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICKS_CRACKED_SLAB, ModBlocks.GRANITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICKS_MOSSY_SLAB, ModBlocks.GRANITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICKS_SLAB, ModBlocks.DIORITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICKS_CRACKED_SLAB, ModBlocks.DIORITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICKS_MOSSY_SLAB, ModBlocks.DIORITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OBSIDIAN_BRICKS_SLAB, ModBlocks.OBSIDIAN_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.COBSIDIAN_BRICKS_SLAB, ModBlocks.COBSIDIAN_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB, ModBlocks.OBSIDIAN_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB, ModBlocks.OBSIDIAN_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_STONE_BRICKS_SLAB, Blocks.CRACKED_STONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_STONE_BRICKS_SLAB, Blocks.CHISELED_STONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DEEPSLATE_TILES_SLAB, Blocks.DEEPSLATE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIRT_WALL, Blocks.DIRT);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.RDIRT_WALL, Blocks.ROOTED_DIRT);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CDIRT_WALL, Blocks.COARSE_DIRT);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.MUD_WALL, Blocks.MUD);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.PMUD_WALL, Blocks.PACKED_MUD);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CLAY_WALL, Blocks.CLAY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRAY_WOOL_WALL, Blocks.GRAY_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.BLACK_WOOL_WALL, Blocks.BLACK_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.BROWN_WOOL_WALL, Blocks.BROWN_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.RED_WOOL_WALL, Blocks.RED_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.LIME_WOOL_WALL, Blocks.LIME_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GREEN_WOOL_WALL, Blocks.GREEN_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CYAN_WOOL_WALL, Blocks.CYAN_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.BLUE_WOOL_WALL, Blocks.BLUE_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.MAGENTA_WOOL_WALL, Blocks.MAGENTA_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.PINK_WOOL_WALL, Blocks.PINK_WOOL);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_STONE_BRICKS_WALL, Blocks.CRACKED_STONE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_STONE_BRICKS_WALL, Blocks.CHISELED_STONE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_DEEPSLATE_WALL, Blocks.CHISELED_DEEPSLATE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DEEPSLATE_TILES_WALL, Blocks.DEEPSLATE_TILES);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_DEEPSLATE_TILES_WALL, Blocks.CRACKED_DEEPSLATE_TILES);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ANDESITE_BRICKS_WALL, ModBlocks.ANDESITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ANDESITE_BRICKS_CRACKED_WALL, ModBlocks.ANDESITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ANDESITE_BRICKS_MOSSY_WALL, ModBlocks.ANDESITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRANITE_BRICKS_WALL, ModBlocks.GRANITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRANITE_BRICKS_CRACKED_WALL, ModBlocks.GRANITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRANITE_BRICKS_MOSSY_WALL, ModBlocks.GRANITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIORITE_BRICKS_WALL, ModBlocks.DIORITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIORITE_BRICKS_CRACKED_WALL, ModBlocks.DIORITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIORITE_BRICKS_MOSSY_WALL, ModBlocks.DIORITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.OBSIDIAN_BRICKS_WALL, ModBlocks.OBSIDIAN_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.COBSIDIAN_BRICKS_WALL, ModBlocks.COBSIDIAN_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL, ModBlocks.OBSIDIAN_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL, ModBlocks.OBSIDIAN_BRICKS_MOSSY);

        createStairsRecipe(ModBlocks.DIRT_STAIRS, Ingredient.ofItems(Blocks.DIRT));
        createStairsRecipe(ModBlocks.CDIRT_STAIRS, Ingredient.ofItems(Blocks.COARSE_DIRT));
        createStairsRecipe(ModBlocks.RDIRT_STAIRS, Ingredient.ofItems(Blocks.ROOTED_DIRT));
        createStairsRecipe(ModBlocks.MUD_STAIRS, Ingredient.ofItems(Blocks.MUD));
        createStairsRecipe(ModBlocks.PMUD_STAIRS, Ingredient.ofItems(Blocks.PACKED_MUD));
        createStairsRecipe(ModBlocks.CLAY_STAIRS, Ingredient.ofItems(Blocks.CLAY));
        createStairsRecipe(ModBlocks.WHITE_WOOL_STAIRS,Ingredient.ofItems(Blocks.WHITE_WOOL));
        createStairsRecipe(ModBlocks.GRAY_WOOL_STAIRS,Ingredient.ofItems(Blocks.GRAY_WOOL));
        createStairsRecipe(ModBlocks.LIGHT_GRAY_WOOL_STAIRS,Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL));
        createStairsRecipe(ModBlocks.BLACK_WOOL_STAIRS,Ingredient.ofItems(Blocks.BLACK_WOOL));
        createStairsRecipe(ModBlocks.BROWN_WOOL_STAIRS,Ingredient.ofItems(Blocks.BROWN_WOOL));
        createStairsRecipe(ModBlocks.RED_WOOL_STAIRS,Ingredient.ofItems(Blocks.RED_WOOL));
        createStairsRecipe(ModBlocks.ORANGE_WOOL_STAIRS,Ingredient.ofItems(Blocks.ORANGE_WOOL));
        createStairsRecipe(ModBlocks.YELLOW_WOOL_STAIRS,Ingredient.ofItems(Blocks.YELLOW_WOOL));
        createStairsRecipe(ModBlocks.LIME_WOOL_STAIRS,Ingredient.ofItems(Blocks.LIME_WOOL));
        createStairsRecipe(ModBlocks.GREEN_WOOL_STAIRS,Ingredient.ofItems(Blocks.GREEN_WOOL));
        createStairsRecipe(ModBlocks.CYAN_WOOL_STAIRS,Ingredient.ofItems(Blocks.CYAN_WOOL));
        createStairsRecipe(ModBlocks.LIGHT_BLUE_WOOL_STAIRS,Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL));
        createStairsRecipe(ModBlocks.BLUE_WOOL_STAIRS,Ingredient.ofItems(Blocks.BLUE_WOOL));
        createStairsRecipe(ModBlocks.PURPLE_WOOL_STAIRS,Ingredient.ofItems(Blocks.PURPLE_WOOL));
        createStairsRecipe(ModBlocks.MAGENTA_WOOL_STAIRS,Ingredient.ofItems(Blocks.MAGENTA_WOOL));
        createStairsRecipe(ModBlocks.PINK_WOOL_STAIRS,Ingredient.ofItems(Blocks.PINK_WOOL));
        createStairsRecipe(ModBlocks.ANDESITE_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS));
        createStairsRecipe(ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS_CRACKED));
        createStairsRecipe(ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS_MOSSY));
        createStairsRecipe(ModBlocks.GRANITE_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS));
        createStairsRecipe(ModBlocks.GRANITE_BRICKS_CRACKED_SLAB, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS_CRACKED));
        createStairsRecipe(ModBlocks.GRANITE_BRICKS_MOSSY_SLAB, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS_MOSSY));
        createStairsRecipe(ModBlocks.DIORITE_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS));
        createStairsRecipe(ModBlocks.DIORITE_BRICKS_CRACKED_SLAB, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS_CRACKED));
        createStairsRecipe(ModBlocks.DIORITE_BRICKS_MOSSY_SLAB, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS_MOSSY));
        createStairsRecipe(ModBlocks.OBSIDIAN_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.OBSIDIAN_BRICKS));
        createStairsRecipe(ModBlocks.COBSIDIAN_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.COBSIDIAN_BRICKS));
        createStairsRecipe(ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB, Ingredient.ofItems(ModBlocks.OBSIDIAN_BRICKS_CRACKED));
        createStairsRecipe(ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB, Ingredient.ofItems(ModBlocks.OBSIDIAN_BRICKS_MOSSY));
        createStairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS));
        createStairsRecipe(ModBlocks.CHISELED_STONE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CHISELED_STONE_BRICKS));
        createStairsRecipe(ModBlocks.CHISELED_DEEPSLATE_STAIRS, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE));
        createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS));
        createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES));
        createStairsRecipe(ModBlocks.DEEPSLATE_TILES_STAIRS, Ingredient.ofItems(Blocks.DEEPSLATE_TILES));


    }

    private void verticalslab(ItemConvertible output, ItemConvertible itemConvertible, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output,6)
                .pattern("X")
                .pattern("X")
                .pattern("X")
                .input('X',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, new Identifier(getRecipeName(output)));

    }

}
