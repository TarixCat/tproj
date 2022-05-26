package me.devtarix.tproj.cmdutils;

import static me.devtarix.tproj.Utils.log;

public interface Command {
    default void register(String name) {
        CommandRegistry.registry.put(name, this);
        log("Registered command: " + name);
    }

    void textCommand();
    void textCommand(String[] args);
}
