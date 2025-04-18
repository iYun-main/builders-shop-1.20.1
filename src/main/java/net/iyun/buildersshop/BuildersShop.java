package net.iyun.buildersshop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.iyun.buildersshop.block.ModBlocks;
import net.iyun.buildersshop.item.ModItemGroups;
import net.iyun.buildersshop.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildersShop implements ModInitializer {
	public static final String MOD_ID = "buildersshop";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_PLANK_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK_VERTICAL_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_PLANK_FENCE_GATE,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_OAK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_OAK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_OAK_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_OAK_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_DARK_OAK,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_DARK_OAK_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_DARK_OAK_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_DARK_OAK_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_SPRUCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_SPRUCE_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_SPRUCE_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_SPRUCE_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_JUNGLE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_JUNGLE_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_JUNGLE_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_JUNGLE_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_CHERRY,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_CHERRY_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_CHERRY_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_CHERRY_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_MANGROVE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_MANGROVE_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_MANGROVE_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_MANGROVE_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_ACA,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_ACA_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_ACA_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_ACA_STAIR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_BIRCH,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_BIRCH_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_BIRCH_V_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEVEL_BIRCH_STAIR,5,20);

	}
}