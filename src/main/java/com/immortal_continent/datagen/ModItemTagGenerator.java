package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider
{
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture, CompletableFuture<TagLookup<Block>> aSuper, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(packOutput, providerCompletableFuture, aSuper, ImmortalContinent.MOD_ID, existingFileHelper);
    }

    // 物品标签生成
    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        this.tag(ItemTags.LOGS)
                .add(ModBlocks.FLAMING_LOG.get().asItem(),
                     ModBlocks.STRIPPED_FLAMING_LOG.get().asItem(),
                     ModBlocks.FLAMING_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_FLAMING_WOOD.get().asItem(),

                     ModBlocks.LOAM_LOG.get().asItem(),
                     ModBlocks.STRIPPED_LOAM_LOG.get().asItem(),
                     ModBlocks.LOAM_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_LOAM_WOOD.get().asItem(),

                     ModBlocks.CAST_GOLD_LOG.get().asItem(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get().asItem(),
                     ModBlocks.CAST_GOLD_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get().asItem(),

                     ModBlocks.CONDENSED_WATER_LOG.get().asItem(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get().asItem(),
                     ModBlocks.CONDENSED_WATER_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_LOG.get().asItem(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get().asItem(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get().asItem(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.FLAMING_PLANKS.get().asItem(),

                     ModBlocks.LOAM_PLANKS.get().asItem(),

                     ModBlocks.CAST_GOLD_PLANKS.get().asItem(),

                     ModBlocks.CONDENSED_WATER_PLANKS.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_PLANKS.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(ModBlocks.FLAMING_LEAVES.get().asItem(),

                     ModBlocks.LOAM_LEAVES.get().asItem(),

                     ModBlocks.CAST_GOLD_LEAVES.get().asItem(),

                     ModBlocks.CONDENSED_WATER_LEAVES.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_LEAVES.get().asItem());

        this.tag(ItemTags.STAIRS)
                .add(ModBlocks.FLAMING_STAIRS.get().asItem(),

                     ModBlocks.LOAM_STAIRS.get().asItem(),

                     ModBlocks.CAST_GOLD_STAIRS.get().asItem(),

                     ModBlocks.CONDENSED_WATER_STAIRS.get().asItem());

        this.tag(ItemTags.SLABS)
                .add(ModBlocks.FLAMING_SLAB.get().asItem(),

                     ModBlocks.LOAM_SLAB.get().asItem(),

                     ModBlocks.CAST_GOLD_SLAB.get().asItem(),

                     ModBlocks.CONDENSED_WATER_SLAB.get().asItem());

        this.tag(ItemTags.FENCES)
                .add(ModBlocks.FLAMING_FENCE.get().asItem(),

                     ModBlocks.LOAM_FENCE.get().asItem(),

                     ModBlocks.CAST_GOLD_FENCE.get().asItem(),

                     ModBlocks.CONDENSED_WATER_FENCE.get().asItem());

        this.tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.FLAMING_FENCE_GATE.get().asItem(),

                     ModBlocks.LOAM_FENCE_GATE.get().asItem(),

                     ModBlocks.CAST_GOLD_FENCE_GATE.get().asItem(),

                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get().asItem());

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.FLAMING_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.LOAM_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get().asItem());

        this.tag(ItemTags.BUTTONS)
                .add(ModBlocks.FLAMING_BUTTON.get().asItem(),

                     ModBlocks.LOAM_BUTTON.get().asItem(),

                     ModBlocks.CAST_GOLD_BUTTON.get().asItem(),

                     ModBlocks.CONDENSED_WATER_BUTTON.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.FLAMING_LOG.get().asItem(),
                     ModBlocks.STRIPPED_FLAMING_LOG.get().asItem(),
                     ModBlocks.FLAMING_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_FLAMING_WOOD.get().asItem(),
                     ModBlocks.FLAMING_PLANKS.get().asItem(),
                     ModBlocks.FLAMING_LEAVES.get().asItem(),
                     ModBlocks.FLAMING_STAIRS.get().asItem(),
                     ModBlocks.FLAMING_SLAB.get().asItem(),
                     ModBlocks.FLAMING_FENCE.get().asItem(),
                     ModBlocks.FLAMING_FENCE_GATE.get().asItem(),
                     ModBlocks.FLAMING_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.FLAMING_BUTTON.get().asItem(),

                     ModBlocks.LOAM_LOG.get().asItem(),
                     ModBlocks.STRIPPED_LOAM_LOG.get().asItem(),
                     ModBlocks.LOAM_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_LOAM_WOOD.get().asItem(),
                     ModBlocks.LOAM_PLANKS.get().asItem(),
                     ModBlocks.LOAM_LEAVES.get().asItem(),
                     ModBlocks.LOAM_STAIRS.get().asItem(),
                     ModBlocks.LOAM_SLAB.get().asItem(),
                     ModBlocks.LOAM_FENCE.get().asItem(),
                     ModBlocks.LOAM_FENCE_GATE.get().asItem(),
                     ModBlocks.LOAM_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.LOAM_BUTTON.get().asItem(),

                     ModBlocks.CAST_GOLD_LOG.get().asItem(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get().asItem(),
                     ModBlocks.CAST_GOLD_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get().asItem(),
                     ModBlocks.CAST_GOLD_PLANKS.get().asItem(),
                     ModBlocks.CAST_GOLD_LEAVES.get().asItem(),
                     ModBlocks.CAST_GOLD_STAIRS.get().asItem(),
                     ModBlocks.CAST_GOLD_SLAB.get().asItem(),
                     ModBlocks.CAST_GOLD_FENCE.get().asItem(),
                     ModBlocks.CAST_GOLD_FENCE_GATE.get().asItem(),
                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.CAST_GOLD_BUTTON.get().asItem(),

                     ModBlocks.CONDENSED_WATER_LOG.get().asItem(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get().asItem(),
                     ModBlocks.CONDENSED_WATER_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get().asItem(),
                     ModBlocks.CONDENSED_WATER_PLANKS.get().asItem(),
                     ModBlocks.CONDENSED_WATER_LEAVES.get().asItem(),
                     ModBlocks.CONDENSED_WATER_STAIRS.get().asItem(),
                     ModBlocks.CONDENSED_WATER_SLAB.get().asItem(),
                     ModBlocks.CONDENSED_WATER_FENCE.get().asItem(),
                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get().asItem(),
                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.CONDENSED_WATER_BUTTON.get().asItem());
    }
}