package novamachina.exnihilomekanism.data.recipes.packs;

import java.util.List;
import net.minecraft.data.PackOutput;
import novamachina.exnihilomekanism.data.recipes.providers.CraftingRecipes;
import novamachina.exnihilomekanism.data.recipes.providers.HeatRecipes;
import novamachina.exnihilomekanism.data.recipes.providers.SiftingRecipes;
import novamachina.novacore.data.recipes.AbstractRecipeProvider;
import novamachina.novacore.data.recipes.ISubRecipeProvider;

public class EXNMekanismRecipeProvider extends AbstractRecipeProvider {
  public EXNMekanismRecipeProvider(PackOutput packOutput) {
    super(packOutput);
  }

  @Override
  protected List<ISubRecipeProvider> getSubProviders() {
    return List.of(new CraftingRecipes(), new HeatRecipes(), new SiftingRecipes());
  }
}
