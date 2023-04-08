package me.devtarix.tproj.utils;

import me.devtarix.tproj.Config;

import java.util.Scanner;

import static me.devtarix.tproj.Utils.log;

public interface Command {
    default void register(String name) {
        CommandRegistry.registry.put(name, this);
        if(Config.getConfig().getProperty("debug").equals("true")) {
            log("Registered command: " + name);
        }
    }

    static String query(String lmsg) {
        System.out.println("Please input "+lmsg.toLowerCase()+":");
        Scanner sc = new Scanner(System.in);

        return sc.next();
    }

    void textCommand();
    void textCommand(String[] args);
}
