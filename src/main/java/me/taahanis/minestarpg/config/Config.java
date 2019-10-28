package me.taahanis.minestarpg.config;

import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    File config;
    YamlConfiguration configYaml;
    MinestaRPG plugin;

    public Config(MinestaRPG instance)
    {
        this.plugin = instance;
        this.config = new File(plugin.getDataFolder(), "config.yml");
        this.configYaml = YamlConfiguration.loadConfiguration(config);
    }

    public void setup()
    {
        if (!plugin.getDataFolder().exists())
        {
            plugin.getDataFolder().mkdir();
        }
        if (!config.exists())
        {
            try {
                config.createNewFile();
                save();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
}
