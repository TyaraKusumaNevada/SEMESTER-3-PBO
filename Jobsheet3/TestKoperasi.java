package Jobsheet3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menggunakan class AnggotaTugas
        AnggotaTugas donny = new AnggotaTugas("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        // input jumlah pinjaman
        System.out.print("\nMasukkan jumlah pinjaman: ");
        int jumlahPinjam = scanner.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // input jumlah pinjaman kedua
        System.out.print("\nMasukkan jumlah pinjaman kedua: ");
        jumlahPinjam = scanner.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // angsuran 1
        System.out.print("\nMasukkan jumlah angsuran pertama: ");
        int jumlahAngsuran = scanner.nextInt();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // angsuran 2
        System.out.print("\nMasukkan jumlah angsuran kedua: ");
        jumlahAngsuran = scanner.nextInt();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        scanner.close();
    }
}


