package org.stevi.gof.behavioral.mediator;

public class MediatorExample {

    public static void main(String[] args) {

        AirTrafficControlMediator mediator = new AirTrafficControlMediatorImpl();

        Plane planeOne = new PlaneOne(mediator, "boeing-747");
        Plane planeTwo = new PlaneTwo(mediator, "airbus-a330");

        planeOne.requestLocationUpdate();
        System.out.println("------------");
        planeTwo.requestLocationUpdate();
    }
}
