package me.Jishnu.CreeperSpawn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;

import me.Jishnu.CreeperSpawn.Main;

public class CreeperCommand implements CommandExecutor {
    private Main plugin;
     
    public CreeperCommand(Main plugin) {
    	this.plugin = plugin;
    	plugin.getCommand("creepspawn").setExecutor(this);
    } 
    
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		Location loc = player.getLocation();
		World w = player.getWorld();
		for(int i = 0; i < 10; i++) {
			w.spawnEntity(loc, EntityType.CREEPER);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return false;
	}
     
}
