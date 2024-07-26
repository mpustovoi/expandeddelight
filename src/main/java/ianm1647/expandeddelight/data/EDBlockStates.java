package ianm1647.expandeddelight.data;

import ianm1647.expandeddelight.ExpandedDelight;
import ianm1647.expandeddelight.common.block.EDCropBlock;
import ianm1647.expandeddelight.common.registry.EDBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.block.*;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;

public class EDBlockStates extends BlockStateProvider {
    private static final int DEFAULT_ANGLE_OFFSET = 180;

    public EDBlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExpandedDelight.MODID, existingFileHelper);
    }

    private String blockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return ResourceLocation.fromNamespaceAndPath(ExpandedDelight.MODID, "block/" + path);
    }

    public ModelFile existingModel(Block block) {
        return new ModelFile.ExistingModelFile(this.resourceBlock(this.blockName(block)), this.models().existingFileHelper);
    }

    public ModelFile existingModel(String path) {
        return new ModelFile.ExistingModelFile(this.resourceBlock(path), this.models().existingFileHelper);
    }

    protected void registerStatesAndModels() {
        this.customHorizontalBlock(EDBlocks.JUICER.get(),
                ($) -> this.existingModel(EDBlocks.JUICER.get()));
        this.simpleBlock(EDBlocks.CASK.get(), this.existingModel(EDBlocks.CASK.get()));
        this.simpleBlock(EDBlocks.MILK_CASK.get(), this.existingModel(EDBlocks.MILK_CASK.get()));
        this.simpleBlock(EDBlocks.CHEESE_CASK.get(), this.existingModel(EDBlocks.CHEESE_CASK.get()));
        this.pieBlock(EDBlocks.CHEESE_WHEEL.get());

        this.simpleBlock(EDBlocks.ASPARAGUS_CRATE.get(), this.existingModel(EDBlocks.ASPARAGUS_CRATE.get()));
        this.simpleBlock(EDBlocks.SWEET_POTATO_CRATE.get(), this.existingModel(EDBlocks.SWEET_POTATO_CRATE.get()));
        this.simpleBlock(EDBlocks.CHILI_PEPPER_CRATE.get(), this.existingModel(EDBlocks.CHILI_PEPPER_CRATE.get()));

        this.wildCropBlock(EDBlocks.WILD_ASPARAGUS.get());
        this.wildCropBlock(EDBlocks.WILD_SWEET_POTATO.get());
        this.wildCropBlock(EDBlocks.WILD_CHILI_PEPPER.get());
        this.wildCropBlock(EDBlocks.WILD_PEANUTS.get());

        this.simpleBlock(EDBlocks.SALT_ORE.get(), this.existingModel(EDBlocks.SALT_ORE.get()));
        this.simpleBlock(EDBlocks.DEEPSLATE_SALT_ORE.get(), this.existingModel(EDBlocks.DEEPSLATE_SALT_ORE.get()));

        this.customStageBlock(EDBlocks.ASPARAGUS_CROP.get(), this.mcLoc("crop"), "crop", EDCropBlock.AGE, Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        this.customStageBlock(EDBlocks.SWEET_POTATO_CROP.get(), this.mcLoc("crop"), "crop", EDCropBlock.AGE, Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        this.customStageBlock(EDBlocks.CHILI_PEPPER_CROP.get(), this.mcLoc("crop"), "crop", EDCropBlock.AGE, Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        this.customStageBlock(EDBlocks.PEANUT_CROP.get(), this.mcLoc("crop"), "crop", EDCropBlock.AGE, Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
    }

    public ConfiguredModel[] cubeRandomRotation(Block block, String suffix) {
        String var10000 = this.blockName(block);
        String formattedName = var10000 + (suffix.isEmpty() ? "" : "_" + suffix);
        return ConfiguredModel.allYRotations(this.models().cubeAll(formattedName, this.resourceBlock(formattedName)), 0, false);
    }

    public void customDirectionalBlock(Block block, Function<BlockState, ModelFile> modelFunc, Property<?>... ignored) {
        this.getVariantBuilder(block).forAllStatesExcept((state) -> {
            Direction dir = state.getValue(BlockStateProperties.FACING);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationX(dir == Direction.DOWN ? 180 : (dir.getAxis().isHorizontal() ? 90 : 0)).rotationY(dir.getAxis().isVertical() ? 0 : ((int)dir.toYRot() + 180) % 360).build();
        }, ignored);
    }

    public void customHorizontalBlock(Block block, Function<BlockState, ModelFile> modelFunc, Property<?>... ignored) {
        this.getVariantBuilder(block).forAllStatesExcept(
                (state) -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360).build(), ignored);
    }

    public void stageBlock(Block block, IntegerProperty ageProperty, Property<?>... ignored) {
        this.getVariantBuilder(block).forAllStatesExcept((state) -> {
            int ageSuffix = state.getValue(ageProperty);
            String var10000 = this.blockName(block);
            String stageName = var10000 + "_stage" + ageSuffix;
            return ConfiguredModel.builder().modelFile(((BlockModelBuilder)this.models().cross(stageName, this.resourceBlock(stageName))).renderType("cutout")).build();
        }, ignored);
    }

    public void customStageBlock(Block block, @Nullable ResourceLocation parent, String textureKey, IntegerProperty ageProperty, List<Integer> suffixes, Property<?>... ignored) {
        this.getVariantBuilder(block).forAllStatesExcept((state) -> {
            int ageSuffix = (Integer)state.getValue(ageProperty);
            String var10000 = this.blockName(block);
            String stageName = var10000 + "_stage";
            stageName = stageName + (suffixes.isEmpty() ? ageSuffix : (Integer)suffixes.get(Math.min(suffixes.size(), ageSuffix)));
            return parent == null ? ConfiguredModel.builder().modelFile(((BlockModelBuilder)this.models().cross(stageName, this.resourceBlock(stageName))).renderType("cutout")).build() : ConfiguredModel.builder().modelFile(((BlockModelBuilder)this.models().singleTexture(stageName, parent, textureKey, this.resourceBlock(stageName))).renderType("cutout")).build();
        }, ignored);
    }

    public void wildCropBlock(Block block) {
        this.wildCropBlock(block, false);
    }

    public void wildCropBlock(Block block, boolean isBushCrop) {
        if (isBushCrop) {
            this.simpleBlock(block, ((BlockModelBuilder)this.models().singleTexture(this.blockName(block), this.resourceBlock("bush_crop"), "crop", this.resourceBlock(this.blockName(block)))).renderType("cutout"));
        } else {
            this.simpleBlock(block, ((BlockModelBuilder)this.models().cross(this.blockName(block), this.resourceBlock(this.blockName(block)))).renderType("cutout"));
        }

    }

    public void feastBlock(FeastBlock block) {
        this.getVariantBuilder(block).forAllStates((state) -> {
            IntegerProperty servingsProperty = block.getServingsProperty();
            int servings = (Integer)state.getValue(servingsProperty);
            String suffix = "_stage" + (block.getMaxServings() - servings);
            if (servings == 0) {
                suffix = block.hasLeftovers ? "_leftover" : "_stage" + (servingsProperty.getPossibleValues().toArray().length - 2);
            }

            ConfiguredModel.Builder var10000 = ConfiguredModel.builder();
            String var10002 = this.blockName(block);
            return var10000.modelFile(this.existingModel(var10002 + suffix)).rotationY(((int)((Direction)state.getValue(FeastBlock.FACING)).toYRot() + 180) % 360).build();
        });
    }

    public void doublePlantBlock(Block block) {
        ConfiguredModel.Builder var10000 = this.getVariantBuilder(block).partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).modelForState();
        BlockModelProvider var10001 = this.models();
        String var10002 = this.blockName(block) + "_bottom";
        String var10004 = this.blockName(block);
        var10000 = ((VariantBlockStateBuilder)var10000.modelFile(((BlockModelBuilder)var10001.cross(var10002, this.resourceBlock(var10004 + "_bottom"))).renderType("cutout")).addModel()).partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).modelForState();
        var10001 = this.models();
        var10002 = this.blockName(block) + "_top";
        var10004 = this.blockName(block);
        var10000.modelFile(((BlockModelBuilder)var10001.cross(var10002, this.resourceBlock(var10004 + "_top"))).renderType("cutout")).addModel();
    }

    public void pieBlock(Block block) {
        this.getVariantBuilder(block).forAllStates((state) -> {
            int bites = (Integer)state.getValue(PieBlock.BITES);
            String suffix = bites > 0 ? "_slice" + bites : "";
            ConfiguredModel.Builder var10000 = ConfiguredModel.builder();
            String var10002 = this.blockName(block);
            return var10000.modelFile(this.existingModel(var10002 + suffix)).rotationY(((int)((Direction)state.getValue(PieBlock.FACING)).toYRot() + 180) % 360).build();
        });
    }
}
