package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import test_mod.setup.Registration;
import test_mod.Test;
public class TestBlockTags extends BlockTagsProvider {

    public TestBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Test.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get());

        tag(Tags.Blocks.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get());

    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}