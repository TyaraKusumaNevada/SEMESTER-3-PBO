package UTS;

public class Hewan {
    private String nama;
    private String jenis;
    private int umur;

    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }
}


