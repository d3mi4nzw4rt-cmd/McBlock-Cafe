package net.mcreator.mcdonalds.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BigmacItem extends Item {
	public BigmacItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.5f).build()));
	}
}