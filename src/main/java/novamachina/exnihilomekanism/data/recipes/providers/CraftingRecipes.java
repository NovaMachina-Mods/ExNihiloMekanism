package novamachina.exnihilomekanism.data.recipes.providers;

import static novamachina.exnihilosequentia.data.recipes.RecipeProviderUtilities.prependRecipePrefix;

import java.util.Objects;
import mekanism.common.registries.MekanismItems;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.resource.ResourceType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.world.item.ExNihiloMekanismItems;
import novamachina.novacore.data.recipes.ISubRecipeProvider;

public class CraftingRecipes implements ISubRecipeProvider {
  @Override
  public void addRecipes(RecipeOutput recipeOutput) {
    Item item = ExNihiloMekanismItems.OSMIUM.getPieceItem();
    ShapedRecipeBuilder.shaped(
            RecipeCategory.MISC,
            Objects.requireNonNull(
                MekanismItems.PROCESSED_RESOURCES.get(ResourceType.RAW, PrimaryResource.OSMIUM)))
        .pattern("xx")
        .pattern("xx")
        .define('x', item)
        .unlockedBy("has_piece", InventoryChangeTrigger.TriggerInstance.hasItems(item))
        .save(
            recipeOutput,
            new ResourceLocation(
                ExNihiloMekanism.MOD_ID,
                prependRecipePrefix(BuiltInRegistries.ITEM.getKey(item).getPath())));
  }
}
