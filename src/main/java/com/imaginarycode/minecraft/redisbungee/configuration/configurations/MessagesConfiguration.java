package com.imaginarycode.minecraft.redisbungee.configuration.configurations;

public class MessagesConfiguration {

    private final KickMessages kickMessages = new KickMessages();

    public class KickMessages {

        private final String alreadyConnectedMessage = "&cYou are already logged on to this server." +
                "\n\n" +
                "&7It may help to try logging in again in a few minutes." +
                "\nIf this does not resolve your issue, please contact staff.";

        private final String onlineModeReconnect = "&cWhoops! You need to reconnect."
                +"\n\n&7We found someone online using your username. They were kicked and you may reconnect." +
                "\nIf this does not work, please contact staff.";

        public String getAlreadyConnectedMessage() {
            return alreadyConnectedMessage;
        }

        public String getOnlineModeReconnect() {
            return onlineModeReconnect;
        }
    }

    public KickMessages getKickMessages() {
        return kickMessages;
    }
}
