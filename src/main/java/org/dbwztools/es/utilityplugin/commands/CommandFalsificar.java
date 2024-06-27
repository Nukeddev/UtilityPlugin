package org.dbwztools.es.utilityplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFalsificar implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        // /falsificar <jugador> <mensaje>

        String nick;
        nick = strings[0];
        String mensaje = "";
        for (int i = 1; i < strings.length; i++) {
            mensaje += strings[i]+" ";
        }

        Player player = commandSender.getServer().getPlayer(nick);
        player.chat(mensaje);

        return true;
    }
}
