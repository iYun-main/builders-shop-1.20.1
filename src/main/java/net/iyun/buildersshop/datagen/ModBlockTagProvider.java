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
                .add(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);


        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.RDIRT_SLAB)
                .add(ModBlocks.CDIRT_SLAB)
                .add(ModBlocks.DIRT_SLAB);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.DIRT_VERTICAL_SLAB)
                .add(ModBlocks.RDIRT_VERTICAL_SLAB)
                .add(ModBlocks.CDIRT_VERTICAL_SLAB)
                .add(ModBlocks.RDIRT_SLAB)
                .add(ModBlocks.CDIRT_SLAB)
                .add(ModBlocks.DIRT_SLAB);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);



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
