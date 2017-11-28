package com.SurvivalMania.checks.movement;

import com.SurvivalMania.AntiCheat.checks.CheckType;
import com.SurvivalMania.AntiCheat.util.Distance;
import com.SurvivalMania.AntiCheat.util.Settings;
import com.SurvivalMania.AntiCheat.util.User;
import com.SurvivalMania.checks.CheckResult;
import com.SurvivalMania.checks.Level;
import org.bukkit.ChatColor;

public class SpeedCheck {
	private static final CheckResult PASS = new CheckResult(Level.PASSED, null, CheckType.SPEED);
	
	public static CheckResult runCheck(Distance d, User u) {
		Double xz_speed = ((d.getxDiff() > d.getzDiff() ? d.getxDiff() : d.getzDiff()));
		
		if (xz_speed > Settings.MAX_XZ_SPEED) {
			return new CheckResult(Level.DEFINITLY, "tried to move faster than normal. (Speed:" + xz_speed.toString() + ". Max:" + Settings.MAX_XZ_SPEED  + ")", CheckType.SPEED);
		}
		
		return PASS;
	}
}
