package me.devtarix.tproj.cmdutils;

import static me.devtarix.tproj.Utils.log;

public interface Commands {
    default String register(String name) {
        CommandRegistry.registry.put(name, this);
        log("Registered command: " + name);

        return name;
    }

    default void print(String msg) {
        log(msg);
    }

    void textCommand();
    void textCommand(String[] args);
}
