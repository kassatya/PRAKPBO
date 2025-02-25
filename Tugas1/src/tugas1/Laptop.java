package tugas1;

public class Laptop extends ElectronicDevice implements Connectable {
    private String processor;

    public Laptop(String brand, int batteryLife, String processor) {
        super(brand, batteryLife);
        this.processor = processor;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " Laptop is powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " Laptop is shutting down...");
    }

    @Override
    public void showSpecs() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Processor: " + processor);
    }

    @Override
    public void connectToWiFi() {
        System.out.println(brand + " Laptop is connecting to WiFi...");
    }

    @Override
    public void connectToBluetooth() {
        System.out.println(brand + " Laptop is connecting to Bluetooth...");
    }
}
