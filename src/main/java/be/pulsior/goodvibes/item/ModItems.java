package be.pulsior.goodvibes.item;

import be.pulsior.goodvibes.GoodVibes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GoodVibes.MOD_ID);

    public static final RegistryObject<Item> REMOTE = ITEMS.register(  "remote",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
