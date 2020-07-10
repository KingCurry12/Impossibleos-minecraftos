package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class SleepEvent implements Listener {
    @EventHandler
    public  void Sleep(PlayerBedEnterEvent event){
        event.setCancelled(true);

    }
    public void SleepLeft(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.setHealth(0);
        player.sendMessage("SomeHow you slept");
    }
}
