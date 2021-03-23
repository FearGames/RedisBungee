package com.imaginarycode.minecraft.redisbungee;

import net.md_5.bungee.config.Configuration;

public class MessagesConfiguration {


    private final String alreadyConnectedMessage ;

    private final String onlineModeReconnectMessage;

    public MessagesConfiguration(Configuration configuration) {
        alreadyConnectedMessage = configuration.getString("already-connected");
        onlineModeReconnectMessage = configuration.getString("online-mode-reconnect");
    }

    public String getAlreadyConnectedMessage() {
        return alreadyConnectedMessage;
    }

    public String getOnlineModeReconnectMessage() {
        return onlineModeReconnectMessage;
    }

}
