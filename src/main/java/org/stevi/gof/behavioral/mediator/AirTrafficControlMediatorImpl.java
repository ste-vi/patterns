package org.stevi.gof.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlMediatorImpl implements AirTrafficControlMediator {

    private final List<Plane> planes;

    public AirTrafficControlMediatorImpl() {
        this.planes = new ArrayList<>();
    }

    @Override
    public void registerPlane(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void sendLocation(String location, Plane sender) {
        for (Plane plane : planes) {
            if (plane != sender) {
                plane.updateLocation(location);
            }
        }
    }
}
