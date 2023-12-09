package org.stevi.gof.iterator;

public class CarArray {

    private Car[] cars;
    private int index;

    public void add(Car car) {
        if (cars == null || cars.length == 0) {
            cars = new Car[16];
            index = 0;
        }
        cars[index] = car;
        index++;
    }

    public Iterator<Car> iterator() {
        return new CarArrayIterator();
    }

    private class CarArrayIterator implements Iterator<Car> {

        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < cars.length - 1 && cars[position] != null;
        }

        @Override
        public Car next() {
            if (hasNext()) {
                Car car = cars[position];
                position++;
                return car;
            }
            throw new IllegalStateException("No more elements");
        }
    }
}
