package me.devtarix.tproj;

import static me.devtarix.tproj.Utils.log;

public interface Extensions {
    default void registerAs(String name) {
        ExtensionRegistry.registry.put("-"+name, this);
        log("Registered extension: " + name);
    }

    void execute();
}
