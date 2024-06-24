package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, ImmortalContinent.MOD_ID, exFileHelper);
    }

    // 方块状态生成
    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.WOODEN_AGGLUTINATE);

        logBlock(((RotatedPillarBlock) ModBlocks.CAST_GOLD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CAST_GOLD_WOOD.get()), blockTexture(ModBlocks.CAST_GOLD_LOG.get()), blockTexture(ModBlocks.CAST_GOLD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CAST_GOLD_LOG.get()), blockTexture(ModBlocks.STRIPPED_CAST_GOLD_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_cast_gold_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CAST_GOLD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CAST_GOLD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CAST_GOLD_LOG.get()));
        blockItem(ModBlocks.CAST_GOLD_LOG);
        blockItem(ModBlocks.CAST_GOLD_WOOD);
        blockItem(ModBlocks.STRIPPED_CAST_GOLD_LOG);
        blockItem(ModBlocks.STRIPPED_CAST_GOLD_WOOD);
        blockWithItem(ModBlocks.CAST_GOLD_PLANKS);
        leavesBlock(ModBlocks.CAST_GOLD_LEAVES);

        logBlock(((RotatedPillarBlock) ModFireResistantBlocks.IMMORTAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModFireResistantBlocks.IMMORTAL_WOOD.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_LOG.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()), blockTexture(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_immortal_log_top"));
        axisBlock(((RotatedPillarBlock) ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get()), blockTexture(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()),
                blockTexture(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()));
        blockItem(ModFireResistantBlocks.IMMORTAL_LOG);
        blockItem(ModFireResistantBlocks.IMMORTAL_WOOD);
        blockItem(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG);
        blockItem(ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD);
        blockWithItem(ModFireResistantBlocks.IMMORTAL_PLANKS);
        leavesBlock(ModFireResistantBlocks.IMMORTAL_LEAVES);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(ImmortalContinent.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}