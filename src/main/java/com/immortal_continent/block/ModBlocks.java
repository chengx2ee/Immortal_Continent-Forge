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

    public static final RegistryObject<Block> CAST_GOLD_LOG = registerBlock("cast_gold_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> STRIPPED_CAST_GOLD_LOG = registerBlock("stripped_cast_gold_log",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CAST_GOLD_WOOD = registerBlock("cast_gold_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> STRIPPED_CAST_GOLD_WOOD = registerBlock("stripped_cast_gold_wood",
            () -> new ModCastGoldWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CAST_GOLD_PLANKS = registerBlock("cast_gold_planks",
            () -> new ModOthersPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CAST_GOLD_LEAVES = registerBlock("cast_gold_leaves",
            () -> new ModOthersLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CAST_GOLD_STAIRS = registerBlock("cast_gold_stairs",
            () -> new StairBlock(() -> ModBlocks.CAST_GOLD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 3.0F))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 16;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
                {
                    return 2;
                }
            });
    public static final RegistryObject<Block> CAST_GOLD_SLAB = registerBlock("cast_gold_slab",
            () -> new ModOthersSlabBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));



    public static final RegistryObject<Block> CONDENSED_WATER_LOG = registerBlock("condensed_water_log",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> STRIPPED_CONDENSED_WATER_LOG = registerBlock("stripped_condensed_water_log",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CONDENSED_WATER_WOOD = registerBlock("condensed_water_wood",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> STRIPPED_CONDENSED_WATER_WOOD = registerBlock("stripped_condensed_water_wood",
            () -> new ModCondensedWaterWoodBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CONDENSED_WATER_PLANKS = registerBlock("condensed_water_planks",
            () -> new ModOthersPlankBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CONDENSED_WATER_LEAVES = registerBlock("condensed_water_leaves",
            () -> new ModOthersLeafBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));



    public static final RegistryObject<Block> WOODEN_AGGLUTINATE = registerBlock("wooden_agglutinate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F))
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