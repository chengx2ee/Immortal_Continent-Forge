package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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
        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.CAST_GOLD_PLANKS.get().asItem(),

                     ModBlocks.CONDENSED_WATER_PLANKS.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CAST_GOLD_LOG.get().asItem(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get().asItem(),
                     ModBlocks.CAST_GOLD_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get().asItem(),
                     ModBlocks.CAST_GOLD_PLANKS.get().asItem(),
                     ModBlocks.CAST_GOLD_LEAVES.get().asItem(),

                     ModBlocks.CONDENSED_WATER_LOG.get().asItem(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get().asItem(),
                     ModBlocks.CONDENSED_WATER_WOOD.get().asItem(),
                     ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get().asItem(),
                     ModBlocks.CONDENSED_WATER_PLANKS.get().asItem(),
                     ModBlocks.CONDENSED_WATER_LEAVES.get().asItem());
    }
}