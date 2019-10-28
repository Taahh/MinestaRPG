package me.taahanis.minestarpg.config;

import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Human {
    File config;
    YamlConfiguration configYaml;
    MinestaRPG plugin;

    public Human(MinestaRPG instance)
    {
        this.plugin = instance;
        this.config = new File(plugin.getDataFolder(), "humans.yml");
        this.configYaml = YamlConfiguration.loadConfiguration(config);
    }
    public Human(Player player)
    {
        String name = player.getName();
        String ip = player.getAddress().getHostName();
        String uuid = player.getUniqueId().toString();
        int level = 1;

        configYaml.set("humans." + uuid + ".name", name);
        configYaml.set("humans." + uuid + ".ip", ip);
        configYaml.set("humans." + uuid + ".level", String.valueOf(level));
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
            configYaml.createSection("humans");
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
