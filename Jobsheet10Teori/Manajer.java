package Jobsheet10Teori;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return gaji; // Kembalikan gaji dasar saja
    }

    public int getTunjangan() {
        return tunjangan;
    }
}



