package net.igorcardosoy.bicomodtest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.igorcardosoy.bicomodtest.Bicomodtest;
import net.igorcardosoy.bicomodtest.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Bicomodtest.MOD_ID,
            "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(Items.FURNACE);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        Bicomodtest.LOGGER.info("Registering item groups for " + Bicomodtest.MOD_ID);
    }
}
