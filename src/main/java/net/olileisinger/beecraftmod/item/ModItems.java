package net.olileisinger.beecraftmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.olileisinger.beecraftmod.BeecraftMod;



public class ModItems {

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_METALS)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_METALS)));
    public static final Item RAW_LEAD = registerItem("raw_lead",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_METALS)));

    public static final Item ACID_BOTTLE = registerItem("acid_bottle",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_CHEMICALS)));
    public static final Item SULFUR = registerItem("sulfur",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_CHEMICALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeecraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + BeecraftMod.MOD_ID);
    }
}
