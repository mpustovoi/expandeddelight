package ianm1647.expandeddelight.data.recipe;

import ianm1647.expandeddelight.common.registry.EDItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

public class CuttingRecipes {

    public static void register(RecipeOutput output) {
        crushingMaterials(output);
        cuttingFoods(output);
        cuttingFlowers(output);
    }

    private static void crushingMaterials(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.SUGAR_CANE), Ingredient.of(EDItems.CRUSHING_MALLET.get()), Items.SUGAR, 2).save(output, ResourceLocation.fromNamespaceAndPath("expandeddelight", "sugar_cane"));
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.SALT_ROCK.get()), Ingredient.of(EDItems.CRUSHING_MALLET.get()), EDItems.SALT.get(), 2).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.CINNAMON_STICK.get()), Ingredient.of(EDItems.CRUSHING_MALLET.get()), EDItems.CINNAMON.get(), 2).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.BLAZE_ROD), Ingredient.of(EDItems.CRUSHING_MALLET.get()), Items.BLAZE_POWDER, 3).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.BONE), Ingredient.of(EDItems.CRUSHING_MALLET.get()), Items.BONE_MEAL, 4).save(output);


    }

    private static void cuttingFoods(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.CHEESE_WHEEL.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.CHEESE_SLICE.get(), 4).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.GOAT_CHEESE_WHEEL.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.GOAT_CHEESE_SLICE.get(), 4).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.CRANBERRY_COBBLER.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.CRANBERRY_COBBLER_SLICE.get(), 4).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.HONEYED_GOAT_CHEESE_TART.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.HONEYED_GOAT_CHEESE_TART_SLICE.get(), 4).save(output);

    }

    private static void cuttingFlowers(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_ASPARAGUS.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.ASPARAGUS.get(), 1)
                .addResultWithChance(EDItems.ASPARAGUS_SEEDS.get(), 0.5F).addResultWithChance(Items.BROWN_DYE, 0.1F, 2).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_SWEET_POTATO.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.SWEET_POTATO.get(), 1)
                .addResultWithChance(Items.GREEN_DYE, 0.1F, 2).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_CHILI_PEPPER.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.CHILI_PEPPER.get(), 1)
                .addResultWithChance(EDItems.CHILI_PEPPER_SEEDS.get(), 0.5F).addResultWithChance(Items.WHITE_DYE, 0.25F, 2).save(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(EDItems.WILD_PEANUTS.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), EDItems.PEANUT.get(), 1)
                .addResultWithChance(Items.YELLOW_DYE, 0.25F, 2).save(output);
    }
}
