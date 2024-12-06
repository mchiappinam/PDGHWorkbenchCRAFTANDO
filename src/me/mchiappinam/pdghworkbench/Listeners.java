package me.mchiappinam.pdghworkbench;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class Listeners implements Listener {
	//private Main plugin;
	public Listeners(Main main) {
		//plugin=main;
	}
	
	@EventHandler(priority=EventPriority.MONITOR)
	public void onCraft(CraftItemEvent e) {
	    if((e.getRecipe().getResult().getType()==Material.GOLDEN_APPLE)&&((byte)e.getRecipe().getResult().getData().getData()==1)) {
	    	e.setCancelled(true);
	    	((Player)e.getWhoClicked()).closeInventory();
	    	((Player)e.getWhoClicked()).sendMessage("§cVocê não tem permissões para criar esse item.");
	    }
	}
}
