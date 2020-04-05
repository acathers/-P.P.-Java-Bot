package com.programmerspalace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private String discordKey;

    public Config() {
        Logger logger = LoggerFactory.getLogger(Config.class);

        try (InputStream input = new FileInputStream("config/settings.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            discordKey = properties.getProperty("discord.key");
        } catch (IOException e) {
            logger.error("Could not read properties file");
        }
    }

    public String getDiscordKey() {
        return discordKey;
    }
}