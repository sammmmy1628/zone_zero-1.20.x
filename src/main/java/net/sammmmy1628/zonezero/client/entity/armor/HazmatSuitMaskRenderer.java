package net.sammmmy1628.zonezero.client.entity.armor;

import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.hazmat_suit.HazmatSuitMaskItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class HazmatSuitMaskRenderer extends AbstractRenderer<HazmatSuitMaskItem> {

    public HazmatSuitMaskRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png")) {
            @Override
            public ResourceLocation getModelResource(HazmatSuitMaskItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "geo/hazmat_suit_mask.geo.json");
            }

            @Override
            public ResourceLocation getTextureResource(HazmatSuitMaskItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png");
            }

            @Override
            public ResourceLocation getAnimationResource(HazmatSuitMaskItem animatable) {
                return new ResourceLocation(ZoneZero.MOD_ID, "animations/armor.animation.json");
            }
        });
    }
}
