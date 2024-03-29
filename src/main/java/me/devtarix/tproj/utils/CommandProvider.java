package me.devtarix.tproj.utils;

import me.devtarix.tproj.Config;
import me.devtarix.tproj.commands.ExitCmd;
import me.devtarix.tproj.commands.MathCmd;
import me.devtarix.tproj.commands.OpenAICmd;
import me.devtarix.tproj.commands.TestCmd;

import static me.devtarix.tproj.Utils.log;

public class CommandProvider {
    public CommandProvider() {
        if (Config.getConfig().getProperty("debug").equals("true")) {
            new TestCmd();
        }
        new ExitCmd();
        new MathCmd();
        new OpenAICmd();

        log("Loaded "+CommandRegistry.registry.size() + " commands");
    }
}
