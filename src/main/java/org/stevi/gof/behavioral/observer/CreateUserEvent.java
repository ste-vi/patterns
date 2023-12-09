package org.stevi.gof.behavioral.observer;

public record CreateUserEvent(String userEmail) implements Event {

}
