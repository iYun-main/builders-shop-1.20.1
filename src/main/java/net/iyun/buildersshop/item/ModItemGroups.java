package net.iyun.buildersshop.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iyun.buildersshop.BuildersShop;
import net.iyun.buildersshop.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup AAShop = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BuildersShop.MOD_ID, "aashop"),
            FabricItemGroup.builder().displayName(Text.literal("Builders Shop"))
                    .icon(() -> new ItemStack(ModBlocks.PLACE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLACE);
                        entries.add(ModBlocks.DIRT_SLAB);
                        entries.add(ModBlocks.DIRT_WALL);
                        entries.add(ModBlocks.DIRT_FENCE);
                        entries.add(ModBlocks.DIRT_FENCEG);
                        entries.add(ModBlocks.DIRT_STAIRS);
                        entries.add(ModBlocks.DIRT_BUTTON);
                    }).build());

    public static void registerItemGroups() {
        BuildersShop.LOGGER.info("Loading Item Tabs of " + BuildersShop.MOD_ID);
    }
}