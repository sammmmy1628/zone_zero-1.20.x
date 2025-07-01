package net.sammmmy1628.zonezero.client.entity.armor;

import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.hazmat_suit.HazmatSuitLegsItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class HazmatSuitLegsRenderer extends AbstractRenderer<HazmatSuitLegsItem> {

    public HazmatSuitLegsRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png")) {
            @Override
            public ResourceLocation getModelResource(HazmatSuitLegsItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "geo/hazmat_suit_legs.geo.json");
            }

            @Override
            public ResourceLocation getTextureResource(HazmatSuitLegsItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png");
            }

            @Override
            public ResourceLocation getAnimationResource(HazmatSuitLegsItem animatable) {
                return new ResourceLocation(ZoneZero.MOD_ID, "animations/armor.animation.json");
            }
        });
    }
}
