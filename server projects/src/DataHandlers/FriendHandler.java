package DataHandlers;

import Messages.FriendMessage;
import ServerComponents.Client;

public class FriendHandler {



    public static void handleFriendMessage(Client client, FriendMessage message){
        String itemStatus = message.getFriendRequestStatus();
        switch (itemStatus){

            case "Request":
                if (message.getReceiverName().equals("")){
                    //TODO: request friendname with friendcode
                    //TODO: resend back to the requester the message with the name placed for conform
                }else{
                    //TODO: send to receiver
                }

                break;
            case "Accepted":
                //TODO: set info in server if needed
                //TODO: send to requester for confirmation
                break;

            case "Denied":
                //TODO: send to requester for confirmation
                break;

            case "Deleted":
                //TODO: set info in server if needed
                //TODO: send to receiver for confirmation
                break;



        }

    }


}
