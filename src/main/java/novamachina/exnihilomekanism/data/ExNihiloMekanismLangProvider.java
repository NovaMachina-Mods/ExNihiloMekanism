package novamachina.exnihilomekanism.data;

import net.minecraft.data.PackOutput;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.novacore.data.AbstractLangGenerator;

public class ExNihiloMekanismLangProvider extends AbstractLangGenerator {

  public ExNihiloMekanismLangProvider(PackOutput gen, String locale) {
    super(gen, ExNihiloMekanism.MOD_ID, locale);
  }

  @Override
  protected void addTranslations() {
    // Items
    addItem();
  }

  private void addItem() {
    addPieceAutoName("osmium");
  }
}
