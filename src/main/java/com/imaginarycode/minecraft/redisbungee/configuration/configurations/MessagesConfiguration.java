package com.imaginarycode.minecraft.redisbungee.configuration.configurations;

public class MessagesConfiguration {

    private final KickMessages kickMessages = new KickMessages();

    public class KickMessages {

        private final String alreadyConnectedMessage = "&cYou are already logged on to this server.\n" +
                "\n" +
                "&7It may help to try logging in again in a few minutes.\n" +
                "If this does not resolve your issue, please contact staff.";

        public String getAlreadyConnectedMessage() {
            return alreadyConnectedMessage;
        }
    }

    public KickMessages getKickMessages() {
        return kickMessages;
    }
}
