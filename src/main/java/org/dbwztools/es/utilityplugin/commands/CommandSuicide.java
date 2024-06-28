package org.dbwztools.es.utilityplugin.commands;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSuicide implements CommandExecutor {
    @Override
    public boolean onCommand ( CommandSender commandSender, Command command, String s, String[] args ) {
        if(commandSender instanceof Player player){
            player.setHealth ( 0.0 );
            player.sendMessage ( Color.RED + "Te has suicidado" );
            return true;
        }
        return false;
    }
}
