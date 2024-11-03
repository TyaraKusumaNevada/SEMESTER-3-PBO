package UTS;

public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, "Kucing", umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

   
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras: " + ras);
    }
}

