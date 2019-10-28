package me.taahanis.minestarpg.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RacePicker {

    public Inventory i;

    public RacePicker()
    {
        i = Bukkit.getServer().createInventory(null, 9, "  §b§l~~~ §c§lRace Selector §b§l~~~"); //0 - elf, 1, 2, 3, 4 - human, 5, 6, 7, 8 - wizard

        ItemStack elf = new ItemStack(Material.ENDER_PEARL, 1);
        ItemMeta elfMeta = elf.getItemMeta();
        assert elfMeta != null;
        elfMeta.setDisplayName("§a§lElf");
        elfMeta.addEnchant(Enchantment.LUCK, 100, true);
        elfMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        elf.setItemMeta(elfMeta);

        ItemStack wizard = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta wizardMeta = wizard.getItemMeta();
        assert wizardMeta != null;
        wizardMeta.setDisplayName("§5§lWizard");
        wizardMeta.addEnchant(Enchantment.MENDING, 100, true);
        wizardMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wizard.setItemMeta(wizardMeta);

        ItemStack human = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta humanMeta = human.getItemMeta();
        assert humanMeta != null;
        humanMeta.setDisplayName("§6§lHuman");
        humanMeta.addEnchant(Enchantment.OXYGEN, 100, true);
        humanMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        human.setItemMeta(humanMeta);

        i.setItem(0, elf);
        i.setItem(4, human);
        i.setItem(8, wizard);
    }
    public Inventory getI() {
        return i;
    }
}
