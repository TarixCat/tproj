package me.devtarix.tproj.cmdutils;

import me.devtarix.tproj.commands.ExitCmd;
import me.devtarix.tproj.commands.TestCmd;

public class CommandProvider {
    public CommandProvider() {
        new TestCmd();
        new ExitCmd();
    }
}
