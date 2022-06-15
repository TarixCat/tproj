package me.devtarix.tproj.commands;

import me.devtarix.tproj.utils.Command;

import java.util.Arrays;

public class TestCmd implements Command {
    public TestCmd() {
        register("testcmd");
    }

    @Override
    public void textCommand() {
        System.out.println("This command was entered without arguments!");
    }

    @Override
    public void textCommand(String[] args) {
        System.out.println("This command was entered with the following args: " + Arrays.toString(args));
    }
}
