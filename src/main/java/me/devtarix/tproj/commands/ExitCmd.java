package me.devtarix.tproj.commands;

import me.devtarix.tproj.Settings;
import me.devtarix.tproj.cmdutils.Commands;

public class ExitCmd implements Commands {
    public ExitCmd() {
        register("exit");
    }


    @Override
    public void textCommand() {
        Settings.getInstance().setCommandInterpreterActive(false);
    }

    @Override
    public void textCommand(String[] args) {
        textCommand();
    }
}
