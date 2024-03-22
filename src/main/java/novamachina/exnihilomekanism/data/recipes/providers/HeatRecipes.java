package novamachina.exnihilomekanism.data.recipes.providers;

import mekanism.common.registries.MekanismBlocks;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import novamachina.exnihilosequentia.ExNihiloSequentia;
import novamachina.exnihilosequentia.data.recipes.HeatRecipeBuilder;
import novamachina.exnihilosequentia.data.recipes.RecipeProviderUtilities;
import novamachina.novacore.data.recipes.ISubRecipeProvider;

public class HeatRecipes implements ISubRecipeProvider {
  @Override
  public void addRecipes(RecipeOutput recipeOutput) {
    HeatRecipeBuilder.heat(MekanismBlocks.SUPERHEATING_ELEMENT.getBlock(), 10)
        .build(recipeOutput, heatLoc("superheating_element"));
  }

  private ResourceLocation heatLoc(String id) {
    return new ResourceLocation(
        ExNihiloSequentia.MOD_ID, "heat/" + RecipeProviderUtilities.prependRecipePrefix(id));
  }
}
