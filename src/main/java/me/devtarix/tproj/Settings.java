package me.devtarix.tproj;

public class Settings {
    private static Settings settings;
    public boolean guiActive = false;

    private Settings() {
    }

    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings();
        }

        return settings;
    }

    public void setGuiActive(boolean guiActive) {
        this.guiActive = guiActive;
    }

    public boolean isGuiActive() {
        return guiActive;
    }
}
