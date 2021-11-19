package me.devtarix.tproj;

import me.devtarix.tproj.extensions.TestExt;

import java.util.HashMap;
import me.devtarix.tproj.extensions.TestExt;

public class Extensions {
    protected static HashMap<String, Extended> registry = new HashMap<>();

    public static void ext(String[] args) {
        for (String ext:args) {
            if (registry.containsKey(ext)) {
                registry.get(ext).execute();
            }
            else {
                System.out.println("There is no extension available called " + ext);
                System.out.println("All the possible extensions are");
                for (String l: registry.keySet()) {
                    System.out.println(l);
                }
            }
        }
    }
}
