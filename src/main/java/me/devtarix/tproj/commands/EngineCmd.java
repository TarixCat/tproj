package me.devtarix.tproj.commands;

import me.devtarix.tproj.Engine;
import me.devtarix.tproj.utils.Command;

import static me.devtarix.tproj.Utils.log;

public class EngineCmd implements Command {
    public static boolean enabled;
    Engine e = new Engine();

    public EngineCmd() {
        register("engine");
    }

    @Override
    public void textCommand() {
        log("Engine has sub arguments");
    }

    @Override
    public void textCommand(String[] args) {
        if(args[1].equals("status")) {
            log("Enabled: " +isEnabled());
            log("Current value: " + e.i);
        }
        else if(args[1].equals("start")) {
            if(isEnabled()) {
                log("Already enabled engine");
            } else if(!isEnabled()) {
                log("Starting engine");
                engineEnable();
            } else {
                log("Cannot reach this case as null. \n Exiting...");
                System.exit(1);
            }
        }
        else if(args[1].equals("stop")) {
            if(!isEnabled()) {
                log("Engine is already off");
            } else if(isEnabled()) {
                log("Stopping engine " +e.i);
                engineDisable();
            } else {
                log("Cannot reach this case as null. \n Exiting...");
                System.exit(1);
            }
        }
        else if(args[1].equals("display")) {
            if(!e.isDisplay()) {
                e.setDisplay(true);
            } else if(e.isDisplay()) {
                e.setDisplay(false);
            } else {
                log("Unreachable case: Ctrl+c is advised");
            }

        }
        else {
            log("Subcommand "+args[1]+" doesn't exist");
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void engineEnable() {
        setEnabled(true);
        e.start();
    }

    public void engineDisable() {
        setEnabled(false);
        e.stop();
    }
}
