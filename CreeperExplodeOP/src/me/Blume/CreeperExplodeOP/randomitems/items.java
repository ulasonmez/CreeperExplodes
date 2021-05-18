package me.Blume.CreeperExplodeOP.randomitems;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
	public int helmetindex,chestplateindex,leggingsindex,bootsindex,swordindex,
				axeindex,pickaxeindex,bowindex,shovelindex,level;
	public Enchantment[] helmetench= {Enchantment.PROTECTION_ENVIRONMENTAL,
			  						Enchantment.THORNS};
	public Enchantment[] chestplateench= {Enchantment.PROTECTION_ENVIRONMENTAL,
											Enchantment.THORNS};
	public Enchantment[] leggingsench= {Enchantment.PROTECTION_ENVIRONMENTAL,
										Enchantment.THORNS};
	public Enchantment[] bootsench= {Enchantment.PROTECTION_FALL,
									Enchantment.PROTECTION_ENVIRONMENTAL,
									Enchantment.THORNS,
									Enchantment.DEPTH_STRIDER};
	public Enchantment[] swordench= {Enchantment.DAMAGE_ALL,
			  Enchantment.LOOT_BONUS_MOBS,
			Enchantment.FIRE_ASPECT,
			Enchantment.KNOCKBACK};
	public Enchantment[] axeench= {Enchantment.DIG_SPEED,
							Enchantment.DAMAGE_ALL};
	public Enchantment[] bowench= {Enchantment.ARROW_DAMAGE,
			Enchantment.ARROW_INFINITE,
			Enchantment.ARROW_FIRE,
			Enchantment.ARROW_KNOCKBACK};
	public Enchantment[] pickaxeench= {Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.DIG_SPEED};
	public Enchantment[] shovelench= {Enchantment.DIG_SPEED};
	
	
	public void helmetmeta(ItemStack helmet) {
		ItemMeta meta = helmet.getItemMeta();
		meta.addEnchant(helmetench[helmetindex], level, true);
		helmet.setItemMeta(meta);
	}
	public void chestplatemeta(ItemStack chestplate) {
		ItemMeta meta = chestplate.getItemMeta();
		meta.addEnchant(chestplateench[chestplateindex], level, true);
		chestplate.setItemMeta(meta);
	}
	public void leggingsmeta(ItemStack leggings) {
		ItemMeta meta = leggings.getItemMeta();
		meta.addEnchant(leggingsench[leggingsindex], level, true);
		leggings.setItemMeta(meta);
	}
	public void bootsmeta(ItemStack boots) {
		ItemMeta meta = boots.getItemMeta();
		meta.addEnchant(bootsench[bootsindex], level, true);
		boots.setItemMeta(meta);
	}
	public void swordmeta(ItemStack sword) {
		ItemMeta meta = sword.getItemMeta();
		meta.addEnchant(swordench[swordindex], level, true);
		sword.setItemMeta(meta);
	}
	public void axemeta(ItemStack axe) {
		ItemMeta meta = axe.getItemMeta();
		meta.addEnchant(axeench[axeindex], level, true);
		axe.setItemMeta(meta);
	}
	public void bowmeta(ItemStack bow) {
		ItemMeta meta = bow.getItemMeta();
		meta.addEnchant(bowench[bowindex], level, true);
		bow.setItemMeta(meta);
	}
	public void pickaxemeta(ItemStack pickaxe) {
		ItemMeta meta = pickaxe.getItemMeta();
		meta.addEnchant(pickaxeench[pickaxeindex], level, true);
		pickaxe.setItemMeta(meta);
	}
	public void shovelmeta(ItemStack shovel) {
		ItemMeta meta = shovel.getItemMeta();
		meta.addEnchant(shovelench[shovelindex], level, true);
		shovel.setItemMeta(meta);
	}
	
}
