package Jobsheet2;

public class Peminjaman{

    // Atribut
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaPerHari;
    public double totalHarga;

    // Method untuk menghitung total harga
    public double hitungTotalHarga() {
        totalHarga = lamaSewa * hargaPerHari;
        return totalHarga;
    }

    // Method untuk menampilkan data peminjaman
    public void tampilData() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Harga Sewa per Hari: Rp. " + hargaPerHari);
        System.out.println("Total Harga yang Harus Dibayar: Rp. " + hitungTotalHarga());
    }
        
}
    
    

