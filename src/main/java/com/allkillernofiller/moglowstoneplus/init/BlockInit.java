package com.allkillernofiller.moglowstoneplus.init;

import java.util.function.Supplier;

import com.allkillernofiller.moglowstoneplus.MoGlowstonePlus;
import com.allkillernofiller.moglowstoneplus.block.GSBrick;
import com.allkillernofiller.moglowstoneplus.block.GSSlabBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoGlowstonePlus.MOD_ID);
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoGlowstonePlus.MOD_ID);
    /**
     * Mod Blocks
     */
    //slab block
    public static final DeferredBlock<SlabBlock> GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () -> new SlabBlock(Block.Properties.ofFullCopy(Blocks.GLOWSTONE)));
    public static final DeferredBlock<SlabBlock> WHITE_GLOWSTONE_SLAB =
        BLOCKS.register("white_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW)
            .sound(SoundType.GLASS)
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> ORANGE_GLOWSTONE_SLAB =
            BLOCKS.register("orange_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> MAGENTA_GLOWSTONE_SLAB =
            BLOCKS.register("magenta_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_GLOWSTONE_SLAB =
            BLOCKS.register("light_blue_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> LIME_GLOWSTONE_SLAB =
            BLOCKS.register("lime_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> PINK_GLOWSTONE_SLAB =
            BLOCKS.register("pink_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> GRAY_GLOWSTONE_SLAB =
            BLOCKS.register("gray_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));

    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_GLOWSTONE_SLAB =
            BLOCKS.register("light_gray_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));

    public static final DeferredBlock<SlabBlock> CYAN_GLOWSTONE_SLAB =
            BLOCKS.register("cyan_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> PURPLE_GLOWSTONE_SLAB =
            BLOCKS.register("purple_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> BLUE_GLOWSTONE_SLAB =
            BLOCKS.register("blue_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> BROWN_GLOWSTONE_SLAB =
            BLOCKS.register("brown_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> GREEN_GLOWSTONE_SLAB =
            BLOCKS.register("green_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> RED_GLOWSTONE_SLAB =
            BLOCKS.register("red_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<SlabBlock> BLACK_GLOWSTONE_SLAB =
            BLOCKS.register("black_glowstone_slab", registryName -> new GSSlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    //brick block
    public static final DeferredBlock<Block> WHITE_GLOWSTONE_BRICK =
            BLOCKS.register("white_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));

    public static final DeferredBlock<Block> ORANGE_GLOWSTONE_BRICK =
            BLOCKS.register("orange_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> MAGENTA_GLOWSTONE_BRICK =
            BLOCKS.register("magenta_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWSTONE_BRICK =
            BLOCKS.register("light_blueglowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LIME_GLOWSTONE_BRICK =
            BLOCKS.register("lime_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> PINK_GLOWSTONE_BRICK =
            BLOCKS.register("pink_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> GRAY_GLOWSTONE_BRICK =
            BLOCKS.register("gray_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWSTONE_BRICK =
            BLOCKS.register("light_gray_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> CYAN_GLOWSTONE_BRICK =
            BLOCKS.register("cyan_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> PURPLE_GLOWSTONE_BRICK =
            BLOCKS.register("purple_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BLUE_GLOWSTONE_BRICK =
            BLOCKS.register("blue_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BROWN_GLOWSTONE_BRICK =
            BLOCKS.register("brown_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> GREEN_GLOWSTONE_BRICK =
            BLOCKS.register("green_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> RED_GLOWSTONE_BRICK =
            BLOCKS.register("red_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BLACK_GLOWSTONE_BRICK =
            BLOCKS.register("black_glowstone_brick", registryName -> new GSBrick(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.GLASS)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .lightLevel(state -> 15)));
    /**
     * Mod Items
     */
    //slab items
    public static final DeferredItem<BlockItem> GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("glowstone_slab", GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> WHITE_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("white_glowstone_slab", WHITE_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> ORANGE_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("orange_glowstone_slab", ORANGE_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> MAGENTA_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("magenta_glowstone_slab", MAGENTA_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("light_blue_glowstone_slab", LIGHT_BLUE_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> LIME_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("lime_glowstone_slab", LIME_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> PINK_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("pink_glowstone_slab", PINK_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> GRAY_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("gray_glowstone_slab", GRAY_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("light_gray_glowstone_slab", LIGHT_GRAY_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> CYAN_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("cyan_glowstone_slab", CYAN_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> PURPLE_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("purple_glowstone_slab", PURPLE_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> BLUE_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("blue_glowstone_slab", BLUE_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> BROWN_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("brown_glowstone_slab", BROWN_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> GREEN_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("green_glowstone_slab", GREEN_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> RED_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("red_glowstone_slab", RED_GLOWSTONE_SLAB);
    public static final DeferredItem<BlockItem> BLACK_GLOWSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("black_glowstone_slab", BLACK_GLOWSTONE_SLAB);
    //brick items
    public static final DeferredItem<BlockItem> WHITE_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("white_glowstone_brick", WHITE_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> ORANGE_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("orange_glowstone_brick", ORANGE_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> MAGENTA_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("magenta_glowstone_brick", MAGENTA_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("light_blue_glowstone_brick", LIGHT_BLUE_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> LIME_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("lime_glowstone_brick", LIME_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> PINK_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("pink_glowstone_brick", PINK_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> GRAY_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("gray_glowstone_brick", GRAY_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("light_gray_glowstone_brick", LIGHT_GRAY_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> CYAN_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("cyan_glowstone_brick", CYAN_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> PURPLE_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("purple_glowstone_brick", PURPLE_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> BLUE_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("blue_glowstone_brick", BLUE_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> BROWN_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("brown_glowstone_brick", BROWN_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> GREEN_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("green_glowstone_brick", GREEN_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> RED_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("red_glowstone_brick", RED_GLOWSTONE_BRICK);
    public static final DeferredItem<BlockItem> BLACK_GLOWSTONE_BRICK_ITEM = ITEMS.registerSimpleBlockItem("black_glowstone_brick", BLACK_GLOWSTONE_BRICK);
}
