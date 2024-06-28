package org.dbwztools.es.utilityplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.dbwztools.es.utilityplugin.commands.CommandFalsificar;
import org.dbwztools.es.utilityplugin.commands.CommandProhibir;
import org.dbwztools.es.utilityplugin.commands.CommandSuicide;
import org.dbwztools.es.utilityplugin.commands.CommandVanish;
import org.dbwztools.es.utilityplugin.events.PickupEvent;

public final class UtilityPlugin extends JavaPlugin {
    public static  UtilityPlugin plugin;
    @Override
    public void onEnable() {
        getCommand ( "suicide" ).setExecutor ( new CommandSuicide () );
        getCommand("falsificar").setExecutor(new CommandFalsificar());
        getCommand("invisible").setExecutor(new CommandVanish());
        getCommand("prohibir").setExecutor(new CommandProhibir());
        getServer().getPluginManager().registerEvents(new PickupEvent(),this);
        plugin = this;
    }

    @Override
    public void onDisable() {

    }
}
