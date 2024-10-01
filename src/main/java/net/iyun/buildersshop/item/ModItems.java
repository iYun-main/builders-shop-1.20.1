package net.iyun.buildersshop.item;

import net.iyun.buildersshop.BuildersShop;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.iyun.buildersshop.BuildersShop.MOD_ID;

public class ModItems {

    public static void registerItems() {
        BuildersShop.LOGGER.info("Loading Item Tabs of " + BuildersShop.MOD_ID);
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }
}
