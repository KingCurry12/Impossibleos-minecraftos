package me._KingCurry_;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main  extends JavaPlugin {

@Override
public void onEnable(){
        getServer().getPluginManager().registerEvents(new Events.EntitySpawnEvent(),  this);
        getServer().getPluginManager().registerEvents(new Events.ItemConsumeEvent(), this);
        getServer().getPluginManager().registerEvents(new Events.SleepEvent(),  this);
        getServer().getPluginManager().registerEvents(new Events.DeathEvent(), this);
        getServer().getPluginManager().registerEvents(new Events.JoinEvent() , this);
        System.out.println("Starting up Impossible+++++");
        }
        }


