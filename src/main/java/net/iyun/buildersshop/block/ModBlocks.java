package net.iyun.buildersshop.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.iyun.buildersshop.BuildersShop;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block PLACE = registerBlock("placeholder", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block DIRT_WALL = registerBlock("dirt_wall", new WallBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_FENCE = registerBlock("dirt_fence", new SlabBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_FENCEG = registerBlock("dirt_fence_gate", new SlabBlock(FabricBlockSettings.copyOf(DIRT)));
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs", new StairsBlock(Blocks.DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DIRT_BUTTON = registerBlock("dirt_button", new ButtonBlock(FabricBlockSettings.copyOf(DIRT).sounds(BlockSoundGroup.ROOTED_DIRT),BlockSetType.STONE,90, false));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BuildersShop.MOD_ID, name), block);
    }


    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BuildersShop.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BuildersShop.LOGGER.info("Adding cool blocks from " + BuildersShop.MOD_ID);
    }
}

