package task2;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomManager {
    private static ChatRoomManager instance = null;
    private Map<String, ChatRoom> chatRooms;

    private ChatRoomManager() {
        chatRooms = new HashMap<>();
    }

    public static synchronized ChatRoomManager getInstance() {
        if (instance == null) {
            instance = new ChatRoomManager();
        }
        return instance;
    }

    public ChatRoom getChatRoom(String roomId) {
        return chatRooms.get(roomId);
    }

    public ChatRoom createChatRoom(String roomId) {
        ChatRoom room = new ChatRoom(roomId);
        chatRooms.put(roomId, room);
        return room;
    }

    public boolean chatRoomExists(String roomId) {
        return chatRooms.containsKey(roomId);
    }
}
