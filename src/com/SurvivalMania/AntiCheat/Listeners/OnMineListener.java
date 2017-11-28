package com.SurvivalMania.AntiCheat.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.SurvivalMania.AntiCheat.Functions;

public class OnMineListener implements Listener {
	
	public static String Prefix = ChatColor.DARK_RED + "" + ChatColor.BOLD + "Anti" + ChatColor.RED + ""
			+ ChatColor.BOLD + "xRay " + ChatColor.GRAY + ">> ";

	@EventHandler
	public void onMine(BlockBreakEvent event) {
		Player player = event.getPlayer();
		String Username = player.getName();

		int blockX = event.getBlock().getX();
		int blockY = event.getBlock().getY();
		int blockZ = event.getBlock().getZ();

		Block b = (Block) event.getBlock();

		if (b.getType() == Material.DIAMOND_ORE) {
			// §
			String msg = Prefix + Username + " Has Mined A Diamond Ore At " + blockX + " " + blockY + " " + blockZ
					+ ".";

			Functions.sendMessage(msg, "Staff.Notify.xRay");
		}
		if (b.getType() == Material.GOLD_ORE) {
			// §
			String msg = Prefix + Username + " Has Mined A Gold Ore At " + blockX + " " + blockY + " " + blockZ + ".";

			Functions.sendMessage(msg, "Staff.Notify.xRay");
		}
		if (b.getType() == Material.EMERALD_ORE) {
			// §
			String msg = Prefix + Username + " Has Mined An Emerald Ore At " + blockX + " " + blockY + " " + blockZ
					+ ".";

			Functions.sendMessage(msg, "Staff.Notify.xRay");
		}
		if (b.getType() == Material.DIAMOND_BLOCK) {
			// §
			String msg = Prefix + Username + " Has Mined A Diamond Block At " + blockX + " " + blockY + " " + blockZ
					+ ".";

			Functions.sendMessage(msg, "Staff.Notify.xRay");
		}
		if (b.getType() == Material.MOB_SPAWNER) {
			// §
			String msg = Prefix + Username + " Has Mined A Spawner At " + blockX + " " + blockY + " " + blockZ + ".";

			Functions.sendMessage(msg, "Staff.Notify.xRay");
		}
	}
}
