package net.mcreator.mcdonalds.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class FriesItem extends Item {
	public FriesItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}
}