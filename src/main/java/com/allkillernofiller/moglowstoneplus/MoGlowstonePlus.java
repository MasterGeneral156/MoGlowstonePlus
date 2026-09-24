package com.allkillernofiller.moglowstoneplus;

import com.allkillernofiller.moglowstoneplus.init.BlockInit;
import com.themastergeneral.ctdcore.helpers.ModUtils;
import com.themastergeneral.moglowstone.TabRegistry;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("moglowstoneplus")
public class MoGlowstonePlus {
	public static MoGlowstonePlus instance;
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moglowstoneplus";

    public MoGlowstonePlus(IEventBus modbus, ModContainer modContainer) {
		instance = this;
        modbus.addListener(this::fillTab);
        BlockInit.BLOCKS.register(modbus);
		BlockInit.ITEMS.register(modbus);
    }

	private void setup(final FMLCommonSetupEvent event)
	{
		LOGGER.info("Mo' Glowstonez+ for Minecraft b" + ModUtils.getMCVersion() + " is launching.");
	}


	private void fillTab(BuildCreativeModeTabContentsEvent ev)
	{
		if (ev.getTabKey() == TabRegistry.MOGLOWSTONE_TAB.getKey())
		{
			ev.accept(BlockInit.BLACK_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.BLACK_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.BLUE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.BLUE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.BROWN_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.BROWN_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.CYAN_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.CYAN_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.GRAY_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.GRAY_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.GREEN_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.GREEN_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.LIGHT_BLUE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.LIGHT_BLUE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.LIGHT_GRAY_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.LIGHT_GRAY_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.LIME_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.LIME_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.MAGENTA_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.MAGENTA_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.ORANGE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.ORANGE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.PINK_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.PINK_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.PURPLE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.PURPLE_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.RED_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.RED_GLOWSTONE_SLAB_ITEM);
			ev.accept(BlockInit.WHITE_GLOWSTONE_BRICK_ITEM);
			ev.accept(BlockInit.WHITE_GLOWSTONE_SLAB_ITEM);
		}
	}
}
