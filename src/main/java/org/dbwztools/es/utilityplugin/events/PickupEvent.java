package org.dbwztools.es.utilityplugin.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.dbwztools.es.utilityplugin.utils.CC;

import static org.dbwztools.es.utilityplugin.commands.CommandProhibir.Items;

public class PickupEvent implements Listener {
    public void Recoger(PlayerPickupItemEvent event) {
        ItemStack item = event.getItem().getItemStack();
        if(Items.contains(item)) {
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage(CC.translate("&cNo puedes recoger el Item."));
        }
    }
}
