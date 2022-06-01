package me.devtarix.tproj.cmdutils;

import me.devtarix.tproj.Config;
import me.devtarix.tproj.commands.ExitCmd;
import me.devtarix.tproj.commands.TestCmd;

public class CommandProvider {
    public CommandProvider() {
        if (Config.getConfig().getProperty("debug") == "true") {
            new TestCmd();
        }
        new ExitCmd();
    }
}
