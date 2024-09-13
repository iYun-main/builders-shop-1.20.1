package net.iyun.buildersshop;

import net.fabricmc.api.ModInitializer;

import net.iyun.buildersshop.datagen.block.ModBlocks;
import net.iyun.buildersshop.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildersShop implements ModInitializer {
	public static final String MOD_ID = "builders-shop";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}