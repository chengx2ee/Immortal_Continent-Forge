package com.immortal_continent.item;

import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmortalContinent.MOD_ID);

    public static final RegistryObject<Item> WOODEN_HEART = ITEMS.register("wooden_heart",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}