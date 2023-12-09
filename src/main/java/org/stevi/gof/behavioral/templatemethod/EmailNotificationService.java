package org.stevi.gof.behavioral.templatemethod;

public class EmailNotificationService extends NotificationService {

    @Override
    protected String fetchUser() {
        return "email user";
    }

    @Override
    protected void notifyUser(String user) {
        System.out.println("Email: notifying user: " + user);
    }
}
