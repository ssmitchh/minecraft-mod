package test_mod.setup;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import test_mod.Test_mod;

import static test_mod.Test_mod.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);

    }

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> MYSTERIOUS_ORE_OVERWORLD = BLOCKS.register("mysterious_ore_overworld", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_ORE_OVERWORLD_ITEM = fromBlock(MYSTERIOUS_ORE_OVERWORLD);
    public static final RegistryObject<Block> MYSTERIOUS_ORE_NETHER = BLOCKS.register("mysterious_ore_nether", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_ORE_NETHER_ITEM = fromBlock(MYSTERIOUS_ORE_NETHER);
    public static final RegistryObject<Block> MYSTERIOUS_ORE_END = BLOCKS.register("mysterious_ore_end", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_ORE_END_ITEM = fromBlock(MYSTERIOUS_ORE_END);
    public static final RegistryObject<Block> MYSTERIOUS_ORE_DEEPSLATE = BLOCKS.register("mysterious_ore_deepslate", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_ORE_DEEPSLATE_ITEM = fromBlock(MYSTERIOUS_ORE_DEEPSLATE);

    public static final RegistryObject<Item> RAW_MYSTERIOUS_CHUNK = ITEMS.register("raw_mysterious_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_INGOT = ITEMS.register("mysterious_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> MYSTERIOUS_ORE = BlockTags.createOptional(new ResourceLocation(Test_mod.MODID,"mysterious_ore" ));
    public static final Tags.IOptionalNamedTag<Item> MYSTERIOUS_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(Test_mod.MODID,"mysterious_ore" ));


    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){
        return ITEMS.register((block.getId().getPath()), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
