public class ParkingTester {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        System.out.println(parkingLot.toString());

        Car infinitiA = new Car("Infiniti A", "ManufacturerA", true);
        int indexInfinitiA = parkingLot.parkCar(infinitiA);
        System.out.println(parkingLot.toString());

        Car cadillacB = new Car("Cadillac B", "ManufacturerB", false);
        int indexCadillacB = parkingLot.parkCar(cadillacB);
        System.out.println(parkingLot.toString());

        parkingLot.removeCar(indexInfinitiA);
        System.out.println(parkingLot.toString());
    }
}
