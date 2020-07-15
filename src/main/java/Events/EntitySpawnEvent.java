package Events;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class EntitySpawnEvent implements Listener {
@EventHandler
    public void CreatureSpawnEvent(CreatureSpawnEvent event){
        Entity entity = event.getEntity();
        switch (entity.getType()){
            case CREEPER:
                Creeper creeper = (Creeper) event.getEntity();
                creeper.setPowered(true);
                creeper.setInvulnerable(true);
                break;
            case WITHER_SKELETON:
                WitherSkeleton witherSkeleton = (WitherSkeleton) event.getEntity();
                witherSkeleton.setInvulnerable(true);
                witherSkeleton.getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
                witherSkeleton.getEquipment().setItemInMainHandDropChance(0);
                witherSkeleton.getEquipment().setItemInOffHand(new ItemStack(Material.DIAMOND_SWORD));
                witherSkeleton.getEquipment().setItemInOffHandDropChance(0);
                break;
            case COW:
                event.setCancelled(true);
                break;
            case MUSHROOM_COW:
                event.setCancelled(true);
                break;
            case SHEEP:
                event.setCancelled(true);
                break;
            case PIG:
                event.setCancelled(true);
                break;
            case ZOMBIFIED_PIGLIN:
                PigZombie pigZombie = (PigZombie) event.getEntity();
                pigZombie.setAngry(true);
                pigZombie.setHealth(200);
                pigZombie.setMaxHealth(200);
                break;
            case   SPIDER:
                Spider spider = (Spider) event.getEntity();
                spider.setInvulnerable(true);
                break;
            case CAVE_SPIDER:
                CaveSpider caveSpider = (CaveSpider) event.getEntity();
                caveSpider.setInvulnerable(true);
                break;
            case ENDERMAN:
                Enderman enderman = (Enderman) event.getEntity();
                enderman.setInvulnerable(false);
                enderman.setMaxHealth(100);
                enderman.setHealth(100);
                break;
            case ZOMBIE:
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
                 break;
            case  ZOMBIE_VILLAGER:
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
                break;
            case  SKELETON:
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
                break;
            case BLAZE:
                Blaze blaze  = (Blaze) event.getEntity();
                blaze.setMaxHealth(200);
                blaze.setHealth(200);
                blaze.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE , 120*600 , 10));
                break;
            case HUSK:
               Husk zombie2 = (Husk) event.getEntity();
                zombie2.setBaby(false);
                zombie2.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_SWORD));
                zombie2.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
                zombie2.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
                zombie2.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
                zombie2.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
                zombie2.getEquipment().setItemInMainHandDropChance(0);
                zombie2.getEquipment().setBootsDropChance(0);
                zombie2.getEquipment().setHelmetDropChance(0);
                zombie2.getEquipment().setChestplateDropChance(0);
                zombie2.getEquipment().setLeggingsDropChance(0);
                break;
        }

    }
}
