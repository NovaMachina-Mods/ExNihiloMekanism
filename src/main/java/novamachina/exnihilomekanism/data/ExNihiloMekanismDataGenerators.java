package novamachina.exnihilomekanism.data;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import novamachina.exnihilomekanism.data.models.ItemModelProvider;
import novamachina.exnihilomekanism.data.recipes.packs.EXNMekanismRecipeProvider;
import novamachina.exnihilomekanism.data.tags.ExNihiloMekanismItemTagProvider;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExNihiloMekanismDataGenerators {

  private ExNihiloMekanismDataGenerators() {}

  @SubscribeEvent
  public static void gatherData(GatherDataEvent event) {
    DataGenerator generator = event.getGenerator();
    PackOutput packoutput = generator.getPackOutput();
    CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

    generator.addProvider(event.includeServer(), new EXNMekanismRecipeProvider(packoutput));
    generator.addProvider(
        event.includeServer(),
        new ExNihiloMekanismItemTagProvider(
            packoutput, lookupProvider, event.getExistingFileHelper()));
    generator.addProvider(
        event.includeClient(), new ItemModelProvider(packoutput, event.getExistingFileHelper()));
    generator.addProvider(
        event.includeClient(), new ExNihiloMekanismLangProvider(packoutput, "en_us"));
  }
}
