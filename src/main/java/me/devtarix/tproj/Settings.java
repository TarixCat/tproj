package me.devtarix.tproj;

public class Settings {
    private static Settings settings;
    public boolean commandInterpreterActive = true;

    private Settings() {

    }

    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings();
        }

        return settings;
    }

    public void setCommandInterpreterActive(boolean commandInterpreterActive) {
        this.commandInterpreterActive = commandInterpreterActive;
    }

    public boolean isCommandInterpreterActive() {
        return commandInterpreterActive;
    }
}
