package com.programmerspalace;

import com.programmerspalace.command.CommandListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.security.auth.login.LoginException;

public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        try {
            JDA jda = JDABuilder.createDefault(new Config().getDiscordKey()).addEventListeners(new CommandListener()).build();
        } catch (LoginException e) {
            logger.error("Could not login");
        }
    }
}
