/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.mcdonalds.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class McdonaldsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == McdonaldsModVillagerProfessions.MCDONALDS.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(McdonaldsModItems.BIGMAC.get()), 10, 10, 0.05f));
		}
		if (event.getType() == McdonaldsModVillagerProfessions.MCDONALDS.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(McdonaldsModItems.FRIES.get()), 10, 4, 0.05f));
		}
		if (event.getType() == McdonaldsModVillagerProfessions.MCDONALDS.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(McdonaldsModItems.HAPPY_MEAL.get(), 2), 2, 10, 0.36f));
		}
		if (event.getType() == McdonaldsModVillagerProfessions.MCDONALDS.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(McdonaldsModItems.MC_FLURRY.get()), 6, 5, 0.05f));
		}
		if (event.getType() == McdonaldsModVillagerProfessions.MCDONALDS.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(McdonaldsModItems.MC_NUGGETS.get()), 10, 5, 0.05f));
		}
	}
}