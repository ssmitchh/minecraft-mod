package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import test_mod.setup.Registration;
import test_mod.test;

public class TestItemTags extends ItemTagsProvider {
    public TestItemTags(DataGenerator gen, TestBlockTags blockTags, ExistingFileHelper helper) {
        super (gen, blockTags, test.MODID, helper);

    }
    @Override
    protected void addTags(){
        tag(Tags.Items.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get());

    }

    @Override
    public String getName() {return "Test Tags";}
}
