package Jobsheet3;


public class AnggotaTugas {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public AnggotaTugas(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }


    public void pinjam(int jumlahPinjam) {
        if (jumlahPinjam + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlahPinjam;
        }
    }

    // Method untuk mengangsur atau membayar pinjaman
    public void angsur(int jumlahAngsuran) {
        // Nominal angsuran minimal adalah 10% dari jumlah pinjaman
        double angsuranMinimal = jumlahPinjaman * 0.1;

        if (jumlahAngsuran < angsuranMinimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlahAngsuran;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}
