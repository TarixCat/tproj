package me.devtarix.tproj;

import me.devtarix.tproj.cmdutils.CommandInterpreter;
import me.devtarix.tproj.cmdutils.CommandProvider;
import me.devtarix.tproj.extensions.ExtensionsProvider;

public class Main {
    public static void main(String[] args) {
        new ExtensionsProvider();
        Config.getConfig();

        System.out.println("Debug: "+Config.getConfig().getProperty("debug"));
        new CommandProvider();
        ExtensionRegistry.ext(args);
        new CommandInterpreter();
    }
}
