package me.devtarix.tproj.utils;

import me.devtarix.tproj.Config;
import me.devtarix.tproj.extensions.TestExt;

import static me.devtarix.tproj.Utils.log;

public class ExtensionsProvider {
    public ExtensionsProvider() {
        if (Config.getConfig().getProperty("debug").equals("true")) {
            new TestExt();
        }

        log("Loaded " + ExtensionRegistry.registry.size() + " extensions");
    }
}
