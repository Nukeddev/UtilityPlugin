package org.dbwztools.es.utilityplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.dbwztools.es.utilityplugin.commands.CommandFalsificar;
import org.dbwztools.es.utilityplugin.commands.CommandSuicide;

public final class UtilityPlugin extends JavaPlugin {
    public static  UtilityPlugin plugin;
    @Override
    public void onEnable() {
        getCommand ( "suicide" ).setExecutor ( new CommandSuicide () );
        getCommand("falsificar").setExecutor(new CommandFalsificar());
        plugin = this;
    }

    @Override
    public void onDisable() {

    }
}
