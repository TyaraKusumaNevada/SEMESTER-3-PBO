package Jobsheet1.Tugas1;

public class BajuJaket extends Baju  {
    public boolean berkancing;

    public BajuJaket(String warna, String ukuran, String bahan, boolean berkancing,  boolean dipakai, boolean dilipat) {
        super(warna, ukuran, bahan, dipakai, dilipat);
        this.berkancing = berkancing;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Berkancing: " + (berkancing ? " ya" : "tidak"));
    }
}
    

