package net.iyun.buildersshop.datagen;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.iyun.buildersshop.BuildersShop.MOD_ID;

public class ModBlockModels {
    public static final Model VERTICAL_SLAB = block("parent/vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model VERTICAL_SLAB_LEFT = block("parent/vertical_slab_left", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model VERTICAL_SLAB_RIGHT = block("parent/vertical_slab_right", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model VERTICAL_SLAB_BACK = block("parent/vertical_slab_back", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
