/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcdonalds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mcdonalds.McdonaldsMod;

public class McdonaldsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McdonaldsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCDONALDSTAB = REGISTRY.register("mcdonaldstab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcdonalds.mcdonaldstab")).icon(() -> new ItemStack(McdonaldsModItems.HAPPY_MEAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McdonaldsModBlocks.M_CDONALDSWORKSTATION.get().asItem());
				tabData.accept(McdonaldsModItems.BIGMAC.get());
				tabData.accept(McdonaldsModItems.FRIES.get());
				tabData.accept(McdonaldsModItems.HAPPY_MEAL.get());
				tabData.accept(McdonaldsModItems.MC_FLURRY.get());
				tabData.accept(McdonaldsModItems.MC_NUGGETS.get());
			}).withSearchBar().build());
}