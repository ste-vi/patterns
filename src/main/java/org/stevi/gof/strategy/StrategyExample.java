package org.stevi.gof.strategy;

public class StrategyExample {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.updateAllUsers();
    }
}
