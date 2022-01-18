package me.devtarix.tproj.cmdutils;

import me.devtarix.tproj.Settings;

import java.io.Console;

import static me.devtarix.tproj.Utils.log;

public class CommandInterpreter {
    private static CommandInterpreter commandInterpreter;

    private CommandInterpreter() {
        Console console = System.console();

        if (!Settings.getInstance().guiActive) {
            while (Settings.getInstance().isCommandInterpreterActive()) {
                System.out.println("Enter command");
                String[] args = console.readLine().split(" ");
                if (console == null) {
                    System.out.println("No console: non-interactive mode!");
                    System.exit(0);
                }

                if (CommandRegistry.registry.containsKey(args[0])) {

                    if (args.length == 1) {
                        CommandRegistry.registry.get(args[0]).textCommand();
                    }
                    else {
                        try  {
                            CommandRegistry.registry.get(args[0]).textCommand(args);
                        }
                        catch (Exception e) {
                            log(e.getMessage());
                        }
                    }
                }
                else {
                    System.out.println("Command not found");
                }
            }
        }
        else {
            System.out.println("Not function. Exiting...");
        }
    }

    public static CommandInterpreter getInstance() {
        if (commandInterpreter == null) {
            commandInterpreter = new CommandInterpreter();
        }
        return commandInterpreter;
    }
}
