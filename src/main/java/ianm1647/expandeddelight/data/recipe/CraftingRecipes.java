package ianm1647.expandeddelight.data.recipe;

import ianm1647.expandeddelight.common.registry.EDItems;
import ianm1647.expandeddelight.common.tag.EDForgeTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import vectorwing.farmersdelight.common.tag.ForgeTags;

public class CraftingRecipes {

    public static void register(RecipeOutput output) {
        recipesBlocks(output);
        recipesTools(output);
        recipesMaterials(output);
        recipesFoodstuffs(output);
        recipesCraftedMeals(output);
    }

    private static void recipesBlocks(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EDItems.JUICER.get()).pattern("iii").pattern(" b ").pattern("iii").define('i', Tags.Items.INGOTS_IRON).define('b', Blocks.BARREL).unlockedBy("has_iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT)).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EDItems.CASK.get()).pattern("iwi").pattern("bBb").pattern("iwi").define('i', Tags.Items.INGOTS_IRON).define('b', Blocks.BARREL).define('w', ItemTags.PLANKS).define('B', Items.BUCKET).unlockedBy("has_iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT)).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EDItems.ASPARAGUS_CRATE.get(), 1).pattern("###").pattern("###").pattern("###").define('#', EDItems.ASPARAGUS.get()).unlockedBy("has_asparagus", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.ASPARAGUS.get())).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EDItems.SWEET_POTATO_CRATE.get(), 1).pattern("###").pattern("###").pattern("###").define('#', EDItems.SWEET_POTATO.get()).unlockedBy("has_sweet_potato", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.SWEET_POTATO.get())).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EDItems.CHILI_PEPPER_CRATE.get(), 1).pattern("###").pattern("###").pattern("###").define('#', EDItems.CHILI_PEPPER.get()).unlockedBy("has_chili_pepper", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.CHILI_PEPPER.get())).save(output);

    }

    private static void recipesTools(RecipeOutput output) {

    }

    private static void recipesMaterials(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EDItems.GLASS_JAR.get(), 3).pattern("g g").pattern("gpg").pattern(" g ").define('g', Items.GLASS).define('p', Items.PAPER).unlockedBy("has_glass", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLASS)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.ASPARAGUS_SEEDS.get()).requires(EDItems.ASPARAGUS.get()).unlockedBy("has_asparagus", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.ASPARAGUS.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.CHILI_PEPPER_SEEDS.get()).requires(EDItems.CHILI_PEPPER.get()).unlockedBy("has_chili_pepper", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.CHILI_PEPPER.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.ASPARAGUS.get(), 9).requires(EDItems.ASPARAGUS_CRATE.get()).unlockedBy("has_asparagus", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.ASPARAGUS.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.SWEET_POTATO.get(), 9).requires(EDItems.SWEET_POTATO_CRATE.get()).unlockedBy("has_sweet_potato", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.SWEET_POTATO.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.CHILI_PEPPER.get(), 9).requires(EDItems.CHILI_PEPPER_CRATE.get()).unlockedBy("has_chili_pepper", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.CHILI_PEPPER.get())).save(output);
    }

    private static void recipesFoodstuffs(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.SWEET_ROLL.get()).requires(ForgeTags.MILK).requires(ForgeTags.DOUGH).requires(EDForgeTags.DUSTS_CINNAMON).requires(Items.SUGAR).unlockedBy("has_cinnamon", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.CINNAMON.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.BERRY_SWEET_ROLL.get()).requires(ForgeTags.MILK).requires(ForgeTags.DOUGH).requires(EDForgeTags.DUSTS_CINNAMON).requires(Items.SUGAR).requires(Items.SWEET_BERRIES).unlockedBy("has_berries", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.GLOW_BERRY_SWEET_ROLL.get()).requires(ForgeTags.MILK).requires(ForgeTags.DOUGH).requires(EDForgeTags.DUSTS_CINNAMON).requires(Items.SUGAR).requires(Items.GLOW_BERRIES).unlockedBy("has_berries", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLOW_BERRIES)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.CHEESE_SANDWICH.get()).requires(Items.BREAD).requires(EDForgeTags.CHEESE).unlockedBy("has_cheese", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.CHEESE_SLICE.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.PEANUT_BUTTER_SANDWICH.get()).requires(Items.BREAD).requires(EDItems.PEANUT_BUTTER.get()).unlockedBy("has_peanut_butter", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.PEANUT_BUTTER.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.PEANUT_BUTTER_HONEY_SANDWICH.get()).requires(Items.BREAD).requires(EDItems.PEANUT_BUTTER.get()).requires(Items.HONEY_BOTTLE).unlockedBy("has_honey", InventoryChangeTrigger.TriggerInstance.hasItems(Items.HONEY_BOTTLE)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.SWEET_BERRY_JELLY_SANDWICH.get()).requires(Items.BREAD).requires(EDItems.PEANUT_BUTTER.get()).requires(EDForgeTags.JAMS_SWEET_BERRY).unlockedBy("has_jelly", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.SWEET_BERRY_JELLY.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.GLOW_BERRY_JELLY_SANDWICH.get()).requires(Items.BREAD).requires(EDItems.PEANUT_BUTTER.get()).requires(EDForgeTags.JAMS_GLOW_BERRY).unlockedBy("has_jelly", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.GLOW_BERRY_JELLY.get())).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, EDItems.CHOCOLATE_COOKIE.get(), 8).pattern("cwc").define('c', Items.COCOA_BEANS).define('w', ForgeTags.GRAIN_WHEAT).unlockedBy("has_cocoa", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COCOA_BEANS)).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, EDItems.SUGAR_COOKIE.get(), 8).pattern("cwc").define('w', Items.SUGAR).define('c', ForgeTags.GRAIN_WHEAT).unlockedBy("has_sugar", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SUGAR)).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, EDItems.SNICKERDOODLE.get(), 8).pattern("cwc").define('w', EDItems.CINNAMON.get()).define('c', ForgeTags.GRAIN_WHEAT).unlockedBy("has_cinnamon", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.CINNAMON.get())).save(output);

    }

    private static void recipesCraftedMeals(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.PEANUT_SALAD.get()).requires(ForgeTags.SALAD_INGREDIENTS).requires(ForgeTags.CROPS_TOMATO).requires(EDForgeTags.CROPS_PEANUT).requires(Items.BOWL).unlockedBy("has_peanut", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.PEANUT.get())).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, EDItems.SWEET_POTATO_SALAD.get()).requires(ForgeTags.SALAD_INGREDIENTS).requires(ForgeTags.CROPS_ONION).requires(EDForgeTags.CROPS_SWEET_POTATO).requires(EDForgeTags.DUSTS_CINNAMON).requires(Items.BOWL).unlockedBy("has_sweet_potato", InventoryChangeTrigger.TriggerInstance.hasItems(EDItems.SWEET_POTATO.get())).save(output);

    }
}
