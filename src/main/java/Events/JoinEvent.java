package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public  void JoinEvents(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.setHealth(0.5);
        player.sendMessage("You start with 0.5 heart");
        player.sendMessage("Also you can walk in the sneaking speed so RIP");
        player.setMaxHealth(0.5);
        player.setWalkSpeed(0.1f);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 180 , 100));
        player.sendMessage("Also wait 180s so u can break blocks");
    }
}
