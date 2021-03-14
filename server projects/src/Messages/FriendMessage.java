package Messages;

public class FriendMessage implements Message {

    public MessageType messageType = MessageType.FRIEND;
    public String FriendCodeReceiver;
    public String FriendCodeRequester;
    public String RequesterName;
    public String ReceiverName;
    public String FriendRequestStatus;

//New > no receiverName
//check > with receiverName
// accept > the two are now friends
//reject > no friendrequest accepted
//delete > remove from both players list and show appropriate message


    public FriendMessage(String friendCodeReceiver, String friendCodeRequester, String requesterName, String receiverName, String friendRequestStatus) {
        FriendCodeReceiver = friendCodeReceiver;
        FriendCodeRequester = friendCodeRequester;
        RequesterName = requesterName;
        ReceiverName = receiverName;
        FriendRequestStatus = friendRequestStatus;
    }

    public String getFriendCodeReceiver() {
        return FriendCodeReceiver;
    }

    public String getFriendCodeRequester() {
        return FriendCodeRequester;
    }

    public String getRequesterName() {
        return RequesterName;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public String getFriendRequestStatus() {
        return FriendRequestStatus;
    }

    public void setReceiverName(String receiverName) {
        ReceiverName = receiverName;
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }
}
