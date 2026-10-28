package homework.exercise13;

public class EmailNotification extends Notification{

    @Override
    void send(String message) {
        System.out.println("Email Notification: " + message);
    }

}
