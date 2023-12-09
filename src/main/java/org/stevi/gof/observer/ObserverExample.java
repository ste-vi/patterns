package org.stevi.gof.observer;

public class ObserverExample {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addObserver(new EmailService());

        userService.createUser();
        userService.updateUser();
    }
}
