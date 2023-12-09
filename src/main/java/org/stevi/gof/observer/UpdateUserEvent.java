package org.stevi.gof.observer;

public record UpdateUserEvent(String userEmail) implements Event {

}
