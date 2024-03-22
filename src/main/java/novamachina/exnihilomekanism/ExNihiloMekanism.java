package novamachina.exnihilomekanism;

import static novamachina.exnihilomekanism.ExNihiloMekanism.MOD_ID;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(MOD_ID)
public class ExNihiloMekanism {

  public static final String MOD_ID = "exnihilomekanism";
  private static final Logger logger = LogUtils.getLogger();

  public ExNihiloMekanism() {
    logger.debug("Starting Ex Nihilo: Sequentia - Mekanism Addon");
  }
}
