package test_mod.setup;

import entities.ThiefEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static final String TAB_NAME = "test_mod";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
            event.put(Registration.THIEF_ENTITY.get(), ThiefEntity.prepareAttributes().build());
    }
    public static void init(FMLCommonSetupEvent event){

    }

    public static void setup() {
    }
}
