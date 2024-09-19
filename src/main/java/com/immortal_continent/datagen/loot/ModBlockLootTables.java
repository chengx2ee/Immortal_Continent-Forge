package com.immortal_continent.datagen.loot;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModBlockLootTables extends BlockLootSubProvider
{
    // 生成方块掉落物
    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        this.add(ModBlocks.WOODEN_AGGLUTINATE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.WOODEN_AGGLUTINATE.get(), ModItems.WOODEN_HEART.get()));

        this.dropSelf(ModBlocks.BIJUE_RAW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BIJUE_RAW_LOG.get());
        this.dropSelf(ModBlocks.BIJUE_RAW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get());
        this.dropSelf(ModBlocks.BIJUE_RAW_PLANKS.get());
        this.add(ModBlocks.BIJUE_RAW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.BIJUE_RAW_STAIRS.get());
        this.add(ModBlocks.BIJUE_RAW_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIJUE_RAW_SLAB.get()));
        this.dropSelf(ModBlocks.BIJUE_RAW_FENCE.get());
        this.dropSelf(ModBlocks.BIJUE_RAW_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BIJUE_RAW_BUTTON.get());

        this.dropSelf(ModBlocks.GREEN_NAN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_NAN_LOG.get());
        this.dropSelf(ModBlocks.GREEN_NAN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_NAN_WOOD.get());
        this.dropSelf(ModBlocks.GREEN_NAN_PLANKS.get());
        this.add(ModBlocks.GREEN_NAN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.GREEN_NAN_STAIRS.get());
        this.add(ModBlocks.GREEN_NAN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_NAN_SLAB.get()));
        this.dropSelf(ModBlocks.GREEN_NAN_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_NAN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_NAN_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREEN_NAN_BUTTON.get());

        this.dropSelf(ModBlocks.SAKU_MAPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get());
        this.dropSelf(ModBlocks.SAKU_MAPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get());
        this.dropSelf(ModBlocks.SAKU_MAPLE_PLANKS.get());
        this.add(ModBlocks.SAKU_MAPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.SAKU_MAPLE_STAIRS.get());
        this.add(ModBlocks.SAKU_MAPLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAKU_MAPLE_SLAB.get()));
        this.dropSelf(ModBlocks.SAKU_MAPLE_FENCE.get());
        this.dropSelf(ModBlocks.SAKU_MAPLE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAKU_MAPLE_BUTTON.get());

        this.dropSelf(ModBlocks.FLAMING_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FLAMING_LOG.get());
        this.dropSelf(ModBlocks.FLAMING_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FLAMING_WOOD.get());
        this.dropSelf(ModBlocks.FLAMING_PLANKS.get());
        this.add(ModBlocks.FLAMING_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.FLAMING_STAIRS.get());
        this.add(ModBlocks.FLAMING_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FLAMING_SLAB.get()));
        this.dropSelf(ModBlocks.FLAMING_FENCE.get());
        this.dropSelf(ModBlocks.FLAMING_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FLAMING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FLAMING_BUTTON.get());

        this.dropSelf(ModBlocks.LOAM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LOAM_LOG.get());
        this.dropSelf(ModBlocks.LOAM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LOAM_WOOD.get());
        this.dropSelf(ModBlocks.LOAM_PLANKS.get());
        this.add(ModBlocks.LOAM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.LOAM_STAIRS.get());
        this.add(ModBlocks.LOAM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LOAM_SLAB.get()));
        this.dropSelf(ModBlocks.LOAM_FENCE.get());
        this.dropSelf(ModBlocks.LOAM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LOAM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LOAM_BUTTON.get());

        this.dropSelf(ModBlocks.CAST_GOLD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CAST_GOLD_LOG.get());
        this.dropSelf(ModBlocks.CAST_GOLD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CAST_GOLD_WOOD.get());
        this.dropSelf(ModBlocks.CAST_GOLD_PLANKS.get());
        this.add(ModBlocks.CAST_GOLD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.CAST_GOLD_STAIRS.get());
        this.add(ModBlocks.CAST_GOLD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CAST_GOLD_SLAB.get()));
        this.dropSelf(ModBlocks.CAST_GOLD_FENCE.get());
        this.dropSelf(ModBlocks.CAST_GOLD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CAST_GOLD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CAST_GOLD_BUTTON.get());

        this.dropSelf(ModBlocks.CONDENSED_WATER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get());
        this.dropSelf(ModBlocks.CONDENSED_WATER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get());
        this.dropSelf(ModBlocks.CONDENSED_WATER_PLANKS.get());
        this.add(ModBlocks.CONDENSED_WATER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.CONDENSED_WATER_STAIRS.get());
        this.add(ModBlocks.CONDENSED_WATER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CONDENSED_WATER_SLAB.get()));
        this.dropSelf(ModBlocks.CONDENSED_WATER_FENCE.get());
        this.dropSelf(ModBlocks.CONDENSED_WATER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CONDENSED_WATER_BUTTON.get());

        this.dropSelf(ModBlocks.PALE_WIND_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PALE_WIND_LOG.get());
        this.dropSelf(ModBlocks.PALE_WIND_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PALE_WIND_WOOD.get());
        this.dropSelf(ModBlocks.PALE_WIND_PLANKS.get());
        this.add(ModBlocks.PALE_WIND_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.PALE_WIND_STAIRS.get());
        this.add(ModBlocks.PALE_WIND_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALE_WIND_SLAB.get()));
        this.dropSelf(ModBlocks.PALE_WIND_FENCE.get());
        this.dropSelf(ModBlocks.PALE_WIND_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PALE_WIND_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PALE_WIND_BUTTON.get());

        this.dropSelf(ModBlocks.THUNDER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_THUNDER_LOG.get());
        this.dropSelf(ModBlocks.THUNDER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_THUNDER_WOOD.get());
        this.dropSelf(ModBlocks.THUNDER_PLANKS.get());
        this.add(ModBlocks.THUNDER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModBlocks.THUNDER_STAIRS.get());
        this.add(ModBlocks.THUNDER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.THUNDER_SLAB.get()));
        this.dropSelf(ModBlocks.THUNDER_FENCE.get());
        this.dropSelf(ModBlocks.THUNDER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.THUNDER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.THUNDER_BUTTON.get());

        this.dropSelf(ModFireResistantBlocks.IMMORTAL_LOG.get());
        this.dropSelf(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_WOOD.get());
        this.dropSelf(ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_PLANKS.get());
        this.add(ModFireResistantBlocks.IMMORTAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_STAIRS.get());
        this.add(ModFireResistantBlocks.IMMORTAL_SLAB.get(),
                block -> createSlabItemTable(ModFireResistantBlocks.IMMORTAL_SLAB.get()));
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_FENCE.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_BUTTON.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item)
    {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected Iterable<Block> getKnownBlocks()
    {
        Stream<Block> blocksStream = Stream.concat(
                ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get),
                ModFireResistantBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
        );
        return blocksStream.collect(Collectors.toList());
    }
}