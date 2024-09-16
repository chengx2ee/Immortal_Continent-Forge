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

                     ModBlocks.BIJUE_RAW_LOG.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_LOG.get(),
                     ModBlocks.BIJUE_RAW_WOOD.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get(),
                     ModBlocks.BIJUE_RAW_PLANKS.get(),
                     ModBlocks.BIJUE_RAW_STAIRS.get(),
                     ModBlocks.BIJUE_RAW_SLAB.get(),
                     ModBlocks.BIJUE_RAW_FENCE.get(),
                     ModBlocks.BIJUE_RAW_FENCE_GATE.get(),
                     ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get(),
                     ModBlocks.BIJUE_RAW_BUTTON.get(),

                     ModBlocks.GREEN_NAN_LOG.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_LOG.get(),
                     ModBlocks.GREEN_NAN_WOOD.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_WOOD.get(),
                     ModBlocks.GREEN_NAN_PLANKS.get(),
                     ModBlocks.GREEN_NAN_STAIRS.get(),
                     ModBlocks.GREEN_NAN_SLAB.get(),
                     ModBlocks.GREEN_NAN_FENCE.get(),
                     ModBlocks.GREEN_NAN_FENCE_GATE.get(),
                     ModBlocks.GREEN_NAN_PRESSURE_PLATE.get(),
                     ModBlocks.GREEN_NAN_BUTTON.get(),

                     ModBlocks.SAKU_MAPLE_LOG.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get(),
                     ModBlocks.SAKU_MAPLE_WOOD.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get(),
                     ModBlocks.SAKU_MAPLE_PLANKS.get(),
                     ModBlocks.SAKU_MAPLE_STAIRS.get(),
                     ModBlocks.SAKU_MAPLE_SLAB.get(),
                     ModBlocks.SAKU_MAPLE_FENCE.get(),
                     ModBlocks.SAKU_MAPLE_FENCE_GATE.get(),
                     ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get(),
                     ModBlocks.SAKU_MAPLE_BUTTON.get(),

                     ModBlocks.FLAMING_LOG.get(),
                     ModBlocks.STRIPPED_FLAMING_LOG.get(),
                     ModBlocks.FLAMING_WOOD.get(),
                     ModBlocks.STRIPPED_FLAMING_WOOD.get(),
                     ModBlocks.FLAMING_PLANKS.get(),
                     ModBlocks.FLAMING_STAIRS.get(),
                     ModBlocks.FLAMING_SLAB.get(),
                     ModBlocks.FLAMING_FENCE.get(),
                     ModBlocks.FLAMING_FENCE_GATE.get(),
                     ModBlocks.FLAMING_PRESSURE_PLATE.get(),
                     ModBlocks.FLAMING_BUTTON.get(),

                     ModBlocks.LOAM_LOG.get(),
                     ModBlocks.STRIPPED_LOAM_LOG.get(),
                     ModBlocks.LOAM_WOOD.get(),
                     ModBlocks.STRIPPED_LOAM_WOOD.get(),
                     ModBlocks.LOAM_PLANKS.get(),
                     ModBlocks.LOAM_STAIRS.get(),
                     ModBlocks.LOAM_SLAB.get(),
                     ModBlocks.LOAM_FENCE.get(),
                     ModBlocks.LOAM_FENCE_GATE.get(),
                     ModBlocks.LOAM_PRESSURE_PLATE.get(),
                     ModBlocks.LOAM_BUTTON.get(),

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

                     ModBlocks.PALE_WIND_LOG.get(),
                     ModBlocks.STRIPPED_PALE_WIND_LOG.get(),
                     ModBlocks.PALE_WIND_WOOD.get(),
                     ModBlocks.STRIPPED_PALE_WIND_WOOD.get(),
                     ModBlocks.PALE_WIND_PLANKS.get(),
                     ModBlocks.PALE_WIND_STAIRS.get(),
                     ModBlocks.PALE_WIND_SLAB.get(),
                     ModBlocks.PALE_WIND_FENCE.get(),
                     ModBlocks.PALE_WIND_FENCE_GATE.get(),
                     ModBlocks.PALE_WIND_PRESSURE_PLATE.get(),
                     ModBlocks.PALE_WIND_BUTTON.get(),

                     ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get(),
                     ModFireResistantBlocks.IMMORTAL_STAIRS.get(),
                     ModFireResistantBlocks.IMMORTAL_SLAB.get(),
                     ModFireResistantBlocks.IMMORTAL_FENCE.get(),
                     ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get(),
                     ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get(),
                     ModFireResistantBlocks.IMMORTAL_BUTTON.get());

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.BIJUE_RAW_LOG.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_LOG.get(),
                     ModBlocks.BIJUE_RAW_WOOD.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get(),

                     ModBlocks.GREEN_NAN_LOG.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_LOG.get(),
                     ModBlocks.GREEN_NAN_WOOD.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_WOOD.get(),

                     ModBlocks.SAKU_MAPLE_LOG.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get(),
                     ModBlocks.SAKU_MAPLE_WOOD.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get(),

                     ModBlocks.FLAMING_LOG.get(),
                     ModBlocks.STRIPPED_FLAMING_LOG.get(),
                     ModBlocks.FLAMING_WOOD.get(),
                     ModBlocks.STRIPPED_FLAMING_WOOD.get(),

                     ModBlocks.LOAM_LOG.get(),
                     ModBlocks.STRIPPED_LOAM_LOG.get(),
                     ModBlocks.LOAM_WOOD.get(),
                     ModBlocks.STRIPPED_LOAM_WOOD.get(),

                     ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),

                     ModBlocks.CONDENSED_WATER_LOG.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get(),
                     ModBlocks.CONDENSED_WATER_WOOD.get(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get(),

                     ModBlocks.PALE_WIND_LOG.get(),
                     ModBlocks.STRIPPED_PALE_WIND_LOG.get(),
                     ModBlocks.PALE_WIND_WOOD.get(),
                     ModBlocks.STRIPPED_PALE_WIND_WOOD.get(),

                     ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.BIJUE_RAW_PLANKS.get(),

                     ModBlocks.GREEN_NAN_PLANKS.get(),

                     ModBlocks.SAKU_MAPLE_PLANKS.get(),

                     ModBlocks.FLAMING_PLANKS.get(),

                     ModBlocks.LOAM_PLANKS.get(),

                     ModBlocks.CAST_GOLD_PLANKS.get(),

                     ModBlocks.CONDENSED_WATER_PLANKS.get(),

                     ModBlocks.PALE_WIND_PLANKS.get(),

                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.BIJUE_RAW_LEAVES.get(),

                     ModBlocks.GREEN_NAN_LEAVES.get(),

                     ModBlocks.SAKU_MAPLE_LEAVES.get(),

                     ModBlocks.FLAMING_LEAVES.get(),

                     ModBlocks.LOAM_LEAVES.get(),

                     ModBlocks.CAST_GOLD_LEAVES.get(),

                     ModBlocks.CONDENSED_WATER_LEAVES.get(),

                     ModBlocks.PALE_WIND_LEAVES.get(),

                     ModFireResistantBlocks.IMMORTAL_LEAVES.get());

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.BIJUE_RAW_STAIRS.get(),

                     ModBlocks.GREEN_NAN_STAIRS.get(),

                     ModBlocks.SAKU_MAPLE_STAIRS.get(),

                     ModBlocks.FLAMING_STAIRS.get(),

                     ModBlocks.LOAM_STAIRS.get(),

                     ModBlocks.CAST_GOLD_STAIRS.get(),

                     ModBlocks.CONDENSED_WATER_STAIRS.get(),

                     ModBlocks.PALE_WIND_STAIRS.get(),

                     ModFireResistantBlocks.IMMORTAL_STAIRS.get());

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.BIJUE_RAW_SLAB.get(),

                     ModBlocks.GREEN_NAN_SLAB.get(),

                     ModBlocks.SAKU_MAPLE_SLAB.get(),

                     ModBlocks.FLAMING_SLAB.get(),

                     ModBlocks.LOAM_SLAB.get(),

                     ModBlocks.CAST_GOLD_SLAB.get(),

                     ModBlocks.CONDENSED_WATER_SLAB.get(),

                     ModBlocks.PALE_WIND_SLAB.get(),

                     ModFireResistantBlocks.IMMORTAL_SLAB.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.BIJUE_RAW_FENCE.get(),

                     ModBlocks.GREEN_NAN_FENCE.get(),

                     ModBlocks.SAKU_MAPLE_FENCE.get(),

                     ModBlocks.FLAMING_FENCE.get(),

                     ModBlocks.LOAM_FENCE.get(),

                     ModBlocks.CAST_GOLD_FENCE.get(),

                     ModBlocks.CONDENSED_WATER_FENCE.get(),

                     ModBlocks.PALE_WIND_FENCE.get(),

                     ModFireResistantBlocks.IMMORTAL_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.BIJUE_RAW_FENCE_GATE.get(),

                     ModBlocks.GREEN_NAN_FENCE_GATE.get(),

                     ModBlocks.SAKU_MAPLE_FENCE_GATE.get(),

                     ModBlocks.FLAMING_FENCE_GATE.get(),

                     ModBlocks.LOAM_FENCE_GATE.get(),

                     ModBlocks.CAST_GOLD_FENCE_GATE.get(),

                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get(),

                     ModBlocks.PALE_WIND_FENCE_GATE.get(),

                     ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get());

        this.tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get(),

                     ModBlocks.GREEN_NAN_PRESSURE_PLATE.get(),

                     ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get(),

                     ModBlocks.FLAMING_PRESSURE_PLATE.get(),

                     ModBlocks.LOAM_PRESSURE_PLATE.get(),

                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get(),

                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get(),

                     ModBlocks.PALE_WIND_PRESSURE_PLATE.get(),

                     ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get());

        this.tag(BlockTags.BUTTONS)
                .add(ModBlocks.BIJUE_RAW_BUTTON.get(),

                     ModBlocks.GREEN_NAN_BUTTON.get(),

                     ModBlocks.SAKU_MAPLE_BUTTON.get(),

                     ModBlocks.FLAMING_BUTTON.get(),

                     ModBlocks.LOAM_BUTTON.get(),

                     ModBlocks.CAST_GOLD_BUTTON.get(),

                     ModBlocks.CONDENSED_WATER_BUTTON.get(),

                     ModBlocks.PALE_WIND_BUTTON.get(),

                     ModFireResistantBlocks.IMMORTAL_BUTTON.get());

        // 方块燃烧
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.BIJUE_RAW_LOG.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_LOG.get(),
                     ModBlocks.BIJUE_RAW_WOOD.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get(),
                     ModBlocks.BIJUE_RAW_PLANKS.get(),
                     ModBlocks.BIJUE_RAW_LEAVES.get(),
                     ModBlocks.BIJUE_RAW_STAIRS.get(),
                     ModBlocks.BIJUE_RAW_SLAB.get(),
                     ModBlocks.BIJUE_RAW_FENCE.get(),
                     ModBlocks.BIJUE_RAW_FENCE_GATE.get(),
                     ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get(),
                     ModBlocks.BIJUE_RAW_BUTTON.get(),

                     ModBlocks.GREEN_NAN_LOG.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_LOG.get(),
                     ModBlocks.GREEN_NAN_WOOD.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_WOOD.get(),
                     ModBlocks.GREEN_NAN_PLANKS.get(),
                     ModBlocks.GREEN_NAN_LEAVES.get(),
                     ModBlocks.GREEN_NAN_STAIRS.get(),
                     ModBlocks.GREEN_NAN_SLAB.get(),
                     ModBlocks.GREEN_NAN_FENCE.get(),
                     ModBlocks.GREEN_NAN_FENCE_GATE.get(),
                     ModBlocks.GREEN_NAN_PRESSURE_PLATE.get(),
                     ModBlocks.GREEN_NAN_BUTTON.get(),

                     ModBlocks.SAKU_MAPLE_LOG.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get(),
                     ModBlocks.SAKU_MAPLE_WOOD.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get(),
                     ModBlocks.SAKU_MAPLE_PLANKS.get(),
                     ModBlocks.SAKU_MAPLE_LEAVES.get(),
                     ModBlocks.SAKU_MAPLE_STAIRS.get(),
                     ModBlocks.SAKU_MAPLE_SLAB.get(),
                     ModBlocks.SAKU_MAPLE_FENCE.get(),
                     ModBlocks.SAKU_MAPLE_FENCE_GATE.get(),
                     ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get(),
                     ModBlocks.SAKU_MAPLE_BUTTON.get(),

                     ModBlocks.FLAMING_LOG.get(),
                     ModBlocks.STRIPPED_FLAMING_LOG.get(),
                     ModBlocks.FLAMING_WOOD.get(),
                     ModBlocks.STRIPPED_FLAMING_WOOD.get(),
                     ModBlocks.FLAMING_PLANKS.get(),
                     ModBlocks.FLAMING_LEAVES.get(),
                     ModBlocks.FLAMING_STAIRS.get(),
                     ModBlocks.FLAMING_SLAB.get(),
                     ModBlocks.FLAMING_FENCE.get(),
                     ModBlocks.FLAMING_FENCE_GATE.get(),
                     ModBlocks.FLAMING_PRESSURE_PLATE.get(),
                     ModBlocks.FLAMING_BUTTON.get(),

                     ModBlocks.LOAM_LOG.get(),
                     ModBlocks.STRIPPED_LOAM_LOG.get(),
                     ModBlocks.LOAM_WOOD.get(),
                     ModBlocks.STRIPPED_LOAM_WOOD.get(),
                     ModBlocks.LOAM_PLANKS.get(),
                     ModBlocks.LOAM_LEAVES.get(),
                     ModBlocks.LOAM_STAIRS.get(),
                     ModBlocks.LOAM_SLAB.get(),
                     ModBlocks.LOAM_FENCE.get(),
                     ModBlocks.LOAM_FENCE_GATE.get(),
                     ModBlocks.LOAM_PRESSURE_PLATE.get(),
                     ModBlocks.LOAM_BUTTON.get(),

                     ModBlocks.CAST_GOLD_LOG.get(),
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
                     ModBlocks.CONDENSED_WATER_BUTTON.get(),

                     ModBlocks.PALE_WIND_LOG.get(),
                     ModBlocks.STRIPPED_PALE_WIND_LOG.get(),
                     ModBlocks.PALE_WIND_WOOD.get(),
                     ModBlocks.STRIPPED_PALE_WIND_WOOD.get(),
                     ModBlocks.PALE_WIND_PLANKS.get(),
                     ModBlocks.PALE_WIND_LEAVES.get(),
                     ModBlocks.PALE_WIND_STAIRS.get(),
                     ModBlocks.PALE_WIND_SLAB.get(),
                     ModBlocks.PALE_WIND_FENCE.get(),
                     ModBlocks.PALE_WIND_FENCE_GATE.get(),
                     ModBlocks.PALE_WIND_PRESSURE_PLATE.get(),
                     ModBlocks.PALE_WIND_BUTTON.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BIJUE_RAW_LOG.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_LOG.get(),
                     ModBlocks.BIJUE_RAW_WOOD.get(),
                     ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get(),
                     ModBlocks.BIJUE_RAW_PLANKS.get(),
                     ModBlocks.BIJUE_RAW_STAIRS.get(),
                     ModBlocks.BIJUE_RAW_SLAB.get(),
                     ModBlocks.BIJUE_RAW_FENCE.get(),
                     ModBlocks.BIJUE_RAW_FENCE_GATE.get(),
                     ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get(),
                     ModBlocks.BIJUE_RAW_BUTTON.get(),

                     ModBlocks.GREEN_NAN_LOG.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_LOG.get(),
                     ModBlocks.GREEN_NAN_WOOD.get(),
                     ModBlocks.STRIPPED_GREEN_NAN_WOOD.get(),
                     ModBlocks.GREEN_NAN_PLANKS.get(),
                     ModBlocks.GREEN_NAN_STAIRS.get(),
                     ModBlocks.GREEN_NAN_SLAB.get(),
                     ModBlocks.GREEN_NAN_FENCE.get(),
                     ModBlocks.GREEN_NAN_FENCE_GATE.get(),
                     ModBlocks.GREEN_NAN_PRESSURE_PLATE.get(),
                     ModBlocks.GREEN_NAN_BUTTON.get(),

                     ModBlocks.SAKU_MAPLE_LOG.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get(),
                     ModBlocks.SAKU_MAPLE_WOOD.get(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get(),
                     ModBlocks.SAKU_MAPLE_PLANKS.get(),
                     ModBlocks.SAKU_MAPLE_STAIRS.get(),
                     ModBlocks.SAKU_MAPLE_SLAB.get(),
                     ModBlocks.SAKU_MAPLE_FENCE.get(),
                     ModBlocks.SAKU_MAPLE_FENCE_GATE.get(),
                     ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get(),
                     ModBlocks.SAKU_MAPLE_BUTTON.get(),

                     ModBlocks.FLAMING_LOG.get(),
                     ModBlocks.STRIPPED_FLAMING_LOG.get(),
                     ModBlocks.FLAMING_WOOD.get(),
                     ModBlocks.STRIPPED_FLAMING_WOOD.get(),
                     ModBlocks.FLAMING_PLANKS.get(),
                     ModBlocks.FLAMING_STAIRS.get(),
                     ModBlocks.FLAMING_SLAB.get(),
                     ModBlocks.FLAMING_FENCE.get(),
                     ModBlocks.FLAMING_FENCE_GATE.get(),
                     ModBlocks.FLAMING_PRESSURE_PLATE.get(),
                     ModBlocks.FLAMING_BUTTON.get(),

                     ModBlocks.LOAM_LOG.get(),
                     ModBlocks.STRIPPED_LOAM_LOG.get(),
                     ModBlocks.LOAM_WOOD.get(),
                     ModBlocks.STRIPPED_LOAM_WOOD.get(),
                     ModBlocks.LOAM_PLANKS.get(),
                     ModBlocks.LOAM_STAIRS.get(),
                     ModBlocks.LOAM_SLAB.get(),
                     ModBlocks.LOAM_FENCE.get(),
                     ModBlocks.LOAM_FENCE_GATE.get(),
                     ModBlocks.LOAM_PRESSURE_PLATE.get(),
                     ModBlocks.LOAM_BUTTON.get(),

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

                     ModBlocks.PALE_WIND_LOG.get(),
                     ModBlocks.STRIPPED_PALE_WIND_LOG.get(),
                     ModBlocks.PALE_WIND_WOOD.get(),
                     ModBlocks.STRIPPED_PALE_WIND_WOOD.get(),
                     ModBlocks.PALE_WIND_PLANKS.get(),
                     ModBlocks.PALE_WIND_STAIRS.get(),
                     ModBlocks.PALE_WIND_SLAB.get(),
                     ModBlocks.PALE_WIND_FENCE.get(),
                     ModBlocks.PALE_WIND_FENCE_GATE.get(),
                     ModBlocks.PALE_WIND_PRESSURE_PLATE.get(),
                     ModBlocks.PALE_WIND_BUTTON.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.WOODEN_AGGLUTINATE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get(),
                     ModFireResistantBlocks.IMMORTAL_STAIRS.get(),
                     ModFireResistantBlocks.IMMORTAL_SLAB.get(),
                     ModFireResistantBlocks.IMMORTAL_FENCE.get(),
                     ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get(),
                     ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get(),
                     ModFireResistantBlocks.IMMORTAL_BUTTON.get());

    }
}