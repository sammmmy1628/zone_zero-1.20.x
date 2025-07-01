package net.sammmmy1628.zonezero.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.zzItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ZoneZero.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(zzItems.HEALTH_PACK);

        simpleItem(zzItems.HAZMAT_SUIT_MASK);
        simpleItem(zzItems.HAZMAT_SUIT_CHEST);
        simpleItem(zzItems.HAZMAT_SUIT_LEGS);
        simpleItem(zzItems.HAZMAT_SUIT_BOOTS);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ZoneZero.MOD_ID,"item/" + item.getId().getPath()));
    }
}