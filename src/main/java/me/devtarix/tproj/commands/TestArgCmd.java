package me.devtarix.tproj.commands;

import me.devtarix.tproj.cmdutils.Commands;

import java.util.ArrayList;

public abstract class TestArgCmd implements Commands {
    String name;
    public TestArgCmd() {
        this.name = register("testarg");
    }
    
    public void textCommand(ArrayList args) {
        System.out.println("Command name: " + name);
        System.out.println("Args: " + args + " Size: " + args.size());
    }
}
