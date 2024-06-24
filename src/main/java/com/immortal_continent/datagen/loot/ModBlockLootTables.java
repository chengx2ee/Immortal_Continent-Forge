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

        this.dropSelf(ModBlocks.CAST_GOLD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CAST_GOLD_LOG.get());
        this.dropSelf(ModBlocks.CAST_GOLD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CAST_GOLD_WOOD.get());
        this.dropSelf(ModBlocks.CAST_GOLD_PLANKS.get());
        this.add(ModBlocks.CAST_GOLD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!

        this.dropSelf(ModFireResistantBlocks.IMMORTAL_LOG.get());
        this.dropSelf(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_WOOD.get());
        this.dropSelf(ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get());
        this.dropSelf(ModFireResistantBlocks.IMMORTAL_PLANKS.get());
        this.add(ModFireResistantBlocks.IMMORTAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WOODEN_AGGLUTINATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!
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