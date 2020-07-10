package Events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class DeathEvent implements Listener {

    @EventHandler
    public void death(PlayerDeathEvent event){
        Player player = event.getEntity();
        player.setGameMode(GameMode.SPECTATOR);

    }
}
