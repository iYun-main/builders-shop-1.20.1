package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.iyun.buildersshop.block.ModBlocks;
import net.iyun.buildersshop.item.ModItems;
import net.iyun.buildersshop.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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


        // V slabs
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

        verticalslab(ModBlocks.VERTICAL_OAK_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_OAK_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_BIRCH_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_BIRCH_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_SPRUCE_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_SPRUCE_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_JUNGLE_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_JUNGLE_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_ACACIA_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_ACACIA_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_DARK_OAK_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_DARK_OAK_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_MANGROVE_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_MANGROVE_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_CHERRY_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_CHERRY_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_BAMBOO_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_BAMBOO_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_WARPED_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_WARPED_PLANK,exporter);
        verticalslab(ModBlocks.VERTICAL_CRIMSON_PLANK_VERTICAL_SLAB, ModBlocks.VERTICAL_CRIMSON_PLANK,exporter);

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

        verticalslab(ModBlocks.CHISELED_ANDESITE_VERTICAL_SLAB, ModBlocks.CHISELED_ANDESITE,exporter);
        verticalslab(ModBlocks.CHISELED_CRACKED_ANDESITE_VERTICAL_SLAB, ModBlocks.CHISELED_CRACKED_ANDESITE,exporter);
        verticalslab(ModBlocks.CHISELED_ANDESITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_ANDESITE_MOSSY,exporter);
        verticalslab(ModBlocks.TILES_ANDESITE_VERTICAL_SLAB, ModBlocks.TILES_ANDESITE,exporter);
        verticalslab(ModBlocks.TILES_CRACKED_ANDESITE_VERTICAL_SLAB, ModBlocks.TILES_CRACKED_ANDESITE,exporter);
        verticalslab(ModBlocks.TILES_MOSSY_ANDESITE_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_ANDESITE,exporter);
        verticalslab(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS,exporter);
        verticalslab(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.CHISELED_DIORITE_VERTICAL_SLAB, ModBlocks.CHISELED_DIORITE,exporter);
        verticalslab(ModBlocks.CHISELED_CRACKED_DIORITE_VERTICAL_SLAB, ModBlocks.CHISELED_CRACKED_DIORITE,exporter);
        verticalslab(ModBlocks.CHISELED_DIORITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_DIORITE_MOSSY,exporter);
        verticalslab(ModBlocks.TILES_DIORITE_VERTICAL_SLAB, ModBlocks.TILES_DIORITE,exporter);
        verticalslab(ModBlocks.TILES_CRACKED_DIORITE_VERTICAL_SLAB, ModBlocks.TILES_CRACKED_DIORITE,exporter);
        verticalslab(ModBlocks.TILES_MOSSY_DIORITE_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_DIORITE,exporter);
        verticalslab(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS,exporter);
        verticalslab(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.CHISELED_GRANITE_VERTICAL_SLAB, ModBlocks.CHISELED_GRANITE,exporter);
        verticalslab(ModBlocks.CHISELED_CRACKED_GRANITE_VERTICAL_SLAB, ModBlocks.CHISELED_CRACKED_GRANITE,exporter);
        verticalslab(ModBlocks.CHISELED_GRANITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_GRANITE_MOSSY,exporter);
        verticalslab(ModBlocks.TILES_GRANITE_VERTICAL_SLAB, ModBlocks.TILES_GRANITE,exporter);
        verticalslab(ModBlocks.TILES_CRACKED_GRANITE_VERTICAL_SLAB, ModBlocks.TILES_CRACKED_GRANITE,exporter);
        verticalslab(ModBlocks.TILES_MOSSY_GRANITE_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_GRANITE,exporter);
        verticalslab(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS,exporter);
        verticalslab(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.CHISELED_OBSIDIAN_VERTICAL_SLAB, ModBlocks.CHISELED_OBSIDIAN,exporter);
        verticalslab(ModBlocks.CHISELED_CRACKED_OBSIDIAN_VERTICAL_SLAB, ModBlocks.CHISELED_CRACKED_OBSIDIAN,exporter);
        verticalslab(ModBlocks.CHISELED_OBSIDIAN_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_OBSIDIAN_MOSSY,exporter);
        verticalslab(ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB, ModBlocks.TILES_OBSIDIAN,exporter);
        verticalslab(ModBlocks.TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB, ModBlocks.TILES_CRACKED_OBSIDIAN,exporter);
        verticalslab(ModBlocks.TILES_MOSSY_OBSIDIAN_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_OBSIDIAN,exporter);
        verticalslab(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS,exporter);
        verticalslab(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_CHISELED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_CHISELED,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_CHISELED_CRACKED,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_TILES_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_TILES,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_TILES_CRACKED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_TILES_CRACKED,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_TILES_MOSSY_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_TILES_MOSSY,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_BRICKS_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_BRICKS,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.CHISELED_COBSIDIAN_RUNIC_VERTICAL_SLAB, ModBlocks.CHISELED_COBSIDIAN_RUNIC,exporter);

        verticalslab(ModBlocks.CALCITE_TILES_VERTICAL_SLAB, ModBlocks.CALCITE_TILES,exporter);
        verticalslab(ModBlocks.CALCITE_BRICKS_VERTICAL_SLAB, ModBlocks.CALCITE_BRICKS,exporter);
        verticalslab(ModBlocks.CHISELED_CALCITE_VERTICAL_SLAB, ModBlocks.CHISELED_CALCITE,exporter);
        verticalslab(ModBlocks.CALCITE_TILES_CRACKED_VERTICAL_SLAB, ModBlocks.CALCITE_TILES_CRACKED,exporter);
        verticalslab(ModBlocks.CALCITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.CALCITE_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.CHISELED_CALCITE_CRACKED_VERTICAL_SLAB, ModBlocks.CHISELED_CALCITE_CRACKED,exporter);
        verticalslab(ModBlocks.CALCITE_TILES_MOSSY_VERTICAL_SLAB, ModBlocks.CALCITE_TILES_MOSSY,exporter);
        verticalslab(ModBlocks.CALCITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.CALCITE_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.CHISELED_CALCITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_CALCITE_MOSSY,exporter);

        verticalslab(ModBlocks.TUFF_TILES_VERTICAL_SLAB, ModBlocks.TUFF_TILES,exporter);
        verticalslab(ModBlocks.TUFF_BRICKS_VERTICAL_SLAB, ModBlocks.TUFF_BRICKS,exporter);
        verticalslab(ModBlocks.CHISELED_TUFF_VERTICAL_SLAB, ModBlocks.CHISELED_TUFF,exporter);
        verticalslab(ModBlocks.TUFF_TILES_CRACKED_VERTICAL_SLAB, ModBlocks.TUFF_TILES_CRACKED,exporter);
        verticalslab(ModBlocks.TUFF_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.TUFF_BRICKS_CRACKED,exporter);
        verticalslab(ModBlocks.CHISELED_TUFF_CRACKED_VERTICAL_SLAB, ModBlocks.CHISELED_TUFF_CRACKED,exporter);
        verticalslab(ModBlocks.TUFF_TILES_MOSSY_VERTICAL_SLAB, ModBlocks.TUFF_TILES_MOSSY,exporter);
        verticalslab(ModBlocks.TUFF_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.TUFF_BRICKS_MOSSY,exporter);
        verticalslab(ModBlocks.CHISELED_TUFF_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_TUFF_MOSSY,exporter);
        verticalslab(ModBlocks.SEA_LANTERN_VERTICAL_SLAB, Blocks.SEA_LANTERN,exporter);
        verticalslab(ModBlocks.PRISMARINE_VERTICAL_SLAB, Blocks.PRISMARINE,exporter);
        verticalslab(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, Blocks.DARK_PRISMARINE,exporter);
        verticalslab(ModBlocks.NETHERRACK_VERTICAL_SLAB, Blocks.NETHERRACK,exporter);
        verticalslab(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, Blocks.NETHER_BRICKS,exporter);
        verticalslab(ModBlocks.CRACKED_NETHER_BRICK_VERTICAL_SLAB, Blocks.CRACKED_NETHER_BRICKS,exporter);
        verticalslab(ModBlocks.CHISELED_NETHER_BRICK_VERTICAL_SLAB, Blocks.CHISELED_NETHER_BRICKS,exporter);
        verticalslab(ModBlocks.RED_NETHER_BRICKS_FENCE, Blocks.RED_NETHER_BRICKS,exporter);
        verticalslab(ModBlocks.SMOOTH_BASALT_VERTICAL_SLAB, Blocks.SMOOTH_BASALT,exporter);
        verticalslab(ModBlocks.BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE,exporter);
        verticalslab(ModBlocks.GILDED_BLACKSTONE_VERTICAL_SLAB, Blocks.GILDED_BLACKSTONE,exporter);
        verticalslab(ModBlocks.CHISELED_POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE,exporter);

        stonefences(ModBlocks.TUFF_TILES_FENCE, ModBlocks.TUFF_TILES,exporter);
        stonefences(ModBlocks.TUFF_BRICKS_FENCE, ModBlocks.TUFF_BRICKS,exporter);
        stonefences(ModBlocks.TUFF_TILES_MOSSY_FENCE, ModBlocks.TUFF_TILES_MOSSY,exporter);
        stonefences(ModBlocks.TUFF_BRICKS_MOSSY_FENCE, ModBlocks.TUFF_BRICKS_MOSSY,exporter);
        stonefences(ModBlocks.TUFF_TILES_CRACKED_FENCE, ModBlocks.TUFF_TILES_CRACKED,exporter);
        stonefences(ModBlocks.TUFF_BRICKS_CRACKED_FENCE, ModBlocks.TUFF_BRICKS_CRACKED,exporter);
        stonefences(ModBlocks.SEA_LANTERN_FENCE, Blocks.SEA_LANTERN,exporter);
        stonefences(ModBlocks.PRISMARINE_FENCE, Blocks.PRISMARINE,exporter);
        stonefences(ModBlocks.PRISMARINE_BRICKS_FENCE, Blocks.PRISMARINE_BRICKS,exporter);
        stonefences(ModBlocks.DARK_PRISMARINE_FENCE, Blocks.DARK_PRISMARINE,exporter);
        stonefences(ModBlocks.NETHERRACK_FENCE, Blocks.NETHERRACK,exporter);
        stonefences(ModBlocks.CRACKED_NETHER_BRICK_FENCE, Blocks.CRACKED_NETHER_BRICKS,exporter);
        stonefences(ModBlocks.SMOOTH_BASALT_FENCE, Blocks.SMOOTH_BASALT,exporter);
        stonefences(ModBlocks.BLACKSTONE_FENCE, Blocks.BLACKSTONE,exporter);
        stonefences(ModBlocks.GILDED_BLACKSTONE_FENCE, Blocks.GILDED_BLACKSTONE,exporter);

        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_TILES_SLAB, ModBlocks.TUFF_TILES);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_BRICKS_SLAB, ModBlocks.TUFF_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_TILES_MOSSY_SLAB, ModBlocks.TUFF_TILES_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_BRICKS_MOSSY_SLAB, ModBlocks.TUFF_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_TILES_CRACKED_SLAB, ModBlocks.TUFF_TILES_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_BRICKS_CRACKED_SLAB, ModBlocks.TUFF_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_TUFF_CRACKED_SLAB, ModBlocks.CHISELED_TUFF_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_TUFF_MOSSY_SLAB, ModBlocks.CHISELED_TUFF_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_TUFF_SLAB, ModBlocks.CHISELED_TUFF);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_TILES_WALL, ModBlocks.TUFF_TILES);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_BRICKS_WALL, ModBlocks.TUFF_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_TILES_MOSSY_WALL, ModBlocks.TUFF_TILES_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_BRICKS_MOSSY_WALL, ModBlocks.TUFF_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_TILES_CRACKED_WALL, ModBlocks.TUFF_TILES_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TUFF_BRICKS_CRACKED_WALL, ModBlocks.TUFF_BRICKS_CRACKED);

        createStairsRecipe(ModBlocks.TUFF_TILES_STAIRS, Ingredient.ofItems(ModBlocks.TUFF_TILES))
                .criterion(hasItem(ModBlocks.TUFF_TILES),conditionsFromItem(ModBlocks.TUFF_TILES_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_TILES_STAIRS)));

        createStairsRecipe(ModBlocks.TUFF_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.TUFF_BRICKS))
                .criterion(hasItem(ModBlocks.TUFF_BRICKS),conditionsFromItem(ModBlocks.TUFF_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_TUFF_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_TUFF))
                .criterion(hasItem(ModBlocks.CHISELED_TUFF),conditionsFromItem(ModBlocks.CHISELED_TUFF_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_TUFF_STAIRS)));

        createStairsRecipe(ModBlocks.TUFF_TILES_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.TUFF_TILES_MOSSY))
                .criterion(hasItem(ModBlocks.TUFF_TILES_MOSSY),conditionsFromItem(ModBlocks.TUFF_TILES_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_TILES_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.TUFF_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.TUFF_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.TUFF_BRICKS_MOSSY),conditionsFromItem(ModBlocks.TUFF_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_TUFF_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_TUFF_MOSSY))
                .criterion(hasItem(ModBlocks.CHISELED_TUFF_MOSSY),conditionsFromItem(ModBlocks.CHISELED_TUFF_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_TUFF_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.TUFF_TILES_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.TUFF_TILES_CRACKED))
                .criterion(hasItem(ModBlocks.TUFF_TILES_CRACKED),conditionsFromItem(ModBlocks.TUFF_TILES_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_TILES_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.TUFF_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.TUFF_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.TUFF_BRICKS_CRACKED),conditionsFromItem(ModBlocks.TUFF_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_TUFF_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_TUFF_CRACKED))
                .criterion(hasItem(ModBlocks.CHISELED_TUFF_CRACKED),conditionsFromItem(ModBlocks.CHISELED_TUFF_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_TUFF_CRACKED_STAIRS)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF, ModBlocks.TUFF_BRICKS_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_MOSSY, ModBlocks.TUFF_BRICKS_MOSSY_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_CRACKED, ModBlocks.TUFF_BRICKS_CRACKED_SLAB);
        offerCrackingRecipe(exporter, ModBlocks.TUFF_TILES_CRACKED, ModBlocks.TUFF_TILES);

        mossycraft(ModBlocks.TUFF_TILES_MOSSY, ModBlocks.TUFF_TILES, exporter);
        mossycraft(ModBlocks.TUFF_BRICKS_MOSSY, ModBlocks.TUFF_BRICKS, exporter);

        // Fences
        createFenceRecipe(ModBlocks.VERTICAL_OAK_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_OAK_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_OAK_PLANK), conditionsFromItem(ModBlocks.VERTICAL_OAK_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_OAK_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_BIRCH_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_BIRCH_PLANK), conditionsFromItem(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_SPRUCE_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_SPRUCE_PLANK), conditionsFromItem(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_ACACIA_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_ACACIA_PLANK), conditionsFromItem(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_DARK_OAK_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_DARK_OAK_PLANK), conditionsFromItem(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_JUNGLE_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_JUNGLE_PLANK), conditionsFromItem(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_MANGROVE_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_MANGROVE_PLANK), conditionsFromItem(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_BAMBOO_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_BAMBOO_PLANK), conditionsFromItem(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_WARPED_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_WARPED_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_WARPED_PLANK), conditionsFromItem(ModBlocks.VERTICAL_WARPED_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_WARPED_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.VERTICAL_CRIMSON_PLANK_FENCE, Ingredient.ofItems(ModBlocks.VERTICAL_CRIMSON_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_CRIMSON_PLANK), conditionsFromItem(ModBlocks.VERTICAL_CRIMSON_PLANK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_CRIMSON_PLANK_FENCE)));

        createFenceRecipe(ModBlocks.DIRT_FENCE, Ingredient.ofItems(Blocks.DIRT))
                .criterion(hasItem(ModBlocks.DIRT_FENCE), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIRT_FENCE)));

        createFenceRecipe(ModBlocks.CDIRT_FENCE, Ingredient.ofItems(Blocks.COARSE_DIRT))
                .criterion(hasItem(ModBlocks.CDIRT_FENCE), conditionsFromItem(Blocks.COARSE_DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CDIRT_FENCE)));

        createFenceRecipe(ModBlocks.RDIRT_FENCE, Ingredient.ofItems(Blocks.ROOTED_DIRT))
                .criterion(hasItem(ModBlocks.RDIRT_FENCE), conditionsFromItem(Blocks.ROOTED_DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RDIRT_FENCE)));

        createFenceRecipe(ModBlocks.MUD_FENCE, Ingredient.ofItems(Blocks.MUD))
                .criterion(hasItem(ModBlocks.MUD_FENCE), conditionsFromItem(Blocks.MUD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MUD_FENCE)));

        createFenceRecipe(ModBlocks.PMUD_FENCE, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(ModBlocks.PMUD_FENCE), conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PMUD_FENCE)));

        createFenceRecipe(ModBlocks.CLAY_FENCE, Ingredient.ofItems(Blocks.CLAY))
                .criterion(hasItem(ModBlocks.CLAY_FENCE), conditionsFromItem(Blocks.CLAY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CLAY_FENCE)));

        // Wool
        woolfence(ModBlocks.WHITE_WOOL_FENCE, Blocks.WHITE_WOOL, exporter);
        woolfence(ModBlocks.GRAY_WOOL_FENCE, Blocks.GRAY_WOOL, exporter);
        woolfence(ModBlocks.LIGHT_GRAY_WOOL_FENCE, Blocks.LIGHT_GRAY_WOOL, exporter);
        woolfence(ModBlocks.BLACK_WOOL_FENCE, Blocks.BLACK_WOOL, exporter);
        woolfence(ModBlocks.BROWN_WOOL_FENCE, Blocks.BROWN_WOOL, exporter);
        woolfence(ModBlocks.RED_WOOL_FENCE, Blocks.RED_WOOL, exporter);
        woolfence(ModBlocks.ORANGE_WOOL_FENCE, Blocks.ORANGE_WOOL, exporter);
        woolfence(ModBlocks.YELLOW_WOOL_FENCE, Blocks.YELLOW_WOOL, exporter);
        woolfence(ModBlocks.LIME_WOOL_FENCE, Blocks.LIME_WOOL, exporter);
        woolfence(ModBlocks.GREEN_WOOL_FENCE, Blocks.GREEN_WOOL, exporter);
        woolfence(ModBlocks.CYAN_WOOL_FENCE, Blocks.CYAN_WOOL, exporter);
        woolfence(ModBlocks.LIGHT_BLUE_WOOL_FENCE, Blocks.LIGHT_BLUE_WOOL, exporter);
        woolfence(ModBlocks.BLUE_WOOL_FENCE, Blocks.BLUE_WOOL, exporter);
        woolfence(ModBlocks.PURPLE_WOOL_FENCE, Blocks.PURPLE_WOOL, exporter);
        woolfence(ModBlocks.MAGENTA_WOOL_FENCE, Blocks.MAGENTA_WOOL, exporter);
        woolfence(ModBlocks.PINK_WOOL_FENCE, Blocks.PINK_WOOL, exporter);


        stonefences(ModBlocks.BRICKS_FENCE, Blocks.BRICKS, exporter);

        stonefences(ModBlocks.ANDESITE_BRICKS_FENCE, ModBlocks.ANDESITE_BRICKS, exporter);
        stonefences(ModBlocks.ANDESITE_BRICKS_CRACKED_FENCE, ModBlocks.ANDESITE_BRICKS_CRACKED, exporter);
        stonefences(ModBlocks.ANDESITE_BRICKS_MOSSY_FENCE, ModBlocks.ANDESITE_BRICKS_MOSSY, exporter);

        stonefences(ModBlocks.DIORITE_BRICKS_FENCE, ModBlocks.DIORITE_BRICKS, exporter);
        stonefences(ModBlocks.DIORITE_BRICKS_CRACKED_FENCE, ModBlocks.DIORITE_BRICKS_CRACKED, exporter);
        stonefences(ModBlocks.DIORITE_BRICKS_MOSSY_FENCE, ModBlocks.DIORITE_BRICKS_MOSSY, exporter);

        stonefences(ModBlocks.GRANITE_BRICKS_FENCE, ModBlocks.GRANITE_BRICKS, exporter);
        stonefences(ModBlocks.GRANITE_BRICKS_CRACKED_FENCE, ModBlocks.GRANITE_BRICKS_CRACKED, exporter);
        stonefences(ModBlocks.GRANITE_BRICKS_MOSSY_FENCE, ModBlocks.GRANITE_BRICKS_MOSSY, exporter);

        stonefences(ModBlocks.OBSIDIAN_BRICKS_FENCE, ModBlocks.OBSIDIAN_BRICKS, exporter);
        stonefences(ModBlocks.OBSIDIAN_BRICKS_CRACKED_FENCE, ModBlocks.OBSIDIAN_BRICKS_CRACKED, exporter);
        stonefences(ModBlocks.OBSIDIAN_BRICKS_MOSSY_FENCE, ModBlocks.OBSIDIAN_BRICKS_MOSSY, exporter);

        stonefences(ModBlocks.TILES_OBSIDIAN_FENCE, ModBlocks.TILES_OBSIDIAN, exporter);
        stonefences(ModBlocks.TILES_CRACKED_OBSIDIAN_FENCE, ModBlocks.TILES_CRACKED_OBSIDIAN, exporter);
        stonefences(ModBlocks.TILES_MOSSY_OBSIDIAN_FENCE, ModBlocks.TILES_MOSSY_OBSIDIAN, exporter);

        stonefences(ModBlocks.COBSIDIAN_BRICKS_FENCE, ModBlocks.COBSIDIAN_BRICKS, exporter);

        stonefences(ModBlocks.COBBLESTONE_FENCE, Blocks.COBBLESTONE, exporter);
        stonefences(ModBlocks.MOSSY_COBBLESTONE_FENCE, Blocks.MOSSY_COBBLESTONE, exporter);
        stonefences(ModBlocks.STONE_FENCE, Blocks.STONE, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_FENCE, Blocks.SMOOTH_STONE, exporter);
        stonefences(ModBlocks.STONE_BRICKS_FENCE, Blocks.STONE_BRICKS, exporter);
        stonefences(ModBlocks.MOSSY_STONE_BRICKS_FENCE, Blocks.MOSSY_STONE_BRICKS, exporter);
        stonefences(ModBlocks.CRACKED_STONE_BRICKS_FENCE, Blocks.CRACKED_STONE_BRICKS, exporter);
        stonefences(ModBlocks.GRANITE_FENCE, Blocks.GRANITE, exporter);
        stonefences(ModBlocks.ANDESITE_FENCE, Blocks.ANDESITE, exporter);
        stonefences(ModBlocks.DIORITE_FENCE, Blocks.DIORITE, exporter);
        stonefences(ModBlocks.COBBLED_DEEPSLATE_FENCE, Blocks.COBBLED_DEEPSLATE, exporter);
        stonefences(ModBlocks.POLISHED_DEEPSLATE_FENCE, Blocks.POLISHED_DEEPSLATE, exporter);
        stonefences(ModBlocks.DEEPSLATE_BRICKS_FENCE, Blocks.DEEPSLATE_BRICKS, exporter);
        stonefences(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE, Blocks.CRACKED_DEEPSLATE_BRICKS, exporter);
        stonefences(ModBlocks.DEEPSLATE_TILES_FENCE, Blocks.DEEPSLATE_TILES, exporter);
        stonefences(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE, Blocks.CRACKED_DEEPSLATE_TILES, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_BRICKS_FENCE, ModBlocks.SMOOTH_STONE_BRICKS, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_FENCE, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_FENCE, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_TILES_FENCE, ModBlocks.SMOOTH_STONE_TILES, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_TILES_CRACKED_FENCE, ModBlocks.SMOOTH_STONE_TILES_CRACKED, exporter);
        stonefences(ModBlocks.SMOOTH_STONE_TILES_MOSSY_FENCE, ModBlocks.SMOOTH_STONE_TILES_MOSSY, exporter);

        stonefences(ModBlocks.CALCITE_TILES_FENCE, ModBlocks.CALCITE_TILES,exporter);
        stonefences(ModBlocks.CALCITE_BRICKS_FENCE, ModBlocks.CALCITE_BRICKS,exporter);
        stonefences(ModBlocks.CALCITE_TILES_MOSSY_FENCE, ModBlocks.CALCITE_TILES_MOSSY,exporter);
        stonefences(ModBlocks.CALCITE_BRICKS_MOSSY_FENCE, ModBlocks.CALCITE_BRICKS_MOSSY,exporter);
        stonefences(ModBlocks.CALCITE_TILES_CRACKED_FENCE, ModBlocks.CALCITE_TILES_CRACKED,exporter);
        stonefences(ModBlocks.CALCITE_BRICKS_CRACKED_FENCE, ModBlocks.CALCITE_BRICKS_CRACKED,exporter);



        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_OAK_PLANK_SLAB, ModBlocks.VERTICAL_OAK_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_BIRCH_PLANK_SLAB, ModBlocks.VERTICAL_BIRCH_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_SPRUCE_PLANK_SLAB, ModBlocks.VERTICAL_SPRUCE_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_JUNGLE_PLANK_SLAB, ModBlocks.VERTICAL_JUNGLE_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_CHERRY_PLANK_SLAB, ModBlocks.VERTICAL_CHERRY_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_ACACIA_PLANK_SLAB, ModBlocks.VERTICAL_ACACIA_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_DARK_OAK_PLANK_SLAB, ModBlocks.VERTICAL_DARK_OAK_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_WARPED_PLANK_SLAB, ModBlocks.VERTICAL_WARPED_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_CRIMSON_PLANK_SLAB, ModBlocks.VERTICAL_CRIMSON_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_BAMBOO_PLANK_SLAB, ModBlocks.VERTICAL_BAMBOO_PLANK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.VERTICAL_MANGROVE_PLANK_SLAB, ModBlocks.VERTICAL_MANGROVE_PLANK);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_SLAB, ModBlocks.SMOOTH_STONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_SLAB, ModBlocks.SMOOTH_STONE_CHISELED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_SLAB, ModBlocks.SMOOTH_STONE_CHISELED_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_SLAB, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_SLAB, ModBlocks.SMOOTH_STONE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_CRACKED_SLAB, ModBlocks.SMOOTH_STONE_TILES_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_MOSSY_SLAB, ModBlocks.SMOOTH_STONE_TILES_MOSSY);

        // Slabs
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIRT_SLAB, Blocks.DIRT);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CDIRT_SLAB, Blocks.COARSE_DIRT);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.RDIRT_SLAB, Blocks.ROOTED_DIRT);

        // Mud
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.MUD_SLAB, Blocks.MUD);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.PMUD_SLAB, Blocks.PACKED_MUD);

        // Clay
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CLAY_SLAB, Blocks.CLAY);

        // Andesite
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICKS_SLAB, ModBlocks.ANDESITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB, ModBlocks.ANDESITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB, ModBlocks.ANDESITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_ANDESITE_SLAB, ModBlocks.CHISELED_ANDESITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_CRACKED_ANDESITE_SLAB, ModBlocks.CHISELED_CRACKED_ANDESITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_ANDESITE_MOSSY_SLAB, ModBlocks.CHISELED_ANDESITE_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_ANDESITE_SLAB, ModBlocks.TILES_ANDESITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_CRACKED_ANDESITE_SLAB, ModBlocks.TILES_CRACKED_ANDESITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_MOSSY_ANDESITE_SLAB, ModBlocks.TILES_MOSSY_ANDESITE);

        // GRANITE
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICKS_SLAB, ModBlocks.GRANITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICKS_CRACKED_SLAB, ModBlocks.GRANITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICKS_MOSSY_SLAB, ModBlocks.GRANITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_GRANITE_SLAB, ModBlocks.CHISELED_GRANITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_CRACKED_GRANITE_SLAB, ModBlocks.CHISELED_CRACKED_GRANITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_GRANITE_MOSSY_SLAB, ModBlocks.CHISELED_GRANITE_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_GRANITE_SLAB, ModBlocks.TILES_GRANITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_CRACKED_GRANITE_SLAB, ModBlocks.TILES_CRACKED_GRANITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_MOSSY_GRANITE_SLAB, ModBlocks.TILES_MOSSY_GRANITE);

        // DIORITE
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICKS_SLAB, ModBlocks.DIORITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICKS_CRACKED_SLAB, ModBlocks.DIORITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICKS_MOSSY_SLAB, ModBlocks.DIORITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_DIORITE_MOSSY_SLAB, ModBlocks.CHISELED_DIORITE_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_CRACKED_DIORITE_SLAB, ModBlocks.CHISELED_CRACKED_DIORITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_DIORITE_SLAB, ModBlocks.CHISELED_DIORITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_DIORITE_SLAB, ModBlocks.TILES_DIORITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_CRACKED_DIORITE_SLAB, ModBlocks.TILES_CRACKED_DIORITE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_MOSSY_DIORITE_SLAB, ModBlocks.TILES_MOSSY_DIORITE);

        // OBSIDIAN
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OBSIDIAN_BRICKS_SLAB, ModBlocks.OBSIDIAN_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB, ModBlocks.OBSIDIAN_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB, ModBlocks.OBSIDIAN_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_OBSIDIAN_MOSSY_SLAB, ModBlocks.CHISELED_OBSIDIAN_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_CRACKED_OBSIDIAN_SLAB, ModBlocks.CHISELED_CRACKED_OBSIDIAN);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_OBSIDIAN_SLAB, ModBlocks.CHISELED_OBSIDIAN);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_OBSIDIAN_SLAB, ModBlocks.TILES_OBSIDIAN);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_CRACKED_OBSIDIAN_SLAB, ModBlocks.TILES_CRACKED_OBSIDIAN);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.TILES_MOSSY_OBSIDIAN_SLAB, ModBlocks.TILES_MOSSY_OBSIDIAN);

        // Crying Obsidian
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.COBSIDIAN_BRICKS_SLAB, ModBlocks.COBSIDIAN_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_COBSIDIAN_RUNIC_SLAB, ModBlocks.CHISELED_COBSIDIAN_RUNIC);

        // Wool
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

        // Stone
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_STONE_BRICKS_SLAB, Blocks.CRACKED_STONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_STONE_BRICKS_SLAB, Blocks.CHISELED_STONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DEEPSLATE_TILES_SLAB, Blocks.DEEPSLATE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);

        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_TILES_SLAB, ModBlocks.CALCITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_BRICKS_SLAB, ModBlocks.CALCITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_TILES_MOSSY_SLAB, ModBlocks.CALCITE_TILES_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_BRICKS_MOSSY_SLAB, ModBlocks.CALCITE_BRICKS_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_TILES_CRACKED_SLAB, ModBlocks.CALCITE_TILES_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_BRICKS_CRACKED_SLAB, ModBlocks.CALCITE_BRICKS_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_CALCITE_CRACKED_SLAB, ModBlocks.CHISELED_CALCITE_CRACKED);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_CALCITE_MOSSY_SLAB, ModBlocks.CHISELED_CALCITE_MOSSY);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_CALCITE_SLAB, ModBlocks.CHISELED_CALCITE);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CHISELED_NETHER_BRICK_SLAB, Blocks.CHISELED_NETHER_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);


        // Walls
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BRICKS_WALL, ModBlocks.SMOOTH_STONE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_WALL, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_WALL, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY);

        // Dirt
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIRT_WALL, Blocks.DIRT);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.RDIRT_WALL, Blocks.ROOTED_DIRT);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CDIRT_WALL, Blocks.COARSE_DIRT);

        // Mud
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.MUD_WALL, Blocks.MUD);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.PMUD_WALL, Blocks.PACKED_MUD);

        // clay
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CLAY_WALL, Blocks.CLAY);

        // Wool
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

        // Stone
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_STONE_BRICKS_WALL, Blocks.CRACKED_STONE_BRICKS);

        // Deepslate
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DEEPSLATE_TILES_WALL, Blocks.DEEPSLATE_TILES);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_DEEPSLATE_TILES_WALL, Blocks.CRACKED_DEEPSLATE_TILES);

        // andesite
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ANDESITE_BRICKS_WALL, ModBlocks.ANDESITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ANDESITE_BRICKS_CRACKED_WALL, ModBlocks.ANDESITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.ANDESITE_BRICKS_MOSSY_WALL, ModBlocks.ANDESITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_ANDESITE_WALL, ModBlocks.TILES_ANDESITE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_CRACKED_ANDESITE_WALL, ModBlocks.TILES_CRACKED_ANDESITE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_MOSSY_ANDESITE_WALL, ModBlocks.TILES_MOSSY_ANDESITE);

        // Granite
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRANITE_BRICKS_WALL, ModBlocks.GRANITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRANITE_BRICKS_CRACKED_WALL, ModBlocks.GRANITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GRANITE_BRICKS_MOSSY_WALL, ModBlocks.GRANITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_GRANITE_WALL, ModBlocks.TILES_GRANITE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_CRACKED_GRANITE_WALL, ModBlocks.TILES_CRACKED_GRANITE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_MOSSY_GRANITE_WALL, ModBlocks.TILES_MOSSY_GRANITE);

        // Diorite
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIORITE_BRICKS_WALL, ModBlocks.DIORITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIORITE_BRICKS_CRACKED_WALL, ModBlocks.DIORITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DIORITE_BRICKS_MOSSY_WALL, ModBlocks.DIORITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_DIORITE_WALL, ModBlocks.TILES_DIORITE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_CRACKED_DIORITE_WALL, ModBlocks.TILES_CRACKED_DIORITE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_MOSSY_DIORITE_WALL, ModBlocks.TILES_MOSSY_DIORITE);

        // Obsidian
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.OBSIDIAN_BRICKS_WALL, ModBlocks.OBSIDIAN_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL, ModBlocks.OBSIDIAN_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL, ModBlocks.OBSIDIAN_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_OBSIDIAN_WALL, ModBlocks.TILES_OBSIDIAN);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_CRACKED_OBSIDIAN_WALL, ModBlocks.TILES_CRACKED_OBSIDIAN);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.TILES_MOSSY_OBSIDIAN_WALL, ModBlocks.TILES_MOSSY_OBSIDIAN);

        // Crying Obsidian
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.COBSIDIAN_BRICKS_WALL, ModBlocks.COBSIDIAN_BRICKS);


        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_OAK_PLANK_WALL, ModBlocks.VERTICAL_OAK_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_BAMBOO_PLANK_WALL, ModBlocks.VERTICAL_BAMBOO_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_MANGROVE_PLANK_WALL, ModBlocks.VERTICAL_MANGROVE_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_BIRCH_PLANK_WALL, ModBlocks.VERTICAL_BIRCH_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_SPRUCE_PLANK_WALL, ModBlocks.VERTICAL_SPRUCE_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_ACACIA_PLANK_WALL, ModBlocks.VERTICAL_ACACIA_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_DARK_OAK_PLANK_WALL, ModBlocks.VERTICAL_DARK_OAK_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_CHERRY_PLANK_WALL, ModBlocks.VERTICAL_CHERRY_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_JUNGLE_PLANK_WALL, ModBlocks.VERTICAL_JUNGLE_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_WARPED_PLANK_WALL, ModBlocks.VERTICAL_WARPED_PLANK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.VERTICAL_CRIMSON_PLANK_WALL, ModBlocks.VERTICAL_CRIMSON_PLANK);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_TILES_WALL, ModBlocks.CALCITE_TILES);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_BRICKS_WALL, ModBlocks.CALCITE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_TILES_MOSSY_WALL, ModBlocks.CALCITE_TILES_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_BRICKS_MOSSY_WALL, ModBlocks.CALCITE_BRICKS_MOSSY);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_TILES_CRACKED_WALL, ModBlocks.CALCITE_TILES_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CALCITE_BRICKS_CRACKED_WALL, ModBlocks.CALCITE_BRICKS_CRACKED);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.SEA_LANTERN_WALL, Blocks.SEA_LANTERN);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        offerWallRecipe(exporter,RecipeCategory.DECORATIONS,ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);

        // Stairs
        createStairsRecipe(ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS, Ingredient.ofItems(Blocks.CHISELED_POLISHED_BLACKSTONE))
                .criterion(hasItem(Blocks.CHISELED_POLISHED_BLACKSTONE),conditionsFromItem(ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS)));

        createStairsRecipe(ModBlocks.GILDED_BLACKSTONE_STAIRS, Ingredient.ofItems(Blocks.GILDED_BLACKSTONE))
                .criterion(hasItem(Blocks.GILDED_BLACKSTONE),conditionsFromItem(ModBlocks.GILDED_BLACKSTONE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GILDED_BLACKSTONE_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_BASALT))
                .criterion(hasItem(Blocks.SMOOTH_BASALT),conditionsFromItem(ModBlocks.SMOOTH_BASALT_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_BASALT_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_NETHER_BRICK_STAIRS, Ingredient.ofItems(Blocks.CHISELED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CHISELED_NETHER_BRICKS),conditionsFromItem(ModBlocks.CHISELED_NETHER_BRICK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_NETHER_BRICK_STAIRS)));

        createStairsRecipe(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Ingredient.ofItems(Blocks.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_NETHER_BRICKS),conditionsFromItem(ModBlocks.CRACKED_NETHER_BRICK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRACKED_NETHER_BRICK_STAIRS)));

        createStairsRecipe(ModBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK),conditionsFromItem(ModBlocks.NETHERRACK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.NETHERRACK_STAIRS)));

        createStairsRecipe(ModBlocks.SEA_LANTERN_STAIRS, Ingredient.ofItems(Blocks.SEA_LANTERN))
                .criterion(hasItem(Blocks.SEA_LANTERN),conditionsFromItem(ModBlocks.SEA_LANTERN_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_LANTERN_STAIRS)));

        createStairsRecipe(ModBlocks.DIRT_STAIRS, Ingredient.ofItems(Blocks.DIRT))
                .criterion(hasItem(Blocks.DIRT),conditionsFromItem(ModBlocks.DIRT_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIRT_STAIRS)));

        createStairsRecipe(ModBlocks.CDIRT_STAIRS, Ingredient.ofItems(Blocks.COARSE_DIRT))
                .criterion(hasItem(Blocks.COARSE_DIRT),conditionsFromItem(ModBlocks.CDIRT_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CDIRT_STAIRS)));

        createStairsRecipe(ModBlocks.RDIRT_STAIRS, Ingredient.ofItems(Blocks.ROOTED_DIRT))
                .criterion(hasItem(Blocks.ROOTED_DIRT),conditionsFromItem(ModBlocks.RDIRT_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RDIRT_STAIRS)));

        createStairsRecipe(ModBlocks.MUD_STAIRS, Ingredient.ofItems(Blocks.MUD))
                .criterion(hasItem(Blocks.MUD),conditionsFromItem(ModBlocks.MUD_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MUD_STAIRS)));

        createStairsRecipe(ModBlocks.PMUD_STAIRS, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD),conditionsFromItem(ModBlocks.PMUD_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PMUD_STAIRS)));

        createStairsRecipe(ModBlocks.CLAY_STAIRS, Ingredient.ofItems(Blocks.CLAY))
                .criterion(hasItem(Blocks.CLAY),conditionsFromItem(ModBlocks.CLAY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CLAY_STAIRS)));

        createStairsRecipe(ModBlocks.WHITE_WOOL_STAIRS,Ingredient.ofItems(Blocks.WHITE_WOOL))
                .criterion(hasItem(Blocks.WHITE_WOOL),conditionsFromItem(ModBlocks.WHITE_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.GRAY_WOOL_STAIRS,Ingredient.ofItems(Blocks.GRAY_WOOL))
                .criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(ModBlocks.GRAY_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.LIGHT_GRAY_WOOL_STAIRS,Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL),conditionsFromItem(ModBlocks.LIGHT_GRAY_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.BLACK_WOOL_STAIRS,Ingredient.ofItems(Blocks.BLACK_WOOL))
                .criterion(hasItem(Blocks.BLACK_WOOL),conditionsFromItem(ModBlocks.BLACK_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.BROWN_WOOL_STAIRS,Ingredient.ofItems(Blocks.BROWN_WOOL))
                .criterion(hasItem(Blocks.BROWN_WOOL),conditionsFromItem(ModBlocks.BROWN_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.RED_WOOL_STAIRS,Ingredient.ofItems(Blocks.RED_WOOL))
                .criterion(hasItem(Blocks.RED_WOOL),conditionsFromItem(ModBlocks.RED_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.ORANGE_WOOL_STAIRS,Ingredient.ofItems(Blocks.ORANGE_WOOL))
                .criterion(hasItem(Blocks.ORANGE_WOOL),conditionsFromItem(ModBlocks.ORANGE_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.YELLOW_WOOL_STAIRS,Ingredient.ofItems(Blocks.YELLOW_WOOL))
                .criterion(hasItem(Blocks.YELLOW_WOOL),conditionsFromItem(ModBlocks.YELLOW_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.LIME_WOOL_STAIRS,Ingredient.ofItems(Blocks.LIME_WOOL))
                .criterion(hasItem(Blocks.LIME_WOOL),conditionsFromItem(ModBlocks.LIME_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.GREEN_WOOL_STAIRS,Ingredient.ofItems(Blocks.GREEN_WOOL))
                .criterion(hasItem(Blocks.GREEN_WOOL),conditionsFromItem(ModBlocks.GREEN_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.CYAN_WOOL_STAIRS,Ingredient.ofItems(Blocks.CYAN_WOOL))
                .criterion(hasItem(Blocks.CYAN_WOOL),conditionsFromItem(ModBlocks.CYAN_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.LIGHT_BLUE_WOOL_STAIRS,Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL),conditionsFromItem(ModBlocks.LIGHT_BLUE_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.BLUE_WOOL_STAIRS,Ingredient.ofItems(Blocks.BLUE_WOOL))
                .criterion(hasItem(Blocks.BLUE_WOOL),conditionsFromItem(ModBlocks.BLUE_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.PURPLE_WOOL_STAIRS,Ingredient.ofItems(Blocks.PURPLE_WOOL))
                .criterion(hasItem(Blocks.PURPLE_WOOL),conditionsFromItem(ModBlocks.PURPLE_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.MAGENTA_WOOL_STAIRS,Ingredient.ofItems(Blocks.MAGENTA_WOOL))
                .criterion(hasItem(Blocks.MAGENTA_WOOL),conditionsFromItem(ModBlocks.MAGENTA_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.PINK_WOOL_STAIRS,Ingredient.ofItems(Blocks.PINK_WOOL))
                .criterion(hasItem(Blocks.PINK_WOOL),conditionsFromItem(ModBlocks.PINK_WOOL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_WOOL_STAIRS)));

        createStairsRecipe(ModBlocks.ANDESITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS),conditionsFromItem(ModBlocks.ANDESITE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANDESITE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.ANDESITE_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS_CRACKED),conditionsFromItem(ModBlocks.ANDESITE_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANDESITE_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.ANDESITE_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS_MOSSY),conditionsFromItem(ModBlocks.ANDESITE_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANDESITE_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.GRANITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS),conditionsFromItem(ModBlocks.GRANITE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRANITE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.GRANITE_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS_CRACKED),conditionsFromItem(ModBlocks.GRANITE_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRANITE_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.GRANITE_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS_MOSSY),conditionsFromItem(ModBlocks.GRANITE_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRANITE_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.DIORITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS))
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS),conditionsFromItem(ModBlocks.DIORITE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIORITE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.DIORITE_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS_CRACKED),conditionsFromItem(ModBlocks.DIORITE_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIORITE_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.DIORITE_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS_MOSSY),conditionsFromItem(ModBlocks.DIORITE_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIORITE_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.OBSIDIAN_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.OBSIDIAN_BRICKS))
                .criterion(hasItem(ModBlocks.OBSIDIAN_BRICKS),conditionsFromItem(ModBlocks.OBSIDIAN_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OBSIDIAN_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.COBSIDIAN_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.COBSIDIAN_BRICKS))
                .criterion(hasItem(ModBlocks.COBSIDIAN_BRICKS),conditionsFromItem(ModBlocks.COBSIDIAN_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COBSIDIAN_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.OBSIDIAN_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.OBSIDIAN_BRICKS_CRACKED),conditionsFromItem(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.OBSIDIAN_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.OBSIDIAN_BRICKS_MOSSY),conditionsFromItem(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS),conditionsFromItem(ModBlocks.CRACKED_STONE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRACKED_STONE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_STONE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CHISELED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS),conditionsFromItem(ModBlocks.CHISELED_STONE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_STONE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_DEEPSLATE_STAIRS, Ingredient.ofItems(Blocks.CHISELED_DEEPSLATE))
                .criterion(hasItem(Blocks.CHISELED_DEEPSLATE),conditionsFromItem(ModBlocks.CHISELED_DEEPSLATE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_DEEPSLATE_STAIRS)));

        createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_BRICKS),conditionsFromItem(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS, Ingredient.ofItems(Blocks.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.CRACKED_DEEPSLATE_TILES),conditionsFromItem(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS)));

        createStairsRecipe(ModBlocks.DEEPSLATE_TILES_STAIRS, Ingredient.ofItems(Blocks.DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.DEEPSLATE_TILES),conditionsFromItem(ModBlocks.DEEPSLATE_TILES_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. DEEPSLATE_TILES_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_ANDESITE))
                .criterion(hasItem(ModBlocks.CHISELED_ANDESITE),conditionsFromItem(ModBlocks.CHISELED_ANDESITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_ANDESITE_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CRACKED_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CRACKED_ANDESITE))
                .criterion(hasItem(ModBlocks.CHISELED_CRACKED_ANDESITE),conditionsFromItem(ModBlocks.CHISELED_CRACKED_ANDESITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_CRACKED_ANDESITE_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_ANDESITE_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_ANDESITE_MOSSY))
                .criterion(hasItem(ModBlocks.CHISELED_ANDESITE_MOSSY),conditionsFromItem(ModBlocks.CHISELED_ANDESITE_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_ANDESITE_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_GRANITE))
                .criterion(hasItem(ModBlocks.CHISELED_GRANITE),conditionsFromItem(ModBlocks.CHISELED_GRANITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_GRANITE_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CRACKED_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CRACKED_GRANITE))
                .criterion(hasItem(ModBlocks.CHISELED_CRACKED_GRANITE),conditionsFromItem(ModBlocks.CHISELED_CRACKED_GRANITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_CRACKED_GRANITE_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_GRANITE_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_GRANITE_MOSSY))
                .criterion(hasItem(ModBlocks.CHISELED_GRANITE_MOSSY),conditionsFromItem(ModBlocks.CHISELED_GRANITE_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_GRANITE_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_DIORITE))
                .criterion(hasItem(ModBlocks.CHISELED_DIORITE),conditionsFromItem(ModBlocks.CHISELED_DIORITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_DIORITE_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CRACKED_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CRACKED_DIORITE))
                .criterion(hasItem(ModBlocks.CHISELED_CRACKED_DIORITE),conditionsFromItem(ModBlocks.CHISELED_CRACKED_DIORITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_CRACKED_DIORITE_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_DIORITE_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_DIORITE_MOSSY))
                .criterion(hasItem(ModBlocks.CHISELED_DIORITE_MOSSY),conditionsFromItem(ModBlocks.CHISELED_DIORITE_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. CHISELED_DIORITE_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_ANDESITE))
                .criterion(hasItem(ModBlocks.TILES_ANDESITE),conditionsFromItem(ModBlocks.TILES_ANDESITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. TILES_ANDESITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_CRACKED_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_CRACKED_ANDESITE))
                .criterion(hasItem(ModBlocks.TILES_CRACKED_ANDESITE),conditionsFromItem(ModBlocks.TILES_CRACKED_ANDESITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. TILES_CRACKED_ANDESITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_MOSSY_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_MOSSY_ANDESITE))
                .criterion(hasItem(ModBlocks.TILES_MOSSY_ANDESITE),conditionsFromItem(ModBlocks.TILES_MOSSY_ANDESITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. TILES_MOSSY_ANDESITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_DIORITE))
        .criterion(hasItem(ModBlocks.TILES_DIORITE),conditionsFromItem(ModBlocks.TILES_DIORITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_DIORITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_CRACKED_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_CRACKED_DIORITE))
                .criterion(hasItem(ModBlocks.TILES_DIORITE),conditionsFromItem(ModBlocks.TILES_CRACKED_DIORITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_CRACKED_DIORITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_MOSSY_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_MOSSY_DIORITE))
                .criterion(hasItem(ModBlocks.TILES_MOSSY_DIORITE),conditionsFromItem(ModBlocks.TILES_MOSSY_DIORITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_MOSSY_DIORITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_GRANITE))
                .criterion(hasItem(ModBlocks.TILES_GRANITE),conditionsFromItem(ModBlocks.TILES_GRANITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. TILES_GRANITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_CRACKED_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_CRACKED_GRANITE))
                .criterion(hasItem(ModBlocks.TILES_CRACKED_GRANITE),conditionsFromItem(ModBlocks.TILES_CRACKED_GRANITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_CRACKED_GRANITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_MOSSY_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.TILES_MOSSY_GRANITE))
                .criterion(hasItem(ModBlocks.TILES_MOSSY_GRANITE),conditionsFromItem(ModBlocks.TILES_MOSSY_GRANITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks. TILES_MOSSY_GRANITE_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_OBSIDIAN_STAIRS, Ingredient.ofItems(ModBlocks.TILES_OBSIDIAN))
                .criterion(hasItem(ModBlocks.TILES_OBSIDIAN),conditionsFromItem(ModBlocks.TILES_OBSIDIAN_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_OBSIDIAN_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_CRACKED_OBSIDIAN_STAIRS, Ingredient.ofItems(ModBlocks.TILES_CRACKED_OBSIDIAN))
                .criterion(hasItem(ModBlocks.TILES_CRACKED_OBSIDIAN),conditionsFromItem(ModBlocks.TILES_CRACKED_OBSIDIAN_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_CRACKED_OBSIDIAN_STAIRS)));

        createStairsRecipe(ModBlocks.TILES_MOSSY_OBSIDIAN_STAIRS, Ingredient.ofItems(ModBlocks.TILES_MOSSY_OBSIDIAN))
                .criterion(hasItem(ModBlocks.TILES_MOSSY_OBSIDIAN),conditionsFromItem(ModBlocks.TILES_MOSSY_OBSIDIAN_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TILES_MOSSY_OBSIDIAN_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_OBSIDIAN_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_OBSIDIAN))
                .criterion(hasItem(ModBlocks.CHISELED_OBSIDIAN),conditionsFromItem(ModBlocks.CHISELED_OBSIDIAN_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_OBSIDIAN_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CRACKED_OBSIDIAN_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CRACKED_OBSIDIAN))
                .criterion(hasItem(ModBlocks.CHISELED_CRACKED_OBSIDIAN),conditionsFromItem(ModBlocks.CHISELED_CRACKED_OBSIDIAN_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_CRACKED_OBSIDIAN_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_OBSIDIAN_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_OBSIDIAN_MOSSY))
                .criterion(hasItem(ModBlocks.CHISELED_OBSIDIAN_MOSSY),conditionsFromItem(ModBlocks.CHISELED_OBSIDIAN_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_OBSIDIAN_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_COBSIDIAN_RUNIC_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_COBSIDIAN_RUNIC))
                .criterion(hasItem(ModBlocks.CHISELED_COBSIDIAN_RUNIC),conditionsFromItem(ModBlocks.CHISELED_COBSIDIAN_RUNIC_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_COBSIDIAN_RUNIC_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_BRICKS))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_BRICKS),conditionsFromItem(ModBlocks.SMOOTH_STONE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED),conditionsFromItem(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY),conditionsFromItem(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_CHISELED_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_CHISELED))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_CHISELED),conditionsFromItem(ModBlocks.SMOOTH_STONE_CHISELED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_CHISELED_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED),conditionsFromItem(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY),conditionsFromItem(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_TILES_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_TILES))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_TILES),conditionsFromItem(ModBlocks.SMOOTH_STONE_TILES_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_TILES_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_TILES_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_TILES_CRACKED))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_TILES_CRACKED),conditionsFromItem(ModBlocks.SMOOTH_STONE_TILES_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_TILES_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.SMOOTH_STONE_TILES_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE_TILES_MOSSY))
                .criterion(hasItem(ModBlocks.SMOOTH_STONE_TILES_MOSSY),conditionsFromItem(ModBlocks.SMOOTH_STONE_TILES_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_STONE_TILES_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_OAK_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_OAK_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_OAK_PLANK),conditionsFromItem(ModBlocks.VERTICAL_OAK_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_OAK_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_BIRCH_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_BIRCH_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_BIRCH_PLANK),conditionsFromItem(ModBlocks.VERTICAL_BIRCH_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BIRCH_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_SPRUCE_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_SPRUCE_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_SPRUCE_PLANK),conditionsFromItem(ModBlocks.VERTICAL_SPRUCE_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_SPRUCE_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_JUNGLE_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_JUNGLE_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_JUNGLE_PLANK),conditionsFromItem(ModBlocks.VERTICAL_JUNGLE_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_JUNGLE_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_ACACIA_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_ACACIA_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_ACACIA_PLANK),conditionsFromItem(ModBlocks.VERTICAL_ACACIA_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_ACACIA_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_CHERRY_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_CHERRY_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_CHERRY_PLANK),conditionsFromItem(ModBlocks.VERTICAL_CHERRY_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_CHERRY_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_DARK_OAK_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_DARK_OAK_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_DARK_OAK_PLANK),conditionsFromItem(ModBlocks.VERTICAL_DARK_OAK_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_DARK_OAK_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_MANGROVE_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_MANGROVE_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_MANGROVE_PLANK),conditionsFromItem(ModBlocks.VERTICAL_MANGROVE_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_MANGROVE_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_BAMBOO_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_BAMBOO_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_BAMBOO_PLANK),conditionsFromItem(ModBlocks.VERTICAL_BAMBOO_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BAMBOO_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_CRIMSON_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_CRIMSON_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_CRIMSON_PLANK),conditionsFromItem(ModBlocks.VERTICAL_CRIMSON_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_CRIMSON_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.VERTICAL_WARPED_PLANK_STAIRS, Ingredient.ofItems(ModBlocks.VERTICAL_WARPED_PLANK))
                .criterion(hasItem(ModBlocks.VERTICAL_WARPED_PLANK),conditionsFromItem(ModBlocks.VERTICAL_WARPED_PLANK_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_WARPED_PLANK_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_TILES_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_TILES))
                .criterion(hasItem(ModBlocks.CALCITE_TILES),conditionsFromItem(ModBlocks.CALCITE_TILES_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_TILES_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_BRICKS))
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS),conditionsFromItem(ModBlocks.CALCITE_BRICKS_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_BRICKS_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CALCITE_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CALCITE))
                .criterion(hasItem(ModBlocks.CHISELED_CALCITE),conditionsFromItem(ModBlocks.CHISELED_CALCITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_CALCITE_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_TILES_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_TILES_MOSSY))
                .criterion(hasItem(ModBlocks.CALCITE_TILES_MOSSY),conditionsFromItem(ModBlocks.CALCITE_TILES_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_TILES_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_BRICKS_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_BRICKS_MOSSY))
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS_MOSSY),conditionsFromItem(ModBlocks.CALCITE_BRICKS_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_BRICKS_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CALCITE_MOSSY_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CALCITE_MOSSY))
                .criterion(hasItem(ModBlocks.CHISELED_CALCITE_MOSSY),conditionsFromItem(ModBlocks.CHISELED_CALCITE_MOSSY_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_CALCITE_MOSSY_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_TILES_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_TILES_CRACKED))
                .criterion(hasItem(ModBlocks.CALCITE_TILES_CRACKED),conditionsFromItem(ModBlocks.CALCITE_TILES_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_TILES_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_BRICKS_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_BRICKS_CRACKED))
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS_CRACKED),conditionsFromItem(ModBlocks.CALCITE_BRICKS_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_BRICKS_CRACKED_STAIRS)));

        createStairsRecipe(ModBlocks.CHISELED_CALCITE_CRACKED_STAIRS, Ingredient.ofItems(ModBlocks.CHISELED_CALCITE_CRACKED))
                .criterion(hasItem(ModBlocks.CHISELED_CALCITE_CRACKED),conditionsFromItem(ModBlocks.CHISELED_CALCITE_CRACKED_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHISELED_CALCITE_CRACKED_STAIRS)));

        // Chiseled
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, ModBlocks.ANDESITE_BRICKS_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE, ModBlocks.GRANITE_BRICKS_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE, ModBlocks.DIORITE_BRICKS_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN, ModBlocks.CHISELED_OBSIDIAN);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_COBSIDIAN_RUNIC, ModBlocks.CHISELED_COBSIDIAN_RUNIC_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED, ModBlocks.SMOOTH_STONE_CHISELED_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE, ModBlocks.CALCITE_BRICKS_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_CRACKED, ModBlocks.CALCITE_BRICKS_CRACKED_SLAB);

        // Custom Bricks Crafting

        compresscrafting(ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE,exporter);
        compresscrafting(ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE,exporter);
        compresscrafting(ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE,exporter);

        brickcrafting(ModBlocks.OBSIDIAN_BRICKS, Blocks.OBSIDIAN,exporter);
        brickcrafting(ModBlocks.CALCITE_BRICKS, Blocks.CALCITE,exporter);
        brickcrafting(ModBlocks.TUFF_BRICKS, Blocks.TUFF,exporter);
        brickcrafting(ModBlocks.SMOOTH_STONE_BRICKS, Blocks.SMOOTH_STONE,exporter);
        brickcrafting(ModBlocks.COBSIDIAN_BRICKS, Blocks.CRYING_OBSIDIAN,exporter);

        //Tiles Crafting
        compresscrafting(ModBlocks.TILES_ANDESITE, ModBlocks.ANDESITE_BRICKS,exporter);
        compresscrafting(ModBlocks.TILES_GRANITE, ModBlocks.GRANITE_BRICKS,exporter);
        compresscrafting(ModBlocks.TILES_DIORITE, ModBlocks.DIORITE_BRICKS,exporter);
        compresscrafting(ModBlocks.TILES_OBSIDIAN, ModBlocks.OBSIDIAN_BRICKS,exporter);
        compresscrafting(ModBlocks.CALCITE_TILES, ModBlocks.CALCITE_BRICKS,exporter);
        compresscrafting(ModBlocks.TUFF_TILES, ModBlocks.TUFF_BRICKS,exporter);
        compresscrafting(ModBlocks.SMOOTH_STONE_TILES, ModBlocks.SMOOTH_STONE_BRICKS,exporter);

        // Cracking Recipe
        offerCrackingRecipe(exporter, ModBlocks.ANDESITE_BRICKS_CRACKED, ModBlocks.ANDESITE_BRICKS);
        offerCrackingRecipe(exporter, ModBlocks.CHISELED_CRACKED_ANDESITE, ModBlocks.CHISELED_ANDESITE);
        offerCrackingRecipe(exporter, ModBlocks.TILES_CRACKED_ANDESITE, ModBlocks.TILES_ANDESITE);
        offerCrackingRecipe(exporter, ModBlocks.CHISELED_CRACKED_GRANITE, ModBlocks.CHISELED_GRANITE);
        offerCrackingRecipe(exporter, ModBlocks.TILES_CRACKED_GRANITE, ModBlocks.TILES_GRANITE);
        offerCrackingRecipe(exporter, ModBlocks.CHISELED_CRACKED_DIORITE, ModBlocks.CHISELED_DIORITE);
        offerCrackingRecipe(exporter, ModBlocks.TILES_CRACKED_DIORITE, ModBlocks.TILES_DIORITE);
        offerCrackingRecipe(exporter, ModBlocks.CHISELED_CRACKED_OBSIDIAN, ModBlocks.CHISELED_OBSIDIAN);
        offerCrackingRecipe(exporter, ModBlocks.TILES_CRACKED_OBSIDIAN, ModBlocks.TILES_OBSIDIAN);
        offerCrackingRecipe(exporter, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED, ModBlocks.SMOOTH_STONE_BRICKS);
        offerCrackingRecipe(exporter, ModBlocks.SMOOTH_STONE_TILES_CRACKED, ModBlocks.SMOOTH_STONE_TILES);
        offerCrackingRecipe(exporter, ModBlocks.SMOOTH_STONE_CHISELED_CRACKED, ModBlocks.SMOOTH_STONE_CHISELED);
        offerCrackingRecipe(exporter, ModBlocks.CALCITE_TILES_CRACKED, ModBlocks.CALCITE_TILES);


         // Mossy Recipes
        mossycraft(ModBlocks.TILES_MOSSY_ANDESITE, ModBlocks.TILES_ANDESITE, exporter);
        mossycraft(ModBlocks.TILES_MOSSY_DIORITE, ModBlocks.TILES_DIORITE, exporter);
        mossycraft(ModBlocks.TILES_MOSSY_GRANITE, ModBlocks.TILES_GRANITE, exporter);
        mossycraft(ModBlocks.TILES_MOSSY_OBSIDIAN, ModBlocks.TILES_OBSIDIAN, exporter);
        mossycraft(ModBlocks.SMOOTH_STONE_TILES_MOSSY, ModBlocks.SMOOTH_STONE_TILES, exporter);
        mossycraft(ModBlocks.CALCITE_TILES_MOSSY, ModBlocks.CALCITE_TILES, exporter);

        mossycraft(ModBlocks.OBSIDIAN_BRICKS_MOSSY, ModBlocks.OBSIDIAN_BRICKS, exporter);
        mossycraft(ModBlocks.DIORITE_BRICKS_MOSSY, ModBlocks.DIORITE_BRICKS, exporter);
        mossycraft(ModBlocks.GRANITE_BRICKS_MOSSY, ModBlocks.GRANITE_BRICKS, exporter);
        mossycraft(ModBlocks.ANDESITE_BRICKS_MOSSY, ModBlocks.ANDESITE_BRICKS, exporter);
        mossycraft(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY, ModBlocks.SMOOTH_STONE_BRICKS, exporter);
        mossycraft(ModBlocks.CALCITE_BRICKS_MOSSY, ModBlocks.CALCITE_BRICKS, exporter);

        mossycraft(ModBlocks.CHISELED_ANDESITE_MOSSY, ModBlocks.CHISELED_ANDESITE, exporter);
        mossycraft(ModBlocks.CHISELED_DIORITE_MOSSY, ModBlocks.CHISELED_DIORITE, exporter);
        mossycraft(ModBlocks.CHISELED_GRANITE_MOSSY, ModBlocks.CHISELED_GRANITE, exporter);
        mossycraft(ModBlocks.CHISELED_OBSIDIAN_MOSSY, ModBlocks.CHISELED_OBSIDIAN, exporter);
        mossycraft(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY, ModBlocks.SMOOTH_STONE_CHISELED, exporter);
        mossycraft(ModBlocks.CHISELED_CALCITE_MOSSY, ModBlocks.CHISELED_CALCITE, exporter);




        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_OAK_PLANK, Blocks.OAK_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_MANGROVE_PLANK, Blocks.MANGROVE_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BIRCH_PLANK, Blocks.BIRCH_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_SPRUCE_PLANK, Blocks.SPRUCE_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_JUNGLE_PLANK, Blocks.JUNGLE_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_ACACIA_PLANK, Blocks.ACACIA_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_DARK_OAK_PLANK, Blocks.DARK_OAK_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAMBOO_PLANK, Blocks.BAMBOO_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WARPED_PLANK, Blocks.WARPED_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CRIMSON_PLANK, Blocks.CRIMSON_PLANKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CHERRY_PLANK, Blocks.CHERRY_PLANKS);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CDIRT_STAIRS, Blocks.COARSE_DIRT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RDIRT_STAIRS, Blocks.ROOTED_DIRT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_SLAB, Blocks.DIRT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_VERTICAL_SLAB, Blocks.DIRT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_STAIRS, Blocks.DIRT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_WALL, Blocks.DIRT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CDIRT_WALL, Blocks.COARSE_DIRT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CDIRT_SLAB, Blocks.COARSE_DIRT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CDIRT_VERTICAL_SLAB, Blocks.COARSE_DIRT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RDIRT_VERTICAL_SLAB, Blocks.ROOTED_DIRT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RDIRT_SLAB, Blocks.ROOTED_DIRT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RDIRT_WALL, Blocks.ROOTED_DIRT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SLAB, Blocks.MUD,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_STAIRS, Blocks.MUD);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_WALL, Blocks.MUD);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_VERTICAL_SLAB, Blocks.MUD,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PMUD_SLAB, Blocks.PACKED_MUD,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PMUD_STAIRS, Blocks.PACKED_MUD);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PMUD_WALL, Blocks.PACKED_MUD);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PMUD_VERTICAL_SLAB, Blocks.PACKED_MUD,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_VERTICAL_SLAB, Blocks.STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_FENCE, Blocks.STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_FENCE, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, Blocks.MOSSY_COBBLESTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLESTONE_FENCE, Blocks.MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICKS_FENCE, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICKS_VERTICAL_SLAB, Blocks.STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK, Blocks.STONE,9);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK, Blocks.COBBLESTONE,9);


        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_BRICKS_FENCE, Blocks.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_BRICKS_VERTICAL_SLAB, Blocks.MOSSY_STONE_BRICKS,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_STAIRS, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_WALL, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_SLAB, Blocks.CALCITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_VERTICAL_SLAB, Blocks.CALCITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_STAIRS, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_WALL, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_SLAB, Blocks.CALCITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_VERTICAL_SLAB, Blocks.CALCITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_STAIRS, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_SLAB, Blocks.CALCITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_VERTICAL_SLAB, Blocks.CALCITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_MOSSY_STAIRS, ModBlocks.CALCITE_BRICKS_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_MOSSY_WALL, ModBlocks.CALCITE_BRICKS_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.CALCITE_BRICKS_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_MOSSY_SLAB, ModBlocks.CALCITE_BRICKS_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_MOSSY_STAIRS, ModBlocks.CALCITE_TILES_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_MOSSY_WALL, ModBlocks.CALCITE_TILES_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_MOSSY_SLAB, ModBlocks.CALCITE_TILES_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_MOSSY_VERTICAL_SLAB, ModBlocks.CALCITE_TILES_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_CRACKED_STAIRS, ModBlocks.CALCITE_BRICKS_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_CRACKED_WALL, ModBlocks.CALCITE_BRICKS_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.CALCITE_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_CRACKED_SLAB, ModBlocks.CALCITE_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_CRACKED_STAIRS, ModBlocks.CALCITE_TILES_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_CRACKED_WALL, ModBlocks.CALCITE_TILES_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_CRACKED_SLAB, ModBlocks.CALCITE_TILES_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES_CRACKED_VERTICAL_SLAB, ModBlocks.CALCITE_TILES_CRACKED,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_STAIRS, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_WALL, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_SLAB, Blocks.TUFF,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_VERTICAL_SLAB, Blocks.TUFF,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_STAIRS, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_WALL, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_SLAB, Blocks.TUFF,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_VERTICAL_SLAB, Blocks.TUFF,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_STAIRS, Blocks.TUFF);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_SLAB, Blocks.TUFF,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_VERTICAL_SLAB, Blocks.TUFF,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_MOSSY_STAIRS, ModBlocks.TUFF_BRICKS_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_MOSSY_WALL, ModBlocks.TUFF_BRICKS_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.TUFF_BRICKS_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_MOSSY_SLAB, ModBlocks.TUFF_BRICKS_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_MOSSY_STAIRS, ModBlocks.TUFF_TILES_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_MOSSY_WALL, ModBlocks.TUFF_TILES_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_MOSSY_SLAB, ModBlocks.TUFF_TILES_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_MOSSY_VERTICAL_SLAB, ModBlocks.TUFF_TILES_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_CRACKED_STAIRS, ModBlocks.TUFF_BRICKS_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_CRACKED_WALL, ModBlocks.TUFF_BRICKS_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.TUFF_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICKS_CRACKED_SLAB, ModBlocks.TUFF_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_CRACKED_STAIRS, ModBlocks.TUFF_TILES_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_CRACKED_WALL, ModBlocks.TUFF_TILES_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_CRACKED_SLAB, ModBlocks.TUFF_TILES_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES_CRACKED_VERTICAL_SLAB, ModBlocks.TUFF_TILES_CRACKED,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DEEPSLATE_STAIRS, Blocks.CHISELED_DEEPSLATE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICKS_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_VERTICAL_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILES_SLAB, Blocks.DEEPSLATE_TILES,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILES_VERTICAL_SLAB, Blocks.DEEPSLATE_TILES,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILES_STAIRS, Blocks.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILES_WALL, Blocks.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICKS_VERTICAL_SLAB, Blocks.BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEA_LANTERN_VERTICAL_SLAB, Blocks.SEA_LANTERN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEA_LANTERN_WALL, Blocks.SEA_LANTERN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEA_LANTERN_STAIRS, Blocks.SEA_LANTERN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_VERTICAL_SLAB, Blocks.PRISMARINE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICKS_VERTICAL_SLAB, Blocks.PRISMARINE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICKS_WALL, Blocks.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, Blocks.DARK_PRISMARINE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB, Blocks.NETHER_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_VERTICAL_SLAB, Blocks.NETHERRACK,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_VERTICAL_SLAB, Blocks.CRACKED_NETHER_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_NETHER_BRICK_SLAB, Blocks.CHISELED_NETHER_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_NETHER_BRICK_VERTICAL_SLAB, Blocks.CHISELED_NETHER_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_NETHER_BRICK_STAIRS, Blocks.CHISELED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICKS_VERTICAL_SLAB, Blocks.RED_NETHER_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_VERTICAL_SLAB, Blocks.SMOOTH_BASALT,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_VERTICAL_SLAB, Blocks.GILDED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS, Blocks.CHISELED_POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DEEPSLATE_VERTICAL_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_CRACKED_VERTICAL_SLAB, ModBlocks.CHISELED_TUFF_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_CRACKED_SLAB, ModBlocks.CHISELED_TUFF_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TUFF_CRACKED_STAIRS, ModBlocks.CHISELED_TUFF_CRACKED);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_CRACKED_VERTICAL_SLAB, ModBlocks.CHISELED_CALCITE_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_CRACKED_SLAB, ModBlocks.CHISELED_CALCITE_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CALCITE_CRACKED_STAIRS, ModBlocks.CHISELED_CALCITE_CRACKED);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_FENCE, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_VERTICAL_SLAB, ModBlocks.CHISELED_ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_STAIRS, ModBlocks.CHISELED_ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_SLAB, ModBlocks.CHISELED_ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_MOSSY_SLAB, ModBlocks.CHISELED_ANDESITE_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_ANDESITE_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_MOSSY_STAIRS, ModBlocks.CHISELED_ANDESITE_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_WALL, ModBlocks.TILES_ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_SLAB, ModBlocks.TILES_ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_VERTICAL_SLAB, ModBlocks.TILES_ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_ANDESITE_STAIRS, ModBlocks.TILES_ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_FENCE, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB, ModBlocks.ANDESITE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB, ModBlocks.ANDESITE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_FENCE, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_ANDESITE_STAIRS, ModBlocks.TILES_MOSSY_ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_ANDESITE_SLAB, ModBlocks.TILES_MOSSY_ANDESITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_ANDESITE_WALL, ModBlocks.TILES_MOSSY_ANDESITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_ANDESITE_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_ANDESITE,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_FENCE, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_VERTICAL_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_VERTICAL_SLAB, ModBlocks.CHISELED_GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_STAIRS, ModBlocks.CHISELED_GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_SLAB, ModBlocks.CHISELED_GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_MOSSY_SLAB, ModBlocks.CHISELED_GRANITE_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_GRANITE_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_MOSSY_STAIRS, ModBlocks.CHISELED_GRANITE_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_VERTICAL_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_WALL, ModBlocks.TILES_GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_SLAB, ModBlocks.TILES_GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_VERTICAL_SLAB, ModBlocks.TILES_GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_GRANITE_STAIRS, ModBlocks.TILES_GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_FENCE, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB, ModBlocks.GRANITE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB, ModBlocks.GRANITE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS, ModBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_FENCE, ModBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_GRANITE_STAIRS, ModBlocks.TILES_MOSSY_GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_GRANITE_SLAB, ModBlocks.TILES_MOSSY_GRANITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_GRANITE_WALL, ModBlocks.TILES_MOSSY_GRANITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_GRANITE_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_GRANITE,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_FENCE, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_VERTICAL_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_VERTICAL_SLAB, ModBlocks.CHISELED_DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_STAIRS, ModBlocks.CHISELED_DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_SLAB, ModBlocks.CHISELED_DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_MOSSY_SLAB, ModBlocks.CHISELED_DIORITE_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_DIORITE_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_MOSSY_STAIRS, ModBlocks.CHISELED_DIORITE_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_VERTICAL_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_WALL, ModBlocks.TILES_DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_SLAB, ModBlocks.TILES_DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_VERTICAL_SLAB, ModBlocks.TILES_DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_DIORITE_STAIRS, ModBlocks.TILES_DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_FENCE, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB, ModBlocks.DIORITE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB, ModBlocks.DIORITE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS, ModBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_FENCE, ModBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_DIORITE_STAIRS, ModBlocks.TILES_MOSSY_DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_DIORITE_SLAB, ModBlocks.TILES_MOSSY_DIORITE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_DIORITE_WALL, ModBlocks.TILES_MOSSY_DIORITE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_DIORITE_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_DIORITE,2);

        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_STAIRS, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_SLAB, Blocks.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_VERTICAL_SLAB, Blocks.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_VERTICAL_SLAB, ModBlocks.CHISELED_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_STAIRS, ModBlocks.CHISELED_OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_SLAB, ModBlocks.CHISELED_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_MOSSY_SLAB, ModBlocks.CHISELED_OBSIDIAN_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_MOSSY_VERTICAL_SLAB, ModBlocks.CHISELED_OBSIDIAN_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_OBSIDIAN_MOSSY_STAIRS, ModBlocks.CHISELED_OBSIDIAN_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_SLAB, Blocks.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB, Blocks.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_STAIRS, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_WALL, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_WALL, ModBlocks.TILES_OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_SLAB, ModBlocks.TILES_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB, ModBlocks.TILES_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_OBSIDIAN_STAIRS, ModBlocks.TILES_OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_SLAB, Blocks.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_STAIRS, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_WALL, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_FENCE, Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB, Blocks.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB, ModBlocks.OBSIDIAN_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_SLAB, ModBlocks.OBSIDIAN_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_STAIRS, ModBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS_FENCE, ModBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_OBSIDIAN_STAIRS, ModBlocks.TILES_MOSSY_OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_OBSIDIAN_SLAB, ModBlocks.TILES_MOSSY_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_OBSIDIAN_WALL, ModBlocks.TILES_MOSSY_OBSIDIAN);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.TILES_MOSSY_OBSIDIAN_VERTICAL_SLAB, ModBlocks.TILES_MOSSY_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_STAIRS, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_SLAB, Blocks.SMOOTH_STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_VERTICAL_SLAB, Blocks.SMOOTH_STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_CHISELED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_STAIRS, ModBlocks.SMOOTH_STONE_CHISELED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_SLAB, ModBlocks.SMOOTH_STONE_CHISELED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_SLAB, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_STAIRS, ModBlocks.SMOOTH_STONE_CHISELED_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_WALL, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_WALL, ModBlocks.SMOOTH_STONE_BRICKS_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_SLAB, ModBlocks.SMOOTH_STONE_CHISELED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_CHISELED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_SLAB, Blocks.SMOOTH_STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_VERTICAL_SLAB, Blocks.SMOOTH_STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_STAIRS, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_WALL, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_WALL, ModBlocks.SMOOTH_STONE_TILES);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_SLAB, ModBlocks.SMOOTH_STONE_TILES,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_TILES,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_STAIRS, ModBlocks.SMOOTH_STONE_TILES);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_SLAB, Blocks.SMOOTH_STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_STAIRS, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_WALL, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_WALL, ModBlocks.SMOOTH_STONE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_FENCE, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_VERTICAL_SLAB, Blocks.SMOOTH_STONE,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_SLAB, ModBlocks.SMOOTH_STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_STAIRS, ModBlocks.SMOOTH_STONE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS_FENCE, ModBlocks.SMOOTH_STONE_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_MOSSY_STAIRS, ModBlocks.SMOOTH_STONE_TILES_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_MOSSY_SLAB, ModBlocks.SMOOTH_STONE_TILES_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_MOSSY_WALL, ModBlocks.SMOOTH_STONE_TILES_MOSSY);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_MOSSY_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_TILES_MOSSY,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_CRACKED_VERTICAL_SLAB, ModBlocks.SMOOTH_STONE_TILES_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_CRACKED_SLAB, ModBlocks.SMOOTH_STONE_TILES_CRACKED,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_CRACKED_STAIRS, ModBlocks.SMOOTH_STONE_TILES_CRACKED);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_TILES_CRACKED_WALL, ModBlocks.SMOOTH_STONE_TILES_CRACKED);
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

    private void stonefences(ItemConvertible output, ItemConvertible itemConvertible, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output,3)
                .pattern("AXA")
                .pattern("AXA")
                .input('X', ModItems.STONE_BRICK)
                .input('A',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, new Identifier(getRecipeName(output)));

    }

    private void woolfence(ItemConvertible output, ItemConvertible itemConvertible, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output,3)
                .pattern("AXA")
                .pattern("AXA")
                .input('X', Items.STRING)
                .input('A',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, new Identifier(getRecipeName(output)));

    }
    private void compresscrafting(ItemConvertible output, ItemConvertible itemConvertible, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output,4)
                .pattern("XX")
                .pattern("XX")
                .input('X', itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, new Identifier(getRecipeName(output)));

    }
    private void brickcrafting(ItemConvertible output, ItemConvertible itemConvertible, Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output,4)
                .input(ModItems.STONE_BRICK,2)
                .input(itemConvertible,2)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, new Identifier(getRecipeName(output)));

    }
    private void mossycraft(ItemConvertible output, ItemConvertible itemConvertible, Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output,1)
                .input(itemConvertible)
                .input(ModTags.Items.MOSS)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, new Identifier(getRecipeName(output)));

    }



}
