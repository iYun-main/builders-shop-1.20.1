package net.iyun.buildersshop.datagen.langdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.iyun.buildersshop.block.ModBlocks;

public class EnglishLanguageProvider extends FabricLanguageProvider {
    public EnglishLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.PLACE,"Placeholder");
        translationBuilder.add(ModBlocks.DIRT_WALL,"Dirt Wall");
        translationBuilder.add(ModBlocks.DIRT_FENCE,"Dirt Fence");
        translationBuilder.add(ModBlocks.DIRT_FENCEG,"Dirt Fence Gate");
        translationBuilder.add(ModBlocks.DIRT_BUTTON,"Dirt Fence Gate");
        translationBuilder.add(ModBlocks.DIRT_SLAB,"Dirt Stairs");
        translationBuilder.add(ModBlocks.DIRT_STAIRS,"Dirt Slab");
    }
}
