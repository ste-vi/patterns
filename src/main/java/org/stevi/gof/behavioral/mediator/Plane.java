package org.stevi.gof.behavioral.mediator;

public abstract class Plane {

    protected AirTrafficControlMediator mediator;
    protected String name;

    public Plane(AirTrafficControlMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void updateLocation(String location);

    public abstract void requestLocationUpdate();
}
