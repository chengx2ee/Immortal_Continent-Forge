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
                .add(ModBlocks.BIJUE_RAW_LOG.get().asItem(),
                     ModBlocks.STRIPPED_BIJUE_RAW_LOG.get().asItem(),
                     ModBlocks.BIJUE_RAW_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get().asItem(),

                     ModBlocks.GREEN_NAN_LOG.get().asItem(),
                     ModBlocks.STRIPPED_GREEN_NAN_LOG.get().asItem(),
                     ModBlocks.GREEN_NAN_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_GREEN_NAN_WOOD.get().asItem(),

                     ModBlocks.SAKU_MAPLE_LOG.get().asItem(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get().asItem(),
                     ModBlocks.SAKU_MAPLE_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get().asItem(),

                     ModBlocks.FLAMING_LOG.get().asItem(),
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

                     ModBlocks.PALE_WIND_LOG.get().asItem(),
                     ModBlocks.STRIPPED_PALE_WIND_LOG.get().asItem(),
                     ModBlocks.PALE_WIND_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_PALE_WIND_WOOD.get().asItem(),

                     ModBlocks.THUNDER_LOG.get().asItem(),
                     ModBlocks.STRIPPED_THUNDER_LOG.get().asItem(),
                     ModBlocks.THUNDER_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_THUNDER_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.BIJUE_RAW_PLANKS.get().asItem(),

                     ModBlocks.GREEN_NAN_PLANKS.get().asItem(),

                     ModBlocks.SAKU_MAPLE_PLANKS.get().asItem(),

                     ModBlocks.FLAMING_PLANKS.get().asItem(),

                     ModBlocks.LOAM_PLANKS.get().asItem(),

                     ModBlocks.CAST_GOLD_PLANKS.get().asItem(),

                     ModBlocks.CONDENSED_WATER_PLANKS.get().asItem(),

                     ModBlocks.PALE_WIND_PLANKS.get().asItem(),

                     ModBlocks.THUNDER_PLANKS.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(ModBlocks.BIJUE_RAW_LEAVES.get().asItem(),

                     ModBlocks.GREEN_NAN_LEAVES.get().asItem(),

                     ModBlocks.SAKU_MAPLE_LEAVES.get().asItem(),

                     ModBlocks.FLAMING_LEAVES.get().asItem(),

                     ModBlocks.LOAM_LEAVES.get().asItem(),

                     ModBlocks.CAST_GOLD_LEAVES.get().asItem(),

                     ModBlocks.CONDENSED_WATER_LEAVES.get().asItem(),

                     ModBlocks.PALE_WIND_LEAVES.get().asItem(),

                     ModBlocks.THUNDER_LEAVES.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_LEAVES.get().asItem());

        this.tag(ItemTags.STAIRS)
                .add(ModBlocks.BIJUE_RAW_STAIRS.get().asItem(),

                     ModBlocks.GREEN_NAN_STAIRS.get().asItem(),

                     ModBlocks.SAKU_MAPLE_STAIRS.get().asItem(),

                     ModBlocks.FLAMING_STAIRS.get().asItem(),

                     ModBlocks.LOAM_STAIRS.get().asItem(),

                     ModBlocks.CAST_GOLD_STAIRS.get().asItem(),

                     ModBlocks.CONDENSED_WATER_STAIRS.get().asItem(),

                     ModBlocks.PALE_WIND_STAIRS.get().asItem(),

                     ModBlocks.THUNDER_STAIRS.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_STAIRS.get().asItem());

        this.tag(ItemTags.SLABS)
                .add(ModBlocks.BIJUE_RAW_SLAB.get().asItem(),

                     ModBlocks.GREEN_NAN_SLAB.get().asItem(),

                     ModBlocks.SAKU_MAPLE_SLAB.get().asItem(),

                     ModBlocks.FLAMING_SLAB.get().asItem(),

                     ModBlocks.LOAM_SLAB.get().asItem(),

                     ModBlocks.CAST_GOLD_SLAB.get().asItem(),

                     ModBlocks.CONDENSED_WATER_SLAB.get().asItem(),

                     ModBlocks.PALE_WIND_SLAB.get().asItem(),

                     ModBlocks.THUNDER_SLAB.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_SLAB.get().asItem());

        this.tag(ItemTags.FENCES)
                .add(ModBlocks.BIJUE_RAW_FENCE.get().asItem(),

                     ModBlocks.GREEN_NAN_FENCE.get().asItem(),

                     ModBlocks.SAKU_MAPLE_FENCE.get().asItem(),

                     ModBlocks.FLAMING_FENCE.get().asItem(),

                     ModBlocks.LOAM_FENCE.get().asItem(),

                     ModBlocks.CAST_GOLD_FENCE.get().asItem(),

                     ModBlocks.CONDENSED_WATER_FENCE.get().asItem(),

                     ModBlocks.PALE_WIND_FENCE.get().asItem(),

                     ModBlocks.THUNDER_FENCE.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_FENCE.get().asItem());

        this.tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.BIJUE_RAW_FENCE_GATE.get().asItem(),

                     ModBlocks.GREEN_NAN_FENCE_GATE.get().asItem(),

                     ModBlocks.SAKU_MAPLE_FENCE_GATE.get().asItem(),

                     ModBlocks.FLAMING_FENCE_GATE.get().asItem(),

                     ModBlocks.LOAM_FENCE_GATE.get().asItem(),

                     ModBlocks.CAST_GOLD_FENCE_GATE.get().asItem(),

                     ModBlocks.CONDENSED_WATER_FENCE_GATE.get().asItem(),

                     ModBlocks.PALE_WIND_FENCE_GATE.get().asItem(),

                     ModBlocks.THUNDER_FENCE_GATE.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get().asItem());

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.GREEN_NAN_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.FLAMING_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.LOAM_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.CAST_GOLD_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.PALE_WIND_PRESSURE_PLATE.get().asItem(),

                     ModBlocks.THUNDER_PRESSURE_PLATE.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get().asItem());

        this.tag(ItemTags.BUTTONS)
                .add(ModBlocks.BIJUE_RAW_BUTTON.get().asItem(),

                     ModBlocks.GREEN_NAN_BUTTON.get().asItem(),

                     ModBlocks.SAKU_MAPLE_BUTTON.get().asItem(),

                     ModBlocks.FLAMING_BUTTON.get().asItem(),

                     ModBlocks.LOAM_BUTTON.get().asItem(),

                     ModBlocks.CAST_GOLD_BUTTON.get().asItem(),

                     ModBlocks.CONDENSED_WATER_BUTTON.get().asItem(),

                     ModBlocks.PALE_WIND_BUTTON.get().asItem(),

                     ModBlocks.THUNDER_BUTTON.get().asItem(),

                     ModFireResistantBlocks.IMMORTAL_BUTTON.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BIJUE_RAW_LOG.get().asItem(),
                     ModBlocks.STRIPPED_BIJUE_RAW_LOG.get().asItem(),
                     ModBlocks.BIJUE_RAW_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get().asItem(),
                     ModBlocks.BIJUE_RAW_PLANKS.get().asItem(),
                     ModBlocks.BIJUE_RAW_LEAVES.get().asItem(),
                     ModBlocks.BIJUE_RAW_STAIRS.get().asItem(),
                     ModBlocks.BIJUE_RAW_SLAB.get().asItem(),
                     ModBlocks.BIJUE_RAW_FENCE.get().asItem(),
                     ModBlocks.BIJUE_RAW_FENCE_GATE.get().asItem(),
                     ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.BIJUE_RAW_BUTTON.get().asItem(),

                     ModBlocks.GREEN_NAN_LOG.get().asItem(),
                     ModBlocks.STRIPPED_GREEN_NAN_LOG.get().asItem(),
                     ModBlocks.GREEN_NAN_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_GREEN_NAN_WOOD.get().asItem(),
                     ModBlocks.GREEN_NAN_PLANKS.get().asItem(),
                     ModBlocks.GREEN_NAN_LEAVES.get().asItem(),
                     ModBlocks.GREEN_NAN_STAIRS.get().asItem(),
                     ModBlocks.GREEN_NAN_SLAB.get().asItem(),
                     ModBlocks.GREEN_NAN_FENCE.get().asItem(),
                     ModBlocks.GREEN_NAN_FENCE_GATE.get().asItem(),
                     ModBlocks.GREEN_NAN_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.GREEN_NAN_BUTTON.get().asItem(),

                     ModBlocks.SAKU_MAPLE_LOG.get().asItem(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get().asItem(),
                     ModBlocks.SAKU_MAPLE_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_SAKU_MAPLE_WOOD.get().asItem(),
                     ModBlocks.SAKU_MAPLE_PLANKS.get().asItem(),
                     ModBlocks.SAKU_MAPLE_LEAVES.get().asItem(),
                     ModBlocks.SAKU_MAPLE_STAIRS.get().asItem(),
                     ModBlocks.SAKU_MAPLE_SLAB.get().asItem(),
                     ModBlocks.SAKU_MAPLE_FENCE.get().asItem(),
                     ModBlocks.SAKU_MAPLE_FENCE_GATE.get().asItem(),
                     ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.SAKU_MAPLE_BUTTON.get().asItem(),

                     ModBlocks.FLAMING_LOG.get().asItem(),
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
                     ModBlocks.CONDENSED_WATER_BUTTON.get().asItem(),

                     ModBlocks.PALE_WIND_LOG.get().asItem(),
                     ModBlocks.STRIPPED_PALE_WIND_LOG.get().asItem(),
                     ModBlocks.PALE_WIND_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_PALE_WIND_WOOD.get().asItem(),
                     ModBlocks.PALE_WIND_PLANKS.get().asItem(),
                     ModBlocks.PALE_WIND_LEAVES.get().asItem(),
                     ModBlocks.PALE_WIND_STAIRS.get().asItem(),
                     ModBlocks.PALE_WIND_SLAB.get().asItem(),
                     ModBlocks.PALE_WIND_FENCE.get().asItem(),
                     ModBlocks.PALE_WIND_FENCE_GATE.get().asItem(),
                     ModBlocks.PALE_WIND_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.PALE_WIND_BUTTON.get().asItem(),

                     ModBlocks.THUNDER_LOG.get().asItem(),
                     ModBlocks.STRIPPED_THUNDER_LOG.get().asItem(),
                     ModBlocks.THUNDER_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_THUNDER_WOOD.get().asItem(),
                     ModBlocks.THUNDER_PLANKS.get().asItem(),
                     ModBlocks.THUNDER_LEAVES.get().asItem(),
                     ModBlocks.THUNDER_STAIRS.get().asItem(),
                     ModBlocks.THUNDER_SLAB.get().asItem(),
                     ModBlocks.THUNDER_FENCE.get().asItem(),
                     ModBlocks.THUNDER_FENCE_GATE.get().asItem(),
                     ModBlocks.THUNDER_PRESSURE_PLATE.get().asItem(),
                     ModBlocks.THUNDER_BUTTON.get().asItem());
    }
}