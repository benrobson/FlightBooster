package me.benrobson8.FlightBooster.recipes;

import me.benrobson8.FlightBooster.FlightBoosterMain;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class BoosterRecipe implements Listener {
    FlightBoosterMain plugin;
    public BoosterRecipe(FlightBoosterMain instance) {
        plugin = instance;
    }

    public void BoosterRecipe() {
        ItemStack item = new ItemStack(Material.SLIME_BALL, 1);
        NamespacedKey key = new NamespacedKey(plugin, "Booster");
        ShapelessRecipe br = new ShapelessRecipe(key, item);

        br.addIngredient(Material.FEATHER);
        br.addIngredient(Material.FIREWORK_ROCKET);


//        br.shape("$$$","@%@","@%@");
//        br.setIngredient('$', Material.DIAMOND_BLOCK);
//        br.setIngredient('@', Material.AIR);
//        br.setIngredient('%', Material.CONDUIT);
        plugin.getServer().addRecipe(br);
    }
}
