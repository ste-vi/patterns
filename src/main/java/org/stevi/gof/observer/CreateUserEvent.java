package org.stevi.gof.observer;

public record CreateUserEvent(String userEmail) implements Event {

}
