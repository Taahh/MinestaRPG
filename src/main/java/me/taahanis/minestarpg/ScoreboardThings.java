package me.taahanis.minestarpg;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardThings {
    public ScoreboardThings()
    {

    }

    public Scoreboard getScoreboard()
    {
        ScoreboardManager s = Bukkit.getScoreboardManager();
        assert s != null;
        Scoreboard sc = s.getNewScoreboard();
        if (sc.getObjective("lol") == null)
        {
            Objective obj = sc.registerNewObjective("health", "health", "§cHealth");
            obj.setDisplaySlot(DisplaySlot.BELOW_NAME);
            obj.setDisplayName("");
        }
        return sc;
    }

}
