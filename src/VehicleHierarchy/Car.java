package VehicleHierarchy;

public class Car extends Vehicle implements EngineStart, Drive{
    public Car(String brand, String model, int year, String colour) {
        super(brand, model, year, colour);
    }
    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }
    @Override
    public void startEngine() {
        System.out.println("Vroom vroom. Car's engine started");
    }
}
