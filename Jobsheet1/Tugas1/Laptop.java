package Jobsheet1.Tugas1;

public class Laptop {
    public String brand, model;
    private int volume;
    private boolean status;
    private String serialNumber;

    public Laptop(String brand, String model, boolean status, int volume) {
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.volume = volume;
    }

    public void hidupkan() {
        status = true;
    }

    public void matikan() {
        status = false;
    }

    public void tingkatkanSuara(int x) {
        volume += x;
    }

    public void kurangiSuara(int x) {
        volume -= x;
    }

    public String infoBrand() {
        return brand;
    }

    public String infoModel() {
        return model;
    }

    public boolean infoStatus() {
        return status;
    }

    public int infoVolume() {
        return volume;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Status: " + status);
        System.out.println("Volume: " + volume);
    }

    public String getSerial() {
        return serialNumber;
    }
}
    

