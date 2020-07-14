package Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockPlaceEvent implements Listener {
@EventHandler
    public  void block(org.bukkit.event.block.BlockPlaceEvent event){
        Block block = event.getBlock();
        if(block.getType().equals(Material.TORCH)){
            event.setCancelled(true);
            event.getPlayer().sendMessage("Nope not placing that block at all");
        }
        if(block.getType().equals(Material.GLOWSTONE)){
            event.setCancelled(true);
            event.getPlayer().sendMessage("Nope not placing that block at all");
        }
        if(block.getType().equals(Material.SHROOMLIGHT)){
            event.setCancelled(true);
            event.getPlayer().sendMessage("Nope not placing that block at all" );
        }
        if(block.getType().equals(Material.BLUE_BED)){
            event.setCancelled(true);
            event.getPlayer().sendMessage("Nope! This bed looks shit use another one");
        }
        if(block.getType().equals(Material.LEGACY_BED)){
            event.setCancelled(true);
            event.getPlayer().sendMessage("Nope!");
        }
    }

}
