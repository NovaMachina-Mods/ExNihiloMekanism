package novamachina.exnihilomekanism.world.item;

import java.util.List;
import java.util.Optional;
import mekanism.common.registries.MekanismItems;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.resource.ResourceType;
import net.minecraft.world.item.Item;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilosequentia.world.item.Ore;
import novamachina.novacore.core.registries.ItemRegistry;
import novamachina.novacore.world.item.ItemDefinition;

public class ExNihiloMekanismItems {

  private static final ItemRegistry ITEMS = new ItemRegistry(ExNihiloMekanism.MOD_ID);
  public static final Ore OSMIUM =
      new Ore(
          "osmium",
          true,
          Optional.of(
              MekanismItems.PROCESSED_RESOURCES
                  .get(ResourceType.RAW, PrimaryResource.OSMIUM)
                  .asItem()),
          Optional.of(
              MekanismItems.PROCESSED_RESOURCES
                  .get(ResourceType.INGOT, PrimaryResource.OSMIUM)
                  .asItem()),
          Optional.of(
              MekanismItems.PROCESSED_RESOURCES
                  .get(ResourceType.NUGGET, PrimaryResource.OSMIUM)
                  .asItem()),
          ITEMS);

  public static List<ItemDefinition<? extends Item>> getDefinitions() {
    return ITEMS.getRegistry();
  }
}
