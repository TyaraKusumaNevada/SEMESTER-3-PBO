package Jobsheet4;

public class KamarKost {
    private String namaKamar;
    private String lokasi;
    private double hargaPerBulan;

    public KamarKost(String namaKamar, String lokasi, double hargaPerBulan) {
        this.namaKamar = namaKamar;
        this.lokasi = lokasi;
        this.hargaPerBulan = hargaPerBulan;
    }

    public String getNamaKamar() {
        return namaKamar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public double getHargaPerBulan() {
        return hargaPerBulan;
    }

    public void setNamaKamar(String namaKamar) {
        this.namaKamar = namaKamar;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setHargaPerBulan(double hargaPerBulan) {
        this.hargaPerBulan = hargaPerBulan;
    }

    public String getInfo() {
        return String.format("Kamar Kost: %-20s | Lokasi: %-10s | Harga: Rp%.2f per bulan", namaKamar, lokasi, hargaPerBulan);
    }
}
    
