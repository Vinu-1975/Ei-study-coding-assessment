package task2;

public class LegacyWebSocketClient {
    public void openConnection() {
        System.out.println("WebSocket connection opened.");
    }

    public void closeConnection() {
        System.out.println("WebSocket connection closed.");
    }

    public void sendMessageOverWebSocket(String message) {
        System.out.println("Sending over WebSocket: " + message);
    }

    public void onMessageReceived(String message) {
        System.out.println("Received over WebSocket: " + message);
    }
}

