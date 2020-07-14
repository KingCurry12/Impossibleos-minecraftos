package Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemConsumeEvent  implements Listener {
    @EventHandler
    public void ConsumeEvent(PlayerItemConsumeEvent event){
        Player player = event.getPlayer();
        ItemStack itemStack = player.getInventory().getItemInMainHand();
            player.setHealth(0.1);
            player.sendMessage(ChatColor.DARK_RED+"You Fool Everytime you eat  your health goes down");
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING , 180 , 10));
      ;
    }
}
