package me.mchiappinam.pdghworkbench;

import org.bukkit.plugin.java.JavaPlugin;

import me.mchiappinam.pdghworkbench.Listeners;

public class Main extends JavaPlugin {
	
	@Override
    public void onEnable() {
		getServer().getPluginManager().registerEvents(new Listeners(this), this);
		getServer().getConsoleSender().sendMessage("§3[PDGHWorkbench] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHWorkbench] §2Acesse: http://pdgh.com.br/");
	}
	
	@Override
    public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHWorkbench] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHWorkbench] §2Acesse: http://pdgh.com.br/");
    }
}