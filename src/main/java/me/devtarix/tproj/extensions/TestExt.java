package me.devtarix.tproj.extensions;

import me.devtarix.tproj.utils.Extensions;

public class TestExt implements Extensions {
    public TestExt() {
        registerAs("testext");
    }

    @Override
    public void execute() {
        System.out.println("Lel");
    }
}