package com.SurvivalMania.AntiCheat.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.SurvivalMania.AntiCheat.main;
import com.SurvivalMania.AntiCheat.util.User;

public class JoinLeaveListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		main.USERS.put(p.getUniqueId(), new User(p));
	}
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		main.USERS.remove(p.getUniqueId());
	}
}
