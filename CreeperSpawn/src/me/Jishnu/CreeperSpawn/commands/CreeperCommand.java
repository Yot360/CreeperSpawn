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
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (args.length == 0){
                sender.sendMessage(ChatColor.RED+"Please choose a number creepers to spawn");
            }else if (args.length == 1){
                int nmb = Integer.parseInt(args[0]);
                Location loc = player.getLocation();
                World w = player.getWorld();
                for(int i = 0; i < nmb; i++) {
                    w.spawnEntity(loc, EntityType.CREEPER);
                }
            }else {
                player.sendMessage(ChatColor.RED+"Please only enter one argument");
            }
        }
        return false;
    } 
}
