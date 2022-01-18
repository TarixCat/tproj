package me.devtarix.tproj.cmdutils;

import me.devtarix.tproj.Settings;

import java.io.Console;

import static me.devtarix.tproj.Utils.log;

public class CommandInterpreter {
    Console console = System.console();
    String[] args;

    public CommandInterpreter() {
        while (Settings.getInstance().isCommandInterpreterActive()) {
            args = requestInput();
            checkCommandValid();
        }
    }

    private String[] requestInput() {
        System.out.println("Enter command");
        return console.readLine().split(" ");
    }

    private void tryCommandRegistryArgs() {
        try  {
            CommandRegistry.registry.get(args[0]).textCommand(args);
        }
        catch (Exception e) {
            log(e.getMessage());
        }
    }

    private void processCommand() {
        if (args.length == 1) {
            CommandRegistry.registry.get(args[0]).textCommand();
        }
        else {
            tryCommandRegistryArgs();
        }
    }

    private void checkCommandValid() {
        if (CommandRegistry.registry.containsKey(args[0])) {
            processCommand();
        }
        else {
            System.out.println("Command not found");
        }
    }
}
