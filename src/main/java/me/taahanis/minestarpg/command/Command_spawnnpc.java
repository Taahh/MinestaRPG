package me.taahanis.minestarpg.command;

import me.taahanis.minestarpg.NPC;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_spawnnpc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("§6[§4MinestaRPG§6] §aYou must be an in-game player to run this command.");
            return true;
        }
        if (args.length == 0)
        {
            sender.sendMessage("§6[§4MinestaRPG§6] §aThe correct usage for this command is: /spawnnpc <humanMerchant | humanRoyalty | humanFarmer | humanKnight | humanBlacksmith>");
            return true;
        }
        Player p = (Player) sender;
        if (args[0].equalsIgnoreCase("humanMerchant"))
        {
            String name = StringUtils.join(args, " ", 1, args.length);

            if (args.length < 2)
            {
                p.sendMessage("§6[§4MinestaRPG§6] §aCorrect usage: /spawnnpc humanMerchant <name>");
                return true;
            }

            NPC.newMerchant(p, name);
            return true;
        }
        return true;
    }
}
