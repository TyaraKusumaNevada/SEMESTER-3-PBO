package Jobsheet1.Tugas1;

public class Baju {
    public String warna, ukuran, bahan;
    public boolean dipakai, dilipat;
    
    public Baju(String warna, String ukuran, String bahan, boolean dipakai, boolean dilipat) {
        this.warna = warna;
        this.ukuran = ukuran;
        this.bahan = bahan;
    }

    public void dipakai() {
        dipakai = true;
    }

    public void dilepas() {
        dipakai = false;
    }

    public void dilipat() {
        dilipat = true;
    }

    public void direntangkan() {
        dilipat = false;
    }

    public void showInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Bahan: " + bahan);
        System.out.println("Dipakai: " + (dipakai ? "Ya" : "Tidak"));
        System.out.println("Dilipat: " + (dilipat ? "Ya" : "Tidak"));
    }
}
    

