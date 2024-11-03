package Jobsheet4;

public class Main {
    public static void main(String[] args) {
        SistemKost sistemKost = new SistemKost();
        
        KamarKost kamar1 = new KamarKost("Kost Alam", "Jakarta", 1500000);
        KamarKost kamar2 = new KamarKost("Kost Sejahtera", "Bandung", 2000000);
        sistemKost.tambahKamar(kamar1);
        sistemKost.tambahKamar(kamar2);
        
        Penyewa penyewa1 = new Penyewa("Budi", "K001", "08123456789");
        Penyewa penyewa2 = new Penyewa("Andi", "K002", "08234567890");
        sistemKost.daftarPenyewa(penyewa1);
        sistemKost.daftarPenyewa(penyewa2);
        
        int tanggalMasuk1 = 20240926;
        int tanggalKeluar1 = 20240929;
        sistemKost.sewaKamar(penyewa1, kamar1, tanggalMasuk1, tanggalKeluar1);
        
        int tanggalMasuk2 = 20240926;
        int tanggalKeluar2 = 20240931;
        sistemKost.sewaKamar(penyewa2, kamar2, tanggalMasuk2, tanggalKeluar2);
        
        sistemKost.getInfo();
    }
}
