package Jobsheet5;

public class Segitiga extends BangunDatar {
    private float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return 0.5f * alas * tinggi;
    }

    public float keliling() {
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
