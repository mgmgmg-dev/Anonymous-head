package me.mgmgmg.Anonymous.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener{
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		
		String message = e.getMessage().trim();
		
		if(e.getPlayer().hasPermission("chat.anonymous")) {
			if(e.getPlayer().getInventory().getArmorContents()[3] != null ) {
				if(e.getPlayer().getInventory().getArmorContents()[3].getType() == Material.SKULL_ITEM) {
					if(message != null) {
						e.setFormat(ChatColor.DARK_GRAY + "Anonymous" + ChatColor.GRAY + " > " + ChatColor.BLUE + message);
					}
					
					System.out.println(e.getPlayer().getName() + " as anonymous: " + message);
				}
			}
		}
	}
}
