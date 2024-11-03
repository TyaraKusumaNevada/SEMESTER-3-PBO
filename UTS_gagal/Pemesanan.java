package UTS;

import java.util.ArrayList;

public class Pemesanan {
    private Pelanggan pelanggan;
    private ArrayList<Tiket> tiketList;

    // Konstruktor
    public Pemesanan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        this.tiketList = new ArrayList<>();
    }

    // Menambahkan tiket ke pemesanan
    public void tambahTiket(Tiket tiket) {
        tiketList.add(tiket);
    }

    // Menghapus tiket dari pemesanan
    public void hapusTiket(Tiket tiket) {
        tiketList.remove(tiket);
    }

    // Mengubah tiket pada posisi tertentu
    public void ubahTiket(int index, Tiket tiketBaru) {
        tiketList.set(index, tiketBaru);
    }

    // Getter untuk daftar tiket
    public ArrayList<Tiket> getTiketList() {
        return tiketList;
    }

    // Menampilkan detail pemesanan
    public void tampilkanDetailPemesanan() {
        pelanggan.tampilkanInfoPelanggan();
        System.out.println("Daftar Tiket yang Dipesan:");
        for (Tiket tiket : tiketList) {
            tiket.tampilkanInfoTiket();
            System.out.println();
        }
    }
}
