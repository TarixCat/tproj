package me.devtarix.tproj;

import me.devtarix.tproj.extensions.ExtensionsProvider;
import me.devtarix.tproj.extensions.TestExt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lo");
        new ExtensionsProvider();
        Extensions.ext(args);
    }
}
