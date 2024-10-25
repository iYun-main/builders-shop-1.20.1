package net.iyun.buildersshop.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iyun.buildersshop.BuildersShop;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.iyun.buildersshop.BuildersShop.MOD_ID;

public class ModItems {

    public static final Item STONE_BRICK = registerItem("stone_brick", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BuildersShop.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BuildersShop.LOGGER.info("Spawning Items for " + BuildersShop.MOD_ID);
    }
}
