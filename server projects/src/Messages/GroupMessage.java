package Messages;

import java.util.List;

public class GroupMessage implements Message{

    public MessageType messageType = MessageType.GROUP;
    public String GroupID;
    public String GroupStatus;
    public List<String> GroupMembers;

    @Override
    public MessageType getMessageType() {
        return messageType;
    }


    //New > no receiverName
// accept > the two are now friends
//reject > no friendrequest accepted
//delete > remove from both players list and show appropriate message







}
