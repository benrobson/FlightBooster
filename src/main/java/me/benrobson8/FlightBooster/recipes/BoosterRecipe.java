package me.benrobson8.FlightBooster.recipes;

import me.benrobson8.FlightBooster.FlightBoosterMain;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class BoosterRecipe implements Listener {
    FlightBoosterMain plugin;
    public BoosterRecipe(FlightBoosterMain instance) {
        plugin = instance;
    }

    public void BoosterRecipe() {
        ItemStack item = new ItemStack(Material.FEATHER, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Flight Booster");
        meta.addEnchant(Enchantment.DURABILITY, 3, true);

        ArrayList<String> lore = new ArrayList<String>();
        lore.add("Right click to be elevated for flight.");
        meta.setLore(lore);
        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "Booster");
        ShapelessRecipe br = new ShapelessRecipe(key, item);

        br.addIngredient(Material.FEATHER);
        br.addIngredient(Material.FIREWORK_ROCKET);

        plugin.getServer().addRecipe(br);
    }
}
