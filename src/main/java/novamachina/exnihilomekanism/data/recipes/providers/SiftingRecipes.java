package novamachina.exnihilomekanism.data.recipes.providers;

import mekanism.common.registries.MekanismItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.world.item.ExNihiloMekanismItems;
import novamachina.exnihilosequentia.data.recipes.RecipeProviderUtilities;
import novamachina.exnihilosequentia.data.recipes.SiftingRecipeBuilder;
import novamachina.exnihilosequentia.world.item.MeshType;
import novamachina.exnihilosequentia.world.item.crafting.MeshWithChance;
import novamachina.novacore.data.recipes.ISubRecipeProvider;

public class SiftingRecipes implements ISubRecipeProvider {
  @Override
  public void addRecipes(RecipeOutput recipeOutput) {
    SiftingRecipeBuilder.sifting(
            Ingredient.of(Blocks.GRAVEL), ExNihiloMekanismItems.OSMIUM.getPieceItem())
        .addRoll(new MeshWithChance(MeshType.IRON, 0.05F))
        .addRoll(new MeshWithChance(MeshType.DIAMOND, 0.1F))
        .build(recipeOutput, siftingLoc("osmium_pieces"));

    SiftingRecipeBuilder.sifting(Ingredient.of(Blocks.GRAVEL), MekanismItems.FLUORITE_GEM.asItem())
        .addRoll(new MeshWithChance(MeshType.IRON, 0.025F))
        .addRoll(new MeshWithChance(MeshType.DIAMOND, 0.05F))
        .build(recipeOutput, siftingLoc(MekanismItems.FLUORITE_GEM.getRegistryName().getPath()));

    SiftingRecipeBuilder.sifting(Ingredient.of(Blocks.SAND), MekanismItems.SALT.asItem())
        .addRoll(new MeshWithChance(MeshType.FLINT, 0.01F))
        .addRoll(new MeshWithChance(MeshType.IRON, 0.02F))
        .addRoll(new MeshWithChance(MeshType.DIAMOND, 0.4F))
        .build(recipeOutput, siftingLoc(MekanismItems.SALT.getRegistryName().getPath()));
  }

  private ResourceLocation siftingLoc(String id) {
    return new ResourceLocation(
        ExNihiloMekanism.MOD_ID, "sifting/" + RecipeProviderUtilities.prependRecipePrefix(id));
  }
}
