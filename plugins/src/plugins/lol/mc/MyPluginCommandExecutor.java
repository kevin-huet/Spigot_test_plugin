package plugins.lol.mc;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class MyPluginCommandExecutor implements CommandExecutor {
	private final Main plugin;
	Location test;
	public MyPluginCommandExecutor(Main plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (sender instanceof Player) {
	        Player player = (Player) sender;
	        test = player.getLocation();
	        sender.sendMessage(ChatColor.DARK_GREEN+"x = "+test.getX()+ChatColor.RED+" y = "+test.getY()+ChatColor.GOLD+"; z = "+test.getZ());
	    } else {
	        sender.sendMessage("You must be a player!");
	        return false;
	    }
	    // do something
	    return false;
	}
}
