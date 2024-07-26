package ianm1647.expandeddelight.data.loot;

import ianm1647.expandeddelight.common.registry.EDBlocks;
import ianm1647.expandeddelight.common.registry.EDDataComponents;
import ianm1647.expandeddelight.common.registry.EDItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.CopyComponentsFunction;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditions;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModDataComponents;

import java.util.HashSet;
import java.util.Set;

public class EDBlockLoot extends BlockLootSubProvider {
    private final Set<Block> generatedLootTables = new HashSet();

    public EDBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    protected void generate() {
        this.add(EDBlocks.JUICER.get(),
                (block) -> LootTable.lootTable().withPool(this.applyExplosionCondition(block, LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block)
                        .apply(CopyComponentsFunction.copyComponents(CopyComponentsFunction.Source.BLOCK_ENTITY)
                        .include(DataComponents.CUSTOM_NAME).include(EDDataComponents.DRINK.get())
                        .include(ModDataComponents.CONTAINER.get()))))));
        this.dropSelf(EDBlocks.CASK.get());
        this.dropOther(EDBlocks.MILK_CASK.get(), EDItems.CASK.get());
        this.dropOther(EDBlocks.CHEESE_CASK.get(), EDItems.CASK.get());
        this.dropSelf(EDBlocks.CHEESE_WHEEL.get());

        this.dropSelf(EDBlocks.ASPARAGUS_CRATE.get());
        this.dropSelf(EDBlocks.SWEET_POTATO_CRATE.get());
        this.dropSelf(EDBlocks.CHILI_PEPPER_CRATE.get());
    }

    protected void dropNamedContainer(Block block) {
        this.add(block, this::createNameableBlockEntityTable);
    }

    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    protected Iterable<Block> getKnownBlocks() {
        return this.generatedLootTables;
    }
}