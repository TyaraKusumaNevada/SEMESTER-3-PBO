package Jobsheet1.Tugas1;

public class Demo {
    public static void main(String[] args) {
        Lampu lb1 = new Lampu("Putih","Kuning", 0);
        Laptop lp1 = new Laptop("Asus", "2929", false, 0);
        Baju b1 = new Baju("Merah", "S", "Linen", false, false);
        BajuKemeja bs1 = new BajuKemeja("Biru", "S", "Katun", true, false, false);

        lb1.tambahTingkatCahaya(10);
        lb1.setWarnaCahaya("Biru");
        lb1.showInfo();
        System.out.println();

        lp1.hidupkan();
        lp1.tingkatkanSuara(10);
        lp1.showInfo();
        System.out.println();

        b1.dilipat();
        b1.dipakai();
        b1.showInfo();
        System.out.println();

        bs1.showInfo();
    }
}


