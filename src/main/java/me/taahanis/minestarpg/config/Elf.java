package me.taahanis.minestarpg.config;

import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Elf {
    File config;
    YamlConfiguration configYaml;
    MinestaRPG plugin;

    public Elf(MinestaRPG instance)
    {
        this.plugin = instance;
        this.config = new File(plugin.getDataFolder(), "elves.yml");
        this.configYaml = YamlConfiguration.loadConfiguration(config);
    }
    public Elf(Player player)
    {
        String name = player.getName();
        String ip = player.getAddress().getHostName();
        String uuid = player.getUniqueId().toString();
        int level = 1;

        configYaml.set("elves." + uuid + ".name", name);
        configYaml.set("elves." + uuid + ".ip", ip);
        configYaml.set("elves." + uuid + ".level", String.valueOf(level));
        save();
    }

    public void setup()
    {
        if (!config.exists())
        {
            try {
                config.createNewFile();
                save();
            } catch (IOException e) {
                e.printStackTrace();
            }
            configYaml.createSection("elves");
            save();
        }
    }

    public void save()
    {
        try {
            configYaml.save(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public YamlConfiguration getConfigYaml() {
        return configYaml;
    }
}
