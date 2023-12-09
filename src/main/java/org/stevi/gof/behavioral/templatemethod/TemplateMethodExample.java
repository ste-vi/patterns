package org.stevi.gof.behavioral.templatemethod;

public class TemplateMethodExample {

    public static void main(String[] args) {
        NotificationService emailNotificationService = new EmailNotificationService();
        NotificationService slackNotificationService = new SlackNotificationService();

        emailNotificationService.doNotify();
        slackNotificationService.doNotify();
    }
}
