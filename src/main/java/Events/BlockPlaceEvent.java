package Events;
;
import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockPlaceEvent implements Listener {
@EventHandler
    public  void block(org.bukkit.event.block.BlockPlaceEvent event){
        Block block = event.getBlock();
        switch (block.getType()){
            case TORCH:
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.DARK_RED+"Nope not placing that block at all");
                break;
            case GLOWSTONE:
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.DARK_RED+"Nope not placing that block at all.");
                break;
            case SHROOMLIGHT:
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.DARK_RED+"You cannot place torches and some other light sources find some you can actually place");
                break;
            case BLUE_BED:
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.DARK_RED+"You cannot sleep so why are you even trying? Also I don't like the color of it");
                break;
            case LEGACY_BED:
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.DARK_RED + "No!");
                break;
            case WALL_TORCH:
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.DARK_RED + "It was a bug before now its not!");
        }
    }

}
