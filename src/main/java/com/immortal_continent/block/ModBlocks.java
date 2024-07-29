package com.immortal_continent.block;

import com.immortal_continent.block.custom.*;
import com.immortal_continent.item.ModItems;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    // 注册普通方块
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmortalContinent.MOD_ID);

    public static final RegistryObject<Block> FLAMING_LOG = registerBlock("flaming_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_FLAMING_LOG = registerBlock("stripped_flaming_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_WOOD = registerBlock("flaming_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_FLAMING_WOOD = registerBlock("stripped_flaming_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_PLANKS = registerBlock("flaming_planks",
            () -> new ModOthersPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_LEAVES = registerBlock("flaming_leaves",
            () -> new ModOthersLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_STAIRS = registerBlock("flaming_stairs",
            () -> new ModOthersStairBlocks(ModBlocks.FLAMING_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_SLAB = registerBlock("flaming_slab",
            () -> new ModOthersSlabBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_FENCE = registerBlock("flaming_fence",
            () -> new ModOthersFenceBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_FENCE_GATE = registerBlock("flaming_fence_gate",
            () -> new ModOthersFenceGateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_PRESSURE_PLATE = registerBlock("flaming_pressure_plate",
            () -> new ModOthersPressurePlateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLAMING_BUTTON = registerBlock("flaming_button",
            () -> new ModOthersButtonBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> LOAM_LOG = registerBlock("loam_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_LOAM_LOG = registerBlock("stripped_loam_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_WOOD = registerBlock("loam_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_LOAM_WOOD = registerBlock("stripped_loam_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_PLANKS = registerBlock("loam_planks",
            () -> new ModOthersPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_LEAVES = registerBlock("loam_leaves",
            () -> new ModOthersLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_STAIRS = registerBlock("loam_stairs",
            () -> new ModOthersStairBlocks(ModBlocks.LOAM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_SLAB = registerBlock("loam_slab",
            () -> new ModOthersSlabBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_FENCE = registerBlock("loam_fence",
            () -> new ModOthersFenceBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_FENCE_GATE = registerBlock("loam_fence_gate",
            () -> new ModOthersFenceGateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_PRESSURE_PLATE = registerBlock("loam_pressure_plate",
            () -> new ModOthersPressurePlateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LOAM_BUTTON = registerBlock("loam_button",
            () -> new ModOthersButtonBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CAST_GOLD_LOG = registerBlock("cast_gold_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CAST_GOLD_LOG = registerBlock("stripped_cast_gold_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_WOOD = registerBlock("cast_gold_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CAST_GOLD_WOOD = registerBlock("stripped_cast_gold_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_PLANKS = registerBlock("cast_gold_planks",
            () -> new ModOthersPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_LEAVES = registerBlock("cast_gold_leaves",
            () -> new ModOthersLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_STAIRS = registerBlock("cast_gold_stairs",
            () -> new ModOthersStairBlocks(ModBlocks.CAST_GOLD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_SLAB = registerBlock("cast_gold_slab",
            () -> new ModOthersSlabBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_FENCE = registerBlock("cast_gold_fence",
            () -> new ModOthersFenceBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_FENCE_GATE = registerBlock("cast_gold_fence_gate",
            () -> new ModOthersFenceGateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_PRESSURE_PLATE = registerBlock("cast_gold_pressure_plate",
            () -> new ModOthersPressurePlateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAST_GOLD_BUTTON = registerBlock("cast_gold_button",
            () -> new ModOthersButtonBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> CONDENSED_WATER_LOG = registerBlock("condensed_water_log",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CONDENSED_WATER_LOG = registerBlock("stripped_condensed_water_log",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_WOOD = registerBlock("condensed_water_wood",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CONDENSED_WATER_WOOD = registerBlock("stripped_condensed_water_wood",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_PLANKS = registerBlock("condensed_water_planks",
            () -> new ModOthersPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_LEAVES = registerBlock("condensed_water_leaves",
            () -> new ModOthersLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_STAIRS = registerBlock("condensed_water_stairs",
            () -> new ModOthersStairBlocks(ModBlocks.CONDENSED_WATER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_SLAB = registerBlock("condensed_water_slab",
            () -> new ModOthersSlabBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_FENCE = registerBlock("condensed_water_fence",
            () -> new ModOthersFenceBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_FENCE_GATE = registerBlock("condensed_water_fence_gate",
            () -> new ModOthersFenceGateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_PRESSURE_PLATE = registerBlock("condensed_water_pressure_plate",
            () -> new ModOthersPressurePlateBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CONDENSED_WATER_BUTTON = registerBlock("condensed_water_button",
            () -> new ModOthersButtonBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> WOODEN_AGGLUTINATE = registerBlock("wooden_agglutinate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(4.5F, 9.0F).sound(SoundType.WOOD))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 3;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 1;
                }
            });

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}