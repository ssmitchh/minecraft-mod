package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import test_mod.Test_mod;
import test_mod.setup.Registration;

import static test_mod.setup.ModSetup.TAB_NAME;

public class TestLanguageProvider extends LanguageProvider {
//
//    private static final String TAB_NAME = test_mod.setup.ModSetup.TAB_NAME;

    public TestLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Test_mod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Test");

        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_END.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");

        add(Registration.MYSTERIOUS_INGOT.get(), "Mysterious ingot");
        add(Registration.RAW_MYSTERIOUS_CHUNK.get(), "Raw Mysterious chunk");
        

    }
}
