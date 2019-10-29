package me.taahanis.minestarpg.race;


import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;

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

    public void newElf(Player player)
    {
        String name = player.getName();
        String ip = player.getAddress().getHostName();
        String uuid = player.getUniqueId().toString();
        int level = 1;
        File f = new File(pl.getDataFolder(), "elves.yml");
        YamlConfiguration configYaml = YamlConfiguration.loadConfiguration(f);
        configYaml.set("elves." + uuid + ".name", name);
        configYaml.set("elves." + uuid + ".ip", ip);
        configYaml.set("elves." + uuid + ".level", String.valueOf(level));
        try {
            configYaml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void newWizard(Player player)
    {
        String name = player.getName();
        String ip = player.getAddress().getHostName();
        String uuid = player.getUniqueId().toString();
        int level = 1;
        File f = new File(pl.getDataFolder(), "wizards.yml");
        YamlConfiguration configYaml = YamlConfiguration.loadConfiguration(f);
        configYaml.set("wizards." + uuid + ".name", name);
        configYaml.set("wizards." + uuid + ".ip", ip);
        configYaml.set("wizards." + uuid + ".level", String.valueOf(level));
        try {
            configYaml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void newHuman(Player player)
    {
        String name = player.getName();
        String ip = player.getAddress().getHostName();
        String uuid = player.getUniqueId().toString();
        int level = 1;
        File f = new File(pl.getDataFolder(), "humans.yml");
        YamlConfiguration configYaml = YamlConfiguration.loadConfiguration(f);
        configYaml.set("humans." + uuid + ".name", name);
        configYaml.set("humans." + uuid + ".ip", ip);
        configYaml.set("humans." + uuid + ".level", String.valueOf(level));
        try {
            configYaml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
