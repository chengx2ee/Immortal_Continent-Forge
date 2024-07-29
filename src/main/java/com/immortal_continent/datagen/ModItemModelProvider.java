package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.item.ModItems;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, ImmortalContinent.MOD_ID, existingFileHelper);
    }

    // 物品模型生成
    @Override
    protected void registerModels()
    {
        simpleItem(ModItems.WOODEN_HEART);

        ordinaryBlockVariantItem(ModBlocks.FLAMING_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.FLAMING_SLAB);
        fenceItem(ModBlocks.FLAMING_FENCE, ModBlocks.FLAMING_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.FLAMING_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.FLAMING_PRESSURE_PLATE);
        buttonItem(ModBlocks.FLAMING_BUTTON, ModBlocks.FLAMING_PLANKS);

        ordinaryBlockVariantItem(ModBlocks.LOAM_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.LOAM_SLAB);
        fenceItem(ModBlocks.LOAM_FENCE, ModBlocks.LOAM_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.LOAM_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.LOAM_PRESSURE_PLATE);
        buttonItem(ModBlocks.LOAM_BUTTON, ModBlocks.LOAM_PLANKS);

        ordinaryBlockVariantItem(ModBlocks.CAST_GOLD_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.CAST_GOLD_SLAB);
        fenceItem(ModBlocks.CAST_GOLD_FENCE, ModBlocks.CAST_GOLD_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.CAST_GOLD_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.CAST_GOLD_PRESSURE_PLATE);
        buttonItem(ModBlocks.CAST_GOLD_BUTTON, ModBlocks.CAST_GOLD_PLANKS);

        ordinaryBlockVariantItem(ModBlocks.CONDENSED_WATER_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.CONDENSED_WATER_SLAB);
        fenceItem(ModBlocks.CONDENSED_WATER_FENCE, ModBlocks.CONDENSED_WATER_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.CONDENSED_WATER_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.CONDENSED_WATER_PRESSURE_PLATE);
        buttonItem(ModBlocks.CONDENSED_WATER_BUTTON, ModBlocks.CONDENSED_WATER_PLANKS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ImmortalContinent.MOD_ID,"item/" + item.getId().getPath()));
    }

    // 楼梯、台阶、栅栏门与压力板
    public void ordinaryBlockVariantItem(RegistryObject<Block> block)
    {
        this.withExistingParent(ImmortalContinent.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock)
    {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ImmortalContinent.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock)
    {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ImmortalContinent.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

}