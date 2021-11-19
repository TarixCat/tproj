package me.devtarix.tproj.extensions;

import me.devtarix.tproj.Extended;

public class NewTest implements Extended {
    NewTest() {
        registerAs("newtest");
    }


    @Override
    public void execute() {
        System.out.println("Yes");
    }
}
