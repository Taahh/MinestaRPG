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
