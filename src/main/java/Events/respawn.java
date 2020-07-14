package Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class respawn implements Listener {
    @EventHandler
    public  void respawns(PlayerRespawnEvent event){
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.DARK_RED+"You are severely wounded you cannot see anything you don't know where you are");

        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING , 100 , 10));
        player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS , 100 ,1));
        
    }
}
