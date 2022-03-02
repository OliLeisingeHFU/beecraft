package net.olileisinger.beecraftmod.world.features;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.olileisinger.beecraftmod.BeecraftMod;
import net.olileisinger.beecraftmod.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registryKey("lead_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SULFUR_ORE_KEY = registryKey("sulfur_ore");


    public static final ConfiguredFeature<?, ?> LEAD_ORE = register(Feature.ORE.configure(
            new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.LEAD_ORE.getDefaultState(), 4)).range(new RangeDecoratorConfig(
            UniformHeightProvider.create(YOffset.aboveBottom(55), YOffset.fixed(320)))).spreadHorizontally().repeat(10), LEAD_ORE_KEY);
    public static final ConfiguredFeature<?, ?> SULFUR_ORE = register(Feature.ORE.configure(
            new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.SULFUR_ORE.getDefaultState(), 4)).range(new RangeDecoratorConfig(
            UniformHeightProvider.create(YOffset.aboveBottom(55), YOffset.fixed(320)))).spreadHorizontally().repeat(10), SULFUR_ORE_KEY);

    private static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name){
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(BeecraftMod.MOD_ID, name));
    }

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature, RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BeecraftMod.MOD_ID);
    }
}
