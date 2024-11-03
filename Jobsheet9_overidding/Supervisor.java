package Jobsheet9_overidding;

class Supervisor extends Manager {

    // Constructor untuk Supervisor, memanggil constructor dari Manager
    public Supervisor(String nama, int gaji) {
        super(nama, gaji); // memanggil constructor dari superclass (Manager)
    }

    // Metode naikkanGaji() bisa di-overridden jika ada kenaikan yang berbeda
    @Override
    public void naikkanGaji() {
        gaji += 1500000; // contoh kenaikan gaji lebih besar untuk Supervisor
    }
}

