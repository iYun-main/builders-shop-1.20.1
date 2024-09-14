package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.iyun.buildersshop.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool dirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIRT);

        dirtPool.button(ModBlocks.DIRT_BUTTON);
        dirtPool.wall(ModBlocks.DIRT_WALL);
        dirtPool.fence(ModBlocks.DIRT_FENCE);
        dirtPool.fenceGate(ModBlocks.DIRT_FENCEG);
        dirtPool.slab(ModBlocks.DIRT_SLAB);
        dirtPool.stairs(ModBlocks.DIRT_STAIRS);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
