package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import test_mod.Test_mod;
import test_mod.setup.Registration;

public class TestItemTags extends ItemTagsProvider {
    public TestItemTags(DataGenerator gen, TestBlockTags blockTags, ExistingFileHelper helper) {
        super (gen, blockTags, Test_mod.MODID, helper);

    }
    @Override
    protected void addTags(){
        tag(Tags.Items.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());

        tag(Tags.Items.INGOTS)
                .add(Registration.MYSTERIOUS_INGOT.get());

        tag(Registration.MYSTERIOUS_ORE_ITEM)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get());


    }

    @Override
    public String getName() {return "Test Tags";}
}
