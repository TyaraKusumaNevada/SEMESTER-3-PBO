package Jobsheet9_overloading;

public class GasStation {
    // Harga per litr
    private final int HARGA_PERTAMAX = 10000;
    private final int HARGA_PERTALITE = 5000;

    // Method isiBahanBakar menggunakan Pertalite
    public void isiBahanBakar(MobilKuno mobil, int bayar) {
        int liter = bayar / HARGA_PERTALITE;
        System.out.println("Mobil tua diisi pertalite sebanyak " + liter + " liter");
    }

    // Method isiBahanBakar menggunakan Pertalite Pertamax
    public void isiBahanBakar(MobilMewah mobil, int bayar) {
        int liter = bayar / HARGA_PERTAMAX;
        System.out.println("Mobil mewah diisi pertamax sebanyak " + liter + " liter");
    }
}

