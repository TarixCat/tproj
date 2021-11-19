package me.devtarix.tproj;

import static me.devtarix.tproj.Utils.log;

public interface Extended {
    default void registerAs(String name) {
        Extensions.registry.put("-"+name, this);
        log("Registered extension: " + name);
    }

    void execute();
}
