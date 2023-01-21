package me.devtarix.tproj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Config {
    private static Config config;

    Config() {
        Path config = Paths.get("config.properties");
        try (InputStream input = Files.newInputStream(config)) {
            Properties prop = new Properties();

            prop.load(input);
        } catch (IOException ex) {
            System.out.println("Config not found, generating default config!");

            try (OutputStream output = Files.newOutputStream(config)) {
                Properties prop = new Properties();

                prop.setProperty("debug", "true");
                prop.setProperty("ver", "1.1");

                prop.store(output, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static Config getConfig() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public String getProperty(String key) {
        Properties prp = new Properties();

        try (InputStream input = Files.newInputStream(Paths.get("config.properties"))) {
            prp.load(input);
        } catch (IOException e) {
            System.out.println("Failed to load property file");
        }

        return prp.getProperty(key);
    }
}
