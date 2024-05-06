package com.unclecole.bossautofeed.tasks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodEvent implements Listener {

    @EventHandler
    public void onFood(FoodLevelChangeEvent event) {
        if (!(event.getEntity() instanceof Player)) return;

        Player player = ((Player) event.getEntity()).getPlayer();

        if(player.hasPermission("boss.autofeed")) {
            if (event.getFoodLevel() <= 19){
                event.setFoodLevel(19);
            }
        }
    }
}
