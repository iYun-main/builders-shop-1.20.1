package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.iyun.buildersshop.block.ModBlocks;
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
                .add(ModBlocks.PINK_WOOL_WALL);


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
                .add(ModBlocks.CDIRT_WALL);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.DIRT_VERTICAL_SLAB)
                .add(ModBlocks.DIRT_SLAB);


    }
}
