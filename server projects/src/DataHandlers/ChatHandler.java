package DataHandlers;


import Messages.ChatMessage;
import ServerComponents.Client;

public class ChatHandler {

    public static void handleChatMessage(Client client, ChatMessage message){

        //TODO: handle the messages
        String ReceiverID = message.getReceiver();
        if (message.isPrivate()){
            //TODO: search for player
            //TODO: write to player
        }else{
            //TODO: search for group
            //TODO: write to group
        }


    }







}
