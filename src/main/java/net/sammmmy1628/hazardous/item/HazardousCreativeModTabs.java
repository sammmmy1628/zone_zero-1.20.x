package net.sammmmy1628.hazardous.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.hazardous.Hazardous;
import net.sammmmy1628.hazardous.block.HazardousBlocks;

public class HazardousCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Hazardous.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("hazardous",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HazardousItems.HEALTH_PACK.get()))
                    .title(Component.translatable("creativetab.hazardous"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(HazardousItems.HEALTH_PACK.get());

                        pOutput.accept(HazardousBlocks.IRON_GRATE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
