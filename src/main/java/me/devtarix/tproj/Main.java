package me.devtarix.tproj;

import me.devtarix.tproj.utils.CommandInterpreter;
import me.devtarix.tproj.utils.CommandProvider;
import me.devtarix.tproj.utils.ExtensionRegistry;
import me.devtarix.tproj.utils.ExtensionsProvider;

public class Main {
    public static void main(String[] args) {
        new ExtensionsProvider();
        new CommandProvider();
        ExtensionRegistry.ext(args);
        new CommandInterpreter();
    }
}
