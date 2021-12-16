package me.devtarix.tproj.extensions;

import me.devtarix.tproj.Extensions;
import me.devtarix.tproj.Settings;

public class GuiMode implements Extensions {
    GuiMode() {
        registerAs("gui");
    }
    @Override
    public void execute() {
        Settings st = Settings.getInstance();
        st.setGuiActive(true);
    }
}
