package net.olileisinger.beecraftmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.olileisinger.beecraftmod.BeecraftMod;
import net.olileisinger.beecraftmod.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup BEECRAFT_METALS = FabricItemGroupBuilder.build(new Identifier(BeecraftMod.MOD_ID, "metal"),
            () -> new ItemStack(ModItems.PLATINUM));

    public static final ItemGroup BEECRAFT_MACHINERY = FabricItemGroupBuilder.build(new Identifier(BeecraftMod.MOD_ID, "machines"),
            () -> new ItemStack(ModBlocks.GRINDER));
}
