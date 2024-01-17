package ElectronicDeviceex3;

public class Phone extends ElectronicDevice implements Connectivity, Display{

    public Phone(String brand, String model, int powerConsumption) {
        super(brand, model, powerConsumption);
    }
    @Override
    public void connectToWifi() {
        System.out.println("Phone is connecting to WIFI... Connected to WIFI");
    }
    @Override
    public void connectToBluetooth() {
        System.out.println("Phone is connecting to bluetooth... Connected to bluetooth");
    }
    @Override
    public void displayContent() {
        System.out.println("Phone is turned on and needs face id to unlock");
    }
}
