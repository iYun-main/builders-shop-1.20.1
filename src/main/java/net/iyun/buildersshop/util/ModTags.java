package net.iyun.buildersshop.util;

import net.iyun.buildersshop.BuildersShop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> V_SLAB = createTag("vertical_slabs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BuildersShop.MOD_ID, name));
    }
}
    public static class Items {

        public static final TagKey<Item> MOSS = createTag("moss");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BuildersShop.MOD_ID, name));
       }
    }
}