package me.devtarix.tproj.extensions;

import me.devtarix.tproj.Config;

public class ExtensionsProvider {
    public ExtensionsProvider() {
        if (Config.getConfig().getProperty("debug") == "true") {
            new TestExt();
        }
    }
}
