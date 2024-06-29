package com.allkillernofiller.moglowstoneplus.init;

import java.util.function.Supplier;

import com.allkillernofiller.moglowstoneplus.MoGlowstonePlus;
import com.allkillernofiller.moglowstoneplus.block.GSBrick;
import com.allkillernofiller.moglowstoneplus.block.GSSlabBlock;
import com.allkillernofiller.moglowstoneplus.item.BlockItemCreativeTab;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public class BlockInit {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoGlowstonePlus.MOD_ID);
    public static Items ITEMS = DeferredRegister.createItems(MoGlowstonePlus.MOD_ID);

    /**
     * Mod Blocks
     */
    //slab block
    //TODO Maybe add normal slabs for glowstone?
    public static final Supplier<SlabBlock> GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () -> new SlabBlock(Block.Properties.ofFullCopy(Blocks.GLOWSTONE)));
    public static final Supplier<SlabBlock> WHITE_GLOWSTONE_SLAB = BLOCKS.register("white_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> ORANGE_GLOWSTONE_SLAB = BLOCKS.register("orange_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> MAGENTA_GLOWSTONE_SLAB = BLOCKS.register("magenta_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> LIGHT_BLUE_GLOWSTONE_SLAB = BLOCKS.register("light_blue_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> LIME_GLOWSTONE_SLAB = BLOCKS.register("lime_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> PINK_GLOWSTONE_SLAB = BLOCKS.register("pink_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> GRAY_GLOWSTONE_SLAB = BLOCKS.register("gray_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> LIGHT_GRAY_GLOWSTONE_SLAB = BLOCKS.register("light_gray_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> CYAN_GLOWSTONE_SLAB = BLOCKS.register("cyan_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> PURPLE_GLOWSTONE_SLAB = BLOCKS.register("purple_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> BLUE_GLOWSTONE_SLAB = BLOCKS.register("blue_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> BROWN_GLOWSTONE_SLAB = BLOCKS.register("brown_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> GREEN_GLOWSTONE_SLAB = BLOCKS.register("green_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> RED_GLOWSTONE_SLAB = BLOCKS.register("red_glowstone_slab", GSSlabBlock::new);
    public static final Supplier<SlabBlock> BLACK_GLOWSTONE_SLAB = BLOCKS.register("black_glowstone_slab", GSSlabBlock::new);
    //brick block
    public static final Supplier<Block> WHITE_GLOWSTONE_BRICK = BLOCKS.register("white_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> ORANGE_GLOWSTONE_BRICK = BLOCKS.register("orange_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> MAGENTA_GLOWSTONE_BRICK = BLOCKS.register("magenta_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> LIGHT_BLUE_GLOWSTONE_BRICK = BLOCKS.register("light_blue_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> LIME_GLOWSTONE_BRICK = BLOCKS.register("lime_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> PINK_GLOWSTONE_BRICK = BLOCKS.register("pink_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> GRAY_GLOWSTONE_BRICK = BLOCKS.register("gray_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> LIGHT_GRAY_GLOWSTONE_BRICK = BLOCKS.register("light_gray_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> CYAN_GLOWSTONE_BRICK = BLOCKS.register("cyan_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> PURPLE_GLOWSTONE_BRICK = BLOCKS.register("purple_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> BLUE_GLOWSTONE_BRICK = BLOCKS.register("blue_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> BROWN_GLOWSTONE_BRICK = BLOCKS.register("brown_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> GREEN_GLOWSTONE_BRICK = BLOCKS.register("green_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> RED_GLOWSTONE_BRICK = BLOCKS.register("red_glowstone_brick", GSBrick::new);
    public static final Supplier<Block> BLACK_GLOWSTONE_BRICK = BLOCKS.register("black_glowstone_brick", GSBrick::new);

    /**
     * Mod Items
     */
    //slab items
    public static final Supplier<BlockItemCreativeTab> GLOWSTONE_SLAB_ITEM = ITEMS.register("glowstone_slab", () -> new BlockItemCreativeTab(GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> WHITE_GLOWSTONE_SLAB_ITEM = ITEMS.register("white_glowstone_slab", () -> new BlockItemCreativeTab(WHITE_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> ORANGE_GLOWSTONE_SLAB_ITEM = ITEMS.register("orange_glowstone_slab", () -> new BlockItemCreativeTab(ORANGE_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> MAGENTA_GLOWSTONE_SLAB_ITEM = ITEMS.register("magenta_glowstone_slab", () -> new BlockItemCreativeTab(MAGENTA_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> LIGHT_BLUE_GLOWSTONE_SLAB_ITEM = ITEMS.register("light_blue_glowstone_slab", () -> new BlockItemCreativeTab(LIGHT_BLUE_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> LIME_GLOWSTONE_SLAB_ITEM = ITEMS.register("lime_glowstone_slab", () -> new BlockItemCreativeTab(LIME_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> PINK_GLOWSTONE_SLAB_ITEM = ITEMS.register("pink_glowstone_slab", () -> new BlockItemCreativeTab(PINK_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> GRAY_GLOWSTONE_SLAB_ITEM = ITEMS.register("gray_glowstone_slab", () -> new BlockItemCreativeTab(GRAY_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> LIGHT_GRAY_GLOWSTONE_SLAB_ITEM = ITEMS.register("light_gray_glowstone_slab", () -> new BlockItemCreativeTab(LIGHT_GRAY_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> CYAN_GLOWSTONE_SLAB_ITEM = ITEMS.register("cyan_glowstone_slab", () -> new BlockItemCreativeTab(CYAN_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> PURPLE_GLOWSTONE_SLAB_ITEM = ITEMS.register("purple_glowstone_slab", () -> new BlockItemCreativeTab(PURPLE_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> BLUE_GLOWSTONE_SLAB_ITEM = ITEMS.register("blue_glowstone_slab", () -> new BlockItemCreativeTab(BLUE_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> BROWN_GLOWSTONE_SLAB_ITEM = ITEMS.register("brown_glowstone_slab", () -> new BlockItemCreativeTab(BROWN_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> GREEN_GLOWSTONE_SLAB_ITEM = ITEMS.register("green_glowstone_slab", () -> new BlockItemCreativeTab(GREEN_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> RED_GLOWSTONE_SLAB_ITEM = ITEMS.register("red_glowstone_slab", () -> new BlockItemCreativeTab(RED_GLOWSTONE_SLAB.get()));
    public static final Supplier<BlockItemCreativeTab> BLACK_GLOWSTONE_SLAB_ITEM = ITEMS.register("black_glowstone_slab", () -> new BlockItemCreativeTab(BLACK_GLOWSTONE_SLAB.get()));
    //brick items
    public static final Supplier<BlockItemCreativeTab> WHITE_GLOWSTONE_BRICK_ITEM = ITEMS.register("white_glowstone_brick", () -> new BlockItemCreativeTab(WHITE_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> ORANGE_GLOWSTONE_BRICK_ITEM = ITEMS.register("orange_glowstone_brick", () -> new BlockItemCreativeTab(ORANGE_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> MAGENTA_GLOWSTONE_BRICK_ITEM = ITEMS.register("magenta_glowstone_brick", () -> new BlockItemCreativeTab(MAGENTA_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> LIGHT_BLUE_GLOWSTONE_BRICK_ITEM = ITEMS.register("light_blue_glowstone_brick", () -> new BlockItemCreativeTab(LIGHT_BLUE_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> LIME_GLOWSTONE_BRICK_ITEM = ITEMS.register("lime_glowstone_brick", () -> new BlockItemCreativeTab(LIME_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> PINK_GLOWSTONE_BRICK_ITEM = ITEMS.register("pink_glowstone_brick", () -> new BlockItemCreativeTab(PINK_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> GRAY_GLOWSTONE_BRICK_ITEM = ITEMS.register("gray_glowstone_brick", () -> new BlockItemCreativeTab(GRAY_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> LIGHT_GRAY_GLOWSTONE_BRICK_ITEM = ITEMS.register("light_gray_glowstone_brick", () -> new BlockItemCreativeTab(LIGHT_GRAY_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> CYAN_GLOWSTONE_BRICK_ITEM = ITEMS.register("cyan_glowstone_brick", () -> new BlockItemCreativeTab(CYAN_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> PURPLE_GLOWSTONE_BRICK_ITEM = ITEMS.register("purple_glowstone_brick", () -> new BlockItemCreativeTab(PURPLE_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> BLUE_GLOWSTONE_BRICK_ITEM = ITEMS.register("blue_glowstone_brick", () -> new BlockItemCreativeTab(BLUE_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> GREEN_GLOWSTONE_BRICK_ITEM = ITEMS.register("green_glowstone_brick", () -> new BlockItemCreativeTab(GREEN_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> BROWN_GLOWSTONE_BRICK_ITEM = ITEMS.register("brown_glowstone_brick", () -> new BlockItemCreativeTab(BROWN_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> RED_GLOWSTONE_BRICK_ITEM = ITEMS.register("red_glowstone_brick", () -> new BlockItemCreativeTab(RED_GLOWSTONE_BRICK.get()));
    public static final Supplier<BlockItemCreativeTab> BLACK_GLOWSTONE_BRICK_ITEM = ITEMS.register("black_glowstone_brick", () -> new BlockItemCreativeTab(BLACK_GLOWSTONE_BRICK.get()));
}
