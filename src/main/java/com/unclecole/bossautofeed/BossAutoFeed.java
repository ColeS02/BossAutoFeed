package com.unclecole.bossautofeed;

import com.unclecole.bossautofeed.tasks.FoodEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossAutoFeed extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FoodEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
