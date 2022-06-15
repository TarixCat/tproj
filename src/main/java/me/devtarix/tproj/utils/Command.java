package me.devtarix.tproj.utils;

import me.devtarix.tproj.Config;

import static me.devtarix.tproj.Utils.log;

public interface Command {
    default void register(String name) {
        CommandRegistry.registry.put(name, this);
        if(Config.getConfig().getProperty("debug").equals("true")) {
            log("Registered command: " + name);
        }
    }

    void textCommand();
    void textCommand(String[] args);
}
