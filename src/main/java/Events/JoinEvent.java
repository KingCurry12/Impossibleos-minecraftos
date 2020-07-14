package Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.*;

public class JoinEvent implements Listener {
    @EventHandler
    public void JoinEvents(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setHealth(0.5);
        player.sendMessage("You start with 0.5 heart");
        player.sendMessage("Also you can only walk in the sneaking speed so RIP");
        player.setMaxHealth(0.5);
        player.setWalkSpeed(0.1f);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 1400, 10));
        player.sendMessage("Also wait 180s so u can break blocks");
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = manager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("Test", "deathCount");
        objective.setDisplayName(ChatColor.DARK_RED+"Deaths:");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        player.setScoreboard(scoreboard);

    }
}
