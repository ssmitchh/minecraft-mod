package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import test_mod.setup.Registration;
import test_mod.test;

public class TestItemModels extends ItemModelProvider {

    public TestItemModels(DataGenerator gen, ExistingFileHelper helper) {
        super (gen, test.MODID, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_overworld"));

    }
}
