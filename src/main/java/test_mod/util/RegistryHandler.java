package test_mod.util;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import test_mod.items.ItemBase;
import test_mod.test;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, test.MOD_ID);

    public static final RegistryObject<Item> test_item = ITEMS.register("test_item", ItemBase::new);
}
