package ianm1647.expandeddelight.common.registry;

import ianm1647.expandeddelight.ExpandedDelight;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class EDWoodTypes {
    public static WoodType CINNAMON;
    public static BlockSetType CINNAMON_SET;

    public static void register() {
        Sheets.addWoodType(CINNAMON);
    }

    static {
        CINNAMON_SET = BlockSetType.register(new BlockSetType(ExpandedDelight.MODID + ":cinnamon"));
        CINNAMON = WoodType.register(new WoodType(ExpandedDelight.MODID + ":cinnamon", CINNAMON_SET));

    }
}
