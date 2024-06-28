package org.dbwztools.es.utilityplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.dbwztools.es.utilityplugin.utils.CC;

import java.util.ArrayList;

public class CommandProhibir implements CommandExecutor {
    public static ArrayList<ItemStack> Items = new ArrayList<>();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        if(commandSender instanceof Player player){
            ItemStack item = player.getItemInHand();
            Items.add(item);
            player.sendMessage(CC.translate("&cEl Item fue prohibido."));
        }
        return false;
    }
}
