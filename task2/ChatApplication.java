package task2;

public class ChatApplication {
    public static void main(String[] args) {
        // Create client communication adapters
        ClientCommunication aliceCommunication = new WebSocketClientAdapter(new LegacyWebSocketClient());
        ClientCommunication bobCommunication = new HttpClientAdapter(new LegacyHttpClient());

        // Create users with different communication protocols
        User alice = new User("Alice", aliceCommunication);
        User bob = new User("Bob", bobCommunication);

        // Users join chat room
        alice.joinChatRoom("Room123");
        bob.joinChatRoom("Room123");

        // Users send messages
        alice.sendMessage("Hello, everyone!");
        bob.sendMessage("How's it going?");

        // Display active users
        ChatRoomManager manager = ChatRoomManager.getInstance();
        ChatRoom room = manager.getChatRoom("Room123");
        System.out.println("Active users: " + room.getActiveUsers());

        // Users leaves chat room
        alice.leaveChatRoom();
        bob.leaveChatRoom();
    }
}

