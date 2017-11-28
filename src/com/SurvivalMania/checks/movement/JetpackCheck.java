package com.SurvivalMania.checks.movement;

import com.SurvivalMania.AntiCheat.checks.CheckType;
import com.SurvivalMania.AntiCheat.util.Distance;
import com.SurvivalMania.AntiCheat.util.Settings;
import com.SurvivalMania.AntiCheat.util.User;
import com.SurvivalMania.checks.CheckResult;
import com.SurvivalMania.checks.Level;
import org.bukkit.ChatColor;

public class JetpackCheck {
	private static final CheckResult PASS = new CheckResult(Level.PASSED, null, CheckType.SPEED);

	public static CheckResult runCheck(Distance d, User u) {
		Double xy_speed = ((d.getxDiff() > d.getyDiff() ? d.getxDiff() : d.getyDiff()));

		if (xy_speed > Settings.MAX_XY_SPEED) {
			return new CheckResult(Level.DEFINITLY, "tried to jump quicker than normal. (Speed:" + xy_speed.toString()
					+ ". Max:" + Settings.MAX_XY_SPEED + ")", CheckType.JETPACK);
		}
		
		return PASS;
	}
}
