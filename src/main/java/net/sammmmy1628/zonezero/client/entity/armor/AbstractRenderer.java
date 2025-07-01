package net.sammmmy1628.zonezero.client.entity.armor;

import net.sammmmy1628.zonezero.item.ArmorsItems;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public abstract class AbstractRenderer <T extends ArmorsItems> extends GeoArmorRenderer<T> {

    public AbstractRenderer(GeoModel<T> model) {
        super(model);
    }

}