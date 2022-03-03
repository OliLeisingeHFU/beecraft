package net.olileisinger.beecraftmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.olileisinger.beecraftmod.BeecraftMod;
import net.olileisinger.beecraftmod.block.custom.Grinder;
import net.olileisinger.beecraftmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)), ModItemGroup.BEECRAFT_METALS);
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.0f)), ModItemGroup.BEECRAFT_METALS);
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.0f)), ModItemGroup.BEECRAFT_METALS);
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemGroup.BEECRAFT_METALS);

    public static final Block SULFUR_ORE = registerBlock("sulfur_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.BEECRAFT_CHEMICALS);

    public static final Block GRINDER = registerBlock("grinder",
            new Grinder(FabricBlockSettings.of(Material.METAL).strength(2.0f)), ModItemGroup.BEECRAFT_MACHINERY);
    public static final Block MACHINE_CASE = registerBlock("machine_case",
            new Grinder(FabricBlockSettings.of(Material.METAL).strength(1.1f)), ModItemGroup.BEECRAFT_MACHINERY);


    private static Block registerBlock(String _name, Block _block, ItemGroup _group){
        registerBlockItem(_name, _block, _group);
        return Registry.register(Registry.BLOCK, new Identifier(BeecraftMod.MOD_ID, _name), _block);
    }

    private static Item registerBlockItem(String _name, Block _block, ItemGroup _group){
        return Registry.register(Registry.ITEM, new Identifier(BeecraftMod.MOD_ID, _name),
                new BlockItem(_block, new FabricItemSettings().group(_group)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + BeecraftMod.MOD_ID);
    }
}
