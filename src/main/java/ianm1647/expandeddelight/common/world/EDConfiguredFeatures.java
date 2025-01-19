package ianm1647.expandeddelight.common.world;

import ianm1647.expandeddelight.ExpandedDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class EDConfiguredFeatures {
    private static String MODID = ExpandedDelight.MODID;

    public static ResourceKey<ConfiguredFeature<?, ?>> SALT_ORE;

    public static ResourceKey<ConfiguredFeature<?, ?>> CINNAMON_TREE;

    public static ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILD_ASPARAGUS;
    public static ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILD_SWEET_POTATO;
    public static ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILD_CHILI_PEPPER;
    public static ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILD_PEANUT;
    public static ResourceKey<ConfiguredFeature<?, ?>> PATCH_CRANBERRIES;

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

    }

    static {
        SALT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "salt_ore"));

        CINNAMON_TREE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "cinnamon_tree"));

        PATCH_WILD_ASPARAGUS = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_asparagus"));
        PATCH_WILD_SWEET_POTATO = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_sweet_potato"));
        PATCH_WILD_CHILI_PEPPER = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_chili_pepper"));
        PATCH_WILD_PEANUT = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_wild_peanuts"));
        PATCH_CRANBERRIES = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_cranberries"));

    }
}
