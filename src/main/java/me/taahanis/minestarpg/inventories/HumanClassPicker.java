package me.taahanis.minestarpg.inventories;

import me.taahanis.minestarpg.classes.HumanClass;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HumanClassPicker
{

    Inventory i;

    public HumanClassPicker()
    {
        i = Bukkit.getServer().createInventory(null, 9, "   §b§l~~~ §c§lHuman Classes §b§l~~~");
        //0 -- royalty, 1, 2 --knight, 3, 4 --farmer, 5, 6 --blacksmith, 7, 8 -- merchant

        i.setItem(0, Royalty());
        i.setItem(2, Knight());
        i.setItem(4, Farmer());
        i.setItem(6, BlackSmith());
        i.setItem(8, Merchant());


    }

    public Inventory getI() {
        return i;
    }

    public ItemStack Royalty()
    {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§a§lRoyalty");
        item.setItemMeta(itemMeta);

        return item;
    }

    public ItemStack Knight()
    {
        ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§7§lKnight");
        item.setItemMeta(itemMeta);

        return item;
    }

    public ItemStack Farmer()
    {
        ItemStack item = new ItemStack(Material.HAY_BLOCK, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§6§lFarmer");
        item.setItemMeta(itemMeta);

        return item;
    }

    public ItemStack BlackSmith()
    {
        ItemStack item = new ItemStack(Material.FURNACE, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§8§lBlacksmith");
        item.setItemMeta(itemMeta);

        return item;
    }

    public ItemStack Merchant()
    {
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§5§lMerchant");
        item.setItemMeta(itemMeta);

        return item;
    }

}