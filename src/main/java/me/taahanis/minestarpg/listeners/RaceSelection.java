package me.taahanis.minestarpg.listeners;

import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RaceSelection implements Listener {

    MinestaRPG pl = MinestaRPG.getPlugin(MinestaRPG.class);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player p = event.getPlayer();
        p.openInventory(pl.rP.getI());
    }
}
