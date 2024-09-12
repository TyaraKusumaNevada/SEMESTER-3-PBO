package Jobsheet2;


public class TampilKaryawan {
    public static void main(String[] args) {
       Karyawan kry = new Karyawan("44444", "ali", "laki-laki", "kepala", 100000);

       kry.hitungGaji();
       kry.tampilkanInfo();

    }
}
