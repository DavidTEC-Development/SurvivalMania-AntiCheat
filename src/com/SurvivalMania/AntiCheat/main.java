package com.SurvivalMania.AntiCheat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
	public void onEnable() {
		System.out.println("Plugin Started!");
	}

	public void onDisable() {
		System.out.println("Plugin Disabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("discord")) {
			p.sendMessage("COMMAND OUTOUT");
			
			return true;
		}
		
		return false;
	}
}