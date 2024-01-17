package VehicleHierarchy;

public class Bicycle extends Vehicle implements EngineStart, Drive{
    public Bicycle(String brand, String model, int year, String colour) {
        super(brand, model, year, colour);
    }
    @Override
    public void drive() {
        System.out.println("Bicycle is being pedaled");
    }
    @Override
    public void startEngine() {
        System.out.println("Feet on the pedals and ready to roll");
    }
}
