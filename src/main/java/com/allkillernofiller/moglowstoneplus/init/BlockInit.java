package com.allkillernofiller.moglowstoneplus.init;

import com.allkillernofiller.moglowstoneplus.MoGlowstonePlus;
import com.allkillernofiller.moglowstoneplus.block.GSBrick;
import com.allkillernofiller.moglowstoneplus.block.GSSlabBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = MoGlowstonePlus.BLOCKS;
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
}
