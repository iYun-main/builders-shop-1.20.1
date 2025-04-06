package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.iyun.buildersshop.block.ModBlocks;
import net.minecraft.item.Items;

import javax.sound.midi.MidiChannel;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.DIRT_VERTICAL_SLAB, slabDrops(ModBlocks.DIRT_VERTICAL_SLAB));
        addDrop(ModBlocks.RDIRT_VERTICAL_SLAB, slabDrops(ModBlocks.RDIRT_VERTICAL_SLAB));
        addDrop(ModBlocks.CDIRT_VERTICAL_SLAB, slabDrops(ModBlocks.CDIRT_VERTICAL_SLAB));
        addDrop(ModBlocks.MUD_VERTICAL_SLAB, slabDrops(ModBlocks.MUD_VERTICAL_SLAB));
        addDrop(ModBlocks.PMUD_VERTICAL_SLAB, slabDrops(ModBlocks.PMUD_VERTICAL_SLAB));
        addDrop(ModBlocks.CLAY_VERTICAL_SLAB, slabDrops(ModBlocks.CLAY_VERTICAL_SLAB));
        addDrop(ModBlocks.GRAY_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.BLACK_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.BROWN_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.RED_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.RED_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.LIME_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.LIME_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.GREEN_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.CYAN_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.BLUE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.PINK_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.PINK_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.WHITE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_VERTICAL_SLAB));
        addDrop(ModBlocks.OAK_VERTICAL_SLAB,slabDrops(ModBlocks.OAK_VERTICAL_SLAB));
        addDrop(ModBlocks.BIRCH_VERTICAL_SLAB,slabDrops(ModBlocks.BIRCH_VERTICAL_SLAB));
        addDrop(ModBlocks.SPRUCE_VERTICAL_SLAB,slabDrops(ModBlocks.SPRUCE_VERTICAL_SLAB));
        addDrop(ModBlocks.JUNGLE_VERTICAL_SLAB,slabDrops(ModBlocks.JUNGLE_VERTICAL_SLAB));
        addDrop(ModBlocks.ACA_VERTICAL_SLAB, slabDrops(ModBlocks.ACA_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_OAK_VERTICAL_SLAB,slabDrops(ModBlocks.DARK_OAK_VERTICAL_SLAB));
        addDrop(ModBlocks.MANGROVE_VERTICAL_SLAB,slabDrops(ModBlocks.MANGROVE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHERRY_VERTICAL_SLAB,slabDrops(ModBlocks.CHERRY_VERTICAL_SLAB));
        addDrop(ModBlocks.BAMBOO_VERTICAL_SLAB,slabDrops(ModBlocks.BAMBOO_VERTICAL_SLAB));
        addDrop(ModBlocks.WARPED_VERTICAL_SLAB,slabDrops(ModBlocks.WARPED_VERTICAL_SLAB));
        addDrop(ModBlocks.CRIMSON_VERTICAL_SLAB,slabDrops(ModBlocks.CRIMSON_VERTICAL_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB,slabDrops(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLESTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.STONE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.STONE_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.CRACKED_STONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_STONE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_STONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.MOSSY_STONE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_STONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.DEEPSLATE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_VERTICAL_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_TILES_VERTICAL_SLAB));
        addDrop(ModBlocks.DEEPSLATE_TILES_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_TILES_VERTICAL_SLAB));
        addDrop(ModBlocks.BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.BRICKS_VERTICAL_SLAB));

        addDrop(ModBlocks.DIRT_SLAB, slabDrops(ModBlocks.DIRT_SLAB));
        addDrop(ModBlocks.RDIRT_SLAB, slabDrops(ModBlocks.RDIRT_SLAB));
        addDrop(ModBlocks.CDIRT_SLAB, slabDrops(ModBlocks.CDIRT_SLAB));
        addDrop(ModBlocks.MUD_SLAB, slabDrops(ModBlocks.MUD_SLAB));
        addDrop(ModBlocks.PMUD_SLAB, slabDrops(ModBlocks.PMUD_SLAB));
        addDrop(ModBlocks.CLAY_SLAB, slabDrops(ModBlocks.CLAY_SLAB));
        addDrop(ModBlocks.GRAY_WOOL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(ModBlocks.BLACK_WOOL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_SLAB));
        addDrop(ModBlocks.BROWN_WOOL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_SLAB));
        addDrop(ModBlocks.RED_WOOL_SLAB, slabDrops(ModBlocks.RED_WOOL_SLAB));
        addDrop(ModBlocks.ORANGE_WOOL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_SLAB));
        addDrop(ModBlocks.YELLOW_WOOL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_SLAB));
        addDrop(ModBlocks.LIME_WOOL_SLAB, slabDrops(ModBlocks.LIME_WOOL_SLAB));
        addDrop(ModBlocks.GREEN_WOOL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_SLAB));
        addDrop(ModBlocks.CYAN_WOOL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(ModBlocks.BLUE_WOOL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_SLAB));
        addDrop(ModBlocks.PURPLE_WOOL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_SLAB));
        addDrop(ModBlocks.MAGENTA_WOOL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_SLAB));
        addDrop(ModBlocks.PINK_WOOL_SLAB, slabDrops(ModBlocks.PINK_WOOL_SLAB));
        addDrop(ModBlocks.WHITE_WOOL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_SLAB,slabDrops(ModBlocks.ANDESITE_BRICKS_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB,slabDrops(ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_CRACKED_SLAB,slabDrops(ModBlocks.GRANITE_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.GRANITE_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_CRACKED_SLAB,slabDrops(ModBlocks.DIORITE_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.DIORITE_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICKS_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICKS_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB,slabDrops(ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.COBSIDIAN_BRICKS_SLAB, slabDrops(ModBlocks.COBSIDIAN_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.CHISELED_STONE_BRICKS_SLAB, slabDrops(ModBlocks.CHISELED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.CHISELED_DEEPSLATE_SLAB, slabDrops(ModBlocks.CHISELED_DEEPSLATE_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB));
        addDrop(ModBlocks.DEEPSLATE_TILES_SLAB, slabDrops(ModBlocks.DEEPSLATE_TILES_SLAB));

        addDrop(ModBlocks.DIRT_WALL);
        addDrop(ModBlocks.RDIRT_WALL);
        addDrop(ModBlocks.CDIRT_WALL);
        addDrop(ModBlocks.MUD_WALL);
        addDrop(ModBlocks.PMUD_WALL);
        addDrop(ModBlocks.CLAY_WALL);
        addDrop(ModBlocks.GRAY_WOOL_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_WALL);
        addDrop(ModBlocks.BLACK_WOOL_WALL);
        addDrop(ModBlocks.BROWN_WOOL_WALL);
        addDrop(ModBlocks.RED_WOOL_WALL);
        addDrop(ModBlocks.ORANGE_WOOL_WALL);
        addDrop(ModBlocks.YELLOW_WOOL_WALL);
        addDrop(ModBlocks.LIME_WOOL_WALL);
        addDrop(ModBlocks.GREEN_WOOL_WALL);
        addDrop(ModBlocks.CYAN_WOOL_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_WALL);
        addDrop(ModBlocks.BLUE_WOOL_WALL);
        addDrop(ModBlocks.PURPLE_WOOL_WALL);
        addDrop(ModBlocks.MAGENTA_WOOL_WALL);
        addDrop(ModBlocks.PINK_WOOL_WALL);
        addDrop(ModBlocks.WHITE_WOOL_WALL);
        addDrop(ModBlocks.ANDESITE_BRICKS_WALL);
        addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.GRANITE_BRICKS_WALL);
        addDrop(ModBlocks.GRANITE_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.GRANITE_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.DIORITE_BRICKS_WALL);
        addDrop(ModBlocks.DIORITE_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.DIORITE_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_WALL);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.COBSIDIAN_BRICKS_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);
        addDrop(ModBlocks.STONE_WALL);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL);
        addDrop(ModBlocks.DEEPSLATE_TILES_WALL);

        addDrop(ModBlocks.DIRT_FENCE );
        addDrop(ModBlocks.RDIRT_FENCE );
        addDrop(ModBlocks.CDIRT_FENCE );
        addDrop(ModBlocks.MUD_FENCE );
        addDrop(ModBlocks.PMUD_FENCE );
        addDrop(ModBlocks.CLAY_FENCE );
        addDrop(ModBlocks.GRAY_WOOL_FENCE );
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_FENCE );
        addDrop(ModBlocks.BLACK_WOOL_FENCE );
        addDrop(ModBlocks.BROWN_WOOL_FENCE );
        addDrop(ModBlocks.RED_WOOL_FENCE );
        addDrop(ModBlocks.ORANGE_WOOL_FENCE );
        addDrop(ModBlocks.YELLOW_WOOL_FENCE );
        addDrop(ModBlocks.LIME_WOOL_FENCE );
        addDrop(ModBlocks.GREEN_WOOL_FENCE );
        addDrop(ModBlocks.CYAN_WOOL_FENCE );
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
        addDrop(ModBlocks.BLUE_WOOL_FENCE );
        addDrop(ModBlocks.PURPLE_WOOL_FENCE );
        addDrop(ModBlocks.MAGENTA_WOOL_FENCE );
        addDrop(ModBlocks.PINK_WOOL_FENCE);
        addDrop(ModBlocks.WHITE_WOOL_FENCE);
        addDrop(ModBlocks.ANDESITE_BRICKS_FENCE);
        addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.GRANITE_BRICKS_FENCE);
        addDrop(ModBlocks.GRANITE_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.GRANITE_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.DIORITE_BRICKS_FENCE);
        addDrop(ModBlocks.DIORITE_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.DIORITE_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_FENCE);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.COBSIDIAN_BRICKS_FENCE);
        addDrop(ModBlocks.COBBLESTONE_FENCE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_FENCE);
        addDrop(ModBlocks.STONE_BRICKS_FENCE);
        addDrop(ModBlocks.STONE_FENCE);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_FENCE);
        addDrop(ModBlocks.MOSSY_STONE_BRICKS_FENCE );
        addDrop(ModBlocks.GRANITE_FENCE);
        addDrop(ModBlocks.DIORITE_FENCE);
        addDrop(ModBlocks.ANDESITE_FENCE);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_FENCE);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_BRICKS_FENCE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);
        addDrop(ModBlocks.DEEPSLATE_TILES_FENCE);
        addDrop(ModBlocks.BRICKS_FENCE);

        addDrop(ModBlocks.DIRT_STAIRS );
        addDrop(ModBlocks.RDIRT_STAIRS );
        addDrop(ModBlocks.CDIRT_STAIRS );
        addDrop(ModBlocks.MUD_STAIRS );
        addDrop(ModBlocks.PMUD_STAIRS );
        addDrop(ModBlocks.CLAY_STAIRS );
        addDrop(ModBlocks.GRAY_WOOL_STAIRS );
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_STAIRS );
        addDrop(ModBlocks.BLACK_WOOL_STAIRS );
        addDrop(ModBlocks.BROWN_WOOL_STAIRS );
        addDrop(ModBlocks.RED_WOOL_STAIRS );
        addDrop(ModBlocks.ORANGE_WOOL_STAIRS );
        addDrop(ModBlocks.YELLOW_WOOL_STAIRS );
        addDrop(ModBlocks.LIME_WOOL_STAIRS );
        addDrop(ModBlocks.GREEN_WOOL_STAIRS );
        addDrop(ModBlocks.CYAN_WOOL_STAIRS );
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.BLUE_WOOL_STAIRS );
        addDrop(ModBlocks.PURPLE_WOOL_STAIRS );
        addDrop(ModBlocks.MAGENTA_WOOL_STAIRS );
        addDrop(ModBlocks.PINK_WOOL_STAIRS );
        addDrop(ModBlocks.WHITE_WOOL_STAIRS );
        addDrop(ModBlocks.ANDESITE_BRICKS_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICKS_STAIRS );
        addDrop(ModBlocks.GRANITE_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICKS_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_STAIRS);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.COBSIDIAN_BRICKS_STAIRS );
        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.CHISELED_STONE_BRICKS_STAIRS );
        addDrop(ModBlocks.CHISELED_DEEPSLATE_STAIRS);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_TILES_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICKS);

        addDrop(ModBlocks.VERTICAL_OAK_PLANK);
        addDrop(ModBlocks.VERTICAL_OAK_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_OAK_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_OAK_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_OAK_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_OAK_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_OAK_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_OAK_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK);
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_BIRCH_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_BIRCH_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK);
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_SPRUCE_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_SPRUCE_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK);
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_JUNGLE_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_JUNGLE_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK);
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_ACACIA_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_ACACIA_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK);
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_CHERRY_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_CHERRY_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK);
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_MANGROVE_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_MANGROVE_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK);
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_DARK_OAK_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_DARK_OAK_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK);
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_BAMBOO_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_BAMBOO_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_WARPED_PLANK);
        addDrop(ModBlocks.VERTICAL_WARPED_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_WARPED_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_WARPED_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_WARPED_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_WARPED_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_WARPED_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_WARPED_PLANK_SLAB));

        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK);
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK_FENCE_GATE);
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK_STAIRS);
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK_VERTICAL_SLAB, slabDrops(ModBlocks.VERTICAL_CRIMSON_PLANK_VERTICAL_SLAB));
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK_SLAB, slabDrops(ModBlocks.VERTICAL_CRIMSON_PLANK_SLAB));

        addDrop(ModBlocks.SMOOTH_STONE_BRICKS);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED);
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_CHISELED_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_CHISELED_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY);
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_CHISELED_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED);
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_CHISELED_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_TILES);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_TILES_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_TILES_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_TILES_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_TILES_CRACKED);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_CRACKED_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_TILES_CRACKED_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_TILES_CRACKED_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_CRACKED_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_CRACKED_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_TILES_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_TILES_MOSSY);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_MOSSY_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_TILES_MOSSY_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_TILES_MOSSY_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_MOSSY_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_MOSSY_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_TILES_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_TILES_MOSSY_VERTICAL_SLAB));

        addDrop(ModBlocks.CHISELED_OBSIDIAN);
        addDrop(ModBlocks.CHISELED_OBSIDIAN_SLAB, slabDrops(ModBlocks.CHISELED_OBSIDIAN_SLAB));
        addDrop(ModBlocks.CHISELED_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.CHISELED_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.CHISELED_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_OBSIDIAN);
        addDrop(ModBlocks.CHISELED_CRACKED_OBSIDIAN_SLAB,slabDrops(ModBlocks.CHISELED_CRACKED_OBSIDIAN_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.CHISELED_CRACKED_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.CHISELED_CRACKED_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_OBSIDIAN_MOSSY);
        addDrop(ModBlocks.CHISELED_OBSIDIAN_MOSSY_STAIRS);
        addDrop(ModBlocks.CHISELED_OBSIDIAN_MOSSY_VERTICAL_SLAB,slabDrops(ModBlocks.CHISELED_OBSIDIAN_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_OBSIDIAN_MOSSY_SLAB,slabDrops(ModBlocks.CHISELED_OBSIDIAN_MOSSY_SLAB));
        addDrop(ModBlocks.TILES_OBSIDIAN);
        addDrop(ModBlocks.TILES_OBSIDIAN_SLAB,slabDrops(ModBlocks.TILES_OBSIDIAN_SLAB));
        addDrop(ModBlocks.TILES_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.TILES_OBSIDIAN_WALL);
        addDrop(ModBlocks.TILES_OBSIDIAN_FENCE);
        addDrop(ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_SLAB,slabDrops(ModBlocks.TILES_CRACKED_OBSIDIAN_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_WALL);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_FENCE);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN);
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_SLAB,slabDrops(ModBlocks.TILES_MOSSY_OBSIDIAN_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_WALL);
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_FENCE);
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.TILES_MOSSY_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_COBSIDIAN_RUNIC);
        addDrop(ModBlocks.CHISELED_COBSIDIAN_RUNIC_SLAB, slabDrops(ModBlocks.CHISELED_COBSIDIAN_RUNIC_SLAB));
        addDrop(ModBlocks.CHISELED_COBSIDIAN_RUNIC_STAIRS);
        addDrop(ModBlocks.CHISELED_COBSIDIAN_RUNIC_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_COBSIDIAN_RUNIC_VERTICAL_SLAB));

        addDrop(ModBlocks.CHISELED_ANDESITE);
        addDrop(ModBlocks.CHISELED_ANDESITE_SLAB, slabDrops(ModBlocks.CHISELED_ANDESITE_SLAB));
        addDrop(ModBlocks.CHISELED_ANDESITE_STAIRS);
        addDrop(ModBlocks.CHISELED_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_ANDESITE);
        addDrop(ModBlocks.CHISELED_CRACKED_ANDESITE_SLAB, slabDrops(ModBlocks.CHISELED_CRACKED_ANDESITE_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_ANDESITE_STAIRS);
        addDrop(ModBlocks.CHISELED_CRACKED_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_CRACKED_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_ANDESITE_MOSSY);
        addDrop(ModBlocks.CHISELED_ANDESITE_MOSSY_SLAB, slabDrops(ModBlocks.CHISELED_ANDESITE_MOSSY_SLAB));
        addDrop(ModBlocks.CHISELED_ANDESITE_MOSSY_STAIRS);
        addDrop(ModBlocks.CHISELED_ANDESITE_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_ANDESITE_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_ANDESITE);
        addDrop(ModBlocks.TILES_ANDESITE_SLAB, slabDrops(ModBlocks.TILES_ANDESITE_SLAB));
        addDrop(ModBlocks.TILES_ANDESITE_STAIRS);
        addDrop(ModBlocks.TILES_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_ANDESITE_WALL);
        addDrop(ModBlocks.TILES_MOSSY_ANDESITE);
        addDrop(ModBlocks.TILES_MOSSY_ANDESITE_SLAB, slabDrops(ModBlocks.TILES_MOSSY_ANDESITE_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_ANDESITE_STAIRS);
        addDrop(ModBlocks.TILES_MOSSY_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_MOSSY_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_ANDESITE_WALL);
        addDrop(ModBlocks.TILES_CRACKED_ANDESITE);
        addDrop(ModBlocks.TILES_CRACKED_ANDESITE_SLAB, slabDrops(ModBlocks.TILES_CRACKED_ANDESITE_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_ANDESITE_STAIRS);
        addDrop(ModBlocks.TILES_CRACKED_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_CRACKED_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_ANDESITE_WALL);
        addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED);
        addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY);
        addDrop(ModBlocks.ANDESITE_BRICKS);

        addDrop(ModBlocks.CHISELED_GRANITE);
        addDrop(ModBlocks.CHISELED_GRANITE_SLAB, slabDrops(ModBlocks.CHISELED_GRANITE_SLAB));
        addDrop(ModBlocks.CHISELED_GRANITE_STAIRS);
        addDrop(ModBlocks.CHISELED_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_GRANITE);
        addDrop(ModBlocks.CHISELED_CRACKED_GRANITE_SLAB, slabDrops(ModBlocks.CHISELED_CRACKED_GRANITE_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_GRANITE_STAIRS);
        addDrop(ModBlocks.CHISELED_CRACKED_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_CRACKED_GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_GRANITE_MOSSY);
        addDrop(ModBlocks.CHISELED_GRANITE_MOSSY_SLAB, slabDrops(ModBlocks.CHISELED_GRANITE_MOSSY_SLAB));
        addDrop(ModBlocks.CHISELED_GRANITE_MOSSY_STAIRS);
        addDrop(ModBlocks.CHISELED_GRANITE_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_GRANITE_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_GRANITE);
        addDrop(ModBlocks.TILES_GRANITE_SLAB, slabDrops(ModBlocks.TILES_GRANITE_SLAB));
        addDrop(ModBlocks.TILES_GRANITE_STAIRS);
        addDrop(ModBlocks.TILES_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_GRANITE_WALL);
        addDrop(ModBlocks.TILES_MOSSY_GRANITE);
        addDrop(ModBlocks.TILES_MOSSY_GRANITE_SLAB, slabDrops(ModBlocks.TILES_MOSSY_DIORITE_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_GRANITE_STAIRS);
        addDrop(ModBlocks.TILES_MOSSY_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_MOSSY_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_GRANITE_WALL);
        addDrop(ModBlocks.TILES_CRACKED_GRANITE);
        addDrop(ModBlocks.TILES_CRACKED_GRANITE_SLAB, slabDrops(ModBlocks.TILES_CRACKED_GRANITE_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_GRANITE_STAIRS);
        addDrop(ModBlocks.TILES_CRACKED_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_CRACKED_GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_GRANITE_WALL);
        addDrop(ModBlocks.GRANITE_BRICKS_CRACKED);
        addDrop(ModBlocks.GRANITE_BRICKS_MOSSY);

        addDrop(ModBlocks.CHISELED_DIORITE);
        addDrop(ModBlocks.CHISELED_DIORITE_SLAB, slabDrops(ModBlocks.CHISELED_DIORITE_SLAB));
        addDrop(ModBlocks.CHISELED_DIORITE_STAIRS);
        addDrop(ModBlocks.CHISELED_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_DIORITE);
        addDrop(ModBlocks.CHISELED_CRACKED_DIORITE_SLAB, slabDrops(ModBlocks.CHISELED_CRACKED_DIORITE_SLAB));
        addDrop(ModBlocks.CHISELED_CRACKED_DIORITE_STAIRS);
        addDrop(ModBlocks.CHISELED_CRACKED_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_CRACKED_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_DIORITE_MOSSY);
        addDrop(ModBlocks.CHISELED_DIORITE_MOSSY_SLAB, slabDrops(ModBlocks.CHISELED_DIORITE_MOSSY_SLAB));
        addDrop(ModBlocks.CHISELED_DIORITE_MOSSY_STAIRS);
        addDrop(ModBlocks.CHISELED_DIORITE_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_DIORITE_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_DIORITE);
        addDrop(ModBlocks.TILES_DIORITE_SLAB, slabDrops(ModBlocks.TILES_DIORITE_SLAB));
        addDrop(ModBlocks.TILES_DIORITE_STAIRS);
        addDrop(ModBlocks.TILES_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_DIORITE_WALL);
        addDrop(ModBlocks.TILES_MOSSY_DIORITE);
        addDrop(ModBlocks.TILES_MOSSY_DIORITE_SLAB, slabDrops(ModBlocks.TILES_MOSSY_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_DIORITE_STAIRS);
        addDrop(ModBlocks.TILES_MOSSY_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_MOSSY_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_DIORITE_WALL);
        addDrop(ModBlocks.TILES_CRACKED_DIORITE);
        addDrop(ModBlocks.TILES_CRACKED_DIORITE_SLAB, slabDrops(ModBlocks.TILES_CRACKED_DIORITE_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_DIORITE_STAIRS);
        addDrop(ModBlocks.TILES_CRACKED_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.TILES_CRACKED_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_DIORITE_WALL);
        addDrop(ModBlocks.DIORITE_BRICKS_CRACKED);
        addDrop(ModBlocks.DIORITE_BRICKS_MOSSY);
        addDrop(ModBlocks.DIORITE_BRICKS);

        addDrop(ModBlocks.TUFF_BRICKS);
        addDrop(ModBlocks.TUFF_BRICKS_STAIRS);
        addDrop(ModBlocks.TUFF_BRICKS_FENCE);
        addDrop(ModBlocks.TUFF_BRICKS_WALL);
        addDrop(ModBlocks.TUFF_BRICKS_SLAB, slabDrops(ModBlocks.TUFF_BRICKS_SLAB));
        addDrop(ModBlocks.TUFF_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.TUFF_TILES);
        addDrop(ModBlocks.TUFF_TILES_STAIRS);
        addDrop(ModBlocks.TUFF_TILES_FENCE);
        addDrop(ModBlocks.TUFF_TILES_WALL);
        addDrop(ModBlocks.TUFF_TILES_SLAB, slabDrops(ModBlocks.TUFF_TILES_SLAB));
        addDrop(ModBlocks.TUFF_TILES_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_TILES_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_TUFF);
        addDrop(ModBlocks.CHISELED_TUFF_STAIRS);
        addDrop(ModBlocks.CHISELED_TUFF_SLAB, slabDrops(ModBlocks.CHISELED_TUFF_SLAB));
        addDrop(ModBlocks.CHISELED_TUFF_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_TUFF_VERTICAL_SLAB));

        addDrop(ModBlocks.TUFF_BRICKS_CRACKED);
        addDrop(ModBlocks.TUFF_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.TUFF_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.TUFF_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.TUFF_BRICKS_CRACKED_SLAB, slabDrops(ModBlocks.TUFF_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.TUFF_BRICKS_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.TUFF_TILES_CRACKED);
        addDrop(ModBlocks.TUFF_TILES_CRACKED_STAIRS);
        addDrop(ModBlocks.TUFF_TILES_CRACKED_FENCE);
        addDrop(ModBlocks.TUFF_TILES_CRACKED_WALL);
        addDrop(ModBlocks.TUFF_TILES_CRACKED_SLAB, slabDrops(ModBlocks.TUFF_TILES_CRACKED_SLAB));
        addDrop(ModBlocks.TUFF_TILES_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_TILES_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_TUFF_CRACKED);
        addDrop(ModBlocks.CHISELED_TUFF_CRACKED_STAIRS);
        addDrop(ModBlocks.CHISELED_TUFF_CRACKED_SLAB, slabDrops(ModBlocks.CHISELED_TUFF_CRACKED_SLAB));
        addDrop(ModBlocks.CHISELED_TUFF_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_TUFF_CRACKED_VERTICAL_SLAB));

        addDrop(ModBlocks.TUFF_BRICKS_MOSSY);
        addDrop(ModBlocks.TUFF_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.TUFF_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.TUFF_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.TUFF_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.TUFF_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.TUFF_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.TUFF_TILES_MOSSY);
        addDrop(ModBlocks.TUFF_TILES_MOSSY_STAIRS);
        addDrop(ModBlocks.TUFF_TILES_MOSSY_FENCE);
        addDrop(ModBlocks.TUFF_TILES_MOSSY_WALL);
        addDrop(ModBlocks.TUFF_TILES_MOSSY_SLAB, slabDrops(ModBlocks.TUFF_TILES_MOSSY_SLAB));
        addDrop(ModBlocks.TUFF_TILES_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.TUFF_TILES_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_TUFF_MOSSY);
        addDrop(ModBlocks.CHISELED_TUFF_MOSSY_STAIRS);
        addDrop(ModBlocks.CHISELED_TUFF_MOSSY_SLAB, slabDrops(ModBlocks.CHISELED_TUFF_MOSSY_SLAB));
        addDrop(ModBlocks.CHISELED_TUFF_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_TUFF_MOSSY_VERTICAL_SLAB));

        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_BRICKS_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICKS_FENCE);
        addDrop(ModBlocks.CALCITE_BRICKS_WALL);
        addDrop(ModBlocks.CALCITE_BRICKS_SLAB, slabDrops(ModBlocks.CALCITE_BRICKS_SLAB));
        addDrop(ModBlocks.CALCITE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.CALCITE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CALCITE_TILES);
        addDrop(ModBlocks.CALCITE_TILES_STAIRS);
        addDrop(ModBlocks.CALCITE_TILES_FENCE);
        addDrop(ModBlocks.CALCITE_TILES_WALL);
        addDrop(ModBlocks.CALCITE_TILES_SLAB, slabDrops(ModBlocks.CALCITE_TILES_SLAB));
        addDrop(ModBlocks.CALCITE_TILES_VERTICAL_SLAB, slabDrops(ModBlocks.CALCITE_TILES_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CALCITE);
        addDrop(ModBlocks.CHISELED_CALCITE_STAIRS);
        addDrop(ModBlocks.CHISELED_CALCITE_SLAB, slabDrops(ModBlocks.CHISELED_CALCITE_SLAB));
        addDrop(ModBlocks.CHISELED_CALCITE_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_CALCITE_VERTICAL_SLAB));

        addDrop(ModBlocks.CALCITE_BRICKS_CRACKED);
        addDrop(ModBlocks.CALCITE_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICKS_CRACKED_FENCE);
        addDrop(ModBlocks.CALCITE_BRICKS_CRACKED_WALL);
        addDrop(ModBlocks.CALCITE_BRICKS_CRACKED_SLAB, slabDrops(ModBlocks.CALCITE_BRICKS_CRACKED_SLAB));
        addDrop(ModBlocks.CALCITE_BRICKS_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.CALCITE_BRICKS_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.CALCITE_TILES_CRACKED);
        addDrop(ModBlocks.CALCITE_TILES_CRACKED_STAIRS);
        addDrop(ModBlocks.CALCITE_TILES_CRACKED_FENCE);
        addDrop(ModBlocks.CALCITE_TILES_CRACKED_WALL);
        addDrop(ModBlocks.CALCITE_TILES_CRACKED_SLAB, slabDrops(ModBlocks.CALCITE_TILES_CRACKED_SLAB));
        addDrop(ModBlocks.CALCITE_TILES_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.CALCITE_TILES_CRACKED_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CALCITE_CRACKED);
        addDrop(ModBlocks.CHISELED_CALCITE_CRACKED_STAIRS);
        addDrop(ModBlocks.CHISELED_CALCITE_CRACKED_SLAB, slabDrops(ModBlocks.CHISELED_CALCITE_CRACKED_SLAB));
        addDrop(ModBlocks.CHISELED_CALCITE_CRACKED_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_CALCITE_CRACKED_VERTICAL_SLAB));

        addDrop(ModBlocks.CALCITE_BRICKS_MOSSY);
        addDrop(ModBlocks.CALCITE_BRICKS_MOSSY_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICKS_MOSSY_FENCE);
        addDrop(ModBlocks.CALCITE_BRICKS_MOSSY_WALL);
        addDrop(ModBlocks.CALCITE_BRICKS_MOSSY_SLAB, slabDrops(ModBlocks.CALCITE_BRICKS_MOSSY_SLAB));
        addDrop(ModBlocks.CALCITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CALCITE_BRICKS_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.CALCITE_TILES_MOSSY);
        addDrop(ModBlocks.CALCITE_TILES_MOSSY_STAIRS);
        addDrop(ModBlocks.CALCITE_TILES_MOSSY_FENCE);
        addDrop(ModBlocks.CALCITE_TILES_MOSSY_WALL);
        addDrop(ModBlocks.CALCITE_TILES_MOSSY_SLAB, slabDrops(ModBlocks.CALCITE_TILES_MOSSY_SLAB));
        addDrop(ModBlocks.CALCITE_TILES_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CALCITE_TILES_MOSSY_VERTICAL_SLAB));
        addDrop(ModBlocks.CHISELED_CALCITE_MOSSY);
        addDrop(ModBlocks.CHISELED_CALCITE_MOSSY_STAIRS);
        addDrop(ModBlocks.CHISELED_CALCITE_MOSSY_SLAB, slabDrops(ModBlocks.CHISELED_CALCITE_MOSSY_SLAB));
        addDrop(ModBlocks.CHISELED_CALCITE_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.CHISELED_CALCITE_MOSSY_VERTICAL_SLAB));

        addDrop(ModBlocks.SMOOTH_SANDSTONE_FENCE);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE);

        addDrop(ModBlocks.MOSS_FENCE);
        addDrop(ModBlocks.MOSS_WALL);
        addDrop(ModBlocks.MOSS_V_SLAB, slabDrops(ModBlocks.MOSS_V_SLAB));
        addDrop(ModBlocks.MOSS_SLAB, slabDrops(ModBlocks.MOSS_SLAB));
        addDrop(ModBlocks.MOSS_STAIR);

        addDropWithSilkTouch(ModBlocks.SEA_LANTERN_STAIRS);
        addDropWithSilkTouch(ModBlocks.SEA_LANTERN_SLAB, ModBlocks.SEA_LANTERN_SLAB);
        addDropWithSilkTouch(ModBlocks.SEA_LANTERN_VERTICAL_SLAB);
        addDropWithSilkTouch(ModBlocks.SEA_LANTERN_FENCE);
        addDropWithSilkTouch(ModBlocks.SEA_LANTERN_WALL);

        addDropWithSilkTouch(ModBlocks.P_ICE_FENCE);
        addDropWithSilkTouch(ModBlocks.P_ICE_WALL);
        addDropWithSilkTouch(ModBlocks.P_ICE_STAIR);
        addDropWithSilkTouch(ModBlocks.P_ICE_V_SLAB, ModBlocks.P_ICE_V_SLAB);
        addDropWithSilkTouch(ModBlocks.P_ICE_SLAB, ModBlocks.P_ICE_SLAB);

        addDropWithSilkTouch(ModBlocks.B_ICE_FENCE);
        addDropWithSilkTouch(ModBlocks.B_ICE_WALL);
        addDropWithSilkTouch(ModBlocks.B_ICE_STAIR);
        addDropWithSilkTouch(ModBlocks.B_ICE_V_SLAB);
        addDropWithSilkTouch(ModBlocks.B_ICE_SLAB);

        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.CALCITE_V_SLAB, slabDrops(ModBlocks.CALCITE_V_SLAB));
        addDrop(ModBlocks.CALCITE_STAIR);
        addDrop(ModBlocks.CALCITE_FENCE);
        addDrop(ModBlocks.CALCITE_WALL);

        addDrop(ModBlocks.TUFF_SLAB, slabDrops(ModBlocks.TUFF_SLAB));
        addDrop(ModBlocks.TUFF_V_SLAB, slabDrops(ModBlocks.TUFF_V_SLAB));
        addDrop(ModBlocks.TUFF_STAIR);
        addDrop(ModBlocks.TUFF_FENCE);
        addDrop(ModBlocks.TUFF_WALL);

        addDrop(ModBlocks.DRIPSTONE_SLAB, slabDrops(ModBlocks.DRIPSTONE_SLAB));
        addDrop(ModBlocks.DRIPSTONE_V_SLAB, slabDrops(ModBlocks.DRIPSTONE_V_SLAB));
        addDrop(ModBlocks.DRIPSTONE_STAIR);
        addDrop(ModBlocks.DRIPSTONE_FENCE);
        addDrop(ModBlocks.DRIPSTONE_WALL);

        addDrop(ModBlocks.OBSIDIAN_SLAB, slabDrops(ModBlocks.OBSIDIAN_SLAB));
        addDrop(ModBlocks.OBSIDIAN_V_SLAB, slabDrops(ModBlocks.OBSIDIAN_V_SLAB));
        addDrop(ModBlocks.OBSIDIAN_STAIR);
        addDrop(ModBlocks.OBSIDIAN_FENCE);
        addDrop(ModBlocks.OBSIDIAN_WALL);

        addDrop(ModBlocks.C_OBSIDIAN_SLAB, slabDrops(ModBlocks.C_OBSIDIAN_SLAB));
        addDrop(ModBlocks.C_OBSIDIAN_V_SLAB, slabDrops(ModBlocks.C_OBSIDIAN_V_SLAB));
        addDrop(ModBlocks.C_OBSIDIAN_STAIR);
        addDrop(ModBlocks.C_OBSIDIAN_FENCE);
        addDrop(ModBlocks.C_OBSIDIAN_WALL);

        addDrop(ModBlocks.SOUL_SOIL_SLAB, slabDrops(ModBlocks.SOUL_SOIL_SLAB));
        addDrop(ModBlocks.SOUL_SOIL_V_SLAB, slabDrops(ModBlocks.SOUL_SOIL_V_SLAB));
        addDrop(ModBlocks.SOUL_SOIL_STAIR);
        addDrop(ModBlocks.SOUL_SOIL_FENCE);
        addDrop(ModBlocks.SOUL_SOIL_WALL);

        addDrop(ModBlocks.PRISMARINE_VERTICAL_SLAB);
        addDrop(ModBlocks.PRISMARINE_FENCE);

        addDrop(ModBlocks.PRISMARINE_BRICKS_FENCE);
        addDrop(ModBlocks.PRISMARINE_BRICKS_VERTICAL_SLAB);
        addDrop(ModBlocks.PRISMARINE_BRICKS_WALL);

        addDrop(ModBlocks.DARK_PRISMARINE_FENCE);
        addDrop(ModBlocks.DARK_PRISMARINE_WALL);
        addDrop(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);

        addDrop(ModBlocks.NETHERRACK_SLAB);
        addDrop(ModBlocks.NETHERRACK_VERTICAL_SLAB);
        addDrop(ModBlocks.NETHERRACK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_WALL);
        addDrop(ModBlocks.NETHERRACK_FENCE);

        addDrop(ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_VERTICAL_SLAB);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_FENCE);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);

        addDrop(ModBlocks.CHISELED_NETHER_BRICK_VERTICAL_SLAB);
        addDrop(ModBlocks.CHISELED_NETHER_BRICK_SLAB);
        addDrop(ModBlocks.CHISELED_NETHER_BRICK_STAIRS);

        addDrop(ModBlocks.RED_NETHER_BRICKS_FENCE);
        addDrop(ModBlocks.RED_NETHER_BRICKS_VERTICAL_SLAB);

        addDrop(ModBlocks.SMOOTH_BASALT_VERTICAL_SLAB);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB);
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_FENCE);

        addDrop(ModBlocks.BLACKSTONE_VERTICAL_SLAB);
        addDrop(ModBlocks.BLACKSTONE_FENCE);

        addDrop(ModBlocks.GILDED_BLACKSTONE_FENCE);
        addDrop(ModBlocks.GILDED_BLACKSTONE_WALL);
        addDrop(ModBlocks.GILDED_BLACKSTONE_SLAB);
        addDrop(ModBlocks.GILDED_BLACKSTONE_VERTICAL_SLAB);
        addDrop(ModBlocks.GILDED_BLACKSTONE_STAIRS);

        addDrop(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB);
        addDrop(ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.CHISELED_POLISHED_BLACKSTONE_VERTICAL_SLAB);

        addDrop(ModBlocks.POLISHED_BLACKSTONE_FENCE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB,slabDrops(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB));

        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICKS_VERTICAL_SLAB,slabDrops(ModBlocks.POLISHED_BLACKSTONE_BRICKS_VERTICAL_SLAB));

        addDrop(ModBlocks.SMOOTH_QUARTZ_FENCE);
        addDrop(ModBlocks.SMOOTH_QUARTZ_WALL);

        addDrop(ModBlocks.AMETHYST_STAIRS);
        addDrop(ModBlocks.AMETHYST_WALL);
        addDrop(ModBlocks.AMETHYST_FENCE);
        addDrop(ModBlocks.AMETHYST_VERTICAL_SLAB,slabDrops(ModBlocks.AMETHYST_VERTICAL_SLAB));
        addDrop(ModBlocks.AMETHYST_SLAB,slabDrops(ModBlocks.AMETHYST_SLAB));

        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_WALL);
        addDrop(ModBlocks.TERRACOTTA_FENCE);
        addDrop(ModBlocks.TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.TERRACOTTA_SLAB,slabDrops(ModBlocks.TERRACOTTA_SLAB));

        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_WALL);
        addDrop(ModBlocks.WHITE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.WHITE_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.WHITE_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB,slabDrops(ModBlocks.WHITE_TERRACOTTA_SLAB));

        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB,slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));

        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_WALL);
        addDrop(ModBlocks.GRAY_TERRACOTTA_FENCE);
        addDrop(ModBlocks.GRAY_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.GRAY_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB,slabDrops(ModBlocks.GRAY_TERRACOTTA_SLAB));

        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_WALL);
        addDrop(ModBlocks.BLACK_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BLACK_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.BLACK_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB,slabDrops(ModBlocks.BLACK_TERRACOTTA_SLAB));

        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_WALL);
        addDrop(ModBlocks.BROWN_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BROWN_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.BROWN_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB,slabDrops(ModBlocks.BROWN_TERRACOTTA_SLAB));

        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_WALL);
        addDrop(ModBlocks.RED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.RED_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.RED_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.RED_TERRACOTTA_SLAB,slabDrops(ModBlocks.RED_TERRACOTTA_SLAB));

        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_WALL);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.ORANGE_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB,slabDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB));

        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_WALL);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_FENCE);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.YELLOW_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB,slabDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB));

        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_WALL);
        addDrop(ModBlocks.LIME_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIME_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.LIME_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB,slabDrops(ModBlocks.LIME_TERRACOTTA_SLAB));

        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_WALL);
        addDrop(ModBlocks.GREEN_TERRACOTTA_FENCE);
        addDrop(ModBlocks.GREEN_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.GREEN_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB,slabDrops(ModBlocks.GREEN_TERRACOTTA_SLAB));

        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_WALL);
        addDrop(ModBlocks.CYAN_TERRACOTTA_FENCE);
        addDrop(ModBlocks.CYAN_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.CYAN_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.CYAN_TERRACOTTA_SLAB,slabDrops(ModBlocks.CYAN_TERRACOTTA_SLAB));

        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB,slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));

        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_WALL);
        addDrop(ModBlocks.BLUE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BLUE_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.BLUE_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB,slabDrops(ModBlocks.BLUE_TERRACOTTA_SLAB));

        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_WALL);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.PURPLE_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB,slabDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB));

        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_WALL);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_FENCE);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.MAGENTA_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB,slabDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB));

        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_WALL);
        addDrop(ModBlocks.PINK_TERRACOTTA_FENCE);
        addDrop(ModBlocks.PINK_TERRACOTTA_VERTICAL_SLAB,slabDrops(ModBlocks.PINK_TERRACOTTA_VERTICAL_SLAB));
        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB,slabDrops(ModBlocks.PINK_TERRACOTTA_SLAB));

        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_WALL);
        addDrop(ModBlocks.WHITE_CONCRETE_FENCE);
        addDrop(ModBlocks.WHITE_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.WHITE_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB,slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));

        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB,slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));

        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_WALL);
        addDrop(ModBlocks.GRAY_CONCRETE_FENCE);
        addDrop(ModBlocks.GRAY_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.GRAY_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB,slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));

        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_WALL);
        addDrop(ModBlocks.BLACK_CONCRETE_FENCE);
        addDrop(ModBlocks.BLACK_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.BLACK_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB,slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));

        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_WALL);
        addDrop(ModBlocks.BROWN_CONCRETE_FENCE);
        addDrop(ModBlocks.BROWN_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.BROWN_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB,slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));

        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_WALL);
        addDrop(ModBlocks.RED_CONCRETE_FENCE);
        addDrop(ModBlocks.RED_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.RED_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_SLAB,slabDrops(ModBlocks.RED_CONCRETE_SLAB));

        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_WALL);
        addDrop(ModBlocks.ORANGE_CONCRETE_FENCE);
        addDrop(ModBlocks.ORANGE_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.ORANGE_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB,slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));

        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_WALL);
        addDrop(ModBlocks.YELLOW_CONCRETE_FENCE);
        addDrop(ModBlocks.YELLOW_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.YELLOW_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB,slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));

        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_WALL);
        addDrop(ModBlocks.LIME_CONCRETE_FENCE);
        addDrop(ModBlocks.LIME_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.LIME_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_SLAB,slabDrops(ModBlocks.LIME_CONCRETE_SLAB));

        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_WALL);
        addDrop(ModBlocks.GREEN_CONCRETE_FENCE);
        addDrop(ModBlocks.GREEN_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.GREEN_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB,slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));

        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_WALL);
        addDrop(ModBlocks.CYAN_CONCRETE_FENCE);
        addDrop(ModBlocks.CYAN_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.CYAN_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB,slabDrops(ModBlocks.CYAN_CONCRETE_SLAB));

        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB,slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));

        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_WALL);
        addDrop(ModBlocks.BLUE_CONCRETE_FENCE);
        addDrop(ModBlocks.BLUE_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.BLUE_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB,slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));

        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_WALL);
        addDrop(ModBlocks.PURPLE_CONCRETE_FENCE);
        addDrop(ModBlocks.PURPLE_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.PURPLE_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB,slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));

        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(ModBlocks.MAGENTA_CONCRETE_FENCE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.MAGENTA_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB,slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));

        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_WALL);
        addDrop(ModBlocks.PINK_CONCRETE_FENCE);
        addDrop(ModBlocks.PINK_CONCRETE_VERTICAL_SLAB,slabDrops(ModBlocks.PINK_CONCRETE_VERTICAL_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_SLAB,slabDrops(ModBlocks.PINK_CONCRETE_SLAB));

        addDrop(ModBlocks.PURPUR_VERTICAL_SLAB,slabDrops(ModBlocks.PURPUR_VERTICAL_SLAB));
        addDrop(ModBlocks.PURPUR_WALL);
        addDrop(ModBlocks.PURPUR_FENCE);

        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_VERTICAL_SLAB,slabDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB,slabDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS);

        addDrop(ModBlocks.END_STONE_SLAB,slabDrops(ModBlocks.END_STONE_SLAB));
        addDrop(ModBlocks.END_STONE_VERTICAL_SLAB,slabDrops(ModBlocks.END_STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_WALL);
        addDrop(ModBlocks.END_STONE_FENCE);

        addDrop(ModBlocks.END_STONE_BRICKS_VERTICAL_SLAB,slabDrops(ModBlocks.END_STONE_BRICKS_VERTICAL_SLAB));
        addDrop(ModBlocks.END_STONE_BRICKS_FENCE);

        addDrop(ModBlocks.QUARTZ_BRICKS_WALL);
        addDrop(ModBlocks.QUARTZ_BRICKS_FENCE);
        addDrop(ModBlocks.QUARTZ_BRICKS_VERTICAL_SLAB,slabDrops(ModBlocks.QUARTZ_BRICKS_VERTICAL_SLAB));

        addDrop(ModBlocks.OBSIDIAN_BRICKS);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED);
        addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY);
        addDrop(ModBlocks.COBSIDIAN_BRICKS);
        addDrop(ModBlocks.VERTICAL_OAK_PLANK_WALL);
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANK_WALL);
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANK_WALL);
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANK_WALL);
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANK_WALL);
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE);
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANK);
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANK);
        addDrop(ModBlocks.VERTICAL_WARPED_PLANK);

    }

}
