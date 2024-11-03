package Jobsheet5;

public class MainBangunDatar {
    public static void main(String[] args) {
        // objek persegi panjangg
        PersegiPanjang persegiPanjang = new PersegiPanjang(28, 7);
        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        // objek linkaran
        Lingkaran lingkaran = new Lingkaran(21);
        System.out.println("\nLingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        // objek segitiga
        Segitiga segitiga = new Segitiga(10, 15);
        System.out.println("\nSegitiga:");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}

