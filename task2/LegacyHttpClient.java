package task2;

public class LegacyHttpClient {
    public void startSession() {
        System.out.println("HTTP session started.");
    }

    public void endSession() {
        System.out.println("HTTP session ended.");
    }

    public void postMessage(String message) {
        System.out.println("Posting over HTTP: " + message);
    }

    public void getMessage(String message) {
        System.out.println("Getting over HTTP: " + message);
    }
}

