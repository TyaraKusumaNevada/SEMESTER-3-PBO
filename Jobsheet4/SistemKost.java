package Jobsheet4;

public class SistemKost {
    private KamarKost[] daftarKamar;
    private Penyewa[] daftarPenyewa;
    private Penyewaan[] daftarPenyewaan;
    private int kamarCount;
    private int penyewaCount;
    private int penyewaanCount;

    public SistemKost() {
        daftarKamar = new KamarKost[10];
        daftarPenyewa = new Penyewa[10];
        daftarPenyewaan = new Penyewaan[10];
        kamarCount = 0;
        penyewaCount = 0;
        penyewaanCount = 0;
    }

    public void tambahKamar(KamarKost kamarKost) {
        if (kamarCount < 10) {
            daftarKamar[kamarCount] = kamarKost;
            kamarCount++;
        }
    }

    public void daftarPenyewa(Penyewa penyewa) {
        if (penyewaCount < 10) {
            daftarPenyewa[penyewaCount] = penyewa;
            penyewaCount++;
        }
    }

    public void sewaKamar(Penyewa penyewa, KamarKost kamarKost, int checkIn, int checkOut) {
        if (penyewaanCount < 10) {
            Penyewaan penyewaan = new Penyewaan(kamarKost, penyewa, checkIn, checkOut);
            daftarPenyewaan[penyewaanCount] = penyewaan;
            penyewaanCount++;
        }
    }

    public void getInfo() {
        System.out.println("===== Daftar Kamar Kost =====");
        System.out.printf("%-30s\n", "-------------------------");
        for (int i = 0; i < kamarCount; i++) {
            System.out.println(daftarKamar[i].getInfo());
        }

        System.out.println("\n===== Daftar Penyewa =====");
        System.out.printf("%-30s\n", "-------------------------");
        for (int i = 0; i < penyewaCount; i++) {
            System.out.println(daftarPenyewa[i].getInfo());
        }

        System.out.println("\n===== Daftar Penyewaan =====");
        System.out.printf("%-30s\n", "-------------------------");
        for (int i = 0; i < penyewaanCount; i++) {
            System.out.println(daftarPenyewaan[i].getInfo());
        }
    }
}