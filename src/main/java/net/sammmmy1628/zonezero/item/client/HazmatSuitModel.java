package net.sammmmy1628.zonezero.item.client;

import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.custom.HazmatSuitItem;
import software.bernie.geckolib.model.GeoModel;

public class HazmatSuitModel extends GeoModel<HazmatSuitItem> {
    @Override
    public ResourceLocation getModelResource(HazmatSuitItem animatable) {
        return new ResourceLocation(ZoneZero.MOD_ID, "geo/hazmat_suit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatSuitItem animatable) {
        return new ResourceLocation(ZoneZero.MOD_ID, "textures/armor/hazmat_suit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatSuitItem animatable) {
        return new ResourceLocation(ZoneZero.MOD_ID, "animations/hazmat_suit.animation.json");
    }
}
