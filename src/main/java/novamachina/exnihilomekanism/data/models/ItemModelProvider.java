package novamachina.exnihilomekanism.data.models;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.world.item.ExNihiloMekanismItems;
import novamachina.novacore.world.item.ItemDefinition;

public class ItemModelProvider
    extends net.neoforged.neoforge.client.model.generators.ItemModelProvider {
  public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
    super(output, ExNihiloMekanism.MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerModels() {
    ExNihiloMekanismItems.getDefinitions().stream()
        .filter(def -> def.getType() == ItemDefinition.ItemType.OTHER)
        .forEach(
            definition ->
                singleTexture(
                    definition.getId().getPath(),
                    new ResourceLocation("item/generated"),
                    "layer0",
                    new ResourceLocation(modid, "item/" + definition.getId().getPath())));
  }
}
