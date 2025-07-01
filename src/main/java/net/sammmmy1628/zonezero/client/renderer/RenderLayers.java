package net.sammmmy1628.zonezero.client.renderer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sammmmy1628.zonezero.ZoneZero;

@OnlyIn(Dist.CLIENT)
public class RenderLayers {

    public static ModelLayerLocation register(String name) {
        return new ModelLayerLocation(new ResourceLocation(ZoneZero.MOD_ID, name), "main");
    }

}