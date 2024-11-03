package UTS;

public class Transaksi {
    private Pelanggan pelanggan;
    private Hewan hewan;

    public Transaksi(Pelanggan pelanggan, Hewan hewan) {
        this.pelanggan = pelanggan;
        this.hewan = hewan;
    }

    public void tampilkanTransaksi() {
        pelanggan.tampilkanInfo();
        hewan.tampilkanInfo();
    }
}



