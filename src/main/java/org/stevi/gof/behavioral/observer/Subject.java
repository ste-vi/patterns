package org.stevi.gof.behavioral.observer;

public interface Subject {

    void addObserver(Observer observer);

    void notifyObservers(Event event);
}
