package Jobsheet4;

public class Penyewa {
    private String nama;
    private String idPenyewa;
    private String noTelepon;

    public Penyewa(String nama, String idPenyewa, String noTelepon) {
        this.nama = nama;
        this.idPenyewa = idPenyewa;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getIdPenyewa() {
        return idPenyewa;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdPenyewa(String idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getInfo() {
        return String.format("Nama: %-10s | ID Penyewa: %-5s | No Telepon: %s", nama, idPenyewa, noTelepon);
    }
}

