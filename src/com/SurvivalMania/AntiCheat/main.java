package com.SurvivalMania.AntiCheat;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import com.SurvivalMania.AntiCheat.Commands.CommandClass;
import com.SurvivalMania.AntiCheat.Listeners.JoinLeaveListener;
import com.SurvivalMania.AntiCheat.Listeners.MoveListener;
import com.SurvivalMania.AntiCheat.Listeners.OnMineListener;
import com.SurvivalMania.AntiCheat.util.Settings;
import com.SurvivalMania.AntiCheat.util.User;
import com.SurvivalMania.checks.CheckResult;

public class main extends JavaPlugin implements Listener {
	private static Plugin plugin;
	public static HashMap<UUID, User> USERS = new HashMap<>();
	
	public void onEnable() {
		getCommand("examplecommand").setExecutor(new CommandClass());
		registerEvents(this, new OnMineListener(), new JoinLeaveListener(), new MoveListener());
		registerEvents(this, this);
		
		plugin = this;
		System.out.println("Plugin Started!");
		
		for (Player p : Bukkit.getOnlinePlayers()) {
			USERS.put(p.getUniqueId(), new User(p));
		}
	}

	public void onDisable() {
		plugin = null;
		System.out.println("Plugin Disabled!");
	}

	public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}

	public static Plugin getPlugin() {
		return plugin;
	}

	public static void log(CheckResult cr, User u) {
		Functions.sendMessage(Settings.prefix + u.getPlayer().getName() + ChatColor.GRAY +  " " + cr.getLevel().toString().toLowerCase() + " " + ChatColor.RESET.toString() +  cr.getType().getName() + "; " + ChatColor.GRAY + cr.getMessage(), Settings.NOTIFY);
	}

}