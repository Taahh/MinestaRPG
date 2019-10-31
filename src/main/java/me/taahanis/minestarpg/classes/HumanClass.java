package me.taahanis.minestarpg.classes;

import org.bukkit.entity.Player;

public enum HumanClass {

    ROYALTY("Royalty"),
    KNIGHT("Knight"),
    FARMER("Farmer"),
    BLACKSMITH("Blacksmith"),
    MERCHANT("Merchant");

    String n;
    HumanClass(String name) {
        this.n = name;
    }

   public String getName()
   {
       return n;
   }
}
