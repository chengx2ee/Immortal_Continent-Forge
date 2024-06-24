package com.immortal_continent.item;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final String CREATIVE_TAB = "creative_tab.immortal_continent";
    public static final String CREATIVE_TAB_1 = "creative_tab.immortal_continent_1";
    
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImmortalContinent.MOD_ID);

    public static final RegistryObject<CreativeModeTab> IMMORTAL_CONTINENT_TAB = CREATIVE_MODE_TABS.register("immortal_continent_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.WOODEN_HEART.get()))
                    .title(Component.translatable(CREATIVE_TAB))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.WOODEN_HEART.get());
                        pOutput.accept(ModBlocks.WOODEN_AGGLUTINATE.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> IMMORTAL_CONTINENT_TAB_1 = CREATIVE_MODE_TABS.register("immortal_continent_tab_1",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModFireResistantBlocks.IMMORTAL_LOG.get()))
                    .title(Component.translatable(CREATIVE_TAB_1))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModBlocks.CAST_GOLD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_CAST_GOLD_LOG.get());
                        pOutput.accept(ModBlocks.CAST_GOLD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CAST_GOLD_WOOD.get());
                        pOutput.accept(ModBlocks.CAST_GOLD_PLANKS.get());
                        pOutput.accept(ModBlocks.CAST_GOLD_LEAVES.get());
                        pOutput.accept(ModFireResistantBlocks.IMMORTAL_LOG.get());
                        pOutput.accept(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get());
                        pOutput.accept(ModFireResistantBlocks.IMMORTAL_WOOD.get());
                        pOutput.accept(ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get());
                        pOutput.accept(ModFireResistantBlocks.IMMORTAL_PLANKS.get());
                        pOutput.accept(ModFireResistantBlocks.IMMORTAL_LEAVES.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}