package me.devtarix.tproj.extensions;

import me.devtarix.tproj.Extenders;

import java.util.ArrayList;
import java.util.List;

public class TestExt extends Extenders {

    public TestExt(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Lel");
    }
}