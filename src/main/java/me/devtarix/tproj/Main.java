package me.devtarix.tproj;

import me.devtarix.tproj.cmdutils.CommandInterpreter;
import me.devtarix.tproj.extensions.ExtensionsProvider;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lo");
        new ExtensionsProvider();
        ExtensionRegistry.ext(args);
        CommandInterpreter.getInstance();
    }
}
