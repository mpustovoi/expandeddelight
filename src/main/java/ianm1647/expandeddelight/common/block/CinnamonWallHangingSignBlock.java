package ianm1647.expandeddelight.common.block;

import ianm1647.expandeddelight.common.registry.EDBlockEntityTypes;
import ianm1647.expandeddelight.common.registry.EDWoodTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class CinnamonWallHangingSignBlock extends WallHangingSignBlock {

    public CinnamonWallHangingSignBlock() {
        super(EDWoodTypes.CINNAMON, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_HANGING_SIGN));
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return EDBlockEntityTypes.CINNAMON_HANGING_SIGN.get().create(pos, state);
    }
}
