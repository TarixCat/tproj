package me.devtarix.tproj.extensions;

import me.devtarix.tproj.Extended;
import me.devtarix.tproj.Extenders;

import java.util.ArrayList;
import java.util.List;

public class TestExt implements Extended {
    public TestExt() {
        registerAs("testext");
    }

    @Override
    public void execute() {
        System.out.println("Lel");
    }
}