package ianm1647.expandeddelight.data;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.registry.EDBlocks;
import ianm1647.expandeddelight.common.tag.EDCompatTags;
import ianm1647.expandeddelight.common.tag.EDTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class EDBlockTags extends BlockTagsProvider {
    public EDBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExpandedDelight.MODID, existingFileHelper);
    }

    protected void addTags(HolderLookup.Provider provider) {
        this.registerModTags();
        this.registerDelightTags();
        this.registerMinecraftTags();
        this.registerForgeTags();
        this.registerCompatibilityTags();
        this.registerBlockMineables();
    }

    protected void registerBlockMineables() {
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(EDBlocks.JUICER.get(), EDBlocks.CASK.get(), EDBlocks.ASPARAGUS_CRATE.get(), EDBlocks.SWEET_POTATO_CRATE.get(), EDBlocks.CHILI_PEPPER_CRATE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EDBlocks.SALT_ORE.get(), EDBlocks.DEEPSLATE_SALT_ORE.get());
    }

    protected void registerModTags() {
        this.tag(EDTags.MILK_ACTIVATORS).add(Blocks.MYCELIUM, Blocks.RED_MUSHROOM, Blocks.BROWN_MUSHROOM, ModBlocks.RED_MUSHROOM_COLONY.get(), ModBlocks.BROWN_MUSHROOM_COLONY.get());
    }

    protected void registerDelightTags() {
        this.tag(ModTags.WILD_CROPS).add(EDBlocks.WILD_ASPARAGUS.get(), EDBlocks.WILD_SWEET_POTATO.get(), EDBlocks.WILD_CHILI_PEPPER.get(), EDBlocks.WILD_PEANUTS.get());
    }

    protected void registerMinecraftTags() {
        this.tag(BlockTags.CROPS).add(EDBlocks.ASPARAGUS_CROP.get(), EDBlocks.SWEET_POTATO_CROP.get(), EDBlocks.CHILI_PEPPER_CROP.get(), EDBlocks.PEANUT_CROP.get());
        this.tag(BlockTags.SMALL_FLOWERS).add(EDBlocks.WILD_ASPARAGUS.get(), EDBlocks.WILD_SWEET_POTATO.get(), EDBlocks.WILD_CHILI_PEPPER.get(), EDBlocks.WILD_PEANUTS.get());
    }

    protected void registerForgeTags() {

    }

    private void registerCompatibilityTags() {
        this.tag(EDCompatTags.SERENE_SEASONS_AUTUMN_CROPS_BLOCK).add(EDBlocks.SWEET_POTATO_CROP.get());
        this.tag(EDCompatTags.SERENE_SEASONS_SPRING_CROPS_BLOCK).add(EDBlocks.ASPARAGUS_CROP.get(), EDBlocks.PEANUT_CROP.get());
        this.tag(EDCompatTags.SERENE_SEASONS_SUMMER_CROPS_BLOCK).add(EDBlocks.CHILI_PEPPER_CROP.get());
    }
}
