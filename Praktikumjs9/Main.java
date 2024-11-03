package Praktikumjs9;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        // Menghitung keliling segitiga dengan tiga sisi
        int keliling1 = segitiga.keliling(5, 7, 10);
        System.out.println("Keliling segitiga (tiga sisi): " + keliling1);
        
        // Menghitung hipotenusa segitiga siku-siku dengan dua sisi
        double keliling2 = segitiga.keliling(3, 4);
        System.out.println("Panjang hipotenusa (dua sisi): " + keliling2);
    }
}

