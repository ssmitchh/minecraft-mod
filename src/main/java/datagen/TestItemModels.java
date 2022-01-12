package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import test_mod.Test_mod;
import test_mod.setup.Registration;

public class TestItemModels extends ItemModelProvider {

    public TestItemModels(DataGenerator gen, ExistingFileHelper helper) {
        super (gen, Test_mod.MODID, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_nether"));
        withExistingParent(Registration.MYSTERIOUS_ORE_END_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_end"));
        withExistingParent(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_deepslate"));

        singleTexture(Registration.RAW_MYSTERIOUS_CHUNK.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_mysterious_chunk"));
        singleTexture(Registration.MYSTERIOUS_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/mysterious_ingot"));

    }
}
