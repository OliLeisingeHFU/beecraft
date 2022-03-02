package net.olileisinger.beecraftmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.olileisinger.beecraftmod.BeecraftMod;
import net.olileisinger.beecraftmod.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup BEECRAFT_METALS = FabricItemGroupBuilder.build(new Identifier(BeecraftMod.MOD_ID, "metal"),
            () -> new ItemStack(ModItems.PLATINUM_INGOT));

    public static final ItemGroup BEECRAFT_CHEMICALS = FabricItemGroupBuilder.build(new Identifier(BeecraftMod.MOD_ID, "chemicals"),
            () -> new ItemStack(ModItems.ACID_BOTTLE));

    public static final ItemGroup BEECRAFT_ESSENTIALS = FabricItemGroupBuilder.build(new Identifier(BeecraftMod.MOD_ID, "essentials"),
            () -> new ItemStack(ModItems.LEAD_BATTERY));

    public static final ItemGroup BEECRAFT_MACHINERY = FabricItemGroupBuilder.build(new Identifier(BeecraftMod.MOD_ID, "machines"),
            () -> new ItemStack(ModBlocks.GRINDER));
}
