package net.iyun.buildersshop.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.iyun.buildersshop.block.ModBlocks;
import net.iyun.buildersshop.block.enums.VerticalSlabType;
import net.iyun.buildersshop.property.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {


    private static final String TOP_SUFFIX = "_top";
    private static final String SIDE_SUFFIX = "_side";
    private static final String BOTTOM_SUFFIX = "_bottom";

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OAK_PLANKS, ModBlocks.OAK_VERTICAL_SLAB);

        BlockStateModelGenerator.BlockTexturePool dirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIRT);
        BlockStateModelGenerator.BlockTexturePool cdirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COARSE_DIRT);
        BlockStateModelGenerator.BlockTexturePool rdirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ROOTED_DIRT);
        BlockStateModelGenerator.BlockTexturePool mudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MUD);
        BlockStateModelGenerator.BlockTexturePool pmudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        BlockStateModelGenerator.BlockTexturePool clayPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CLAY);
        BlockStateModelGenerator.BlockTexturePool whitewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightgraywoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool graywoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool blackwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlockStateModelGenerator.BlockTexturePool brownwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BlockStateModelGenerator.BlockTexturePool redwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        BlockStateModelGenerator.BlockTexturePool orangewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        BlockStateModelGenerator.BlockTexturePool yellowwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        BlockStateModelGenerator.BlockTexturePool limewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        BlockStateModelGenerator.BlockTexturePool greenwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        BlockStateModelGenerator.BlockTexturePool cyanwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        BlockStateModelGenerator.BlockTexturePool lbluewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool bluewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool purplewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        BlockStateModelGenerator.BlockTexturePool magentawoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        BlockStateModelGenerator.BlockTexturePool pinkwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);

        //   dirtPool.button(ModBlocks.DIRT_BUTTON);
        dirtPool.wall(ModBlocks.DIRT_WALL);
        dirtPool.fence(ModBlocks.DIRT_FENCE);
        dirtPool.slab(ModBlocks.DIRT_SLAB);
        dirtPool.stairs(ModBlocks.DIRT_STAIRS);

        mudPool.wall(ModBlocks.MUD_WALL);
        mudPool.fence(ModBlocks.MUD_FENCE);
        mudPool.slab(ModBlocks.MUD_SLAB);
        mudPool.stairs(ModBlocks.MUD_STAIRS);

        clayPool.wall(ModBlocks.CLAY_WALL);
        clayPool.fence(ModBlocks.CLAY_FENCE);
        clayPool.slab(ModBlocks.CLAY_SLAB);
        clayPool.stairs(ModBlocks.CLAY_STAIRS);

        pmudPool.wall(ModBlocks.PMUD_WALL);
        pmudPool.fence(ModBlocks.PMUD_FENCE);
        pmudPool.slab(ModBlocks.PMUD_SLAB);
        pmudPool.stairs(ModBlocks.PMUD_STAIRS);

        whitewoolPool.wall(ModBlocks.WHITE_WOOL_WALL);
        whitewoolPool.fence(ModBlocks.WHITE_WOOL_FENCE);
        whitewoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        whitewoolPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);

        lightgraywoolPool.wall(ModBlocks.LIGHT_GRAY_WOOL_WALL);
        lightgraywoolPool.fence(ModBlocks.LIGHT_GRAY_WOOL_FENCE);
        lightgraywoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        lightgraywoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);

        graywoolPool.wall(ModBlocks.GRAY_WOOL_WALL);
        graywoolPool.fence(ModBlocks.GRAY_WOOL_FENCE);
        graywoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        graywoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);

        redwoolPool.wall(ModBlocks.RED_WOOL_WALL);
        redwoolPool.fence(ModBlocks.RED_WOOL_FENCE);
        redwoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        redwoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);

        orangewoolPool.wall(ModBlocks.ORANGE_WOOL_WALL);
        orangewoolPool.fence(ModBlocks.ORANGE_WOOL_FENCE);
        orangewoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        orangewoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);

        yellowwoolPool.wall(ModBlocks.YELLOW_WOOL_WALL);
        yellowwoolPool.fence(ModBlocks.YELLOW_WOOL_FENCE);
        yellowwoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        yellowwoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);

        limewoolPool.wall(ModBlocks.LIME_WOOL_WALL);
        limewoolPool.fence(ModBlocks.LIME_WOOL_FENCE);
        limewoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        limewoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);

        lbluewoolPool.wall(ModBlocks.LIGHT_BLUE_WOOL_WALL);
        lbluewoolPool.fence(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
        lbluewoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        lbluewoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);

        bluewoolPool.wall(ModBlocks.BLUE_WOOL_WALL);
        bluewoolPool.fence(ModBlocks.BLUE_WOOL_FENCE);
        bluewoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        bluewoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);

        purplewoolPool.wall(ModBlocks.PURPLE_WOOL_WALL);
        purplewoolPool.fence(ModBlocks.PURPLE_WOOL_FENCE);
        purplewoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        purplewoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);

        magentawoolPool.wall(ModBlocks.MAGENTA_WOOL_WALL);
        magentawoolPool.fence(ModBlocks.MAGENTA_WOOL_FENCE);
        magentawoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        magentawoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);

        pinkwoolPool.wall(ModBlocks.PINK_WOOL_WALL);
        pinkwoolPool.fence(ModBlocks.PINK_WOOL_FENCE);
        pinkwoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
        pinkwoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);

        blackwoolPool.wall(ModBlocks.BLACK_WOOL_WALL);
        blackwoolPool.fence(ModBlocks.BLACK_WOOL_FENCE);
        blackwoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        blackwoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);

        greenwoolPool.wall(ModBlocks.GREEN_WOOL_WALL);
        greenwoolPool.fence(ModBlocks.GREEN_WOOL_FENCE);
        greenwoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        greenwoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);

        cyanwoolPool.wall(ModBlocks.CYAN_WOOL_WALL);
        cyanwoolPool.fence(ModBlocks.CYAN_WOOL_FENCE);
        cyanwoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        cyanwoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);

        brownwoolPool.wall(ModBlocks.BROWN_WOOL_WALL);
        brownwoolPool.fence(ModBlocks.BROWN_WOOL_FENCE);
        brownwoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        brownwoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);

        //  rdirtPool.button(ModBlocks.RDIRT_BUTTON);
        rdirtPool.wall(ModBlocks.RDIRT_WALL);
        rdirtPool.fence(ModBlocks.RDIRT_FENCE);
        rdirtPool.slab(ModBlocks.RDIRT_SLAB);
        rdirtPool.stairs(ModBlocks.RDIRT_STAIRS);

        //  cdirtPool.button(ModBlocks.CDIRT_BUTTON);
        cdirtPool.wall(ModBlocks.CDIRT_WALL);
        cdirtPool.fence(ModBlocks.CDIRT_FENCE);
        cdirtPool.slab(ModBlocks.CDIRT_SLAB);
        cdirtPool.stairs(ModBlocks.CDIRT_STAIRS);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
    private void registerSmoothStone(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.SIDE, TextureMap.getId(Blocks.SMOOTH_STONE_SLAB).withSuffixedPath("_side"))
                .put(TextureKey.BOTTOM, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.PARTICLE, TextureMap.getId(Blocks.SMOOTH_STONE));
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(Blocks.SMOOTH_STONE_SLAB, "_side"), textureMap.getTexture(TextureKey.TOP));

        Identifier modelId = ModBlockModels.VERTICAL_SLAB.upload(ModBlocks.OAK_VERTICAL_SLAB, textureMap, blockStateModelGenerator.modelCollector);
        Identifier leftModelId = ModBlockModels.VERTICAL_SLAB_LEFT.upload(ModBlocks.OAK_VERTICAL_SLAB, "_left", textureMap, blockStateModelGenerator.modelCollector);
        Identifier rightModelId = ModBlockModels.VERTICAL_SLAB_RIGHT.upload(ModBlocks.OAK_VERTICAL_SLAB, "_right", textureMap, blockStateModelGenerator.modelCollector);
        Identifier backModelId = ModBlockModels.VERTICAL_SLAB_BACK.upload(ModBlocks.OAK_VERTICAL_SLAB, "_back", textureMap, blockStateModelGenerator.modelCollector);
        Identifier fullBlockId = Models.CUBE_COLUMN.uploadWithoutVariant(ModBlocks.OAK_VERTICAL_SLAB, "_double", textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(ModBlocks.OAK_VERTICAL_SLAB, modelId, leftModelId, rightModelId, backModelId, fullBlockId));
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, textureBlock, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String suffix, Block block) {
        generateVerticalSlabBlockModel(blockStateModelGenerator, textureBlock, fullBlock, suffix, suffix, suffix, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String topSuffix, String sideSuffix, String bottomSuffix, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock).withSuffixedPath(sideSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock).withSuffixedPath(bottomSuffix))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, fullBlock, block);
    }

    private void generateVerticalSlabBlockModelForCutSandstone(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(secondTextureBlock).withSuffixedPath(TOP_SUFFIX))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureBlock).withSuffixedPath(BOTTOM_SUFFIX))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, textureBlock, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, TextureMap textureMap, Block fullBlock, Block block) {
        Identifier modelId = ModBlockModels.VERTICAL_SLAB.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier leftModelId = ModBlockModels.VERTICAL_SLAB_LEFT.upload(block, "_left", textureMap, blockStateModelGenerator.modelCollector);
        Identifier rightModelId = ModBlockModels.VERTICAL_SLAB_RIGHT.upload(block, "_right", textureMap, blockStateModelGenerator.modelCollector);
        Identifier backModelId = ModBlockModels.VERTICAL_SLAB_BACK.upload(block, "_back", textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(block, modelId, leftModelId, rightModelId, backModelId, TextureMap.getId(fullBlock)));
    }

    public static BlockStateSupplier createVerticalSlabBlockState(Block verticalSlabBlock, Identifier modelId,
                                                                  Identifier leftModelId, Identifier rightModelId, Identifier backModelId, Identifier fullModelId) {
        return VariantsBlockStateSupplier.create(verticalSlabBlock)
                .coordinate(
                        BlockStateVariantMap.create(ModProperties.VERTICAL_SLAB_TYPE)
                                .register(VerticalSlabType.FRONT, BlockStateVariant.create().put(VariantSettings.MODEL, modelId))
                                .register(VerticalSlabType.LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, leftModelId))
                                .register(VerticalSlabType.RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, rightModelId))
                                .register(VerticalSlabType.BACK, BlockStateVariant.create().put(VariantSettings.MODEL, backModelId))
                                .register(VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullModelId))
                );
    }
}
