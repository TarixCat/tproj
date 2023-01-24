package me.devtarix.tproj.commands;

import me.devtarix.tproj.Config;
import me.devtarix.tproj.utils.Command;

public class OpenAICmd implements Command {
    public OpenAICmd() {
        register("gpt");
    }

    @Override
    public void textCommand() {
        String APIKEY = Config.getConfig().getProperty("OPENAI_API_KEY");
    }

    @Override
    public void textCommand(String[] args) {
        textCommand();
    }
}
