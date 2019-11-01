/**
 package me.taahanis.minestarpg.listeners;

 import me.taahanis.minestarpg.MinestaRPG;
 import org.bukkit.Bukkit;
 import org.bukkit.entity.Player;
 import org.bukkit.event.EventHandler;
 import org.bukkit.event.Listener;
 import org.bukkit.event.player.PlayerJoinEvent;
 import org.bukkit.event.player.PlayerQuitEvent;
 import org.bukkit.scoreboard.DisplaySlot;
 import org.bukkit.scoreboard.Objective;
 import org.bukkit.scoreboard.Scoreboard;
 import org.bukkit.scoreboard.ScoreboardManager;

 public class NametagListener implements Listener {

 MinestaRPG pl = MinestaRPG.getPlugin(MinestaRPG.class);

 @EventHandler
 public void onScoreboard(PlayerJoinEvent event)
 {
 Player p = event.getPlayer();

 String uuid = p.getUniqueId().toString();

 String level = null;

 if (pl.race.isHuman(p))
 {
 level = pl.h.getConfigYaml().getString("humans." + uuid + ".level");
 }
 p.setHealth(p.getHealth());

 p.setScoreboard(pl.sCT.getScoreboard());

 }


 }
 **/