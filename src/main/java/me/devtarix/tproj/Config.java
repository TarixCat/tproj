package me.devtarix.tproj;

import java.io.*;
import java.util.Properties;

public class Config {
    private static Config config;

    Config() {
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();

            prop.load(input);
        } catch (IOException ex) {
            System.out.println("Config not found, generating default config!");

            try (OutputStream output = new FileOutputStream("config.properties")) {
                Properties prop = new Properties();

                prop.setProperty("debug", "true");

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

        try (InputStream input = new FileInputStream("config.properties")) {
            prp.load(input);
        } catch (IOException e) {
            System.out.println("Failed to load property file");
        }

        return prp.getProperty(key);
    }
}
