package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, ImmortalContinent.MOD_ID, existingFileHelper);
    }

    // 方块标签生成
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.WOODEN_AGGLUTINATE.get(),
                     ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),
                     ModBlocks.CAST_GOLD_PLANKS.get(),
                     ModBlocks.CAST_GOLD_STAIRS.get(),
                     ModBlocks.CAST_GOLD_SLAB.get(),
                     ModBlocks.CAST_GOLD_FENCE.get(),
                     ModBlocks.CAST_GOLD_FENCE_GATE.get(),
                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get(),
                     ModBlocks.CAST_GOLD_BUTTON.get(),

                     ModBlocks.CONDENSED_WATER_LOG.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get(),
                     ModBlocks.CONDENSED_WATER_WOOD.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get(),
                     ModBlocks.CONDENSED_WATER_PLANKS.get(),
                     ModBlocks.CONDENSED_WATER_STAIRS.get(),
                     ModBlocks.CONDENSED_WATER_SLAB.get(),
                     ModBlocks.CONDENSED_WATER_FENCE.get(),
                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get(),
                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get(),
                     ModBlocks.CONDENSED_WATER_BUTTON.get(),

                     ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),

                     ModBlocks.CONDENSED_WATER_LOG.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get(),
                     ModBlocks.CONDENSED_WATER_WOOD.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get(),

                     ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.CAST_GOLD_PLANKS.get(),

                     ModBlocks.CONDENSED_WATER_PLANKS.get(),

                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.CAST_GOLD_LEAVES.get(),

                     ModBlocks.CONDENSED_WATER_LEAVES.get(),

                     ModFireResistantBlocks.IMMORTAL_LEAVES.get());

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.CAST_GOLD_STAIRS.get(),
                     ModBlocks.CONDENSED_WATER_STAIRS.get());

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.CAST_GOLD_SLAB.get(),
                     ModBlocks.CONDENSED_WATER_SLAB.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.CAST_GOLD_FENCE.get(),
                     ModBlocks.CONDENSED_WATER_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.CAST_GOLD_FENCE_GATE.get(),
                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get());

        this.tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.CAST_GOLD_PRESSURE_PLATE.get(),
                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get());

        this.tag(BlockTags.BUTTONS)
                .add(ModBlocks.CAST_GOLD_BUTTON.get(),
                     ModBlocks.CONDENSED_WATER_BUTTON.get());

        // 方块燃烧
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),
                     ModBlocks.CAST_GOLD_PLANKS.get(),
                     ModBlocks.CAST_GOLD_LEAVES.get(),
                     ModBlocks.CAST_GOLD_STAIRS.get(),
                     ModBlocks.CAST_GOLD_SLAB.get(),
                     ModBlocks.CAST_GOLD_FENCE.get(),
                     ModBlocks.CAST_GOLD_FENCE_GATE.get(),
                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get(),
                     ModBlocks.CAST_GOLD_BUTTON.get(),

                     ModBlocks.CONDENSED_WATER_LOG.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get(),
                     ModBlocks.CONDENSED_WATER_WOOD.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get(),
                     ModBlocks.CONDENSED_WATER_PLANKS.get(),
                     ModBlocks.CONDENSED_WATER_LEAVES.get(),
                     ModBlocks.CONDENSED_WATER_STAIRS.get(),
                     ModBlocks.CONDENSED_WATER_SLAB.get(),
                     ModBlocks.CONDENSED_WATER_FENCE.get(),
                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get(),
                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get(),
                     ModBlocks.CONDENSED_WATER_BUTTON.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),
                     ModBlocks.CAST_GOLD_PLANKS.get(),
                     ModBlocks.CAST_GOLD_STAIRS.get(),
                     ModBlocks.CAST_GOLD_SLAB.get(),
                     ModBlocks.CAST_GOLD_FENCE.get(),
                     ModBlocks.CAST_GOLD_FENCE_GATE.get(),
                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get(),
                     ModBlocks.CAST_GOLD_BUTTON.get(),

                     ModBlocks.CONDENSED_WATER_LOG.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get(),
                     ModBlocks.CONDENSED_WATER_WOOD.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get(),
                     ModBlocks.CONDENSED_WATER_PLANKS.get(),
                     ModBlocks.CONDENSED_WATER_STAIRS.get(),
                     ModBlocks.CONDENSED_WATER_SLAB.get(),
                     ModBlocks.CONDENSED_WATER_FENCE.get(),
                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get(),
                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get(),
                     ModBlocks.CONDENSED_WATER_BUTTON.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.WOODEN_AGGLUTINATE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

    }
}