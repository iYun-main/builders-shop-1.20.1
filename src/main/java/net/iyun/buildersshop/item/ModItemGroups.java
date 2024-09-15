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
                        entries.add(ModBlocks.DIRT_STAIRS);
                        // entries.add(ModBlocks.DIRT_BUTTON);
                        entries.add(ModBlocks.CDIRT_SLAB);
                        entries.add(ModBlocks.CDIRT_WALL);
                        entries.add(ModBlocks.CDIRT_FENCE);
                        entries.add(ModBlocks.CDIRT_STAIRS);
                        // entries.add(ModBlocks.CDIRT_BUTTON);
                        entries.add(ModBlocks.RDIRT_SLAB);
                        entries.add(ModBlocks.RDIRT_WALL);
                        entries.add(ModBlocks.RDIRT_FENCE);
                        entries.add(ModBlocks.RDIRT_STAIRS);
                        // entries.add(ModBlocks.RDIRT_BUTTON);
                        entries.add(ModBlocks.MUD_WALL);
                        entries.add(ModBlocks.MUD_FENCE);
                        entries.add(ModBlocks.MUD_SLAB);
                        entries.add(ModBlocks.MUD_STAIRS);
                        entries.add(ModBlocks.CLAY_WALL);
                        entries.add(ModBlocks.CLAY_FENCE);
                        entries.add(ModBlocks.CLAY_SLAB);
                        entries.add(ModBlocks.CLAY_STAIRS);
                        entries.add(ModBlocks.PMUD_WALL);
                        entries.add(ModBlocks.PMUD_FENCE);
                        entries.add(ModBlocks.PMUD_SLAB);
                        entries.add(ModBlocks.PMUD_STAIRS);
                        entries.add(ModBlocks.WHITE_WOOL_WALL);
                        entries.add(ModBlocks.WHITE_WOOL_FENCE);
                        entries.add(ModBlocks.WHITE_WOOL_SLAB);
                        entries.add(ModBlocks.WHITE_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.GRAY_WOOL_WALL);
                        entries.add(ModBlocks.GRAY_WOOL_FENCE);
                        entries.add(ModBlocks.GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.BLACK_WOOL_WALL);
                        entries.add(ModBlocks.BLACK_WOOL_FENCE);
                        entries.add(ModBlocks.BLACK_WOOL_SLAB);
                        entries.add(ModBlocks.BLACK_WOOL_STAIRS);
                        entries.add(ModBlocks.BROWN_WOOL_WALL);
                        entries.add(ModBlocks.BROWN_WOOL_FENCE);
                        entries.add(ModBlocks.BROWN_WOOL_SLAB);
                        entries.add(ModBlocks.BROWN_WOOL_STAIRS);
                        entries.add(ModBlocks.RED_WOOL_WALL);
                        entries.add(ModBlocks.RED_WOOL_FENCE);
                        entries.add(ModBlocks.RED_WOOL_SLAB);
                        entries.add(ModBlocks.RED_WOOL_STAIRS);
                        entries.add(ModBlocks.ORANGE_WOOL_WALL);
                        entries.add(ModBlocks.ORANGE_WOOL_FENCE);
                        entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                        entries.add(ModBlocks.ORANGE_WOOL_STAIRS);
                        entries.add(ModBlocks.YELLOW_WOOL_WALL);
                        entries.add(ModBlocks.YELLOW_WOOL_FENCE);
                        entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                        entries.add(ModBlocks.YELLOW_WOOL_STAIRS);
                        entries.add(ModBlocks.LIME_WOOL_WALL);
                        entries.add(ModBlocks.LIME_WOOL_FENCE);
                        entries.add(ModBlocks.LIME_WOOL_SLAB);
                        entries.add(ModBlocks.LIME_WOOL_STAIRS);
                        entries.add(ModBlocks.GREEN_WOOL_WALL);
                        entries.add(ModBlocks.GREEN_WOOL_FENCE);
                        entries.add(ModBlocks.GREEN_WOOL_SLAB);
                        entries.add(ModBlocks.GREEN_WOOL_STAIRS);
                        entries.add(ModBlocks.CYAN_WOOL_WALL);
                        entries.add(ModBlocks.CYAN_WOOL_FENCE);
                        entries.add(ModBlocks.CYAN_WOOL_SLAB);
                        entries.add(ModBlocks.CYAN_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.BLUE_WOOL_WALL);
                        entries.add(ModBlocks.BLUE_WOOL_FENCE);
                        entries.add(ModBlocks.BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.PURPLE_WOOL_WALL);
                        entries.add(ModBlocks.PURPLE_WOOL_FENCE);
                        entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                        entries.add(ModBlocks.PURPLE_WOOL_STAIRS);
                        entries.add(ModBlocks.MAGENTA_WOOL_WALL);
                        entries.add(ModBlocks.MAGENTA_WOOL_FENCE);
                        entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                        entries.add(ModBlocks.MAGENTA_WOOL_STAIRS);
                        entries.add(ModBlocks.PINK_WOOL_WALL);
                        entries.add(ModBlocks.PINK_WOOL_FENCE);
                        entries.add(ModBlocks.PINK_WOOL_SLAB);
                        entries.add(ModBlocks.PINK_WOOL_STAIRS);
                    }).build());

    public static void registerItemGroups() {
        BuildersShop.LOGGER.info("Loading Item Tabs of " + BuildersShop.MOD_ID);
    }
}