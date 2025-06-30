package net.sammmmy1628.hazardous.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.hazardous.Hazardous;
import net.sammmmy1628.hazardous.item.HazardousItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Hazardous.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(HazardousItems.HEALTH_PACK);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Hazardous.MOD_ID,"item/" + item.getId().getPath()));
    }
}