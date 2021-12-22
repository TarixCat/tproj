package me.devtarix.tproj;

public class Settings {
    private static Settings settings;
    public boolean guiActive = false;
    public boolean commandInterpreterActive = true;

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

    public void setCommandInterpreterActive(boolean commandInterpreterActive) {
        this.commandInterpreterActive = commandInterpreterActive;
    }

    public boolean isCommandInterpreterActive() {
        return commandInterpreterActive;
    }
}
