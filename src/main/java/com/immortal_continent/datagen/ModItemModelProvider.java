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

        ordinaryBlockVariantItem(ModBlocks.CAST_GOLD_STAIRS);
        ordinaryBlockVariantItem(ModBlocks.CAST_GOLD_SLAB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ImmortalContinent.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void ordinaryBlockVariantItem(RegistryObject<Block> block)
    {
        this.withExistingParent(ImmortalContinent.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}