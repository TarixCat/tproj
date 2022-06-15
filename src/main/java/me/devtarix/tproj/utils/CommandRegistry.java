package me.devtarix.tproj.utils;

import java.util.HashMap;
import java.util.Map;

public class CommandRegistry {
    public static HashMap<String, Command> registry = new HashMap<>();

    public void loadCommands() {
        for(Map.Entry<String, Command> entry : registry.entrySet()) {
            String key = entry.getKey();
            Command value = entry.getValue();

            value.register(key);
        }
    }
}
