package me.devtarix.tproj.utils;

import me.devtarix.tproj.Config;

import static me.devtarix.tproj.Utils.log;

public interface Extensions {
    default void registerAs(String name) {
        ExtensionRegistry.registry.put("-"+name, this);
        if(Config.getConfig().getProperty("debug").equals("true")) {
            log("Registered extension: " + name);
        }
    }

    void execute();
}
