package me.devtarix.tproj.commands;

import me.devtarix.tproj.utils.Command;

import me.devtarix.tproj.commands.math.MathQuery;

public class MathCmd implements Command {


    public MathCmd() {
        register("maths");
    }

    @Override
    public void textCommand() {
        String subcmd = Command.query("Subcommand");
        new MathQuery(subcmd);
    }

    @Override
    public void textCommand(String[] args) {
        new MathQuery(args[1]);
    }
}
