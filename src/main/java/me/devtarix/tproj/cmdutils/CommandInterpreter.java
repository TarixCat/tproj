package me.devtarix.tproj.cmdutils;

import me.devtarix.tproj.Settings;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandInterpreter {
    private boolean active = true;
    private static CommandInterpreter commandInterpreter;

    private CommandInterpreter() {
        Console console = System.console();

        if (!Settings.getInstance().guiActive) {
            while (active) {
                System.out.println("Enter command");
                String[] args = console.readLine().split(" ");
                if (console == null) {
                    System.out.println("No console: non-interactive mode!");
                    System.exit(0);
                }

                if (CommandRegistry.registry.containsKey(args[0])) {
                    List<String> pass = new ArrayList<>();

                    try {
                        pass = Arrays.asList(args);
                        pass.remove(0);
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("Args length are " + pass.size());
                    }

                    if (pass.size() == 0) {
                        CommandRegistry.registry.get(args[0]).textCommand();
                    }
                    else {
                        CommandRegistry.registry.get(args[0]).textCommand(pass);
                    }
                }
                else {
                    System.out.println("Command not found");
                }
            }
        }
        else {
            System.out.println("Not implemented. Exiting...");
        }
    }

    public static CommandInterpreter getInstance() {
        if (commandInterpreter == null) {
            commandInterpreter = new CommandInterpreter();
        }
        return commandInterpreter;
    }
}
