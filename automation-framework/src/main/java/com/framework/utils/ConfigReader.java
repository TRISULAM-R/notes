package com.framework.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private Properties props = new Properties();

    public ConfigReader() {
        try (InputStream input = new FileInputStream("src/test/resources/config.properties")) {
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Unable to load config.properties", e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    public String getBrowser() {
        String b = props.getProperty("browser");
        return (b != null) ? b : "chrome";
    }
}
