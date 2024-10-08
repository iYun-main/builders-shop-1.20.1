package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.iyun.buildersshop.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        this.addDrop(ModBlocks.DIRT_VERTICAL_SLAB, slabDrops(ModBlocks.DIRT_VERTICAL_SLAB));
        this.addDrop(ModBlocks.RDIRT_VERTICAL_SLAB, slabDrops(ModBlocks.RDIRT_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CDIRT_VERTICAL_SLAB, slabDrops(ModBlocks.CDIRT_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MUD_VERTICAL_SLAB, slabDrops(ModBlocks.MUD_VERTICAL_SLAB));
        this.addDrop(ModBlocks.PMUD_VERTICAL_SLAB, slabDrops(ModBlocks.PMUD_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CLAY_VERTICAL_SLAB, slabDrops(ModBlocks.CLAY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.GRAY_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BLACK_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BROWN_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.RED_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.RED_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.LIME_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.LIME_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.GREEN_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CYAN_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BLUE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.PINK_WOOL_VERTICAL_SLAB, slabDrops(ModBlocks.PINK_WOOL_VERTICAL_SLAB));
        this.addDrop(ModBlocks.OAK_VERTICAL_SLAB,slabDrops(ModBlocks.OAK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BIRCH_VERTICAL_SLAB,slabDrops(ModBlocks.BIRCH_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SPRUCE_VERTICAL_SLAB,slabDrops(ModBlocks.SPRUCE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.JUNGLE_VERTICAL_SLAB,slabDrops(ModBlocks.JUNGLE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ACA_VERTICAL_SLAB, slabDrops(ModBlocks.ACA_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DARK_OAK_VERTICAL_SLAB,slabDrops(ModBlocks.DARK_OAK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MANGROVE_VERTICAL_SLAB,slabDrops(ModBlocks.MANGROVE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CHERRY_VERTICAL_SLAB,slabDrops(ModBlocks.CHERRY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BAMBOO_VERTICAL_SLAB,slabDrops(ModBlocks.BAMBOO_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WARPED_VERTICAL_SLAB,slabDrops(ModBlocks.WARPED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CRIMSON_VERTICAL_SLAB,slabDrops(ModBlocks.CRIMSON_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB,slabDrops(ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB));
        this.addDrop(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB));
        this.addDrop(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB,slabDrops(ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB, slabDrops(ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB));

    }

}
