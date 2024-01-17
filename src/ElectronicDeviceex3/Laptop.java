package ElectronicDeviceex3;

public class Laptop extends ElectronicDevice implements Connectivity, Display{
    public Laptop(String brand, String model, int powerConsumption) {
        super(brand, model, powerConsumption);
    }

    @Override
    public void connectToWifi() {
        System.out.println("Laptop is connecting to WIFI... Connected to WIFI");
    }
    @Override
    public void connectToBluetooth() {
        System.out.println("Laptop is connecting to bluetooth... Connected to bluetooth");
    }

    @Override
    public void displayContent() {
        System.out.println("The laptop is turned on and need login information");
    }
}
