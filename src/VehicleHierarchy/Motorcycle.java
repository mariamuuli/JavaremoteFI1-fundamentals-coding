package VehicleHierarchy;

public class Motorcycle extends Vehicle implements EngineStart, Drive {
    public Motorcycle(String brand, String model, int year, String colour) {
        super(brand, model, year, colour);
    }
    @Override
    public void drive() {
        System.out.println("Motorcycle is being ridden");
    }
    @Override
    public void startEngine() {
        System.out.println("Vroom-vroom. Motorcycle's engine has started");
    }

    }

