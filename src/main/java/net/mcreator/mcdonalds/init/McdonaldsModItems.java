/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcdonalds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mcdonalds.item.McNuggetsItem;
import net.mcreator.mcdonalds.item.McFlurryItem;
import net.mcreator.mcdonalds.item.HappyMealItem;
import net.mcreator.mcdonalds.item.FriesItem;
import net.mcreator.mcdonalds.item.BigmacItem;
import net.mcreator.mcdonalds.McdonaldsMod;

public class McdonaldsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(McdonaldsMod.MODID);
	public static final DeferredItem<Item> M_CDONALDSWORKSTATION = block(McdonaldsModBlocks.M_CDONALDSWORKSTATION);
	public static final DeferredItem<Item> BIGMAC = REGISTRY.register("bigmac", BigmacItem::new);
	public static final DeferredItem<Item> FRIES = REGISTRY.register("fries", FriesItem::new);
	public static final DeferredItem<Item> HAPPY_MEAL = REGISTRY.register("happy_meal", HappyMealItem::new);
	public static final DeferredItem<Item> MC_FLURRY = REGISTRY.register("mc_flurry", McFlurryItem::new);
	public static final DeferredItem<Item> MC_NUGGETS = REGISTRY.register("mc_nuggets", McNuggetsItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}