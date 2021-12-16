package me.devtarix.tproj.commands;

import me.devtarix.tproj.cmdutils.Commands;

import java.util.ArrayList;
import java.util.List;

public abstract class TestArgCmd implements Commands {
    String name;
    public TestArgCmd() {
        this.name = register("testarg");
    }

    @Override
    public void textCommand(List args) {
        System.out.println("Command name: " + name);
        System.out.println("Args: " + args + " Size: " + args.size());
    }
}
