public class Barang29 {    

    private String kode;
    private String namaBarang;
    private int hargaAsli;
    private float diskon;

    public Barang29(String kode, String namaBarang, int hargaAsli, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaAsli = hargaAsli;
        this.diskon = diskon;
    }

    // Method untuk menghitung harga jual
    public int hitungHargaJual() {
        return (int) (hargaAsli - (hargaAsli * diskon / 100));
    }

    // Method untuk menampilkan data
    public void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaAsli);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: " + hitungHargaJual());
    }
}

