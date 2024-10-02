package task2;

public class User implements Observer {
    private String username;
    private ChatRoom chatRoom;
    private ClientCommunication clientCommunication;

    public User(String username, ClientCommunication clientCommunication) {
        this.username = username;
        this.clientCommunication = clientCommunication;
    }

    public void joinChatRoom(String roomId) {
        ChatRoomManager manager = ChatRoomManager.getInstance();
        if (!manager.chatRoomExists(roomId)) {
            manager.createChatRoom(roomId);
        }
        chatRoom = manager.getChatRoom(roomId);
        chatRoom.registerObserver(this);
        // Display active users
        System.out.println("Active users in " + roomId + ": " + chatRoom.getActiveUsers());
    }

    public void leaveChatRoom() {
        if (chatRoom != null) {
            chatRoom.removeObserver(this);
            chatRoom = null;
        }
    }

    public void sendMessage(String content) {
        if (chatRoom != null) {
            Message message = new Message(username, content);
            chatRoom.sendMessage(message);
        }
    }

    @Override
    public void update(Message message) {
        // Display the message
        System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getContent());
    }

    public String getUsername() {
        return username;
    }
}

