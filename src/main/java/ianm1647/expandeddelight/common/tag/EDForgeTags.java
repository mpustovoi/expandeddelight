package ianm1647.expandeddelight.common.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EDForgeTags {
    public static final TagKey<Item> ORES = forgeItemTag("ores");
    public static final TagKey<Item> ORES_SALT = forgeItemTag("ores/salt");
    public static final TagKey<Item> DUSTS = forgeItemTag("ores");
    public static final TagKey<Item> DUSTS_SALT = forgeItemTag("dusts/salt");
    public static final TagKey<Item> DUSTS_CINNAMON = forgeItemTag("dusts/cinnamon");
    public static final TagKey<Item> CROPS_ASPARAGUS = forgeItemTag("crops/asparagus");
    public static final TagKey<Item> CROPS_SWEET_POTATO = forgeItemTag("crops/sweet_potato");
    public static final TagKey<Item> CROPS_CHILI_PEPPER = forgeItemTag("crops/chili_pepper");
    public static final TagKey<Item> CROPS_PEANUT = forgeItemTag("crops/peanut");
    public static final TagKey<Item> SEEDS_ASPARAGUS = forgeItemTag("seeds/asparagus");
    public static final TagKey<Item> SEEDS_SWEET_POTATO = forgeItemTag("seeds/sweet_potato");
    public static final TagKey<Item> SEEDS_CHILI_PEPPER = forgeItemTag("seeds/chili_pepper");
    public static final TagKey<Item> SEEDS_PEANUT = forgeItemTag("seeds/peanut");
    public static final TagKey<Item> VEGETABLES_ASPARAGUS = forgeItemTag("vegetables/asparagus");
    public static final TagKey<Item> VEGETABLES_SWEET_POTATO = forgeItemTag("vegetables/sweet_potato");
    public static final TagKey<Item> VEGETABLES_CHILI_PEPPER = forgeItemTag("vegetables/chili_pepper");
    public static final TagKey<Item> CHEESE = forgeItemTag("cheese");
    public static final TagKey<Item> FRUITS = forgeItemTag("fruits");
    public static final TagKey<Item> JAMS = forgeItemTag("jams");
    public static final TagKey<Item> JAMS_SWEET_BERRY = forgeItemTag("jams/sweet_berry");
    public static final TagKey<Item> JAMS_GLOW_BERRY = forgeItemTag("jams/glow_berry");
    public static final TagKey<Item> JUICES = forgeItemTag("juices");
    public static final TagKey<Item> JUICES_APPLE = forgeItemTag("juices/apple");
    public static final TagKey<Item> JUICES_SWEET_BERRY = forgeItemTag("juices/sweet_berry");
    public static final TagKey<Item> JUICES_GLOW_BERRY = forgeItemTag("juices/glow_berry");

    public EDForgeTags() {
    }

    private static TagKey<Block> forgeBlockTag(String path) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("forge", path));
    }

    private static TagKey<Item> forgeItemTag(String path) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", path));
    }
}
