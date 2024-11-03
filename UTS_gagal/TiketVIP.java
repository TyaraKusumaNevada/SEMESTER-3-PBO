package UTS;

public class TiketVIP extends Tiket {
    private String layananTambahan;

    // Konstruktor
    public TiketVIP(String jenisFilm, double hargaTiket, String layananTambahan) {
        super(jenisFilm, hargaTiket);
        this.layananTambahan = layananTambahan;
    }

    // Getter dan Setter untuk layanan tambahan
    public String getLayananTambahan() {
        return layananTambahan;
    }

    public void setLayananTambahan(String layananTambahan) {
        this.layananTambahan = layananTambahan;
    }

    // Override untuk menampilkan info tiket VIP
    @Override
    public void tampilkanInfoTiket() {
        super.tampilkanInfoTiket();
        System.out.println("Layanan Tambahan: " + layananTambahan);
    }
}
