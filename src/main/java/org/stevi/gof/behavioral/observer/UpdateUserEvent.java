package org.stevi.gof.behavioral.observer;

public record UpdateUserEvent(String userEmail) implements Event {

}
