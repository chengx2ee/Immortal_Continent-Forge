package com.immortal_continent.world;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.item.ModCreativeModTabs;
import com.immortal_continent.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ImmortalContinent.MOD_ID)
public class ImmortalContinent {
    public static final String MOD_ID = "immortal_continent";

    public ImmortalContinent()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);
        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFireResistantBlocks.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }
}