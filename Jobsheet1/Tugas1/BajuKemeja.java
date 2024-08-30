package Jobsheet1.Tugas1;

public class BajuKemeja extends Baju {
    public boolean berkerah;

    public BajuKemeja(String warna, String ukuran, String bahan, boolean berkerah,  boolean dipakai, boolean dilipat) {
        super(warna, ukuran, bahan, dipakai, dilipat);
        this.berkerah = berkerah;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Berkerah: " + (berkerah ? " ya" : "tidak"));
    }
}
