package Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak  implements Listener {
    @EventHandler
    public  void Break(BlockBreakEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();
        if(block.getType().equals(Material.COAL_ORE)){
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"DUDE DON'T EVEN TRY!");
        }
        if(block.getType().equals(Material.BIRCH_LOG)){
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Just No!");
        }
        if(block.getType().equals(Material.JUNGLE_LOG)){
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Find Another one IDC");
        }
        if(block.getType().equals(Material.OAK_LOG)){
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED + "Find Another One please!");
        }
        if(block.getType().equals(Material.END_CRYSTAL)){
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED + "It is invincible!");
        }

    }

}
