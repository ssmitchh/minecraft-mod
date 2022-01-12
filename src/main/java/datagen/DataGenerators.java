package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import test_mod.Test_mod;


@Mod.EventBusSubscriber(modid = Test_mod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new TestRecipes(generator));
            generator.addProvider(new TestLootTables(generator));
            TestBlockTags blockTags = new TestBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new TestItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if(event.includeClient()){
            generator.addProvider(new TestBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new TestItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new TestLanguageProvider(generator, "en_us"));
        }
    }
}
