package UTS;

public class TiketReguler extends Tiket {
    private String seatPosition;

    // Konstruktor
    public TiketReguler(String jenisFilm, double hargaTiket, String seatPosition) {
        super(jenisFilm, hargaTiket);
        this.seatPosition = seatPosition;
    }

    // Getter dan Setter untuk posisi kursi
    public String getSeatPosition() {
        return seatPosition;
    }

    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    // Override untuk menampilkan info tiket reguler
    @Override
    public void tampilkanInfoTiket() {
        super.tampilkanInfoTiket();
        System.out.println("Posisi Kursi: " + seatPosition);
    }
}
