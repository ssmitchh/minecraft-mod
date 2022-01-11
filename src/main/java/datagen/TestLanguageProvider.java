package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.common.data.LanguageProvider;
import test_mod.setup.Registration;
import test_mod.test;

import static test_mod.setup.ModSetup.TAB_NAME;

public class TestLanguageProvider extends LanguageProvider {
//
//    private static final String TAB_NAME = test_mod.setup.ModSetup.TAB_NAME;

    public TestLanguageProvider(DataGenerator gen, String locale) {
        super(gen, test.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Test");

        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious Ore");
        

    }
}
