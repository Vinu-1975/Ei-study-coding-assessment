package task2;

public class WebSocketClientAdapter implements ClientCommunication {
    private LegacyWebSocketClient webSocketClient;

    public WebSocketClientAdapter(LegacyWebSocketClient webSocketClient) {
        this.webSocketClient = webSocketClient;
    }

    @Override
    public void connect() {
        webSocketClient.openConnection();
    }

    @Override
    public void disconnect() {
        webSocketClient.closeConnection();
    }

    @Override
    public void send(String message) {
        webSocketClient.sendMessageOverWebSocket(message);
    }

    @Override
    public void receive(String message) {
        webSocketClient.onMessageReceived(message);
    }
}

