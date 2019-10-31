package me.taahanis.minestarpg.listeners;

import me.taahanis.minestarpg.MinestaRPG;
import me.taahanis.minestarpg.config.Elf;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RaceSelection implements Listener {

    MinestaRPG pl = MinestaRPG.getPlugin(MinestaRPG.class);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player p = event.getPlayer();
        if (!pl.race.hasRace(p))
        {
            p.openInventory(pl.rP.getI());
            return;
        }
    }


    @EventHandler
    public void onSelect(InventoryClickEvent event)
    {
        Inventory i = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();
        Player p = (Player) event.getWhoClicked();
        if (i == pl.rP.getI())
        {
            if (item.hasItemMeta() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§a§lElf"))
            {
                event.setCancelled(true);
                pl.race.newElf(p);
                p.closeInventory();
                p.sendMessage("§6[§4MinestaRPG§6] §aYou are now an " + pl.rP.Elf().getItemMeta().getDisplayName());
                return;
            }
            if (item.hasItemMeta() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§6§lHuman"))
            {
                event.setCancelled(true);
                p.openInventory(pl.hCp.getI());
                return;
            }
            if (item.hasItemMeta() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§5§lWizard"))
            {
                event.setCancelled(true);
                pl.race.newWizard(p);
                p.closeInventory();
                p.sendMessage("§6[§4MinestaRPG§6] §aYou are now a " + pl.rP.Wizard().getItemMeta().getDisplayName());
                return;
            }
        }
    }
}
