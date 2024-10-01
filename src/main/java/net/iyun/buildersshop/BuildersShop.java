package net.iyun.buildersshop;

import net.fabricmc.api.ModInitializer;

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
		ModItems.registerItems();
	}
}