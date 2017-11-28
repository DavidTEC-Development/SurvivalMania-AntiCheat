package com.SurvivalMania.AntiCheat.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandClass implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		if (str.toString().toLowerCase().equals("examplecommand")) {
			sender.sendMessage("Hello!");
			
			return true;
		}
		return false;
	}
	
}
