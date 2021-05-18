package me.Blume.CreeperExplodeOP.Listener;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.ItemStack;

import me.Blume.CreeperExplodeOP.Main;
import me.Blume.CreeperExplodeOP.randomitems.items;

public class creeperexplode implements Listener{
	@SuppressWarnings("unused")
	private Main plugin;
	public creeperexplode(Main plugin) {
		this.plugin=plugin;
	}
	Random rand = new Random();
	items item = new items();
	int randomitem,enchnumber,randomitem2;
	@EventHandler
	public void creeperExplode(EntityExplodeEvent event) {
		Creature e = (Creature) event.getEntity();
		if(e instanceof Creeper) {
			Location loc = e.getLocation();
			World world = e.getWorld();
			
			randomitem2=rand.nextInt(3)+1;
			for(int a =0;a<randomitem2;a++) {
				randomitem = rand.nextInt(100)+1;
			if(randomitem>=1 && randomitem<=3) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.TOTEM_OF_UNDYING));
			}
			if(randomitem>=4 && randomitem<=14) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.IRON_BLOCK));
			}
			if(randomitem>=15 && randomitem<=24) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.DIAMOND,5));
			}
			if(randomitem==25) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.ELYTRA));
			}
			if(randomitem>=26 && randomitem<=27) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
			}
			if(randomitem>=28 && randomitem<=37) {

				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.GOLDEN_APPLE));
			}
			
			if(randomitem>=38 && randomitem<=42) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.NETHERITE_INGOT,2));
			}
			if(randomitem>=43 && randomitem<=52) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.GOLD_INGOT,10));
			}
			if(randomitem>=53 && randomitem<=57) {
				
				enchnumber = rand.nextInt(2)+2;
				ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
				for(int i =0;i<enchnumber;i++) {
					item.helmetindex =rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.helmetmeta(helmet);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), helmet);
			}
			if(randomitem>=58 && randomitem<=62) {
				
				enchnumber = rand.nextInt(2)+2;
				ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
				for(int i =0;i<enchnumber;i++) {
					item.chestplateindex =rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.chestplatemeta(chestplate);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), chestplate);
			}
			if(randomitem>=63 && randomitem<=67) {
				
				
				enchnumber = rand.nextInt(2)+2;
				ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
				for(int i =0;i<enchnumber;i++) {
					item.leggingsindex =rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.leggingsmeta(leggings);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), leggings);
			}
			if(randomitem>=68 && randomitem<=72) {
				
				enchnumber = rand.nextInt(4)+1;
				
				ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
				for(int i =0;i<enchnumber;i++) {
					item.bootsindex=rand.nextInt(4);
					item.level=rand.nextInt(6)+5;
					item.bootsmeta(boots);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), boots);
			}
			if(randomitem>=73 && randomitem<=77) {
				
				enchnumber = rand.nextInt(4)+1;
				
				ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
				for(int i =0;i<enchnumber;i++) {
					item.axeindex=rand.nextInt(4);
					item.level=rand.nextInt(6)+5;
					item.axemeta(axe);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), axe);
			}
			if(randomitem>=78 && randomitem<=82) {
				
				enchnumber = rand.nextInt(4)+1;
				ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
				for(int i =0;i<enchnumber;i++) {
					item.swordindex=rand.nextInt(4);
					item.level=rand.nextInt(6)+5;
					item.swordmeta(sword);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), sword);
			}
			
			if(randomitem>=83 && randomitem<=87) {
				
				enchnumber = rand.nextInt(4)+1;
				ItemStack bow = new ItemStack(Material.BOW);
				for(int i =0;i<enchnumber;i++) {
					item.bowindex=rand.nextInt(4);
					item.level=rand.nextInt(6)+5;
					item.bowmeta(bow);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), bow);
			}
			if(randomitem>=87 && randomitem<=92) {
				
				enchnumber = rand.nextInt(2)+1;
				ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);		
				for(int i =0;i<enchnumber;i++) {
					item.pickaxeindex=rand.nextInt(2);
					item.level=rand.nextInt(6)+5;
					item.pickaxemeta(pickaxe);
				}
				world.dropItemNaturally(loc.clone().add(0, 1, 0), pickaxe);
				}
			if(randomitem>=93 && randomitem<=96) {
				item.pickaxeindex=0;
				item.level=rand.nextInt(6)+5;
				ItemStack shovel = new ItemStack(Material.DIAMOND_SHOVEL);
				item.shovelmeta(shovel);
			}
			if(randomitem>=97 && randomitem<=100) {
				world.dropItemNaturally(loc.clone().add(0, 1, 0), new ItemStack(Material.GOLD_INGOT,10));
			}
			}
		}
	}
}

