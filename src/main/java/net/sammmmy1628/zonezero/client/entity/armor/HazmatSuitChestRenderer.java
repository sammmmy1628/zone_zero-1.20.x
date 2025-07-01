package net.sammmmy1628.zonezero.client.entity.armor;

import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.hazmat_suit.HazmatSuitChestItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class HazmatSuitChestRenderer extends AbstractRenderer<HazmatSuitChestItem> {

    public HazmatSuitChestRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png")) {
            @Override
            public ResourceLocation getModelResource(HazmatSuitChestItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "geo/hazmat_suit_chest.geo.json");
            }

            @Override
            public ResourceLocation getTextureResource(HazmatSuitChestItem object) {
                return new ResourceLocation(ZoneZero.MOD_ID, "textures/models/armor/hazmat_suit_texture.png");
            }

            @Override
            public ResourceLocation getAnimationResource(HazmatSuitChestItem animatable) {
                return new ResourceLocation(ZoneZero.MOD_ID, "animations/armor.animation.json");
            }
        });
    }
}
