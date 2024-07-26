package ianm1647.expandeddelight.common.registry;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

public class EDBlocks {

    public static final DeferredRegister<Block> BLOCKS;

    public static Supplier<Block> JUICER;
    public static Supplier<Block> CASK;
    public static Supplier<Block> MILK_CASK;
    public static Supplier<Block> CHEESE_CASK;
    public static Supplier<Block> CHEESE_WHEEL;

    public static Supplier<Block> ASPARAGUS_CRATE;
    public static Supplier<Block> SWEET_POTATO_CRATE;
    public static Supplier<Block> CHILI_PEPPER_CRATE;

    public static Supplier<Block> WILD_ASPARAGUS;
    public static Supplier<Block> WILD_SWEET_POTATO;
    public static Supplier<Block> WILD_CHILI_PEPPER;
    public static Supplier<Block> WILD_PEANUTS;

    public static Supplier<Block> SALT_ORE;
    public static Supplier<Block> DEEPSLATE_SALT_ORE;

    public static Supplier<Block> ASPARAGUS_CROP;
    public static Supplier<Block> SWEET_POTATO_CROP;
    public static Supplier<Block> CHILI_PEPPER_CROP;
    public static Supplier<Block> PEANUT_CROP;

    static {
        BLOCKS = DeferredRegister.create(Registries.BLOCK, ExpandedDelight.MODID);

        JUICER = BLOCKS.register("juicer",
                () -> new JuicerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.5F, 1.0F).sound(SoundType.BAMBOO_WOOD)));
        if (!ModList.get().isLoaded("brewinandchewin")) {
            CASK = BLOCKS.register("cask",
                    () -> new CaskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.0F, 1.0F).sound(SoundType.CHERRY_WOOD)));
            MILK_CASK = BLOCKS.register("milk_cask",
                    () -> new MilkCaskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.0F, 1.0F).sound(SoundType.CHERRY_WOOD)));
            CHEESE_CASK = BLOCKS.register("cheese_cask",
                    () -> new CheeseCaskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.0F, 1.0F).sound(SoundType.CHERRY_WOOD)));
            CHEESE_WHEEL = BLOCKS.register("cheese_wheel",
                    () -> new PieBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), EDItems.CHEESE_SLICE));
        }

        ASPARAGUS_CRATE = BLOCKS.register("asparagus_crate",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
        SWEET_POTATO_CRATE = BLOCKS.register("sweet_potato_crate",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
        CHILI_PEPPER_CRATE = BLOCKS.register("chili_pepper_crate",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

        WILD_ASPARAGUS  = BLOCKS.register("wild_asparagus",
                () -> new WildCropBlock(MobEffects.ABSORPTION, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        WILD_SWEET_POTATO  = BLOCKS.register("wild_sweet_potato",
                () -> new WildCropBlock(MobEffects.OOZING, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        WILD_CHILI_PEPPER  = BLOCKS.register("wild_chili_pepper",
                () -> new WildCropBlock(MobEffects.CONFUSION, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));
        WILD_PEANUTS  = BLOCKS.register("wild_peanuts",
                () -> new WildCropBlock(MobEffects.DAMAGE_RESISTANCE, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

        SALT_ORE = BLOCKS.register("salt_ore",
                () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                        .strength(3.0f, 3.0f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
        DEEPSLATE_SALT_ORE = BLOCKS.register("deepslate_salt_ore",
                () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                        .strength(4.5f, 3.0f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

        ASPARAGUS_CROP = BLOCKS.register("asparagus_crop", EDCropBlock::new);
        SWEET_POTATO_CROP = BLOCKS.register("sweet_potato_crop", EDCropBlock::new);
        CHILI_PEPPER_CROP = BLOCKS.register("chili_pepper_crop", EDCropBlock::new);
        PEANUT_CROP = BLOCKS.register("peanut_crop", EDCropBlock::new);

    }
}
