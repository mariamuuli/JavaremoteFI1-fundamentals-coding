package VehicleHierarchy;

public class mainDemo {
    public static void main(String[] args) {
        Car car = new Car("Volvo", "XC90", 2021, "Black");
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2020, "Green");
        Bicycle bicycle = new Bicycle("Helkama", "Kaunotar", 1990, "Light blue");

        car.displayInfo();
        car.startEngine();
        car.drive();

        bicycle.displayInfo();
        bicycle.startEngine();
        bicycle.drive();

        motorcycle.displayInfo();
        motorcycle.startEngine();
        motorcycle.drive();



    }
}
