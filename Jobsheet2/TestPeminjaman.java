package Jobsheet2;

public class TestPeminjaman {
    public static void main(String[] args) {
        // Membuat objek
        Peminjaman pinjam1 = new Peminjaman();

        // Mengisi atribut
        pinjam1.id = 250;
        pinjam1.namaMember = "Imam Ali";
        pinjam1.namaGame = "Resident Evil";
        pinjam1.lamaSewa = 7;  // per hari 
        pinjam1.hargaPerHari = 60000;  

        // Menampilkan data peminjaman
        pinjam1.tampilData();
    }
}
    

