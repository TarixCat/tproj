package me.devtarix.tproj;

import java.util.HashMap;

public class ExtensionRegistry {
    protected static HashMap<String, Extensions> registry = new HashMap<>();

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
