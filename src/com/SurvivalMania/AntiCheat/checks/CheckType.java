package com.SurvivalMania.AntiCheat.checks;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;

public enum CheckType {
	SPEED("Speed", new Permission("smac.bypass.speed")), JETPACK("Jetpack/Fly", new Permission("smac.bypass.jetpack"));
	
	private String name;
	private Permission perm;
	
	private CheckType(String name, Permission perm) {
		this.name = name;
		this.perm = perm;
		
		Bukkit.getPluginManager().addPermission(perm);
	}

	public String getName() {
		return name;
	}

	public Permission getPerm() {
		return perm;
	}
}
