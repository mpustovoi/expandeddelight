package ianm1647.expandeddelight.common.event;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.registry.EDBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = ExpandedDelight.MODID)
public class StripLogEvent {

    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();
        Player player = event.getEntity();
        InteractionHand hand = player.getUsedItemHand();
        BlockPos pos = event.getPos();
        Level level = event.getLevel();
        BlockState state = level.getBlockState(pos);

        if (stack.getItem() instanceof AxeItem) {
            if (state.is(EDBlocks.CINNAMON_LOG.get())) {
                level.setBlock(pos, EDBlocks.CINNAMON_STRIPPED_LOG.get().defaultBlockState(), 3);
                level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0f, 1.0f);
                player.swing(hand);
            }
            if (state.is(EDBlocks.CINNAMON_WOOD.get())) {
                level.setBlock(pos, EDBlocks.CINNAMON_STRIPPED_WOOD.get().defaultBlockState(), 3);
                level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0f, 1.0f);
                player.swing(hand);
            }
        }
    }
}
