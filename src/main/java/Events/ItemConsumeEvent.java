package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class ItemConsumeEvent  implements Listener {
    @EventHandler
    public void ConsumeEvent(PlayerItemConsumeEvent event){
        Player player = event.getPlayer();
        player.setHealth(0.1);
        player.sendMessage(ChatColor.Red +"You Fool Everytime you drink, eat , consume anything your health goes down");
    }
}
