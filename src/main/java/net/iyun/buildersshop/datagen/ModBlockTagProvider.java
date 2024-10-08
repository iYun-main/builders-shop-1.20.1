package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.iyun.buildersshop.block.ModBlocks;
import net.iyun.buildersshop.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.WHITE_WOOL_WALL)
                .add(ModBlocks.LIGHT_GRAY_WOOL_WALL)
                .add(ModBlocks.GRAY_WOOL_WALL)
                .add(ModBlocks.BLACK_WOOL_WALL)
                .add(ModBlocks.BROWN_WOOL_WALL)
                .add(ModBlocks.RED_WOOL_WALL)
                .add(ModBlocks.ORANGE_WOOL_WALL)
                .add(ModBlocks.YELLOW_WOOL_WALL)
                .add(ModBlocks.LIME_WOOL_WALL)
                .add(ModBlocks.GREEN_WOOL_WALL)
                .add(ModBlocks.CYAN_WOOL_WALL)
                .add(ModBlocks.LIGHT_BLUE_WOOL_WALL)
                .add(ModBlocks.BLUE_WOOL_WALL)
                .add(ModBlocks.PURPLE_WOOL_WALL)
                .add(ModBlocks.MAGENTA_WOOL_WALL)
                .add(ModBlocks.PINK_WOOL_WALL)
                .add(ModBlocks.WHITE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.GRAY_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.BLACK_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.BROWN_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.RED_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.LIME_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.GREEN_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.CYAN_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.BLUE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.PINK_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.WHITE_WOOL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ModBlocks.GRAY_WOOL_SLAB)
                .add(ModBlocks.BLACK_WOOL_SLAB)
                .add(ModBlocks.BROWN_WOOL_SLAB)
                .add(ModBlocks.RED_WOOL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_SLAB)
                .add(ModBlocks.LIME_WOOL_SLAB)
                .add(ModBlocks.GREEN_WOOL_SLAB)
                .add(ModBlocks.CYAN_WOOL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ModBlocks.BLUE_WOOL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)
                .add(ModBlocks.PINK_WOOL_SLAB)
                .add(ModBlocks.WHITE_WOOL_FENCE)
                .add(ModBlocks.LIGHT_GRAY_WOOL_FENCE)
                .add(ModBlocks.GRAY_WOOL_FENCE)
                .add(ModBlocks.BLACK_WOOL_FENCE)
                .add(ModBlocks.BROWN_WOOL_FENCE)
                .add(ModBlocks.RED_WOOL_FENCE)
                .add(ModBlocks.ORANGE_WOOL_FENCE)
                .add(ModBlocks.YELLOW_WOOL_FENCE)
                .add(ModBlocks.LIME_WOOL_FENCE)
                .add(ModBlocks.GREEN_WOOL_FENCE)
                .add(ModBlocks.CYAN_WOOL_FENCE)
                .add(ModBlocks.LIGHT_BLUE_WOOL_FENCE)
                .add(ModBlocks.BLUE_WOOL_FENCE)
                .add(ModBlocks.PURPLE_WOOL_FENCE)
                .add(ModBlocks.MAGENTA_WOOL_FENCE)
                .add(ModBlocks.PINK_WOOL_FENCE);


        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DIRT_WALL)
                .add(ModBlocks.MUD_WALL)
                .add(ModBlocks.CLAY_WALL)
                .add(ModBlocks.RDIRT_WALL)
                .add(ModBlocks.PMUD_WALL)
                .add(ModBlocks.WHITE_WOOL_WALL)
                .add(ModBlocks.LIGHT_GRAY_WOOL_WALL)
                .add(ModBlocks.GRAY_WOOL_WALL)
                .add(ModBlocks.BLACK_WOOL_WALL)
                .add(ModBlocks.BROWN_WOOL_WALL)
                .add(ModBlocks.RED_WOOL_WALL)
                .add(ModBlocks.ORANGE_WOOL_WALL)
                .add(ModBlocks.YELLOW_WOOL_WALL)
                .add(ModBlocks.LIME_WOOL_WALL)
                .add(ModBlocks.GREEN_WOOL_WALL)
                .add(ModBlocks.CYAN_WOOL_WALL)
                .add(ModBlocks.LIGHT_BLUE_WOOL_WALL)
                .add(ModBlocks.BLUE_WOOL_WALL)
                .add(ModBlocks.PURPLE_WOOL_WALL)
                .add(ModBlocks.MAGENTA_WOOL_WALL)
                .add(ModBlocks.PINK_WOOL_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.SMOOTH_STONE_WALL)
                .add(ModBlocks.ANDESITE_BRICKS_WALL)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_WALL)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_WALL)
                .add(ModBlocks.GRANITE_BRICKS_WALL)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_WALL)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_WALL)
                .add(ModBlocks.DIORITE_BRICKS_WALL)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_WALL)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_WALL)
                .add(ModBlocks.COBSIDIAN_BRICKS_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL)
                .add(ModBlocks.CRACKED_STONE_BRICKS_WALL)
                .add(ModBlocks.CHISELED_STONE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_STONE_BRICKS_WALL)
                .add(ModBlocks.CHISELED_DEEPSLATE_WALL)
                .add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL)
                .add(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL)
                .add(ModBlocks.DEEPSLATE_TILES_WALL)
                .add(ModBlocks.CDIRT_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.WHITE_WOOL_FENCE)
                .add(ModBlocks.LIGHT_GRAY_WOOL_FENCE)
                .add(ModBlocks.GRAY_WOOL_FENCE)
                .add(ModBlocks.BLACK_WOOL_FENCE)
                .add(ModBlocks.BROWN_WOOL_FENCE)
                .add(ModBlocks.RED_WOOL_FENCE)
                .add(ModBlocks.ORANGE_WOOL_FENCE)
                .add(ModBlocks.YELLOW_WOOL_FENCE)
                .add(ModBlocks.LIME_WOOL_FENCE)
                .add(ModBlocks.GREEN_WOOL_FENCE)
                .add(ModBlocks.CYAN_WOOL_FENCE)
                .add(ModBlocks.LIGHT_BLUE_WOOL_FENCE)
                .add(ModBlocks.BLUE_WOOL_FENCE)
                .add(ModBlocks.PURPLE_WOOL_FENCE)
                .add(ModBlocks.MAGENTA_WOOL_FENCE)
                .add(ModBlocks.PINK_WOOL_FENCE)
                .add(ModBlocks.DEEPSLATE_TILES_FENCE)
                .add(ModBlocks.DIRT_FENCE)
                .add(ModBlocks.RDIRT_FENCE)
                .add(ModBlocks.CDIRT_FENCE)
                .add(ModBlocks.CLAY_FENCE)
                .add(ModBlocks.MUD_FENCE)
                .add(ModBlocks.PMUD_FENCE)
                .add(ModBlocks.ANDESITE_BRICKS_FENCE)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.DIORITE_BRICKS_FENCE)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.GRANITE_BRICKS_FENCE)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_FENCE)
                .add(ModBlocks.COBSIDIAN_BRICKS_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.COBBLESTONE_FENCE)
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE)
                .add(ModBlocks.SMOOTH_STONE_FENCE)
                .add(ModBlocks.STONE_FENCE)
                .add(ModBlocks.CRACKED_STONE_BRICKS_FENCE)
                .add(ModBlocks.CHISELED_STONE_BRICKS_FENCE)
                .add(ModBlocks.MOSSY_STONE_BRICKS_FENCE)
                .add(ModBlocks.GRANITE_FENCE)
                .add(ModBlocks.DIORITE_FENCE)
                .add(ModBlocks.ANDESITE_FENCE)
                .add(ModBlocks.COBBLED_DEEPSLATE_FENCE)
                .add(ModBlocks.CHISELED_DEEPSLATE_FENCE)
                .add(ModBlocks.POLISHED_DEEPSLATE_FENCE)
                .add(ModBlocks.DEEPSLATE_BRICKS_FENCE)
                .add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE)
                .add(ModBlocks.DEEPSLATE_TILES_FENCE)
                .add(ModBlocks.BRICKS_FENCE)
                .add(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);


        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.WHITE_WOOL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ModBlocks.GRAY_WOOL_SLAB)
                .add(ModBlocks.BLACK_WOOL_SLAB)
                .add(ModBlocks.BROWN_WOOL_SLAB)
                .add(ModBlocks.RED_WOOL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_SLAB)
                .add(ModBlocks.LIME_WOOL_SLAB)
                .add(ModBlocks.GREEN_WOOL_SLAB)
                .add(ModBlocks.CYAN_WOOL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ModBlocks.BLUE_WOOL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)
                .add(ModBlocks.PINK_WOOL_SLAB)
                .add(ModBlocks.RDIRT_SLAB)
                .add(ModBlocks.CDIRT_SLAB)
                .add(ModBlocks.CLAY_SLAB)
                .add(ModBlocks.MUD_SLAB)
                .add(ModBlocks.PMUD_SLAB)
                .add(ModBlocks.DIRT_SLAB);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.DIRT_VERTICAL_SLAB)
                .add(ModBlocks.CLAY_SLAB)
                .add(ModBlocks.CLAY_WALL)
                .add(ModBlocks.CLAY_FENCE)
                .add(ModBlocks.CLAY_STAIRS)
                .add(ModBlocks.CLAY_VERTICAL_SLAB)
                .add(ModBlocks.MUD_SLAB)
                .add(ModBlocks.MUD_WALL)
                .add(ModBlocks.MUD_FENCE)
                .add(ModBlocks.MUD_STAIRS)
                .add(ModBlocks.MUD_VERTICAL_SLAB)
                .add(ModBlocks.RDIRT_VERTICAL_SLAB)
                .add(ModBlocks.CDIRT_VERTICAL_SLAB)
                .add(ModBlocks.RDIRT_SLAB)
                .add(ModBlocks.RDIRT_WALL)
                .add(ModBlocks.CDIRT_WALL)
                .add(ModBlocks.DIRT_WALL)
                .add(ModBlocks.DIRT_FENCE)
                .add(ModBlocks.CDIRT_FENCE)
                .add(ModBlocks.RDIRT_FENCE)
                .add(ModBlocks.RDIRT_SLAB)
                .add(ModBlocks.CDIRT_SLAB)
                .add(ModBlocks.DIRT_SLAB);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ANDESITE_BRICKS_FENCE)
                .add(ModBlocks.ANDESITE_BRICKS_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS_STAIRS)
                .add(ModBlocks.ANDESITE_BRICKS_WALL)
                .add(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_STAIRS)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_WALL)
                .add(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_STAIRS)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_WALL)
                .add(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB)
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.GRANITE_BRICKS_FENCE)
                .add(ModBlocks.GRANITE_BRICKS_SLAB)
                .add(ModBlocks.GRANITE_BRICKS_STAIRS)
                .add(ModBlocks.GRANITE_BRICKS_WALL)
                .add(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_SLAB)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_STAIRS)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_WALL)
                .add(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_SLAB)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_STAIRS)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_WALL)
                .add(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB)
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICKS_FENCE)
                .add(ModBlocks.DIORITE_BRICKS_SLAB)
                .add(ModBlocks.DIORITE_BRICKS_STAIRS)
                .add(ModBlocks.DIORITE_BRICKS_WALL)
                .add(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_SLAB)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_STAIRS)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_WALL)
                .add(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_SLAB)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_STAIRS)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_WALL)
                .add(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB)
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.OBSIDIAN_BRICKS_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICKS_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS)
                .add(ModBlocks.COBSIDIAN_BRICKS_FENCE)
                .add(ModBlocks.COBSIDIAN_BRICKS_SLAB)
                .add(ModBlocks.COBSIDIAN_BRICKS_STAIRS)
                .add(ModBlocks.COBSIDIAN_BRICKS_WALL)
                .add(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.COBSIDIAN_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_BRICKS_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICKS_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_FENCE)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL)
                .add(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICKS)
                .add(ModBlocks.COBSIDIAN_BRICKS_FENCE)
                .add(ModBlocks.COBSIDIAN_BRICKS_SLAB)
                .add(ModBlocks.COBSIDIAN_BRICKS_STAIRS)
                .add(ModBlocks.COBSIDIAN_BRICKS_WALL)
                .add(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB)
                .add(ModBlocks.COBSIDIAN_BRICKS);


        getOrCreateTagBuilder(ModTags.Blocks.V_SLAB)
                .add(ModBlocks.WHITE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.GRAY_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.BLACK_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.BROWN_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.RED_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.LIME_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.GREEN_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.CYAN_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.BLUE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.PINK_WOOL_VERTICAL_SLAB)
                .add(ModBlocks.RDIRT_VERTICAL_SLAB)
                .add(ModBlocks.CDIRT_VERTICAL_SLAB)
                .add(ModBlocks.DIRT_VERTICAL_SLAB);

    }
}
