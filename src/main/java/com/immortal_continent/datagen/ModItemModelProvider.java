package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
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

        ordinaryBlockVariantItem(ModBlocks.BIJUE_RAW_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.BIJUE_RAW_SLAB);
        fenceItem(ModBlocks.BIJUE_RAW_FENCE, ModBlocks.BIJUE_RAW_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.BIJUE_RAW_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.BIJUE_RAW_PRESSURE_PLATE);
        buttonItem(ModBlocks.BIJUE_RAW_BUTTON, ModBlocks.BIJUE_RAW_PLANKS);

        ordinaryBlockVariantItem(ModBlocks.GREEN_NAN_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.GREEN_NAN_SLAB);
        fenceItem(ModBlocks.GREEN_NAN_FENCE, ModBlocks.GREEN_NAN_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.GREEN_NAN_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.GREEN_NAN_PRESSURE_PLATE);
        buttonItem(ModBlocks.GREEN_NAN_BUTTON, ModBlocks.GREEN_NAN_PLANKS);

        ordinaryBlockVariantItem(ModBlocks.SAKU_MAPLE_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.SAKU_MAPLE_SLAB);
        fenceItem(ModBlocks.SAKU_MAPLE_FENCE, ModBlocks.SAKU_MAPLE_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.SAKU_MAPLE_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.SAKU_MAPLE_PRESSURE_PLATE);
        buttonItem(ModBlocks.SAKU_MAPLE_BUTTON, ModBlocks.SAKU_MAPLE_PLANKS);

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

        ordinaryBlockVariantItem(ModBlocks.PALE_WIND_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.PALE_WIND_SLAB);
        fenceItem(ModBlocks.PALE_WIND_FENCE, ModBlocks.PALE_WIND_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.PALE_WIND_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.PALE_WIND_PRESSURE_PLATE);
        buttonItem(ModBlocks.PALE_WIND_BUTTON, ModBlocks.PALE_WIND_PLANKS);

        ordinaryBlockVariantItem(ModBlocks.THUNDER_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.THUNDER_SLAB);
        fenceItem(ModBlocks.THUNDER_FENCE, ModBlocks.THUNDER_PLANKS);
        ordinaryBlockVariantItem(ModBlocks.THUNDER_FENCE_GATE);
        ordinaryBlockVariantItem(ModBlocks.THUNDER_PRESSURE_PLATE);
        buttonItem(ModBlocks.THUNDER_BUTTON, ModBlocks.THUNDER_PLANKS);

        ordinaryBlockVariantItem(ModFireResistantBlocks.IMMORTAL_STAIRS);
        ordinaryBlockVariantItem(ModFireResistantBlocks.IMMORTAL_SLAB);
        fenceItem(ModFireResistantBlocks.IMMORTAL_FENCE, ModFireResistantBlocks.IMMORTAL_PLANKS);
        ordinaryBlockVariantItem(ModFireResistantBlocks.IMMORTAL_FENCE_GATE);
        ordinaryBlockVariantItem(ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE);
        buttonItem(ModFireResistantBlocks.IMMORTAL_BUTTON, ModFireResistantBlocks.IMMORTAL_PLANKS);
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