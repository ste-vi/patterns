package org.stevi.gof.behavioral.strategy;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void notifyUser() {
        System.out.println("Notifying users via email");
    }
}
