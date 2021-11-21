package me.devtarix.tproj.extensions;

import me.devtarix.tproj.Extensions;

public class NewTest implements Extensions {
    NewTest() {
        registerAs("newtest");
    }


    @Override
    public void execute() {
        System.out.println("Yes");
    }
}
