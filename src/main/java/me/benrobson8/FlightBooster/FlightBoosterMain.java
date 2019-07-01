package me.benrobson8.FlightBooster;

import me.benrobson8.FlightBooster.recipes.BoosterRecipe;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class FlightBoosterMain extends JavaPlugin {
    public static FlightBoosterMain plugin;

    @Override
    public void onEnable() {
        plugin = this;

        // Init Message
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nFlight Booster has been enabled.\nRunning Version " + plugin.getDescription().getVersion() + "\nGitHub Repository: https://github.com/benrobson8/FlightBooster\nCreated by Ben Robson\n\n");

        // Recipe Registry
        // Booster Recipe
        BoosterRecipe br = new BoosterRecipe(this);
        br.BoosterRecipe();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nFlight Booster has been disabled.\n");
    }
}
