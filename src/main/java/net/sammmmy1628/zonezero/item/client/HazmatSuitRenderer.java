package net.sammmmy1628.zonezero.item.client;

import net.sammmmy1628.zonezero.item.custom.HazmatSuitItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HazmatSuitRenderer extends GeoArmorRenderer<HazmatSuitItem> {
    public HazmatSuitRenderer() {
        super(new HazmatSuitModel());
    }
}
