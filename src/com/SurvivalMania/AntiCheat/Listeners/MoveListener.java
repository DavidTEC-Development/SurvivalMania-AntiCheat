package com.SurvivalMania.AntiCheat.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.SurvivalMania.AntiCheat.main;
import com.SurvivalMania.AntiCheat.util.Distance;
import com.SurvivalMania.AntiCheat.util.User;
import com.SurvivalMania.checks.CheckResult;
import com.SurvivalMania.checks.movement.SpeedCheck;

public class MoveListener implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		User u = main.USERS.get(e.getPlayer().getUniqueId());
		Distance d = new Distance(e);
		CheckResult speed = SpeedCheck.runCheck(d, u);
		if (speed.failed()) {
			e.setTo(e.getFrom());
			main.log(speed, u);
		}
	}

}
