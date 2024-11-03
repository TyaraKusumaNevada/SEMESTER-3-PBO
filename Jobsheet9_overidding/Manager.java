package Jobsheet9_overidding;

class Manager {
    String nama;
    int gaji;

    // Constructor untuk menginisialisasi nama dan gaji
    public Manager(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    // Metode untuk menaikkan gaji
    public void naikkanGaji() {
        gaji += 1000000; // contoh kenaikan gaji sebesar 1 juta
    }

    // Metode untuk mencetak status (nama dan gaji)
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}

