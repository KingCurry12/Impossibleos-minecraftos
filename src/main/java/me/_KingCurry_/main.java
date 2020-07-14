package me._KingCurry_;



import org.bukkit.plugin.java.JavaPlugin;

public class main  extends JavaPlugin {

@Override
public void onEnable(){
        getServer().getPluginManager().registerEvents(new Events.EntitySpawnEvent(),  this);
        getServer().getPluginManager().registerEvents(new Events.ItemConsumeEvent(), this);
        getServer().getPluginManager().registerEvents(new Events.EntitySpawnEvent() , this);
        getServer().getPluginManager().registerEvents(new Events.SleepEvent(),  this);
        getServer().getPluginManager().registerEvents(new Events.JoinEvent() , this);
        getServer().getPluginManager().registerEvents(new Events.BlockPlaceEvent() , this);
        getServer().getPluginManager().registerEvents(new Events.BlockBreak() , this);
        getServer().getPluginManager().registerEvents(new Events.respawn() , this);
        System.out.println("Starting up Impossibleos Minecraftos");
        }
        }


