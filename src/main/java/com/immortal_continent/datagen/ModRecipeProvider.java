package com.immortal_continent.datagen;

import com.immortal_continent.block.ModBlocks;
import com.immortal_continent.block.ModFireResistantBlocks;
import com.immortal_continent.item.ModItems;
import com.immortal_continent.world.ImmortalContinent;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    // 配方生成
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of();

    public ModRecipeProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter)
    {
        // 以下为原版配方
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("111")
                .pattern("121")
                .pattern("111")
                .define('1', Items.GOLD_BLOCK)
                .define('2', Items.APPLE)
                .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE), has(Items.ENCHANTED_GOLDEN_APPLE))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.GOLD_BLOCK), has(Items.GOLD_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TRIDENT)
                .pattern("111")
                .pattern("212")
                .pattern(" 1 ")
                .define('1', Items.IRON_INGOT)
                .define('2', Items.NAUTILUS_SHELL)
                .unlockedBy(getHasName(Items.TRIDENT), has(Items.TRIDENT))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SADDLE)
                .pattern("111")
                .pattern("121")
                .pattern("2 2")
                .define('1', Items.LEATHER)
                .define('2', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.SADDLE), has(Items.SADDLE))
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.IRON_HORSE_ARMOR)
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_HORSE_ARMOR), has(Items.IRON_HORSE_ARMOR))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GOLDEN_HORSE_ARMOR)
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLDEN_HORSE_ARMOR), has(Items.GOLDEN_HORSE_ARMOR))
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND_HORSE_ARMOR)
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND_HORSE_ARMOR), has(Items.DIAMOND_HORSE_ARMOR))
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LEATHER_HORSE_ARMOR)
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', Items.LEATHER)
                .unlockedBy(getHasName(Items.LEATHER_HORSE_ARMOR), has(Items.LEATHER_HORSE_ARMOR))
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_HELMET)
                .pattern("111")
                .pattern("1 1")
                .define('1', Items.CHAIN)
                .unlockedBy(getHasName(Items.CHAINMAIL_HELMET), has(Items.CHAINMAIL_HELMET))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_CHESTPLATE)
                .pattern("1 1")
                .pattern("111")
                .pattern("111")
                .define('1', Items.CHAIN)
                .unlockedBy(getHasName(Items.CHAINMAIL_CHESTPLATE), has(Items.CHAINMAIL_CHESTPLATE))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_LEGGINGS)
                .pattern("111")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', Items.CHAIN)
                .unlockedBy(getHasName(Items.CHAINMAIL_LEGGINGS), has(Items.CHAINMAIL_LEGGINGS))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_BOOTS)
                .pattern("1 1")
                .pattern("1 1")
                .define('1', Items.CHAIN)
                .unlockedBy(getHasName(Items.CHAINMAIL_BOOTS), has(Items.CHAINMAIL_BOOTS))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        // 以下为模组配方

        //碧玦树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.BIJUE_RAW_LOG.get(), ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_LOG.get()), has(ModBlocks.BIJUE_RAW_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()), has(ModBlocks.STRIPPED_BIJUE_RAW_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.BIJUE_RAW_LOG.get())
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_WOOD.get()), has(ModBlocks.BIJUE_RAW_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_LOG.get()), has(ModBlocks.BIJUE_RAW_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.BIJUE_RAW_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_STAIRS.get()), has(ModBlocks.BIJUE_RAW_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.BIJUE_RAW_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_SLAB.get()), has(ModBlocks.BIJUE_RAW_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.BIJUE_RAW_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_FENCE.get()), has(ModBlocks.BIJUE_RAW_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.BIJUE_RAW_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_FENCE_GATE.get()), has(ModBlocks.BIJUE_RAW_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.BIJUE_RAW_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get()), has(ModBlocks.BIJUE_RAW_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BIJUE_RAW_BUTTON.get())
                .requires(ModBlocks.BIJUE_RAW_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_BUTTON.get()), has(ModBlocks.BIJUE_RAW_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.BIJUE_RAW_PLANKS.get()), has(ModBlocks.BIJUE_RAW_PLANKS.get()))
                .save(pWriter);

        //青楠树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_NAN_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.GREEN_NAN_LOG.get(), ModBlocks.STRIPPED_GREEN_NAN_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_LOG.get()), has(ModBlocks.GREEN_NAN_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_GREEN_NAN_LOG.get()), has(ModBlocks.STRIPPED_GREEN_NAN_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_NAN_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.GREEN_NAN_LOG.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_WOOD.get()), has(ModBlocks.GREEN_NAN_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_LOG.get()), has(ModBlocks.GREEN_NAN_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_NAN_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.GREEN_NAN_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_STAIRS.get()), has(ModBlocks.GREEN_NAN_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_NAN_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.GREEN_NAN_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_SLAB.get()), has(ModBlocks.GREEN_NAN_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_NAN_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.GREEN_NAN_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_FENCE.get()), has(ModBlocks.GREEN_NAN_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_NAN_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.GREEN_NAN_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_FENCE_GATE.get()), has(ModBlocks.GREEN_NAN_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_NAN_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.GREEN_NAN_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PRESSURE_PLATE.get()), has(ModBlocks.GREEN_NAN_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_NAN_BUTTON.get())
                .requires(ModBlocks.GREEN_NAN_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_BUTTON.get()), has(ModBlocks.GREEN_NAN_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.GREEN_NAN_PLANKS.get()), has(ModBlocks.GREEN_NAN_PLANKS.get()))
                .save(pWriter);

        //朔枫树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.SAKU_MAPLE_LOG.get(), ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_LOG.get()), has(ModBlocks.SAKU_MAPLE_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get()), has(ModBlocks.STRIPPED_SAKU_MAPLE_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.SAKU_MAPLE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_WOOD.get()), has(ModBlocks.SAKU_MAPLE_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_LOG.get()), has(ModBlocks.SAKU_MAPLE_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.SAKU_MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_STAIRS.get()), has(ModBlocks.SAKU_MAPLE_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.SAKU_MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_SLAB.get()), has(ModBlocks.SAKU_MAPLE_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.SAKU_MAPLE_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_FENCE.get()), has(ModBlocks.SAKU_MAPLE_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.SAKU_MAPLE_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_FENCE_GATE.get()), has(ModBlocks.SAKU_MAPLE_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.SAKU_MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get()), has(ModBlocks.SAKU_MAPLE_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SAKU_MAPLE_BUTTON.get())
                .requires(ModBlocks.SAKU_MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_BUTTON.get()), has(ModBlocks.SAKU_MAPLE_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.SAKU_MAPLE_PLANKS.get()), has(ModBlocks.SAKU_MAPLE_PLANKS.get()))
                .save(pWriter);

        //炽焰树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FLAMING_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.FLAMING_LOG.get(), ModBlocks.STRIPPED_FLAMING_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_LOG.get()), has(ModBlocks.FLAMING_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_FLAMING_LOG.get()), has(ModBlocks.STRIPPED_FLAMING_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLAMING_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.FLAMING_LOG.get())
                .unlockedBy(getHasName(ModBlocks.FLAMING_WOOD.get()), has(ModBlocks.FLAMING_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_LOG.get()), has(ModBlocks.FLAMING_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLAMING_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.FLAMING_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FLAMING_STAIRS.get()), has(ModBlocks.FLAMING_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLAMING_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.FLAMING_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FLAMING_SLAB.get()), has(ModBlocks.FLAMING_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLAMING_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.FLAMING_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.FLAMING_FENCE.get()), has(ModBlocks.FLAMING_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLAMING_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.FLAMING_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.FLAMING_FENCE_GATE.get()), has(ModBlocks.FLAMING_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLAMING_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.FLAMING_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FLAMING_PRESSURE_PLATE.get()), has(ModBlocks.FLAMING_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FLAMING_BUTTON.get())
                .requires(ModBlocks.FLAMING_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FLAMING_BUTTON.get()), has(ModBlocks.FLAMING_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.FLAMING_PLANKS.get()), has(ModBlocks.FLAMING_PLANKS.get()))
                .save(pWriter);

        //壤土树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LOAM_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.LOAM_LOG.get(), ModBlocks.STRIPPED_LOAM_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_LOG.get()), has(ModBlocks.LOAM_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_LOAM_LOG.get()), has(ModBlocks.STRIPPED_LOAM_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOAM_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.LOAM_LOG.get())
                .unlockedBy(getHasName(ModBlocks.LOAM_WOOD.get()), has(ModBlocks.LOAM_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_LOG.get()), has(ModBlocks.LOAM_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOAM_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.LOAM_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.LOAM_STAIRS.get()), has(ModBlocks.LOAM_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOAM_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.LOAM_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.LOAM_SLAB.get()), has(ModBlocks.LOAM_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOAM_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.LOAM_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.LOAM_FENCE.get()), has(ModBlocks.LOAM_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOAM_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.LOAM_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.LOAM_FENCE_GATE.get()), has(ModBlocks.LOAM_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOAM_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.LOAM_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.LOAM_PRESSURE_PLATE.get()), has(ModBlocks.LOAM_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LOAM_BUTTON.get())
                .requires(ModBlocks.LOAM_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.LOAM_BUTTON.get()), has(ModBlocks.LOAM_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.LOAM_PLANKS.get()), has(ModBlocks.LOAM_PLANKS.get()))
                .save(pWriter);

        //铸金树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CAST_GOLD_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.CAST_GOLD_LOG.get(), ModBlocks.STRIPPED_CAST_GOLD_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_LOG.get()), has(ModBlocks.CAST_GOLD_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_CAST_GOLD_LOG.get()), has(ModBlocks.STRIPPED_CAST_GOLD_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_GOLD_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.CAST_GOLD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_WOOD.get()), has(ModBlocks.CAST_GOLD_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_LOG.get()), has(ModBlocks.CAST_GOLD_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_GOLD_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.CAST_GOLD_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_STAIRS.get()), has(ModBlocks.CAST_GOLD_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_GOLD_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.CAST_GOLD_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_SLAB.get()), has(ModBlocks.CAST_GOLD_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_GOLD_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.CAST_GOLD_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_FENCE.get()), has(ModBlocks.CAST_GOLD_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_GOLD_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.CAST_GOLD_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_FENCE_GATE.get()), has(ModBlocks.CAST_GOLD_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_GOLD_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.CAST_GOLD_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PRESSURE_PLATE.get()), has(ModBlocks.CAST_GOLD_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CAST_GOLD_BUTTON.get())
                .requires(ModBlocks.CAST_GOLD_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_BUTTON.get()), has(ModBlocks.CAST_GOLD_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.CAST_GOLD_PLANKS.get()), has(ModBlocks.CAST_GOLD_PLANKS.get()))
                .save(pWriter);

        //凝水树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.CONDENSED_WATER_LOG.get(), ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_LOG.get()), has(ModBlocks.CONDENSED_WATER_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()), has(ModBlocks.STRIPPED_CONDENSED_WATER_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.CONDENSED_WATER_LOG.get())
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_WOOD.get()), has(ModBlocks.CONDENSED_WATER_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_LOG.get()), has(ModBlocks.CONDENSED_WATER_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.CONDENSED_WATER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_STAIRS.get()), has(ModBlocks.CONDENSED_WATER_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.CONDENSED_WATER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_SLAB.get()), has(ModBlocks.CONDENSED_WATER_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.CONDENSED_WATER_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_FENCE.get()), has(ModBlocks.CONDENSED_WATER_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.CONDENSED_WATER_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_FENCE_GATE.get()), has(ModBlocks.CONDENSED_WATER_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.CONDENSED_WATER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get()), has(ModBlocks.CONDENSED_WATER_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CONDENSED_WATER_BUTTON.get())
                .requires(ModBlocks.CONDENSED_WATER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_BUTTON.get()), has(ModBlocks.CONDENSED_WATER_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.CONDENSED_WATER_PLANKS.get()), has(ModBlocks.CONDENSED_WATER_PLANKS.get()))
                .save(pWriter);

        //苍风树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PALE_WIND_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.PALE_WIND_LOG.get(), ModBlocks.STRIPPED_PALE_WIND_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_LOG.get()), has(ModBlocks.PALE_WIND_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_PALE_WIND_LOG.get()), has(ModBlocks.STRIPPED_PALE_WIND_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALE_WIND_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.PALE_WIND_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_WOOD.get()), has(ModBlocks.PALE_WIND_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_LOG.get()), has(ModBlocks.PALE_WIND_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALE_WIND_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.PALE_WIND_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_STAIRS.get()), has(ModBlocks.PALE_WIND_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALE_WIND_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.PALE_WIND_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_SLAB.get()), has(ModBlocks.PALE_WIND_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALE_WIND_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.PALE_WIND_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_FENCE.get()), has(ModBlocks.PALE_WIND_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALE_WIND_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.PALE_WIND_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_FENCE_GATE.get()), has(ModBlocks.PALE_WIND_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALE_WIND_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.PALE_WIND_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PRESSURE_PLATE.get()), has(ModBlocks.PALE_WIND_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PALE_WIND_BUTTON.get())
                .requires(ModBlocks.PALE_WIND_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_BUTTON.get()), has(ModBlocks.PALE_WIND_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.PALE_WIND_PLANKS.get()), has(ModBlocks.PALE_WIND_PLANKS.get()))
                .save(pWriter);

        //雷霆树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.THUNDER_PLANKS.get(), 4)
                .requires(Ingredient.of(ModBlocks.THUNDER_LOG.get(), ModBlocks.STRIPPED_THUNDER_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_LOG.get()), has(ModBlocks.THUNDER_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.STRIPPED_THUNDER_LOG.get()), has(ModBlocks.STRIPPED_THUNDER_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THUNDER_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModBlocks.THUNDER_LOG.get())
                .unlockedBy(getHasName(ModBlocks.THUNDER_WOOD.get()), has(ModBlocks.THUNDER_WOOD.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_LOG.get()), has(ModBlocks.THUNDER_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THUNDER_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModBlocks.THUNDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.THUNDER_STAIRS.get()), has(ModBlocks.THUNDER_STAIRS.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THUNDER_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModBlocks.THUNDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.THUNDER_SLAB.get()), has(ModBlocks.THUNDER_SLAB.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THUNDER_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModBlocks.THUNDER_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.THUNDER_FENCE.get()), has(ModBlocks.THUNDER_FENCE.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THUNDER_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModBlocks.THUNDER_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.THUNDER_FENCE_GATE.get()), has(ModBlocks.THUNDER_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THUNDER_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModBlocks.THUNDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.THUNDER_PRESSURE_PLATE.get()), has(ModBlocks.THUNDER_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.THUNDER_BUTTON.get())
                .requires(ModBlocks.THUNDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.THUNDER_BUTTON.get()), has(ModBlocks.THUNDER_BUTTON.get()))
                .unlockedBy(getHasName(ModBlocks.THUNDER_PLANKS.get()), has(ModBlocks.THUNDER_PLANKS.get()))
                .save(pWriter);

        //不朽树种
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_PLANKS.get(), 4)
                .requires(Ingredient.of(ModFireResistantBlocks.IMMORTAL_LOG.get(), ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_LOG.get()), has(ModFireResistantBlocks.IMMORTAL_LOG.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()), has(ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_WOOD.get(), 3)
                .pattern("11")
                .pattern("11")
                .define('1', ModFireResistantBlocks.IMMORTAL_LOG.get())
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_WOOD.get()), has(ModFireResistantBlocks.IMMORTAL_WOOD.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_LOG.get()), has(ModFireResistantBlocks.IMMORTAL_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_STAIRS.get(), 4)
                .pattern("1  ")
                .pattern("11 ")
                .pattern("111")
                .define('1', ModFireResistantBlocks.IMMORTAL_PLANKS.get())
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_STAIRS.get()), has(ModFireResistantBlocks.IMMORTAL_STAIRS.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_SLAB.get(), 6)
                .pattern("111")
                .define('1', ModFireResistantBlocks.IMMORTAL_PLANKS.get())
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_SLAB.get()), has(ModFireResistantBlocks.IMMORTAL_SLAB.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_FENCE.get(), 3)
                .pattern("121")
                .pattern("121")
                .define('1', ModFireResistantBlocks.IMMORTAL_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_FENCE.get()), has(ModFireResistantBlocks.IMMORTAL_FENCE.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get())
                .pattern("212")
                .pattern("212")
                .define('1', ModFireResistantBlocks.IMMORTAL_PLANKS.get())
                .define('2', Items.STICK)
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get()), has(ModFireResistantBlocks.IMMORTAL_FENCE_GATE.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get())
                .pattern("11")
                .define('1', ModFireResistantBlocks.IMMORTAL_PLANKS.get())
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get()), has(ModFireResistantBlocks.IMMORTAL_PRESSURE_PLATE.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModFireResistantBlocks.IMMORTAL_BUTTON.get())
                .requires(ModFireResistantBlocks.IMMORTAL_PLANKS.get())
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_BUTTON.get()), has(ModFireResistantBlocks.IMMORTAL_BUTTON.get()))
                .unlockedBy(getHasName(ModFireResistantBlocks.IMMORTAL_PLANKS.get()), has(ModFireResistantBlocks.IMMORTAL_PLANKS.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup)
    {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup)
    {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName)
    {
        for(ItemLike itemlike : pIngredients)
        {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  ImmortalContinent.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}