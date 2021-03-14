package com.example.observerschosen.GUI.Items.AdapterItems;

public class ChatMessageItem {

    public String SenderName;
    public String Receiver;
    public String Message;
    public String Time;
    //TODO: make timestamp correct value type


    public ChatMessageItem(String senderName, String receiver, String message) {
        SenderName = senderName;
        Receiver = receiver;
        Message = message;
        //TODO: remove this testValue setter
    }

    public ChatMessageItem(String senderName, String receiver, String message, String time) {
        SenderName = senderName;
        Receiver = receiver;
        Message = message;
        Time = time;
    }

    public String getSenderName() {
        return SenderName;
    }

    public String getReceiver() {
        return Receiver;
    }

    public String getMessage() {
        return Message;
    }

    public String getTime() {
        return Time;
    }
}
