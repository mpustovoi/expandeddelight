package ianm1647.expandeddelight.common.registry;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.block.entity.JuicerBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILES;
    public static final Supplier<BlockEntityType<JuicerBlockEntity>> JUICER;

    public EDBlockEntityTypes() {
    }

    static {
        TILES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ExpandedDelight.MODID);
        JUICER = TILES.register("juicer",
                () -> BlockEntityType.Builder.of(JuicerBlockEntity::new, new Block[]{EDBlocks.JUICER.get()}).build(null));
    }
}
