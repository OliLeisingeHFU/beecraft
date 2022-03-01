package net.olileisinger.beecraftmod.world.gen;

import net.minecraft.client.render.debug.BeeDebugRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.olileisinger.beecraftmod.BeecraftMod;
import net.olileisinger.beecraftmod.block.ModBlocks;

public class ModWorldGen {
    public static void generateModWorldGen()  {
        ModOreGeneration.generateOres();
    }
}
