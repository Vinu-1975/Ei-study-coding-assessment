package task2;

public interface ClientCommunication {
    void connect();
    void disconnect();
    void send(String message);
    void receive(String message);
}

