package me.devtarix.tproj.cmdutils;

import java.util.ArrayList;
import java.util.List;

import static me.devtarix.tproj.Utils.log;

public interface Commands {
    default String register(String name) {
        CommandRegistry.registry.put(name, this);
        log("Registered command: " + name);

        return name;
    }

    void textCommand();
    void textCommand(List args);
    void guiCommand();
}
