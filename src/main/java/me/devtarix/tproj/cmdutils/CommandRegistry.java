package me.devtarix.tproj.cmdutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CommandRegistry {

    private static CommandRegistry commandRegistry;
    private CommandRegistry() {
    }
    public static CommandRegistry getInstance() {
        if (commandRegistry == null) {
            commandRegistry = new CommandRegistry();
        }
        return commandRegistry;
    }

    protected static HashMap<String, Commands> registry = new HashMap<>();
    protected static HashMap<String, Commands> textRegistry = new HashMap<>();
    protected static HashMap<String, Commands> guiRegistry = new HashMap<>();

    public static void cmd(String[] cmd) {
        String cmdIn = cmd[0];

        List args;
        args = Arrays.asList(cmd);
        args.remove(0);
    }

}
