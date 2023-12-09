package org.stevi.gof.observer;

public interface Subject {

    void addObserver(Observer observer);

    void notifyObservers(Event event);
}
