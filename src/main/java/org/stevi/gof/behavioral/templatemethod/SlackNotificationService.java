package org.stevi.gof.behavioral.templatemethod;

public class SlackNotificationService extends NotificationService {

    @Override
    protected String fetchUser() {
        return "slack user";
    }

    @Override
    protected void notifyUser(String user) {
        System.out.println("Slack: notifying user: " + user);
    }
}
