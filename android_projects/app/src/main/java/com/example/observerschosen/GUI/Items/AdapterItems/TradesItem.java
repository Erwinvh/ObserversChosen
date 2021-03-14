package com.example.observerschosen.GUI.Items.AdapterItems;

public class TradesItem {

    public String RequesterName;
    public String ReceiverName;
    public String TradeStatus;
    public String MaterialRequestedImagePath;
    public String MaterialReceivedImagePath;

    public int RequestedAmount;
    public int ReceivedAmount;

    public TradesItem(String requesterName, String receiverName, String tradeStatus, String materialRequestedImagePath, String materialReceivedImagePath, int requestedAmount, int receivedAmount) {
        RequesterName = requesterName;
        ReceiverName = receiverName;
        TradeStatus = tradeStatus;
        MaterialRequestedImagePath = materialRequestedImagePath;
        MaterialReceivedImagePath = materialReceivedImagePath;
        RequestedAmount = requestedAmount;
        ReceivedAmount = receivedAmount;
    }

    public String getRequesterName() {
        return RequesterName;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public String getTradeStatus() {
        return TradeStatus;
    }

    public String getMaterialRequestedImagePath() {
        return MaterialRequestedImagePath;
    }

    public String getMaterialReceivedImagePath() {
        return MaterialReceivedImagePath;
    }

    public int getRequestedAmount() {
        return RequestedAmount;
    }

    public int getReceivedAmount() {
        return ReceivedAmount;
    }
}
