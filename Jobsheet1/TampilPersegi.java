package Jobsheet1;

public class TampilPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);

        persegi.dataPersegi(); //tapil data persegi (panjang persegi)

        System.out.println("Luas persegi: " + persegi.luasPersegi()); // hitung dan tampil luas perseg
        System.out.println("Keliling persegi: " + persegi.kelilingPersegi()); //hitung dan tmpil kelilng persegi
    }
}

