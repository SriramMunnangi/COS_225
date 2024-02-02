// ParkingSpot.java
public class ParkingSpot<Car> {
    private Car parkedCar;
    private boolean handicap;

    public ParkingSpot(boolean handicap) {
        this.handicap = handicap;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }

    public boolean isHandicap() {
        return handicap;
    }
}

