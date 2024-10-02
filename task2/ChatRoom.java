package task2;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Subject {
    private String roomId;
    private List<Observer> observers;
    private List<Message> messageHistory;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        observers = new ArrayList<>();
        messageHistory = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        // Send message history to the new observer
        for (Message message : messageHistory) {
            observer.update(message);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void sendMessage(Message message) {
        messageHistory.add(message);
        notifyObservers(message);
    }

    public List<String> getActiveUsers() {
        List<String> users = new ArrayList<>();
        for (Observer observer : observers) {
            if (observer instanceof User) {
                users.add(((User) observer).getUsername());
            }
        }
        return users;
    }

    public String getRoomId() {
        return roomId;
    }
}
