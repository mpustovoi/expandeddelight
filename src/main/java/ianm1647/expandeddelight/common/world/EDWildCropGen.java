package ianm1647.expandeddelight.common.world;

import ianm1647.expandeddelight.ExpandedDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class EDWildCropGen {
    private static String MODID = ExpandedDelight.MODID;
    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_ASPARAGUS;
    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_SWEET_POTATO;
    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_CHILI_PEPPER;
    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_PEANUT;
    public static ResourceKey<PlacedFeature> PATCH_WILD_ASPARAGUS;
    public static ResourceKey<PlacedFeature> PATCH_WILD_SWEET_POTATO;
    public static ResourceKey<PlacedFeature> PATCH_WILD_CHILI_PEPPER;
    public static ResourceKey<PlacedFeature> PATCH_WILD_PEANUT;

    public EDWildCropGen() {
    }

    public static void load() {
    }

    static {
        FEATURE_PATCH_WILD_ASPARAGUS = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_asparagus"));
        FEATURE_PATCH_WILD_SWEET_POTATO = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_sweet_potato"));
        FEATURE_PATCH_WILD_CHILI_PEPPER = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_chili_pepper"));
        FEATURE_PATCH_WILD_PEANUT = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_peanuts"));
        PATCH_WILD_ASPARAGUS = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_asparagus"));
        PATCH_WILD_SWEET_POTATO = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_sweet_potato"));
        PATCH_WILD_CHILI_PEPPER = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_chili_pepper"));
        PATCH_WILD_PEANUT = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_peanuts"));
    }
}
