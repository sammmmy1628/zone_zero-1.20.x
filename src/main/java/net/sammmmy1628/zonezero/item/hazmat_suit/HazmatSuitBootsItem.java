package net.sammmmy1628.zonezero.item.hazmat_suit;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sammmmy1628.zonezero.client.entity.armor.AbstractRenderer;
import net.sammmmy1628.zonezero.client.entity.armor.HazmatSuitBootsRenderer;
import net.sammmmy1628.zonezero.item.ArmorsItems;

public class HazmatSuitBootsItem extends ArmorsItems {
    public HazmatSuitBootsItem(ArmorMaterial pMaterial, Type type, Properties pProperties) {
        super(pMaterial, type, pProperties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    protected AbstractRenderer<?> getRenderer() {
        return new HazmatSuitBootsRenderer();
    }

}