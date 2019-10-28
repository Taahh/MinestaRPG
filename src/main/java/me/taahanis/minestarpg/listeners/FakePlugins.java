package me.taahanis.minestarpg.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class FakePlugins implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCMD(PlayerCommandPreprocessEvent event)
    {
        if (event.getMessage().startsWith("/plugins") || event.getMessage().startsWith("/pl"))
        {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§fPlugins (1): §aMinestar Network");
        }
    }
}
