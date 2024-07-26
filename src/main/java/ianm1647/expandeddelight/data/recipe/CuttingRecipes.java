package ianm1647.expandeddelight.data.recipe;

import ianm1647.expandeddelight.common.registry.EDItems;
import ianm1647.expandeddelight.data.builder.EDCuttingBoardRecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.tag.ForgeTags;

public class CuttingRecipes {

    public static void register(RecipeOutput output) {
        crushingMaterials(output);
        cuttingFoods(output);
        cuttingFlowers(output);
    }

    private static void crushingMaterials(RecipeOutput output) {
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.SUGAR_CANE), Ingredient.of(EDItems.CRUSHING_MALLET.get()), Items.SUGAR, 2).build(output);
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.SALT_ROCK.get()), Ingredient.of(EDItems.CRUSHING_MALLET.get()), EDItems.SALT.get(), 2).build(output);
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.CINNAMON_STICK.get()), Ingredient.of(EDItems.CRUSHING_MALLET.get()), EDItems.CINNAMON.get(), 2).build(output);
    }

    private static void cuttingFoods(RecipeOutput output) {
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.CHEESE_WHEEL.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), EDItems.CHEESE_SLICE.get(), 4).build(output);
    }

    private static void cuttingFlowers(RecipeOutput output) {
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_ASPARAGUS.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), EDItems.ASPARAGUS.get(), 1).addResultWithChance(EDItems.ASPARAGUS_SEEDS.get(), 0.5F).addResultWithChance(Items.BROWN_DYE, 0.1F, 2).build(output);
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_SWEET_POTATO.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), EDItems.SWEET_POTATO.get(), 1).addResultWithChance(Items.GREEN_DYE, 0.1F, 2).build(output);
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_CHILI_PEPPER.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), EDItems.CHILI_PEPPER.get(), 1).addResultWithChance(EDItems.CHILI_PEPPER_SEEDS.get(), 0.5F).addResultWithChance(Items.WHITE_DYE, 0.25F, 2).build(output);
        EDCuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_PEANUTS.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), EDItems.PEANUT.get(), 1).addResultWithChance(Items.YELLOW_DYE, 0.25F, 2).build(output);
    }
}
