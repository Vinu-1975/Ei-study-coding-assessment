package task1.creational.Factory;


public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();


        String channel = "Email"; // Could be "SMS"/ "Push"

        Notification notification = factory.createNotification(channel);
        notification.notifyUser();
    }
}
