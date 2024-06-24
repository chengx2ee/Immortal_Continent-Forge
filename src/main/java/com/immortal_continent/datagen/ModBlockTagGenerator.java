package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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
                     ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.CAST_GOLD_PLANKS.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.CAST_GOLD_LEAVES.get(),
                     ModFireResistantBlocks.IMMORTAL_LEAVES.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),
                     ModBlocks.CAST_GOLD_PLANKS.get(),
                     ModBlocks.CAST_GOLD_LEAVES.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CAST_GOLD_LOG.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_LOG.get(),
                     ModBlocks.CAST_GOLD_WOOD.get(),
                     ModBlocks.STRIPPED_CAST_GOLD_WOOD.get(),
                     ModBlocks.CAST_GOLD_PLANKS.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.WOODEN_AGGLUTINATE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModFireResistantBlocks.IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get(),
                     ModFireResistantBlocks.IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get(),
                     ModFireResistantBlocks.IMMORTAL_PLANKS.get());

    }
}