package plugins.lol.mc;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger();
		this.getCommand("test").setExecutor(new MyPluginCommandExecutor(this));
	}
	@Override
	public void onDisable() {
		getLogger();
	}
}
