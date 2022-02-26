package net.olileisinger.beecraftmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.olileisinger.beecraftmod.BeecraftMod;



public class ModItems {

    public static final Item PLATINUM = registerItem("platinum",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_METALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeecraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + BeecraftMod.MOD_ID);
    }
}
