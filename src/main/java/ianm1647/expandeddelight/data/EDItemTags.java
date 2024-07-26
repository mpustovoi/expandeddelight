package ianm1647.expandeddelight.data;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.registry.EDItems;
import ianm1647.expandeddelight.common.tag.EDCompatTags;
import ianm1647.expandeddelight.common.tag.EDForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class EDItemTags extends ItemTagsProvider {
    public EDItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, ExpandedDelight.MODID, existingFileHelper);
    }

    protected void addTags(HolderLookup.Provider provider) {
        this.registerModTags();
        this.registerDelightTags();
        this.registerMinecraftTags();
        this.registerForgeTags();
        this.registerCompatibilityTags();
    }

    private void registerModTags() {

    }

    private void registerDelightTags() {
        this.tag(ModTags.WILD_CROPS_ITEM).add(EDItems.WILD_ASPARAGUS.get(), EDItems.WILD_SWEET_POTATO.get(), EDItems.WILD_CHILI_PEPPER.get(), EDItems.WILD_PEANUTS.get());
        this.tag(ModTags.SERVING_CONTAINERS).add(EDItems.GLASS_JAR.get());
    }

    private void registerMinecraftTags() {
        this.tag(ItemTags.SMALL_FLOWERS).add(EDItems.WILD_ASPARAGUS.get(), EDItems.WILD_SWEET_POTATO.get(), EDItems.WILD_CHILI_PEPPER.get(), EDItems.WILD_PEANUTS.get());
        this.tag(ItemTags.PIG_FOOD).add(EDItems.CHILI_PEPPER.get());
        this.tag(ItemTags.CHICKEN_FOOD).add(EDItems.ASPARAGUS_SEEDS.get(), EDItems.CHILI_PEPPER_SEEDS.get());
        this.tag(ItemTags.PARROT_FOOD).add(EDItems.ASPARAGUS_SEEDS.get(), EDItems.CHILI_PEPPER_SEEDS.get());
    }

    private void registerForgeTags() {
        this.tag(EDForgeTags.ORES).addTags(EDForgeTags.ORES_SALT);
        this.tag(EDForgeTags.ORES_SALT).add(EDItems.SALT_ORE.get(), EDItems.DEEPSLATE_SALT_ORE.get());
        this.tag(EDForgeTags.DUSTS).addTags(EDForgeTags.DUSTS_SALT, EDForgeTags.DUSTS_CINNAMON);
        this.tag(EDForgeTags.DUSTS_SALT).add(EDItems.SALT.get());
        this.tag(EDForgeTags.DUSTS_CINNAMON).add(EDItems.CINNAMON.get());
        this.tag(ForgeTags.CROPS).addTags(EDForgeTags.CROPS_ASPARAGUS, EDForgeTags.CROPS_SWEET_POTATO, EDForgeTags.CROPS_CHILI_PEPPER, EDForgeTags.CROPS_PEANUT);
        this.tag(EDForgeTags.CROPS_ASPARAGUS).add(EDItems.ASPARAGUS.get());
        this.tag(EDForgeTags.CROPS_SWEET_POTATO).add(EDItems.SWEET_POTATO.get());
        this.tag(EDForgeTags.CROPS_CHILI_PEPPER).add(EDItems.CHILI_PEPPER.get());
        this.tag(EDForgeTags.CROPS_PEANUT).add(EDItems.PEANUT.get());
        this.tag(ForgeTags.SEEDS).addTags(EDForgeTags.SEEDS_ASPARAGUS, EDForgeTags.SEEDS_SWEET_POTATO, EDForgeTags.SEEDS_CHILI_PEPPER, EDForgeTags.SEEDS_PEANUT);
        this.tag(EDForgeTags.SEEDS_ASPARAGUS).add(EDItems.ASPARAGUS_SEEDS.get());
        this.tag(EDForgeTags.SEEDS_SWEET_POTATO).add(EDItems.SWEET_POTATO.get());
        this.tag(EDForgeTags.SEEDS_CHILI_PEPPER).add(EDItems.CHILI_PEPPER_SEEDS.get());
        this.tag(EDForgeTags.SEEDS_PEANUT).add(EDItems.PEANUT.get());
        this.tag(ForgeTags.VEGETABLES).addTags(EDForgeTags.VEGETABLES_ASPARAGUS, EDForgeTags.VEGETABLES_SWEET_POTATO, EDForgeTags.VEGETABLES_CHILI_PEPPER);
        this.tag(EDForgeTags.VEGETABLES_ASPARAGUS).add(EDItems.ASPARAGUS.get());
        this.tag(EDForgeTags.VEGETABLES_SWEET_POTATO).add(EDItems.SWEET_POTATO.get());
        this.tag(EDForgeTags.VEGETABLES_CHILI_PEPPER).add(EDItems.CHILI_PEPPER.get());
        this.tag(EDForgeTags.CHEESE).add(EDItems.CHEESE_SLICE.get());
        this.tag(EDForgeTags.JAMS).addTags(EDForgeTags.JAMS_SWEET_BERRY, EDForgeTags.JAMS_GLOW_BERRY);
        this.tag(EDForgeTags.JAMS_SWEET_BERRY).add(EDItems.SWEET_BERRY_JELLY.get());
        this.tag(EDForgeTags.JAMS_GLOW_BERRY).add(EDItems.GLOW_BERRY_JELLY.get());
        this.tag(EDForgeTags.JUICES).addTags(EDForgeTags.JUICES_APPLE, EDForgeTags.JUICES_SWEET_BERRY, EDForgeTags.JUICES_GLOW_BERRY);
        this.tag(EDForgeTags.JUICES_APPLE).add(EDItems.APPLE_JUICE.get());
        this.tag(EDForgeTags.JUICES_SWEET_BERRY).add(EDItems.SWEET_BERRY_JUICE.get());
        this.tag(EDForgeTags.JUICES_GLOW_BERRY).add(EDItems.GLOW_BERRY_JUICE.get());
    }

    public void registerCompatibilityTags() {
        this.tag(EDCompatTags.CREATE_UPRIGHT_ON_BELT).add(EDItems.APPLE_JUICE.get());
        this.tag(EDCompatTags.SUPP_COOKIES).add(EDItems.CHOCOLATE_COOKIE.get(), EDItems.SUGAR_COOKIE.get(), EDItems.SNICKERDOODLE.get());
        this.tag(EDCompatTags.TAN_DRINKS).add(EDItems.APPLE_JUICE.get(), EDItems.SWEET_BERRY_JUICE.get(), EDItems.GLOW_BERRY_JUICE.get());
        this.tag(EDCompatTags.SERENE_SEASONS_AUTUMN_CROPS).add(EDItems.SWEET_POTATO.get());
        this.tag(EDCompatTags.SERENE_SEASONS_SPRING_CROPS).add(EDItems.ASPARAGUS_SEEDS.get(), EDItems.PEANUT.get());
        this.tag(EDCompatTags.SERENE_SEASONS_SUMMER_CROPS).add(EDItems.CHILI_PEPPER_SEEDS.get());
    }
}
