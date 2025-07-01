package net.sammmmy1628.zonezero.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.item.hazmat_suit.HazmatSuitMaskItem;

public class zzItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZoneZero.MOD_ID);

    public static final RegistryObject<Item> HEALTH_PACK = ITEMS.register("health_pack",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HAZMAT_SUIT_MASK = ITEMS.register("hazmat_suit_mask",
            () -> new HazmatSuitMaskItem(zzArmorMaterials.HAZMAT_SUIT_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_SUIT_CHEST = ITEMS.register("hazmat_suit_chest",
            () -> new HazmatSuitMaskItem(zzArmorMaterials.HAZMAT_SUIT_CHEST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_SUIT_LEGS = ITEMS.register("hazmat_suit_legs",
            () -> new HazmatSuitMaskItem(zzArmorMaterials.HAZMAT_SUIT_LEGS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_SUIT_BOOTS = ITEMS.register("hazmat_suit_boots",
            () -> new HazmatSuitMaskItem(zzArmorMaterials.HAZMAT_SUIT_BOOTS, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
