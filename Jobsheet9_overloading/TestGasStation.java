package Jobsheet9_overloading;

public class TestGasStation {
    public static void main(String[] args) {
        MobilMewah alphard = new MobilMewah();
        MobilKuno carry = new MobilKuno();
        GasStation gs = new GasStation();

        // Isi bahan masing masing mobil
        gs.isiBahanBakar(carry, 20000);   // Mobil tua, pertalite
        gs.isiBahanBakar(alphard, 20000); // Mobil mewah, pertamax
    }
}

