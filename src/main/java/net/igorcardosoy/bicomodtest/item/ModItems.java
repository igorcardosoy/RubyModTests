package net.igorcardosoy.bicomodtest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.igorcardosoy.bicomodtest.Bicomodtest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

    public static void registerModItems() {
        Bicomodtest.LOGGER.info("Registering items for " + Bicomodtest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Bicomodtest.MOD_ID, name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }
}
