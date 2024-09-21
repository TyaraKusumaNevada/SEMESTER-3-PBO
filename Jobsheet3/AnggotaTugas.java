package Jobsheet3;

public class AnggotaTugas {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor
    public AnggotaTugas(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk limit pinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter untuk jumlah pinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(int jumlahPinjam) {
        if (jumlahPinjam + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlahPinjam;
        }
    }

    // Method untuk mengangsur atau membayar pinjaman
    public void angsur(int jumlahAngsuran) {
        if (jumlahAngsuran >= (jumlahPinjaman * 0.1)) {  // Angsuran minimal 10% dari jumlah pinjaman
            jumlahPinjaman -= jumlahAngsuran;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        } else {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        }
    }
}

