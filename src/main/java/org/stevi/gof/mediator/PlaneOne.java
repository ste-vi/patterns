package org.stevi.gof.mediator;

public class PlaneOne extends Plane {

    public PlaneOne(AirTrafficControlMediator mediator, String name) {
        super(mediator, name);
        mediator.registerPlane(this);
    }

    @Override
    public void updateLocation(String location) {
        System.out.println(name + " received location update: " + location);
    }

    @Override
    public void requestLocationUpdate() {
        System.out.println(name + " requests location update.");
        String currentLocation = "France";
        mediator.sendLocation("Current location: " + currentLocation, this);
    }
}
