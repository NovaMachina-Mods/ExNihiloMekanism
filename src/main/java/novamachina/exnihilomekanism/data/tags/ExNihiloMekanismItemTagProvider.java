package novamachina.exnihilomekanism.data.tags;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.world.item.ExNihiloMekanismItems;
import novamachina.exnihilosequentia.tags.ExNihiloTags;
import novamachina.novacore.data.tags.TagProvider;

public class ExNihiloMekanismItemTagProvider extends TagProvider {

  public ExNihiloMekanismItemTagProvider(
      PackOutput output,
      CompletableFuture<HolderLookup.Provider> lookupProvider,
      ExistingFileHelper existingFileHelper) {
    super(output, lookupProvider, ExNihiloMekanism.MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerTags() {
    addToTag(ExNihiloTags.PIECE, ExNihiloMekanismItems.OSMIUM.getPieceItem());
  }
}
