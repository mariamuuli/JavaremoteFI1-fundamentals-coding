package ElectronicDeviceex3;

public class TV extends ElectronicDevice implements Connectivity, Display{

    public TV(String brand, String model, int powerConsumption) {
        super(brand, model, powerConsumption);
    }

    @Override
    public void connectToWifi() {
        System.out.println("Television is connecting to WIFI... Connected to WIFI");
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Television is connecting to bluetooth... Connected to bluetooth");
    }
    @Override
    public void displayContent() {
        System.out.println("The television is connected and displaying channel ETV content");
    }
}
