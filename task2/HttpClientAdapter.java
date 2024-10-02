package task2;

public class HttpClientAdapter implements ClientCommunication {
    private LegacyHttpClient httpClient;

    public HttpClientAdapter(LegacyHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public void connect() {
        httpClient.startSession();
    }

    @Override
    public void disconnect() {
        httpClient.endSession();
    }

    @Override
    public void send(String message) {
        httpClient.postMessage(message);
    }

    @Override
    public void receive(String message) {
        httpClient.getMessage(message);
    }
}

