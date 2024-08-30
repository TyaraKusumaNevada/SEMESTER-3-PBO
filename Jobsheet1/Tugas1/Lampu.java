package Jobsheet1.Tugas1;

public class Lampu {
 
    public String warna, warnaCahaya;
    private int tingkatCahaya;

    public Lampu(String warna, String warnaCahaya, int tingkatCahaya) {
        this.warna = warna;
        this.warnaCahaya = warnaCahaya;
        this.tingkatCahaya = tingkatCahaya;
    }
    
    void setWarnaCahaya(String w) {
        warnaCahaya = w;
    }

    void tambahTingkatCahaya(int tingkatCahaya) {
        this.tingkatCahaya += tingkatCahaya;
    }

    void kurangTingkatCahaya(int tingkatCahaya) {
        this.tingkatCahaya -= tingkatCahaya;
    }

    void showInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Warna Cahaya: " + warnaCahaya);
        System.out.println("Tingkat Cahaya: " + tingkatCahaya);
    }
}

