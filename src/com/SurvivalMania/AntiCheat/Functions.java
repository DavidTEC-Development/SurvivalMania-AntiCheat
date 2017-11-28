package com.SurvivalMania.AntiCheat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Functions {
	public static void sendMessage(String message, String permission) {
		for (Player p : Bukkit.getOnlinePlayers()) {

			if (p.hasPermission(permission)) {
				p.sendMessage(message);
			}

		}
	}
}
