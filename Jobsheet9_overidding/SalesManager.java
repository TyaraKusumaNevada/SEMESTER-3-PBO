package Jobsheet9_overidding;

class SalesManager extends Manager {
    String departemen;

    // Constructor untuk SalesManager, menambahkan departemen
    public SalesManager(String nama, String departemen, int gaji) {
        super(nama, gaji); // memanggil constructor dari superclass (Manager)
        this.departemen = departemen;
    }

    // Overriding metode cetakStatus untuk menampilkan departemen
    @Override
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}
