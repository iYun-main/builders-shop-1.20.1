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
        addDrop(ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.TILES_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_SLAB,slabDrops(ModBlocks.TILES_CRACKED_OBSIDIAN_SLAB));
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_WALL);
        addDrop(ModBlocks.TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB,slabDrops(ModBlocks.TILES_CRACKED_OBSIDIAN_VERTICAL_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN);
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_SLAB,slabDrops(ModBlocks.TILES_MOSSY_OBSIDIAN_SLAB));
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.TILES_MOSSY_OBSIDIAN_WALL);
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


    }

}
