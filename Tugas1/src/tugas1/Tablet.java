package tugas1;

public class Tablet extends ElectronicDevice implements Connectable {
    private double screenSize;

    public Tablet(String brand, int batteryLife, double screenSize) {
        super(brand, batteryLife);
        this.screenSize = screenSize;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " Tablet is powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " Tablet is shutting down...");
    }

    @Override
    public void showSpecs() {
        System.out.println("Tablet Brand: " + brand);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Screen Size: " + screenSize + " inches");
    }

    @Override
    public void connectToWiFi() {
        System.out.println(brand + " Tablet is connecting to WiFi...");
    }

    @Override
    public void connectToBluetooth() {
        System.out.println(brand + " Tablet is connecting to Bluetooth...");
    }
}

