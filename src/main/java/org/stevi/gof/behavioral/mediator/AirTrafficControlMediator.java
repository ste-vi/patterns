package org.stevi.gof.behavioral.mediator;

public interface AirTrafficControlMediator {

    void registerPlane(Plane plane);

    void sendLocation(String location, Plane sender);
}
