package org.stevi.gof.strategy;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void notifyUser() {
        System.out.println("Notifying users via email");
    }
}
