package net.mcreator.mcdonalds.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HappyMealItem extends Item {
	public HappyMealItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(10).saturationModifier(1.2f).build()));
	}
}