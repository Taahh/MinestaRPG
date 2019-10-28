package me.taahanis.minestarpg.modelcreator;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class ArmorStandModel {

    public ArmorStandModel(Player player, double x, double y, double z, Material m, boolean s)
    {
        ArmorStand armorStand = player.getWorld().spawn(new Location(player.getWorld(), x, y,z), ArmorStand.class);
        armorStand.setHelmet(new ItemStack(m));
        armorStand.setVisible(false);
        armorStand.setSmall(true);
        armorStand.setGravity(false);
        armorStand.setCanPickupItems(false);
        if (s){
            armorStand.setVelocity(new Vector(1, 0, 0));
            armorStand.setCustomName("Car Seat");
            armorStand.setCustomNameVisible(true);
        }
    }
}
