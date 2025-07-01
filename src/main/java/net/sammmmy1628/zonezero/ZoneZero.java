package net.sammmmy1628.zonezero;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sammmmy1628.zonezero.block.zzBlocks;
import net.sammmmy1628.zonezero.item.zzCreativeModTabs;
import net.sammmmy1628.zonezero.item.zzItems;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(ZoneZero.MOD_ID)
public class ZoneZero
{
    public static final String MOD_ID = "zonezero";
    private static final Logger LOGGER = LogUtils.getLogger();


    public ZoneZero() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();

        zzCreativeModTabs.register(modEventBus);

        zzItems.register(modEventBus);
        zzBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(zzBlocks.IRON_GRATE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(zzBlocks.IRON_GRATE_EXPOSED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(zzBlocks.IRON_GRATE_OXIDIZED.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(zzBlocks.IRON_SCAFFOLDING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(zzBlocks.IRON_SCAFFOLDING_EXPOSED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(zzBlocks.IRON_SCAFFOLDING_OXIDIZED.get(), RenderType.cutout());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
