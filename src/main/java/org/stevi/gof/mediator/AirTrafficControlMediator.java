package org.stevi.gof.mediator;

public interface AirTrafficControlMediator {

    void registerPlane(Plane plane);

    void sendLocation(String location, Plane sender);
}
