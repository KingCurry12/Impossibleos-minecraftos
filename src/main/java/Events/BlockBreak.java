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
    switch (block.getType()){
        case COAL_ORE:
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Not breaking that block at all");
            break;
        case SHROOMLIGHT:
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Not breaking that block at all.");
            break;
        case GLOWSTONE:
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Not breaking that block!");
            break;
        case END_CRYSTAL:
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Not breaking that block at all!");
            break;
        case STONE_BRICKS:
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"Not breaking that block.");
            break;
        case SPONGE:
            event.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED+"YOU BREAK SPONGE YOU DIE!");
            player.setHealth(0);
            break;
        case JUNGLE_LOG:
            event.setCancelled(true);
            player.sendMessage("No breaking that!");
            break;
        case OAK_LOG:
            event.setCancelled(true);
            player.sendMessage("Not breaking that at all");
            break;
        case BIRCH_LOG:
            event.setCancelled(true);
            player.sendMessage("Dont even dare to break that!");
            break;

    }

    }

}
