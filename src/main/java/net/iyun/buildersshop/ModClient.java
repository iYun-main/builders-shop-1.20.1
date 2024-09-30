package net.iyun.buildersshop;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.iyun.buildersshop.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_VERTICAL_SLAB, RenderLayer.getCutout());

    }
}
