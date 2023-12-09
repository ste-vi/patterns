package org.stevi.gof.strategy;

import java.util.List;

public class UserService {

    private final List<User> users = List.of(new User(NotificationType.EMAIL), new User(NotificationType.SLACK));
    private final EmailNotification emailNotification = new EmailNotification();
    private final SlackNotification slackNotification = new SlackNotification();

    public void updateAllUsers() {
        doUpdate(users);
        notifyUsers(users);
    }

    private void notifyUsers(List<User> users) {
        users.forEach(user -> {
            switch (user.notificationType()) {
                case EMAIL -> emailNotification.notifyUser();
                case SLACK -> slackNotification.notifyUser();
            }
        });
    }

    private void doUpdate(List<User> users) {

    }
}
