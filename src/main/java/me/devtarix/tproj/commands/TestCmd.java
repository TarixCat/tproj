package me.devtarix.tproj.commands;

import me.devtarix.tproj.cmdutils.Commands;

import java.util.Arrays;

public class TestCmd implements Commands {
    public TestCmd() {
        register("testcmd");
    }

    @Override
    public void textCommand() {
        System.out.println("solo");
    }

    @Override
    public void textCommand(String[] args) {
        System.out.println("args" + Arrays.toString(args));
    }
}
