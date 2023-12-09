package org.stevi.gof.behavioral.strategy;

public class SlackNotification implements NotificationStrategy {

    @Override
    public void notifyUser() {
        System.out.println("Notifying users via slack");
    }
}
