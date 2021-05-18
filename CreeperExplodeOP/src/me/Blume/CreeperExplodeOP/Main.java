package me.Blume.CreeperExplodeOP;

import org.bukkit.plugin.java.JavaPlugin;

import me.Blume.CreeperExplodeOP.Listener.creeperexplode;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new creeperexplode(this), this);
	}
	@Override
	public void onDisable() {
		
	}

}
