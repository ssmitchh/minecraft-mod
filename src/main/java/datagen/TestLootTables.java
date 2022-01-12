package datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import test_mod.setup.Registration;

public class TestLootTables extends BaseLootTableProvider{
    public TestLootTables(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), createSilkTouchTable("mysterious_ore_overworld", Registration.MYSTERIOUS_ORE_OVERWORLD.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_ORE_NETHER.get(), createSilkTouchTable("mysterious_ore_nether", Registration.MYSTERIOUS_ORE_NETHER.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_ORE_END.get(), createSilkTouchTable("mysterious_ore_end", Registration.MYSTERIOUS_ORE_END.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), createSilkTouchTable("mysterious_ore_deepslate", Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));


    }
}
