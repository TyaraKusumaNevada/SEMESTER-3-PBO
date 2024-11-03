package UTS;

public class Tiket {
    private String jenisFilm;
    private double hargaTiket;

    // Konstruktor
    public Tiket(String jenisFilm, double hargaTiket) {
        this.jenisFilm = jenisFilm;
        this.hargaTiket = hargaTiket;
    }

    // Getter dan Setter
    public String getJenisFilm() {
        return jenisFilm;
    }

    public void setJenisFilm(String jenisFilm) {
        this.jenisFilm = jenisFilm;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    // Method untuk menampilkan info tiket
    public void tampilkanInfoTiket() {
        System.out.println("Jenis Film: " + jenisFilm);
        System.out.println("Harga Tiket: Rp " + hargaTiket);
    }
}
