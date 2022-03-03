package net.olileisinger.beecraftmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.olileisinger.beecraftmod.BeecraftMod;
import net.olileisinger.beecraftmod.item.custom.BeecraftBattery;


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

    public static final Item LEAD_BATTERY = registerItem("lead_battery",
            new BeecraftBattery(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS).maxCount(1), (4000 * 8), 100, 100));
    public static final Item COPPER_CABLE = registerItem("copper_cable",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));
    public static final Item COPPER_WIRE = registerItem("copper_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));
    public static final Item COIL = registerItem("coil",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));
    public static final Item AC_MODULE = registerItem("ac_module",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));
    public static final Item RUBBER = registerItem("rubber",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));
    public static final Item IRON_ROD = registerItem("iron_rod",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));
    public static final Item SPIN_PLATE = registerItem("spin_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.BEECRAFT_ESSENTIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeecraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + BeecraftMod.MOD_ID);
    }
}
