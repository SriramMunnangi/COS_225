// ParkingLot.java
public class ParkingLot<Car> {
    @SuppressWarnings("rawtypes")
    private ParkingSpot[] spots;

    @SuppressWarnings("rawtypes")
    public ParkingLot() {
        spots = new ParkingSpot[10];
        for (int i = 0; i < 2; i++) {
            spots[i] = new ParkingSpot(true);
        }
        for (int i = 2; i < 10; i++) {
            spots[i] = new ParkingSpot(false);
        }
    }

    @SuppressWarnings("unchecked")
    public int parkCar(Car car) {
        for (int i = 0; i < spots.length; i++) {
            if (spots[i].getParkedCar() == null) {
                spots[i].setParkedCar(car);
                return i;
            }
        }
        return -1; // No available spot
    }

    @SuppressWarnings("unchecked")
    public Object removeCar(int spotIndex) {
        Object removedCar = spots[spotIndex].getParkedCar();
        spots[spotIndex].setParkedCar(null);
        return removedCar;
    }

    
}

