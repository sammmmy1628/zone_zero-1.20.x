package net.sammmmy1628.zonezero.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.zonezero.ZoneZero;
import net.sammmmy1628.zonezero.block.zzBlocks;

public class zzCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZoneZero.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HAZARDOUS = CREATIVE_MODE_TABS.register("hazardous",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(zzItems.HAZMAT_SUIT_MASK.get()))
                    .title(Component.translatable("creativetab.hazardous"))
                    .displayItems((pParameters, pOutput) -> {

                        //items
                        pOutput.accept(zzItems.HEALTH_PACK.get());

                        pOutput.accept(zzItems.HAZMAT_SUIT_MASK.get());
                        pOutput.accept(zzItems.HAZMAT_SUIT_CHEST.get());
                        pOutput.accept(zzItems.HAZMAT_SUIT_LEGS.get());
                        pOutput.accept(zzItems.HAZMAT_SUIT_BOOTS.get());

                        //blocks
                        pOutput.accept(zzBlocks.IRON_GRATE.get());
                        pOutput.accept(zzBlocks.IRON_GRATE_EXPOSED.get());
                        pOutput.accept(zzBlocks.IRON_GRATE_OXIDIZED.get());
                        pOutput.accept(zzBlocks.IRON_SCAFFOLDING.get());
                        pOutput.accept(zzBlocks.IRON_SCAFFOLDING_EXPOSED.get());
                        pOutput.accept(zzBlocks.IRON_SCAFFOLDING_OXIDIZED.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
