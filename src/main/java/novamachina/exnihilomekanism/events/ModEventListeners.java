package novamachina.exnihilomekanism.events;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.world.item.ExNihiloMekanismItems;
import novamachina.exnihilosequentia.world.item.EXNCreativeModeTabs;
import novamachina.novacore.world.item.CreativeModeTabDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod.EventBusSubscriber(modid = ExNihiloMekanism.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventListeners {
  private static final Logger logger = LoggerFactory.getLogger(ModEventListeners.class);

  @SubscribeEvent
  public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
    logger.debug("Fired BuildCreativeModeTabContentsEvent");
    for (CreativeModeTabDefinition tab : EXNCreativeModeTabs.getDefinitions()) {
      if (event.getTab() == tab.tab()) {
        event.accept(ExNihiloMekanismItems.OSMIUM.getPieceItem());
      }
    }
  }
}
