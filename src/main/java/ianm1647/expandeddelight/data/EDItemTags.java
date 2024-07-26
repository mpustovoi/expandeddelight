package ianm1647.expandeddelight.data;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.registry.EDItems;
import ianm1647.expandeddelight.common.tag.EDCompatTags;
import ianm1647.expandeddelight.common.tag.EDCommonTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
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
        this.registerNeoForgeTags();
        this.registerCommonTags();
        this.registerCompatibilityTags();
    }

    private void registerModTags() {

    }

    private void registerDelightTags() {
        tag(ModTags.WILD_CROPS_ITEM).add(EDItems.WILD_ASPARAGUS.get(), EDItems.WILD_SWEET_POTATO.get(), EDItems.WILD_CHILI_PEPPER.get(), EDItems.WILD_PEANUTS.get());
        tag(ModTags.SERVING_CONTAINERS).add(EDItems.GLASS_JAR.get());
    }

    private void registerMinecraftTags() {
        tag(ItemTags.SMALL_FLOWERS).add(EDItems.WILD_ASPARAGUS.get(), EDItems.WILD_SWEET_POTATO.get(), EDItems.WILD_CHILI_PEPPER.get(), EDItems.WILD_PEANUTS.get());
        tag(ItemTags.PIG_FOOD).add(EDItems.CHILI_PEPPER.get());
        tag(ItemTags.CHICKEN_FOOD).add(EDItems.ASPARAGUS_SEEDS.get(), EDItems.CHILI_PEPPER_SEEDS.get());
        tag(ItemTags.PARROT_FOOD).add(EDItems.ASPARAGUS_SEEDS.get(), EDItems.CHILI_PEPPER_SEEDS.get());
    }

    private void registerNeoForgeTags() {
        tag(Tags.Items.ORES).addTag(EDCommonTags.ORES_SALT);
        tag(Tags.Items.DUSTS)
                .addTag(EDCommonTags.DUSTS_SALT)
                .addTag(EDCommonTags.DUSTS_CINNAMON);
        tag(Tags.Items.FOODS_VEGETABLE)
                .addTag(EDCommonTags.FOODS_ASPARAGUS)
                .addTag(EDCommonTags.FOODS_SWEET_POTATO)
                .addTag(EDCommonTags.FOODS_CHILI_PEPPER);
        tag(Tags.Items.FOODS_COOKIE)
                .add(EDItems.CHOCOLATE_COOKIE.get())
                .add(EDItems.SUGAR_COOKIE.get())
                .add(EDItems.SNICKERDOODLE.get());
        tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED)
                .add(EDItems.CHEESE_WHEEL.get());
        tag(Tags.Items.FOODS)
                .addTag(EDCommonTags.FOODS_CHEESE);
        tag(Tags.Items.SEEDS)
                .add(EDItems.ASPARAGUS_SEEDS.get())
                .add(EDItems.CHILI_PEPPER_SEEDS.get());
    }

    public void registerCommonTags() {
        tag(EDCommonTags.ORES_SALT).add(EDItems.SALT_ORE.get(), EDItems.DEEPSLATE_SALT_ORE.get());
        tag(EDCommonTags.DUSTS_SALT).add(EDItems.SALT.get());
        tag(EDCommonTags.DUSTS_CINNAMON).add(EDItems.CINNAMON.get());
        tag(EDCommonTags.CROPS_ASPARAGUS).add(EDItems.ASPARAGUS.get());
        tag(EDCommonTags.CROPS_SWEET_POTATO).add(EDItems.SWEET_POTATO.get());
        tag(EDCommonTags.CROPS_CHILI_PEPPER).add(EDItems.CHILI_PEPPER.get());
        tag(EDCommonTags.CROPS_PEANUT).add(EDItems.PEANUT.get());
        tag(EDCommonTags.FOODS_ASPARAGUS).add(EDItems.ASPARAGUS.get());
        tag(EDCommonTags.FOODS_SWEET_POTATO).add(EDItems.SWEET_POTATO.get());
        tag(EDCommonTags.FOODS_CHILI_PEPPER).add(EDItems.CHILI_PEPPER.get());
        tag(EDCommonTags.FOODS_PEANUT).add(EDItems.PEANUT.get());
        tag(EDCommonTags.FOODS_CHEESE).add(EDItems.CHEESE_SLICE.get());
        tag(EDCommonTags.JAMS)
                .addTag(EDCommonTags.JAMS_SWEET_BERRY)
                .addTag(EDCommonTags.JAMS_GLOW_BERRY);
        tag(EDCommonTags.JAMS_SWEET_BERRY).add(EDItems.SWEET_BERRY_JELLY.get());
        tag(EDCommonTags.JAMS_GLOW_BERRY).add(EDItems.GLOW_BERRY_JELLY.get());
        tag(EDCommonTags.JUICES)
                .addTag(EDCommonTags.JUICES_SWEET_BERRY)
                .addTag(EDCommonTags.JUICES_GLOW_BERRY)
                .addTag(EDCommonTags.JUICES_GLOW_BERRY);
        tag(EDCommonTags.JUICES_APPLE).add(EDItems.APPLE_JUICE.get());
        tag(EDCommonTags.JUICES_SWEET_BERRY).add(EDItems.SWEET_BERRY_JUICE.get());
        tag(EDCommonTags.JUICES_GLOW_BERRY).add(EDItems.GLOW_BERRY_JUICE.get());
    }

    public void registerCompatibilityTags() {
        tag(EDCompatTags.CREATE_UPRIGHT_ON_BELT).add(EDItems.APPLE_JUICE.get());
        tag(EDCompatTags.SUPP_COOKIES).add(EDItems.CHOCOLATE_COOKIE.get(), EDItems.SUGAR_COOKIE.get(), EDItems.SNICKERDOODLE.get());
        tag(EDCompatTags.TAN_DRINKS).add(EDItems.APPLE_JUICE.get(), EDItems.SWEET_BERRY_JUICE.get(), EDItems.GLOW_BERRY_JUICE.get());
        tag(EDCompatTags.SERENE_SEASONS_AUTUMN_CROPS).add(EDItems.SWEET_POTATO.get());
        tag(EDCompatTags.SERENE_SEASONS_SPRING_CROPS).add(EDItems.ASPARAGUS_SEEDS.get(), EDItems.PEANUT.get());
        tag(EDCompatTags.SERENE_SEASONS_SUMMER_CROPS).add(EDItems.CHILI_PEPPER_SEEDS.get());
    }
}
