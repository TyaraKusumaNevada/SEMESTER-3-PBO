package Jobsheet4;

public class Penyewaan {
    private KamarKost kamarKost;
    private Penyewa penyewa;
    private int tanggalMasuk;
    private int tanggalKeluar;

    public Penyewaan(KamarKost kamarKost, Penyewa penyewa, int tanggalMasuk, int tanggalKeluar) {
        this.kamarKost = kamarKost;
        this.penyewa = penyewa;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
    }

    public KamarKost getKamarKost() {
        return kamarKost;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    public int getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setKamarKost(KamarKost kamarKost) {
        this.kamarKost = kamarKost;
    }

    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    public void setTanggalMasuk(int tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public void setTanggalKeluar(int tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public String getInfo() {
        return String.format("Penyewaan: %s, %s, Tanggal Masuk: %d, Tanggal Keluar: %d",
                kamarKost.getInfo(), penyewa.getInfo(), tanggalMasuk, tanggalKeluar);
    }
}