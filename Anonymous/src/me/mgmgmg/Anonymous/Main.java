package me.mgmgmg.Anonymous;

import org.bukkit.plugin.java.JavaPlugin;

import me.mgmgmg.Anonymous.Events.ChatEvent;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		System.out.println("[Anonymous] Plugin Enabled.");
		getServer().getPluginManager().registerEvents(new ChatEvent(), this);
	}
	
	public void onDisable() {
		System.out.println("[Anonymous] Plugin Disabled.");
	}
}
