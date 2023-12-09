package org.stevi.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Subject {

    private final List<Observer> userEventObservers = new ArrayList<>();

    public void updateUser() {
        System.out.println("Do update user logic");
        notifyObservers(new UpdateUserEvent("user@mail.com"));
    }

    public void createUser() {
        System.out.println("Do create user logic");
        notifyObservers(new CreateUserEvent("user@mail.com"));
    }

    @Override
    public void addObserver(Observer observer) {
        userEventObservers.add(observer);
    }

    @Override
    public void notifyObservers(Event event) {
        userEventObservers.forEach(observer -> observer.update(event));
    }
}
