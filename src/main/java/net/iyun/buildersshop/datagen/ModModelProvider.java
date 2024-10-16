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

        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OAK_PLANKS, ModBlocks.OAK_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, ModBlocks.ACA_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_VERTICAL_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, ModBlocks.WARPED_VERTICAL_SLAB);

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

        BlockStateModelGenerator.BlockTexturePool hoakplank = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HORIZONZAL_OAK_PLANK);

        BlockStateModelGenerator.BlockTexturePool andbrick = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool andbrickc = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS_CRACKED);
        BlockStateModelGenerator.BlockTexturePool andbrickm = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS_MOSSY);
        BlockStateModelGenerator.BlockTexturePool diobrick = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool diobrickc = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS_CRACKED);
        BlockStateModelGenerator.BlockTexturePool diobrickm = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS_MOSSY);
        BlockStateModelGenerator.BlockTexturePool granbrick = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granbrickc = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS_CRACKED);
        BlockStateModelGenerator.BlockTexturePool granbrickm = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS_MOSSY);
        BlockStateModelGenerator.BlockTexturePool obsibrick = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OBSIDIAN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool obsibrickc = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OBSIDIAN_BRICKS_CRACKED);
        BlockStateModelGenerator.BlockTexturePool obsibrickm = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OBSIDIAN_BRICKS_MOSSY);
        BlockStateModelGenerator.BlockTexturePool cobsibrickc = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBSIDIAN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool stonepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool smoothstonepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool cobblestonepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool stonebrickpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossycobblepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSSY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool crackedstoneepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool chisledstoneepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHISELED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossybricksepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRANITE);
        BlockStateModelGenerator.BlockTexturePool dioritepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIORITE);
        BlockStateModelGenerator.BlockTexturePool andeistepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ANDESITE);
        BlockStateModelGenerator.BlockTexturePool cobbleddeepslatepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool chisleddeepslatepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHISELED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool polisheddeepslatepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool deepslatebrickspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackeddeepslatebrickspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool deepslatetilespool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackeddeepslatetilespool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool brickspool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BRICKS);

        brickspool.fence(ModBlocks.BRICKS_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BRICKS, ModBlocks.BRICKS_VERTICAL_SLAB);

        crackeddeepslatetilespool.slab(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB);
        crackeddeepslatetilespool.wall(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL);
        crackeddeepslatetilespool.fence(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);
        crackeddeepslatetilespool.stairs(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILES_VERTICAL_SLAB);

        deepslatetilespool.slab(ModBlocks.DEEPSLATE_TILES_SLAB);
        deepslatetilespool.wall(ModBlocks.DEEPSLATE_TILES_WALL);
        deepslatetilespool.fence(ModBlocks.DEEPSLATE_TILES_FENCE);
        deepslatetilespool.stairs(ModBlocks.DEEPSLATE_TILES_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILES_VERTICAL_SLAB);

        crackeddeepslatebrickspool.slab(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB);
        crackeddeepslatebrickspool.wall(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL);
        crackeddeepslatebrickspool.fence(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE);
        crackeddeepslatebrickspool.stairs(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_VERTICAL_SLAB);

        deepslatebrickspool.fence(ModBlocks.DEEPSLATE_BRICKS_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICKS_VERTICAL_SLAB);

        polisheddeepslatepool.fence(ModBlocks.POLISHED_DEEPSLATE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);

        chisleddeepslatepool.slab(ModBlocks.CHISELED_DEEPSLATE_SLAB);
        chisleddeepslatepool.wall(ModBlocks.CHISELED_DEEPSLATE_WALL);
        chisleddeepslatepool.fence(ModBlocks.CHISELED_DEEPSLATE_FENCE);
        chisleddeepslatepool.stairs(ModBlocks.CHISELED_DEEPSLATE_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CHISELED_DEEPSLATE, ModBlocks.CHISELED_DEEPSLATE_VERTICAL_SLAB);

        cobbleddeepslatepool.fence(ModBlocks.COBBLED_DEEPSLATE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);

        andeistepool.fence(ModBlocks.ANDESITE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ANDESITE, ModBlocks.ANDESITE_VERTICAL_SLAB);

        granitepool.fence(ModBlocks.GRANITE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GRANITE, ModBlocks.GRANITE_VERTICAL_SLAB);

        dioritepool.fence(ModBlocks.DIORITE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DIORITE, ModBlocks.DIORITE_VERTICAL_SLAB);

        mossybricksepool.fence(ModBlocks.MOSSY_STONE_BRICKS_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICKS_VERTICAL_SLAB);

        chisledstoneepool.slab(ModBlocks.CHISELED_STONE_BRICKS_SLAB);
        chisledstoneepool.wall(ModBlocks.CHISELED_STONE_BRICKS_WALL);
        chisledstoneepool.fence(ModBlocks.CHISELED_STONE_BRICKS_FENCE);
        chisledstoneepool.stairs(ModBlocks.CHISELED_STONE_BRICKS_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CHISELED_STONE_BRICKS, ModBlocks.CHISELED_STONE_BRICKS_VERTICAL_SLAB);

        crackedstoneepool.fence(ModBlocks.CRACKED_STONE_BRICKS_FENCE);
        crackedstoneepool.wall(ModBlocks.CRACKED_STONE_BRICKS_WALL);
        crackedstoneepool.stairs(ModBlocks.CRACKED_STONE_BRICKS_STAIRS);
        crackedstoneepool.slab(ModBlocks.CRACKED_STONE_BRICKS_SLAB);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICKS_VERTICAL_SLAB);

        mossycobblepool.fence(ModBlocks.MOSSY_COBBLESTONE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);

        stonebrickpool.fence(ModBlocks.STONE_BRICKS_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.STONE_BRICKS, ModBlocks.STONE_BRICKS_VERTICAL_SLAB);

        smoothstonepool.wall(ModBlocks.SMOOTH_STONE_WALL);
        smoothstonepool.fence(ModBlocks.SMOOTH_STONE_FENCE);
        smoothstonepool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_VERTICAL_SLAB);

        cobblestonepool.fence(ModBlocks.COBBLESTONE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_VERTICAL_SLAB);

        stonepool.wall(ModBlocks.STONE_WALL);
        stonepool.fence(ModBlocks.STONE_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.STONE, ModBlocks.STONE_VERTICAL_SLAB);

        obsibrick.wall(ModBlocks.OBSIDIAN_BRICKS_WALL);
        obsibrick.fence(ModBlocks.OBSIDIAN_BRICKS_FENCE);
        obsibrick.slab(ModBlocks.OBSIDIAN_BRICKS_SLAB);
        obsibrick.stairs(ModBlocks.OBSIDIAN_BRICKS_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.OBSIDIAN_BRICKS, ModBlocks.OBSIDIAN_BRICKS_VERTICAL_SLAB);

        obsibrickc.wall(ModBlocks.OBSIDIAN_BRICKS_CRACKED_WALL);
        obsibrickc.fence(ModBlocks.OBSIDIAN_BRICKS_CRACKED_FENCE);
        obsibrickc.slab(ModBlocks.OBSIDIAN_BRICKS_CRACKED_SLAB);
        obsibrickc.stairs(ModBlocks.OBSIDIAN_BRICKS_CRACKED_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.OBSIDIAN_BRICKS_CRACKED, ModBlocks.OBSIDIAN_BRICKS_CRACKED_VERTICAL_SLAB);

        cobsibrickc.wall(ModBlocks.COBSIDIAN_BRICKS_WALL);
        cobsibrickc.fence(ModBlocks.COBSIDIAN_BRICKS_FENCE);
        cobsibrickc.slab(ModBlocks.COBSIDIAN_BRICKS_SLAB);
        cobsibrickc.stairs(ModBlocks.COBSIDIAN_BRICKS_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.COBSIDIAN_BRICKS, ModBlocks.COBSIDIAN_BRICKS_VERTICAL_SLAB);

        obsibrickm.wall(ModBlocks.OBSIDIAN_BRICKS_MOSSY_WALL);
        obsibrickm.fence(ModBlocks.OBSIDIAN_BRICKS_MOSSY_FENCE);
        obsibrickm.slab(ModBlocks.OBSIDIAN_BRICKS_MOSSY_SLAB);
        obsibrickm.stairs(ModBlocks.OBSIDIAN_BRICKS_MOSSY_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.OBSIDIAN_BRICKS_MOSSY, ModBlocks.OBSIDIAN_BRICKS_MOSSY_VERTICAL_SLAB);

        diobrick.wall(ModBlocks.DIORITE_BRICKS_WALL);
        diobrick.fence(ModBlocks.DIORITE_BRICKS_FENCE);
        diobrick.slab(ModBlocks.DIORITE_BRICKS_SLAB);
        diobrick.stairs(ModBlocks.DIORITE_BRICKS_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS_VERTICAL_SLAB);

        diobrickc.wall(ModBlocks.DIORITE_BRICKS_CRACKED_WALL);
        diobrickc.fence(ModBlocks.DIORITE_BRICKS_CRACKED_FENCE);
        diobrickc.slab(ModBlocks.DIORITE_BRICKS_CRACKED_SLAB);
        diobrickc.stairs(ModBlocks.DIORITE_BRICKS_CRACKED_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.DIORITE_BRICKS_CRACKED, ModBlocks.DIORITE_BRICKS_CRACKED_VERTICAL_SLAB);

        diobrickm.wall(ModBlocks.DIORITE_BRICKS_MOSSY_WALL);
        diobrickm.fence(ModBlocks.DIORITE_BRICKS_MOSSY_FENCE);
        diobrickm.slab(ModBlocks.DIORITE_BRICKS_MOSSY_SLAB);
        diobrickm.stairs(ModBlocks.DIORITE_BRICKS_MOSSY_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.DIORITE_BRICKS_MOSSY, ModBlocks.DIORITE_BRICKS_MOSSY_VERTICAL_SLAB);

        andbrick.wall(ModBlocks.ANDESITE_BRICKS_WALL);
        andbrick.slab(ModBlocks.ANDESITE_BRICKS_SLAB);
        andbrick.stairs(ModBlocks.ANDESITE_BRICKS_STAIRS);
        andbrick.fence(ModBlocks.ANDESITE_BRICKS_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS_VERTICAL_SLAB);

        andbrickm.wall(ModBlocks.ANDESITE_BRICKS_MOSSY_WALL);
        andbrickm.slab(ModBlocks.ANDESITE_BRICKS_MOSSY_SLAB);
        andbrickm.stairs(ModBlocks.ANDESITE_BRICKS_MOSSY_STAIRS);
        andbrickm.fence(ModBlocks.ANDESITE_BRICKS_MOSSY_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.ANDESITE_BRICKS_MOSSY, ModBlocks.ANDESITE_BRICKS_MOSSY_VERTICAL_SLAB);

        andbrickc.wall(ModBlocks.ANDESITE_BRICKS_CRACKED_WALL);
        andbrickc.slab(ModBlocks.ANDESITE_BRICKS_CRACKED_SLAB);
        andbrickc.stairs(ModBlocks.ANDESITE_BRICKS_CRACKED_STAIRS);
        andbrickc.fence(ModBlocks.ANDESITE_BRICKS_CRACKED_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.ANDESITE_BRICKS_CRACKED, ModBlocks.ANDESITE_BRICKS_CRACKED_VERTICAL_SLAB);

        hoakplank.slab(ModBlocks.HORIZONZAL_OAK_PLANK_SLAB);
        hoakplank.fence(ModBlocks.HORIZONZAL_OAK_PLANK_FENCE);
        hoakplank.fenceGate(ModBlocks.HORIZONZAL_OAK_PLANK_FENCE_GATE);
        hoakplank.stairs(ModBlocks.HORIZONZAL_OAK_PLANK_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.HORIZONZAL_OAK_PLANK, ModBlocks.HORIZONZAL_OAK_PLANK_VERTICAL_SLAB);

        granbrickc.fence(ModBlocks.GRANITE_BRICKS_CRACKED_FENCE);
        granbrickc.slab(ModBlocks.GRANITE_BRICKS_CRACKED_SLAB);
        granbrickc.stairs(ModBlocks.GRANITE_BRICKS_CRACKED_STAIRS);
        granbrickc.wall(ModBlocks.GRANITE_BRICKS_CRACKED_WALL);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.GRANITE_BRICKS_CRACKED, ModBlocks.GRANITE_BRICKS_CRACKED_VERTICAL_SLAB);

        granbrickm.wall(ModBlocks.GRANITE_BRICKS_MOSSY_WALL);
        granbrickm.slab(ModBlocks.GRANITE_BRICKS_MOSSY_SLAB);
        granbrickm.stairs(ModBlocks.GRANITE_BRICKS_MOSSY_STAIRS);
        granbrickm.fence(ModBlocks.GRANITE_BRICKS_MOSSY_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator,ModBlocks.GRANITE_BRICKS_MOSSY, ModBlocks.GRANITE_BRICKS_MOSSY_VERTICAL_SLAB);

        granbrick.slab(ModBlocks.GRANITE_BRICKS_SLAB);
        granbrick.wall(ModBlocks.GRANITE_BRICKS_WALL);
        granbrick.stairs(ModBlocks.GRANITE_BRICKS_STAIRS);
        granbrick.fence(ModBlocks.GRANITE_BRICKS_FENCE);
        renderVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS_VERTICAL_SLAB);

        //   dirtPool.button(ModBlocks.DIRT_BUTTON);
        dirtPool.wall(ModBlocks.DIRT_WALL);
        dirtPool.fence(ModBlocks.DIRT_FENCE);
        dirtPool.slab(ModBlocks.DIRT_SLAB);
        dirtPool.stairs(ModBlocks.DIRT_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DIRT, ModBlocks.DIRT_VERTICAL_SLAB);

        mudPool.wall(ModBlocks.MUD_WALL);
        mudPool.fence(ModBlocks.MUD_FENCE);
        mudPool.slab(ModBlocks.MUD_SLAB);
        mudPool.stairs(ModBlocks.MUD_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MUD, ModBlocks.MUD_VERTICAL_SLAB);

        clayPool.wall(ModBlocks.CLAY_WALL);
        clayPool.fence(ModBlocks.CLAY_FENCE);
        clayPool.slab(ModBlocks.CLAY_SLAB);
        clayPool.stairs(ModBlocks.CLAY_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CLAY, ModBlocks.CLAY_VERTICAL_SLAB);

        pmudPool.wall(ModBlocks.PMUD_WALL);
        pmudPool.fence(ModBlocks.PMUD_FENCE);
        pmudPool.slab(ModBlocks.PMUD_SLAB);
        pmudPool.stairs(ModBlocks.PMUD_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PACKED_MUD, ModBlocks.PMUD_VERTICAL_SLAB);

        whitewoolPool.wall(ModBlocks.WHITE_WOOL_WALL);
        whitewoolPool.fence(ModBlocks.WHITE_WOOL_FENCE);
        whitewoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        whitewoolPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WHITE_WOOL, ModBlocks.WHITE_WOOL_VERTICAL_SLAB);

        lightgraywoolPool.wall(ModBlocks.LIGHT_GRAY_WOOL_WALL);
        lightgraywoolPool.fence(ModBlocks.LIGHT_GRAY_WOOL_FENCE);
        lightgraywoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        lightgraywoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIGHT_GRAY_WOOL, ModBlocks.LIGHT_GRAY_WOOL_VERTICAL_SLAB);

        graywoolPool.wall(ModBlocks.GRAY_WOOL_WALL);
        graywoolPool.fence(ModBlocks.GRAY_WOOL_FENCE);
        graywoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        graywoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GRAY_WOOL, ModBlocks.GRAY_WOOL_VERTICAL_SLAB);

        redwoolPool.wall(ModBlocks.RED_WOOL_WALL);
        redwoolPool.fence(ModBlocks.RED_WOOL_FENCE);
        redwoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        redwoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_WOOL, ModBlocks.RED_WOOL_VERTICAL_SLAB);

        orangewoolPool.wall(ModBlocks.ORANGE_WOOL_WALL);
        orangewoolPool.fence(ModBlocks.ORANGE_WOOL_FENCE);
        orangewoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        orangewoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ORANGE_WOOL, ModBlocks.ORANGE_WOOL_VERTICAL_SLAB);

        yellowwoolPool.wall(ModBlocks.YELLOW_WOOL_WALL);
        yellowwoolPool.fence(ModBlocks.YELLOW_WOOL_FENCE);
        yellowwoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        yellowwoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.YELLOW_WOOL, ModBlocks.YELLOW_WOOL_VERTICAL_SLAB);

        limewoolPool.wall(ModBlocks.LIME_WOOL_WALL);
        limewoolPool.fence(ModBlocks.LIME_WOOL_FENCE);
        limewoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        limewoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIME_WOOL, ModBlocks.LIME_WOOL_VERTICAL_SLAB);

        lbluewoolPool.wall(ModBlocks.LIGHT_BLUE_WOOL_WALL);
        lbluewoolPool.fence(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
        lbluewoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        lbluewoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.LIGHT_BLUE_WOOL, ModBlocks.LIGHT_BLUE_WOOL_VERTICAL_SLAB);

        bluewoolPool.wall(ModBlocks.BLUE_WOOL_WALL);
        bluewoolPool.fence(ModBlocks.BLUE_WOOL_FENCE);
        bluewoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        bluewoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLUE_WOOL, ModBlocks.BLUE_WOOL_VERTICAL_SLAB);

        purplewoolPool.wall(ModBlocks.PURPLE_WOOL_WALL);
        purplewoolPool.fence(ModBlocks.PURPLE_WOOL_FENCE);
        purplewoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        purplewoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PURPLE_WOOL, ModBlocks.PURPLE_WOOL_VERTICAL_SLAB);

        magentawoolPool.wall(ModBlocks.MAGENTA_WOOL_WALL);
        magentawoolPool.fence(ModBlocks.MAGENTA_WOOL_FENCE);
        magentawoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        magentawoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MAGENTA_WOOL, ModBlocks.MAGENTA_WOOL_VERTICAL_SLAB);

        pinkwoolPool.wall(ModBlocks.PINK_WOOL_WALL);
        pinkwoolPool.fence(ModBlocks.PINK_WOOL_FENCE);
        pinkwoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
        pinkwoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PINK_WOOL, ModBlocks.PINK_WOOL_VERTICAL_SLAB);

        blackwoolPool.wall(ModBlocks.BLACK_WOOL_WALL);
        blackwoolPool.fence(ModBlocks.BLACK_WOOL_FENCE);
        blackwoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        blackwoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLACK_WOOL, ModBlocks.BLACK_WOOL_VERTICAL_SLAB);

        greenwoolPool.wall(ModBlocks.GREEN_WOOL_WALL);
        greenwoolPool.fence(ModBlocks.GREEN_WOOL_FENCE);
        greenwoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        greenwoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GREEN_WOOL, ModBlocks.GREEN_WOOL_VERTICAL_SLAB);

        cyanwoolPool.wall(ModBlocks.CYAN_WOOL_WALL);
        cyanwoolPool.fence(ModBlocks.CYAN_WOOL_FENCE);
        cyanwoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        cyanwoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CYAN_WOOL, ModBlocks.CYAN_WOOL_VERTICAL_SLAB);

        brownwoolPool.wall(ModBlocks.BROWN_WOOL_WALL);
        brownwoolPool.fence(ModBlocks.BROWN_WOOL_FENCE);
        brownwoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        brownwoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BROWN_WOOL, ModBlocks.BROWN_WOOL_VERTICAL_SLAB);

        //  rdirtPool.button(ModBlocks.RDIRT_BUTTON);
        rdirtPool.wall(ModBlocks.RDIRT_WALL);
        rdirtPool.fence(ModBlocks.RDIRT_FENCE);
        rdirtPool.slab(ModBlocks.RDIRT_SLAB);
        rdirtPool.stairs(ModBlocks.RDIRT_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ROOTED_DIRT, ModBlocks.RDIRT_VERTICAL_SLAB);

        //  cdirtPool.button(ModBlocks.CDIRT_BUTTON);
        cdirtPool.wall(ModBlocks.CDIRT_WALL);
        cdirtPool.fence(ModBlocks.CDIRT_FENCE);
        cdirtPool.slab(ModBlocks.CDIRT_SLAB);
        cdirtPool.stairs(ModBlocks.CDIRT_STAIRS);
        renderVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COARSE_DIRT, ModBlocks.CDIRT_VERTICAL_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
    private void renderSmoothStone(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.SIDE, TextureMap.getId(Blocks.SMOOTH_STONE_SLAB).withSuffixedPath("_side"))
                .put(TextureKey.BOTTOM, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.PARTICLE, TextureMap.getId(Blocks.SMOOTH_STONE));
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(Blocks.SMOOTH_STONE_SLAB, "_side"), textureMap.getTexture(TextureKey.TOP));

        Identifier modelId = ModBlockModels.VERTICAL_SLAB.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, textureMap, blockStateModelGenerator.modelCollector);
        Identifier leftModelId = ModBlockModels.VERTICAL_SLAB_LEFT.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_left", textureMap, blockStateModelGenerator.modelCollector);
        Identifier rightModelId = ModBlockModels.VERTICAL_SLAB_RIGHT.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_right", textureMap, blockStateModelGenerator.modelCollector);
        Identifier backModelId = ModBlockModels.VERTICAL_SLAB_BACK.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_back", textureMap, blockStateModelGenerator.modelCollector);
        Identifier fullBlockId = Models.CUBE_COLUMN.uploadWithoutVariant(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_double", textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, modelId, leftModelId, rightModelId, backModelId, fullBlockId));
    }

    private void renderVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block block) {
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
