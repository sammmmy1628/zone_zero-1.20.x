package net.sammmmy1628.hazardous;

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
import net.sammmmy1628.hazardous.block.HazardousBlocks;
import net.sammmmy1628.hazardous.item.HazardousCreativeModTabs;
import net.sammmmy1628.hazardous.item.HazardousItems;
import org.slf4j.Logger;

@Mod(Hazardous.MOD_ID)
public class Hazardous
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "hazardous";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Hazardous(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        HazardousCreativeModTabs.register(modEventBus);

        HazardousItems.register(modEventBus);
        HazardousBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(HazardousBlocks.IRON_GRATE.get(), RenderType.cutout());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
