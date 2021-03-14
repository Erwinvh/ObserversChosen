package Messages;

public class TradeMessage implements Message{

    public MessageType messageType = MessageType.TRADE;
    public String ReceiverFriendCode;
    public String RequesterFriendCode;
    public String RequestedMaterialID;
    public String ReturnMaterialID;
    public int RequestedMaterialAmount;
    public int ReturnMaterialAmount;
    public String TradeStatus;

    public TradeMessage(String receiverFriendCode, String requesterFriendCode, String requestedMaterialID, String returnMaterialID, int requestedMaterialAmount, int returnMaterialAmount, String tradeStatus) {
        ReceiverFriendCode = receiverFriendCode;
        RequesterFriendCode = requesterFriendCode;
        RequestedMaterialID = requestedMaterialID;
        ReturnMaterialID = returnMaterialID;
        RequestedMaterialAmount = requestedMaterialAmount;
        ReturnMaterialAmount = returnMaterialAmount;
        TradeStatus = tradeStatus;
    }

    public String getReceiverFriendCode() {
        return ReceiverFriendCode;
    }

    public String getRequesterFriendCode() {
        return RequesterFriendCode;
    }

    public String getRequestedMaterialID() {
        return RequestedMaterialID;
    }

    public String getReturnMaterialID() {
        return ReturnMaterialID;
    }

    public int getRequestedMaterialAmount() {
        return RequestedMaterialAmount;
    }

    public int getReturnMaterialAmount() {
        return ReturnMaterialAmount;
    }

    public String getTradeStatus() {
        return TradeStatus;
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }



}
