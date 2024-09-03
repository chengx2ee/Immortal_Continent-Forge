package com.immortal_continent.block;

import com.immortal_continent.block.custom.*;
import com.immortal_continent.item.ModItems;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModFireResistantBlocks
{
    // 注册防火方块
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmortalContinent.MOD_ID);

    public static final RegistryObject<Block> IMMORTAL_LOG = registerBlock("immortal_log",
            () -> new ModImmortalWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_IMMORTAL_LOG = registerBlock("stripped_immortal_log",
            () -> new ModImmortalWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_WOOD = registerBlock("immortal_wood",
            () -> new ModImmortalWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_IMMORTAL_WOOD = registerBlock("stripped_immortal_wood",
            () -> new ModImmortalWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_PLANKS = registerBlock("immortal_planks",
            () -> new ModTimeSpaceImmortalPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_LEAVES = registerBlock("immortal_leaves",
            () -> new ModTimeSpaceImmortalLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(5.0F, 120.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_STAIRS = registerBlock("immortal_stairs",
            () -> new ModTimeSpaceImmortalStairBlocks(ModFireResistantBlocks.IMMORTAL_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_SLAB = registerBlock("immortal_slab",
            () -> new ModTimeSpaceImmortalSlabBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_FENCE = registerBlock("immortal_fence",
            () -> new ModTimeSpaceImmortalFenceBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_FENCE_GATE = registerBlock("immortal_fence_gate",
            () -> new ModTimeSpaceImmortalFenceGateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_PRESSURE_PLATE = registerBlock("immortal_pressure_plate",
            () -> new ModTimeSpaceImmortalPressurePlateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> IMMORTAL_BUTTON = registerBlock("immortal_button",
            () -> new ModTimeSpaceImmortalButtonBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFireResistantBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerFireResistantBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}