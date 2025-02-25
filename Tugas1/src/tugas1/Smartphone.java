package tugas1;

public class Smartphone extends ElectronicDevice implements Connectable {
    private int cameraMP;

    public Smartphone(String brand, int batteryLife, int cameraMP) {
        super(brand, batteryLife);
        this.cameraMP = cameraMP;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " Smartphone is turning on...");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " Smartphone is shutting down...");
    }

    @Override
    public void showSpecs() {
        System.out.println("Smartphone Brand: " + brand);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Camera: " + cameraMP + " MP");
    }

    @Override
    public void connectToWiFi() {
        System.out.println(brand + " Smartphone is connecting to WiFi...");
    }

    @Override
    public void connectToBluetooth() {
        System.out.println(brand + " Smartphone is connecting to Bluetooth...");
    }
}

