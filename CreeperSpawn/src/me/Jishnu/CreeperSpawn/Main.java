package me.Jishnu.CreeperSpawn;

import org.bukkit.plugin.java.JavaPlugin;
import me.Jishnu.CreeperSpawn.commands.CreeperCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new CreeperCommand(this);
	}
}
