package novamachina.exnihilomekanism;

import static novamachina.exnihilomekanism.ExNihiloMekanism.MOD_ID;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.registries.RegisterEvent;
import novamachina.exnihilomekanism.common.Config;
import novamachina.exnihilomekanism.core.registries.InitItems;
import novamachina.novacore.bootstrap.NeoforgeItemRegistry;
import org.slf4j.Logger;

@Mod(MOD_ID)
public class ExNihiloMekanism {

  public static final String MOD_ID = "exnihilomekanism";
  private static final Logger logger = LogUtils.getLogger();

  public ExNihiloMekanism(IEventBus modEventBus) {
    logger.debug("Starting Ex Nihilo: Sequentia - Mekanism Addon");
    Config.loadConfig(
        Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-common.toml"));

    modEventBus.addListener(
        (RegisterEvent event) -> {
          if (event.getRegistryKey().equals(BuiltInRegistries.ITEM.key())) {
            InitItems.init(new NeoforgeItemRegistry());
          }
        });
  }
}
