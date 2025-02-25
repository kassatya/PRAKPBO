package tugas1;

public abstract class ElectronicDevice {
    protected String brand;
    protected int batteryLife;

    public ElectronicDevice(String brand, int batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void showSpecs();
}

