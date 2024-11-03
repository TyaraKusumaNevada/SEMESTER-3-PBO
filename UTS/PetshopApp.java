package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class PetshopApp {
    private static ArrayList<Kucing> daftarKucing = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n======== Aplikasi Petshop ========");
            System.out.println("1. Tambah Member Kucing");
            System.out.println("2. Hapus Member Kucing");
            System.out.println("3. Ubah Data Kucing");
            System.out.println("4. Tampilkan Semua Kucing");
            System.out.println("5. Lanjutkan ke Pelayanan");
            System.out.println("6. Keluar");

            System.out.print("Masukkan pilihan (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    tambahKucing(scanner);
                    break;
                case 2:
                    hapusKucing(scanner);
                    break;
                case 3:
                    ubahDataKucing(scanner);
                    break;
                case 4:
                    tampilkanSemuaKucing();
                    break;
                case 5:
                    layananPelayanan(scanner);
                    break;
                case 6:
                    System.out.println("Keluar dari aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    // Method untuk menambah data kucing
    private static void tambahKucing(Scanner scanner) {
        System.out.print("Masukkan nama kucing: ");
        String namaKucing = scanner.nextLine();
        
        System.out.print("Masukkan umur kucing (tahun): ");
        int umurKucing = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline
        
        System.out.print("Masukkan ras kucing: ");
        String rasKucing = scanner.nextLine();
        
        Kucing kucingBaru = new Kucing(namaKucing, umurKucing, rasKucing);
        daftarKucing.add(kucingBaru);
        System.out.println("Kucing berhasil ditambahkan.");
    }

    // Method untuk menghapus data kucing
    private static void hapusKucing(Scanner scanner) {
        System.out.print("Masukkan nama kucing yang ingin dihapus: ");
        String namaKucing = scanner.nextLine();
        
        for (Kucing kucing : daftarKucing) {
            if (kucing.getNama().equalsIgnoreCase(namaKucing)) {
                daftarKucing.remove(kucing);
                System.out.println("Kucing " + namaKucing + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kucing tidak ditemukan.");
    }

    // Method untuk mengubah data kucing
    private static void ubahDataKucing(Scanner scanner) {
        System.out.print("Masukkan nama kucing yang ingin diubah: ");
        String namaKucing = scanner.nextLine();
        
        for (Kucing kucing : daftarKucing) {
            if (kucing.getNama().equalsIgnoreCase(namaKucing)) {
                System.out.print("Masukkan umur baru kucing: ");
                int umurBaru = scanner.nextInt();
                scanner.nextLine(); 
                
                System.out.print("Masukkan ras baru kucing: ");
                String rasBaru = scanner.nextLine();
                
                kucing.setUmur(umurBaru);
                kucing.setRas(rasBaru);
                System.out.println("Data kucing " + namaKucing + " berhasil diubah.");
                return;
            }
        }
        System.out.println("Kucing tidak ditemukan.");
    }

    // Method untuk menampilkan semua kucing
    private static void tampilkanSemuaKucing() {
        System.out.println("\nDaftar Kucing:");
        for (Kucing kucing : daftarKucing) {
            kucing.tampilkanInfo();
        }
    }

    // Method untuk layanan pelayana
    private static void layananPelayanan(Scanner scanner) {
        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        
        System.out.print("Masukkan alamat pelanggan: ");
        String alamatPelanggan = scanner.nextLine();
        
        Pelanggan pelanggan1 = new Pelanggan(namaPelanggan, alamatPelanggan);

        // Input data kucing
        System.out.print("Masukkan nama kucing: ");
        String namaKucing = scanner.nextLine();
        
        System.out.print("Masukkan umur kucing (tahun): ");
        int umurKucing = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline
        
        System.out.print("Masukkan ras kucing: ");
        String rasKucing = scanner.nextLine();
        
        Kucing kucing1 = new Kucing(namaKucing, umurKucing, rasKucing);

        // Membuat objek Transaksi
        Transaksi transaksi1 = new Transaksi(pelanggan1, kucing1);

        // Menampilkan informasi transaksi
        transaksi1.tampilkanTransaksi();

        // Menggunakan kelas PerawatanHewan
        PerawatanHewan perawatan = new PerawatanHewan();

        // list layanan perawatan
        System.out.println("\nPilih layanan perawatan:");
        System.out.println("1. Grooming");
        System.out.println("2. Perawatan Kesehatan");
        System.out.println("3. Pelatihan");
        System.out.println("4. Sesi Pemotretan");
        System.out.println("5. Pembelian Makanan");

        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = scanner.nextInt();

        double totalHarga = 0;

        switch (pilihan) {
            case 1:
                perawatan.grooming();
                totalHarga += perawatan.getHargaGrooming();
                break;
            case 2:
                perawatan.perawatanKesehatan();
                totalHarga += perawatan.getHargaPerawatanKesehatan();
                break;
            case 3:
                perawatan.pelatihan();
                totalHarga += perawatan.getHargaPelatihan();
                break;
            case 4:
                perawatan.sesiPemotretan();
                totalHarga += perawatan.getHargaSesiPemotretan();
                break;
            case 5:
                perawatan.pembelianMakanan();
                totalHarga += perawatan.getHargaMakanan();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        // Menampilkan total harga pelayanan
        if (totalHarga > 0) {
            System.out.println("Total Harga Pelayanan: Rp " + totalHarga);
        }
    }
}

