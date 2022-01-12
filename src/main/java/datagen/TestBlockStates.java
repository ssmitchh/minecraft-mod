package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import test_mod.Test;
import test_mod.setup.Registration;

public class TestBlockStates extends BlockStateProvider {

    public TestBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Test.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.MYSTERIOUS_ORE_OVERWORLD.get());
    }
    }
