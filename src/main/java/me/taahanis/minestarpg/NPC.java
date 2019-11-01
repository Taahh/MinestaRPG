package me.taahanis.minestarpg;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftVillager;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NPC {


    public static void newMerchant(Player p, String name)
    {
        Villager villager = (Villager) p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
        villager.setProfession(Villager.Profession.CLERIC);
        CraftVillager v = (CraftVillager) villager;
        v.setCustomName(ChatColor.translateAlternateColorCodes('&', name));
        v.setInvulnerable(true);
        v.setHealth(20);

        v.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 10000000, 1000000000, false, false), true);
        v.setAI(false);

    }
}
