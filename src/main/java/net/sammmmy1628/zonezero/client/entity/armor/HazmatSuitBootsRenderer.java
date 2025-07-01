package net.sammmmy1628.zonezero.client.entity.armor;

import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.hazmat_suit.HazmatSuitBootsItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class HazmatSuitBootsRenderer extends AbstractRenderer<HazmatSuitBootsItem> {

    public HazmatSuitBootsRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png")) {
            @Override
            public ResourceLocation getModelResource(HazmatSuitBootsItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "geo/hazmat_suit_boots.geo.json");
            }

            @Override
            public ResourceLocation getTextureResource(HazmatSuitBootsItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png");
            }

            @Override
            public ResourceLocation getAnimationResource(HazmatSuitBootsItem animatable) {
                return new ResourceLocation(ZoneZero.MOD_ID, "animations/armor.animation.json");
            }
        });
    }
}
