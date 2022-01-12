package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import test_mod.Test;
import test_mod.setup.Registration;

import static test_mod.setup.ModSetup.TAB_NAME;
public class TestLanguageProvider extends LanguageProvider {

    public TestLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Test.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Tutorial");
        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");

    }
}