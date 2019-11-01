package me.taahanis.minestarpg;

import me.taahanis.minestarpg.command.Command_spawnnpc;
import me.taahanis.minestarpg.config.Config;
import me.taahanis.minestarpg.config.Elf;
import me.taahanis.minestarpg.config.Human;
import me.taahanis.minestarpg.config.Wizard;
import me.taahanis.minestarpg.inventories.HumanClassPicker;
import me.taahanis.minestarpg.inventories.RacePicker;
import me.taahanis.minestarpg.listeners.ClassSelection;
import me.taahanis.minestarpg.listeners.FakePlugins;
import me.taahanis.minestarpg.listeners.RaceSelection;
import me.taahanis.minestarpg.race.Race;
import org.bukkit.plugin.java.JavaPlugin;

//import me.taahanis.minestarpg.listeners.NametagListener;

public class MinestaRPG extends JavaPlugin {

    public Config config;

    public Race race;

    public Wizard w;
    public Elf e;
    public Human h;

    public RacePicker rP;
    public HumanClassPicker hCp;

    //public ScoreboardThings sCT;

    @Override
    public void onLoad()
    {
        config = new Config(this);

        race = new Race(this);

        w = new Wizard(this);
        e = new Elf(this);
        h = new Human(this);

        rP = new RacePicker();
        hCp = new HumanClassPicker();

        //sCT = new ScoreboardThings();

        config.setup();

        w.setup();
        e.setup();
        h.setup();


    }
    @Override
    public void onEnable()
    {
        regListeners();
        regCommands();
    }

    public void regListeners()
    {
        getServer().getPluginManager().registerEvents(new RaceSelection(), this);
        getServer().getPluginManager().registerEvents(new FakePlugins(), this);
        getServer().getPluginManager().registerEvents(new ClassSelection(), this);
        //getServer().getPluginManager().registerEvents(new NametagListener(), this);
    }
    public void regCommands()
    {
        getCommand("spawnnpc").setExecutor(new Command_spawnnpc());
    }

}
