package Jobsheet2;

public class Persegi {
    int sisi;

    // Konstruktor inisialisasi sisi
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    // Method untuk menampilkan data panjang sisi
    public void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }

    // Method untuk hitung luas persegi
    public int luasPersegi() {
        return sisi * sisi;
    }

    // Method untuk keliling persegi
    public int kelilingPersegi() {
        return 4 * sisi;
    }
}


