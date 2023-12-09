package org.stevi.gof.behavioral.iterator;

public class IteratorExample {

    public static void main(String[] args) {
        CarArray carArray = new CarArray();
        carArray.add(new Car());
        carArray.add(new Car());
        carArray.add(new Car());

        Iterator<Car> iterator = carArray.iterator();

        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.hashCode());
        }

    }
}
