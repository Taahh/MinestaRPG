package me.taahanis.minestarpg.listeners;

import me.taahanis.minestarpg.MinestaRPG;
import me.taahanis.minestarpg.classes.HumanClass;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ClassSelection implements Listener {

    MinestaRPG pl = MinestaRPG.getPlugin(MinestaRPG.class);

    @EventHandler
    public void humanClassSelection(InventoryClickEvent event)
    {
        Inventory i = event.getClickedInventory();
        Player p = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();

        if (i == pl.hCp.getI())
        {
            if (item.hasItemMeta() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§a§lRoyalty"))
            {
                event.setCancelled(true);
                p.closeInventory();
                pl.race.newHuman(p, HumanClass.ROYALTY);
                p.sendMessage("§b[§4Minestar Network§b] §cYou have chosen the race §6§lHUMAN §cand have chosen the class §a§lROYALTY§c.");
                p.closeInventory();
                return;
            }
        }
    }
}
