package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
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

        logBlock(((RotatedPillarBlock) ModBlocks.BIJUE_RAW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BIJUE_RAW_WOOD.get()), blockTexture(ModBlocks.BIJUE_RAW_LOG.get()), blockTexture(ModBlocks.BIJUE_RAW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()), blockTexture(ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_bijue_raw_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BIJUE_RAW_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()));
        blockItem(ModBlocks.BIJUE_RAW_LOG);
        blockItem(ModBlocks.BIJUE_RAW_WOOD);
        blockItem(ModBlocks.STRIPPED_BIJUE_RAW_LOG);
        blockItem(ModBlocks.STRIPPED_BIJUE_RAW_WOOD);
        blockWithItem(ModBlocks.BIJUE_RAW_PLANKS);
        leavesBlock(ModBlocks.BIJUE_RAW_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.BIJUE_RAW_STAIRS.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.BIJUE_RAW_SLAB.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.BIJUE_RAW_FENCE.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.BIJUE_RAW_FENCE_GATE.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.BIJUE_RAW_BUTTON.get()), blockTexture(ModBlocks.BIJUE_RAW_PLANKS.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_NAN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GREEN_NAN_WOOD.get()), blockTexture(ModBlocks.GREEN_NAN_LOG.get()), blockTexture(ModBlocks.GREEN_NAN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_NAN_LOG.get()), blockTexture(ModBlocks.STRIPPED_GREEN_NAN_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_green_nan_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_NAN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GREEN_NAN_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_GREEN_NAN_LOG.get()));
        blockItem(ModBlocks.GREEN_NAN_LOG);
        blockItem(ModBlocks.GREEN_NAN_WOOD);
        blockItem(ModBlocks.STRIPPED_GREEN_NAN_LOG);
        blockItem(ModBlocks.STRIPPED_GREEN_NAN_WOOD);
        blockWithItem(ModBlocks.GREEN_NAN_PLANKS);
        leavesBlock(ModBlocks.GREEN_NAN_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.GREEN_NAN_STAIRS.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GREEN_NAN_SLAB.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.GREEN_NAN_FENCE.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GREEN_NAN_FENCE_GATE.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GREEN_NAN_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GREEN_NAN_BUTTON.get()), blockTexture(ModBlocks.GREEN_NAN_PLANKS.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.FLAMING_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FLAMING_WOOD.get()), blockTexture(ModBlocks.FLAMING_LOG.get()), blockTexture(ModBlocks.FLAMING_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FLAMING_LOG.get()), blockTexture(ModBlocks.STRIPPED_FLAMING_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_flaming_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FLAMING_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FLAMING_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FLAMING_LOG.get()));
        blockItem(ModBlocks.FLAMING_LOG);
        blockItem(ModBlocks.FLAMING_WOOD);
        blockItem(ModBlocks.STRIPPED_FLAMING_LOG);
        blockItem(ModBlocks.STRIPPED_FLAMING_WOOD);
        blockWithItem(ModBlocks.FLAMING_PLANKS);
        leavesBlock(ModBlocks.FLAMING_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.FLAMING_STAIRS.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FLAMING_SLAB.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.FLAMING_FENCE.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FLAMING_FENCE_GATE.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FLAMING_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.FLAMING_BUTTON.get()), blockTexture(ModBlocks.FLAMING_PLANKS.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.LOAM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LOAM_WOOD.get()), blockTexture(ModBlocks.LOAM_LOG.get()), blockTexture(ModBlocks.LOAM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LOAM_LOG.get()), blockTexture(ModBlocks.STRIPPED_LOAM_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_loam_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LOAM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LOAM_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_LOAM_LOG.get()));
        blockItem(ModBlocks.LOAM_LOG);
        blockItem(ModBlocks.LOAM_WOOD);
        blockItem(ModBlocks.STRIPPED_LOAM_LOG);
        blockItem(ModBlocks.STRIPPED_LOAM_WOOD);
        blockWithItem(ModBlocks.LOAM_PLANKS);
        leavesBlock(ModBlocks.LOAM_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.LOAM_STAIRS.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.LOAM_SLAB.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.LOAM_FENCE.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LOAM_FENCE_GATE.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.LOAM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.LOAM_BUTTON.get()), blockTexture(ModBlocks.LOAM_PLANKS.get()));

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
        stairsBlock(((StairBlock) ModBlocks.CAST_GOLD_STAIRS.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CAST_GOLD_SLAB.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CAST_GOLD_FENCE.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CAST_GOLD_FENCE_GATE.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CAST_GOLD_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CAST_GOLD_BUTTON.get()), blockTexture(ModBlocks.CAST_GOLD_PLANKS.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.CONDENSED_WATER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CONDENSED_WATER_WOOD.get()), blockTexture(ModBlocks.CONDENSED_WATER_LOG.get()), blockTexture(ModBlocks.CONDENSED_WATER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()), blockTexture(ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()),
                new ResourceLocation(ImmortalContinent.MOD_ID, "block/stripped_condensed_water_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CONDENSED_WATER_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()));
        blockItem(ModBlocks.CONDENSED_WATER_LOG);
        blockItem(ModBlocks.CONDENSED_WATER_WOOD);
        blockItem(ModBlocks.STRIPPED_CONDENSED_WATER_LOG);
        blockItem(ModBlocks.STRIPPED_CONDENSED_WATER_WOOD);
        blockWithItem(ModBlocks.CONDENSED_WATER_PLANKS);
        leavesBlock(ModBlocks.CONDENSED_WATER_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.CONDENSED_WATER_STAIRS.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CONDENSED_WATER_SLAB.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CONDENSED_WATER_FENCE.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CONDENSED_WATER_FENCE_GATE.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CONDENSED_WATER_BUTTON.get()), blockTexture(ModBlocks.CONDENSED_WATER_PLANKS.get()));

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
        stairsBlock(((StairBlock) ModFireResistantBlocks.IMMORTAL_STAIRS.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()));
        slabBlock(((SlabBlock) ModFireResistantBlocks.IMMORTAL_SLAB.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()));
        fenceBlock(((FenceBlock) ModFireResistantBlocks.IMMORTAL_FENCE.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModFireResistantBlocks.IMMORTAL_BUTTON.get()), blockTexture(ModFireResistantBlocks.IMMORTAL_PLANKS.get()));
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