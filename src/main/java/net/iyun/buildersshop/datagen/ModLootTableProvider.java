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
        this.addDrop(ModBlocks.WARPED_VERTICAL_SLAB, slabDrops(ModBlocks.WARPED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CRIMSON_VERTICAL_SLAB, slabDrops(ModBlocks.CRIMSON_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BAMBOO_VERTICAL_SLAB, slabDrops(ModBlocks.BAMBOO_VERTICAL_SLAB));

    }

}
