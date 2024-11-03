package Praktikumjs9;

public class Segitiga {

    // Metode untuk menghitung keliling segitiga dengan tiga sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading metode untuk menghitung hipotenusa dari segitiga siku-siku dengan dua sisi
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}


