package novamachina.exnihilomekanism.datagen.common;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilomekanism.common.init.ExNihiloMekanismItems;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.tags.ExNihiloTags;
import novamachina.novacore.data.tags.TagProvider;

public class ExNihiloMekanismItemTagGenerator extends TagProvider {

  public ExNihiloMekanismItemTagGenerator(
      PackOutput output,
      CompletableFuture<HolderLookup.Provider> lookupProvider,
      ExistingFileHelper existingFileHelper) {
    super(
        output,
        lookupProvider,
        ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM,
        existingFileHelper);
  }

  @Override
  protected void registerTags() {
    addToTag(ExNihiloTags.PIECE, ExNihiloMekanismItems.OSMIUM_PIECES.get());
  }
}
