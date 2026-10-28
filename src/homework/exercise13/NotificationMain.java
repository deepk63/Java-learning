package homework.exercise13;

public class NotificationMain {

    public static void main(String[] args) {

        Notification notification1 = new EmailNotification();
        notification1.send("Your account has been created successfully");

        Notification notification2 = new SMSNotification();
        notification2.send("Your payment was successful");

        Notification notification3 = new PushNotification();
        notification3.send("You have new message");

    }
}
