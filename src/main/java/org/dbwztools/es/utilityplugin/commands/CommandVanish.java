package org.dbwztools.es.utilityplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.dbwztools.es.utilityplugin.UtilityPlugin;
import org.dbwztools.es.utilityplugin.utils.CC;

public class CommandVanish implements CommandExecutor {
    private boolean isActive = false;

    @Override
    public boolean onCommand ( CommandSender commandSender, Command command, String s, String[] strings ) {
        if (isActive ( ) && commandSender instanceof Player player) {
            for (Player onlinePlayer : commandSender.getServer ( ).getOnlinePlayers ( )) {
                player.hidePlayer ( UtilityPlugin.plugin, onlinePlayer );
            }
            try {
                for (OfflinePlayer offlinePlayer : commandSender.getServer ( ).getOfflinePlayers ( )) {
                    player.hidePlayer ( UtilityPlugin.plugin, (Player) offlinePlayer );
                }
            } catch (ClassCastException exception) {
                exception.printStackTrace ( );
            }
            player.sendMessage ( CC.translate ( "&c¡Modo invisibilidad activado!" ) );
            setActive ( !isActive() );
            return true;
        } else if (commandSender instanceof Player player) {
            for (Player onlinePlayer : commandSender.getServer ( ).getOnlinePlayers ( )) {
                player.showPlayer ( UtilityPlugin.plugin, onlinePlayer );
            }
            for (OfflinePlayer offlinePlayer : commandSender.getServer ( ).getOfflinePlayers ( )) {
                player.showPlayer ( UtilityPlugin.plugin, (Player) offlinePlayer );
            }
            player.sendMessage ( CC.translate ( "&a¡Modo invisibilidad desactivado!" ) );
            setActive ( !isActive() );
            return true;
        }


        return false;
    }

    public boolean isActive () {
        return isActive;
    }

    public void setActive ( boolean active ) {
        isActive = active;
    }
}
