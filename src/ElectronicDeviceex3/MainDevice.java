package ElectronicDeviceex3;

public class MainDevice {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", "TXH3000", 10);
        tv.displayInfo();
        tv.connectToWifi();
        tv.connectToBluetooth();
        tv.displayContent();

        Laptop laptop = new Laptop("Lenovo", "Thinkpad", 8);
        laptop.displayInfo();
        laptop.connectToWifi();
        laptop.connectToBluetooth();
        laptop.displayContent();

        Phone smartphone = new Phone("Iphone", "12", 5);
        smartphone.displayInfo();
        smartphone.connectToWifi();
        smartphone.connectToBluetooth();
        smartphone.displayContent();
    }
}
