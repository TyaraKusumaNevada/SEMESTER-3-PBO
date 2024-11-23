package Jobsheet10Teori;

public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai() {
        this.nama = "";
        this.gaji = 0;
    }

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}

