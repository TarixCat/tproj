package me.devtarix.tproj.commands;

import me.devtarix.tproj.Settings;
import me.devtarix.tproj.utils.Command;

import static me.devtarix.tproj.Utils.log;

public class ExitCmd implements Command {
    public ExitCmd() {
        register("exit");
    }


    @Override
    public void textCommand() {
        if(EngineCmd.enabled) {
            log("Please run: engine stop");
        } else {
            Settings.getInstance().setCommandInterpreterActive(false);
        }
    }

    @Override
    public void textCommand(String[] args) {
        textCommand();
    }
}
