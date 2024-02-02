//Sriram Munnangi 
//Homework 1
// Car.java
public class Car {
    private String make;
    private String manufacturer;
    private boolean handicapAccessible;

    public Car(String make, String manufacturer, boolean handicapAccessible) {
        this.make = make;
        this.manufacturer = manufacturer;
        this.handicapAccessible = handicapAccessible;
    }

    public String getMake() {
        return make;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isHandicapAccessible() {
        return handicapAccessible;
    }
}



