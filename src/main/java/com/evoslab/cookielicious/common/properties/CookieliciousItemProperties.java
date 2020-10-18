package com.evoslab.cookielicious.common.properties;

import com.minecraftabnormals.neapolitan.core.registry.NeapolitanEffects;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;

public final class CookieliciousItemProperties {
	
	public static final Item.Properties VANILLA = new Properties()
			.group(ItemGroup.FOOD)
			.food(new Food.Builder()
					.hunger(2)
					.saturation(1f)
					.effect(()-> new EffectInstance(NeapolitanEffects.VANILLA_SCENT.get(), 120, 0), 1)
					.fastToEat()
					.build());
	
	public static final Item.Properties SANDWICH = new Properties()
			.group(ItemGroup.FOOD)
			.food(new Food.Builder()
					.hunger(4)
					.saturation(0.5f)
					.effect(()-> new EffectInstance(NeapolitanEffects.SUGAR_RUSH.get(), 120, 0), 1f)
					.fastToEat()
					.build());
	
	public static final Item.Properties STRAWBERRY = new Properties()
			.group(ItemGroup.FOOD)
			.food(new Food.Builder()
					.hunger(2)
					.saturation(1F)
					.fastToEat()
					.build());
	
}
