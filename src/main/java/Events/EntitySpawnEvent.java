package Events;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class EntitySpawnEvent implements Listener {
@EventHandler
    public void CreatureSpawnEvent(CreatureSpawnEvent event){
        Entity entity = event.getEntity();
        if(entity.getType().equals(EntityType.CREEPER)){
            Creeper creeper = (Creeper) event.getEntity();
            creeper.setPowered(true);
            creeper.setInvulnerable(true);
        }
        if(entity.getType().equals(EntityType.WITHER_SKELETON)){
            WitherSkeleton witherSkeleton = (WitherSkeleton) event.getEntity();
            witherSkeleton.setInvulnerable(true);
            witherSkeleton.getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
        }
        if(entity.getType().equals(EntityType.COW)){
            event.setCancelled(true);
        }
        if(entity.getType().equals(EntityType.MUSHROOM_COW)){
            event.setCancelled(true);
        }
        if(entity.getType().equals(EntityType.SHEEP)){
            event.setCancelled(true);
        }
        if(entity.getType().equals(EntityType.PIG)){
            event.setCancelled(true);
        }
        if(entity.getType().equals(EntityType.ZOMBIFIED_PIGLIN)){
            PigZombie pigZombie = (PigZombie) event.getEntity();
            pigZombie.setAngry(true);
            pigZombie.setHealth(200);
            pigZombie.setMaxHealth(200);
        }
        if(entity.getType().equals(EntityType.SPIDER)){
            Spider spider = (Spider) event.getEntity();
           spider.setInvulnerable(true);

        }
        if(entity.getType().equals(EntityType.CAVE_SPIDER)){
            CaveSpider caveSpider = (CaveSpider) event.getEntity();
            caveSpider.setInvulnerable(true);

        }
        if(entity.getType().equals(EntityType.ENDERMAN)){
            Enderman enderman = (Enderman) event.getEntity();
            enderman.setInvulnerable(false);
            enderman.setMaxHealth(100);
            enderman.setHealth(100);
        }
        if(entity.getType().equals(EntityType.ZOMBIE)){
            Zombie zombie = (Zombie) event.getEntity();
            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_SWORD));
            zombie.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            zombie.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            zombie.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
            zombie.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            zombie.getEquipment().setItemInMainHandDropChance(0);
            zombie.getEquipment().setBootsDropChance(0);
            zombie.getEquipment().setHelmetDropChance(0);
            zombie.getEquipment().setChestplateDropChance(0);
            zombie.getEquipment().setLeggingsDropChance(0);
            zombie.setMaxHealth(60);
            zombie.setHealth(60);
        }
        if(entity.getType().equals(EntityType.ZOMBIE_VILLAGER)){
        ZombieVillager zombie1 = (ZombieVillager) event.getEntity();
        zombie1.setBaby(false);
        zombie1.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_SWORD));
        zombie1.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
        zombie1.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
        zombie1.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        zombie1.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            zombie1.getEquipment().setItemInMainHandDropChance(0);
            zombie1.getEquipment().setBootsDropChance(0);
            zombie1.getEquipment().setHelmetDropChance(0);
            zombie1.getEquipment().setChestplateDropChance(0);
            zombie1.getEquipment().setLeggingsDropChance(0);

        }
        if(entity.getType().equals(EntityType.SKELETON)){
            Skeleton skeleton = (Skeleton) event.getEntity();
            ItemStack itemStacks = new ItemStack(Material.BOW);
            ItemMeta meta = itemStacks.getItemMeta();
            meta.addEnchant(Enchantment.ARROW_FIRE, 10  , true);
            meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 10 , true);
            meta.addEnchant(Enchantment.ARROW_DAMAGE , 1000 , true);
            itemStacks.setItemMeta(meta);
          skeleton.getEquipment().setItemInMainHand(itemStacks);
          skeleton.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
          skeleton.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
          skeleton.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
          skeleton.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            skeleton.getEquipment().setItemInMainHandDropChance(0);
            skeleton.getEquipment().setBootsDropChance(0);
            skeleton.getEquipment().setHelmetDropChance(0);
            skeleton.getEquipment().setChestplateDropChance(0);
            skeleton.getEquipment().setLeggingsDropChance(0);
            skeleton.setMaxHealth(200);
            skeleton.setHealth(200);


        }
        if(entity.getType().equals(EntityType.ENDER_CRYSTAL)){
            EnderCrystal enderCrystal = (EnderCrystal) event.getEntity();
            enderCrystal.setInvulnerable(true);
            enderCrystal.setShowingBottom(true);
        }

    }
}
