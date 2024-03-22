package novamachina.exnihilomekanism.core.registries;

import novamachina.exnihilomekanism.world.item.ExNihiloMekanismItems;
import novamachina.novacore.core.IRegistry;
import novamachina.novacore.world.item.ItemDefinition;

public class InitItems {
  private InitItems() {}

  public static void init(IRegistry<ItemDefinition<?>> registry) {
    for (ItemDefinition<?> definition : ExNihiloMekanismItems.getDefinitions()) {
      registry.register(definition);
    }
  }
}
