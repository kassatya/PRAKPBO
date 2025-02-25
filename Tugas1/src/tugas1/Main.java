package tugas1;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 10, "Intel i7");
        Smartphone smartphone = new Smartphone("Samsung", 15, 64);
        Tablet tablet = new Tablet("Apple", 12, 10.5);

        System.out.println("\n=== Laptop Actions ===");
        laptop.powerOn();
        laptop.showSpecs();
        laptop.connectToWiFi();
        laptop.connectToBluetooth();
        laptop.powerOff();

        System.out.println("\n=== Smartphone Actions ===");
        smartphone.powerOn();
        smartphone.showSpecs();
        smartphone.connectToWiFi();
        smartphone.connectToBluetooth();
        smartphone.powerOff();

        System.out.println("\n=== Tablet Actions ===");
        tablet.powerOn();
        tablet.showSpecs();
        tablet.connectToWiFi();
        tablet.connectToBluetooth();
        tablet.powerOff();
    }
}
