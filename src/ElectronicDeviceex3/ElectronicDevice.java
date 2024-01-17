package ElectronicDeviceex3;

public class ElectronicDevice {
    private String brand;
    private String model;
    private int powerConsumption;

    public ElectronicDevice (String brand, String model, int powerConsumption){
        this.brand = brand;
        this.model = model;
        this.powerConsumption = powerConsumption;
    }
    public void displayInfo(){
        System.out.println("Devices brand is " + brand + " and model is " + model + ". Devices powerconsumpton is " + powerConsumption);
    }
}
