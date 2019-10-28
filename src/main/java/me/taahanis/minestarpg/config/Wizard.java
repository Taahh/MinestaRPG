package me.taahanis.minestarpg.config;

import me.taahanis.minestarpg.MinestaRPG;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Wizard {
        File config;
        YamlConfiguration configYaml;
        MinestaRPG plugin;

        public Wizard(MinestaRPG instance)
        {
            this.plugin = instance;
            this.config = new File(plugin.getDataFolder(), "wizards.yml");
            this.configYaml = YamlConfiguration.loadConfiguration(config);
        }
        public Wizard(Player player)
        {
            String name = player.getName();
            String ip = player.getAddress().getHostName();
            String uuid = player.getUniqueId().toString();
            int level = 1;

            configYaml.set("wizards." + uuid + ".name", name);
            configYaml.set("wizards." + uuid + ".ip", ip);
            configYaml.set("wizards." + uuid + ".level", String.valueOf(level));
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
                configYaml.createSection("wizards");
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
