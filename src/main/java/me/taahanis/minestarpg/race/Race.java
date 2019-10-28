package me.taahanis.minestarpg.race;


import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.entity.Player;

public class Race {

    MinestaRPG pl;
    public Race(MinestaRPG in)
    {
        this.pl = in;
    }

    public boolean hasRace(Player p)
    {
        String elfEntry = pl.e.getConfigYaml().getString("elves." + p.getUniqueId().toString());
        String humanEntry = pl.h.getConfigYaml().getString("humans." + p.getUniqueId().toString());
        String wizardEntry = pl.w.getConfigYaml().getString("wizards." + p.getUniqueId().toString());
        if (elfEntry == null && humanEntry == null && wizardEntry == null)
        {
            return false;
        }
        return true;
    }
}
