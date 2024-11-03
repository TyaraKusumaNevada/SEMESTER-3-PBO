package UTS;

import java.util.Scanner;

public class PesanTiket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Pelanggan
        System.out.println("Masukkan nama pelanggan:");
        String nama = scanner.nextLine();
        System.out.println("Masukkan email pelanggan:");
        String email = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, email);

        // Membuat objek Pemesanan
        Pemesanan pemesanan = new Pemesanan(pelanggan);

        boolean selesai = false;

        do {
            // Menampilkan menu
            System.out.println("\nMenu Pemesanan:");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Hapus Tiket");
            System.out.println("3. Ubah Tiket");
            System.out.println("4. Tampilkan Detail Pemesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahTiket(pemesanan, scanner);
                    break;
                case 2:
                    hapusTiket(pemesanan, scanner);
                    break;
                case 3:
                    ubahTiket(pemesanan, scanner);
                    break;
                case 4:
                    pemesanan.tampilkanDetailPemesanan();
                    break;
                case 5:
                    selesai = true;
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (!selesai);

        scanner.close();
    }

    // Metode untuk menambah tiket
    public static void tambahTiket(Pemesanan pemesanan, Scanner scanner) {
        int jenisTiket;

        do {
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Tiket Reguler");
            System.out.println("2. Tiket VIP");
            System.out.print("Pilihan: ");
            jenisTiket = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (jenisTiket < 1 || jenisTiket > 2) {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (jenisTiket < 1 || jenisTiket > 2);

        System.out.println("Masukkan jenis film:");
        String jenisFilm = scanner.nextLine();
        System.out.println("Masukkan harga tiket:");
        double hargaTiket = scanner.nextDouble();
        scanner.nextLine(); // Konsumsi newline

        if (jenisTiket == 1) {
            System.out.println("Masukkan posisi kursi:");
            String seatPosition = scanner.nextLine();
            TiketReguler tiketReguler = new TiketReguler(jenisFilm, hargaTiket, seatPosition);
            pemesanan.tambahTiket(tiketReguler);
            System.out.println("Tiket Reguler berhasil ditambahkan.");
        } else if (jenisTiket == 2) {
            System.out.println("Masukkan layanan tambahan:");
            String layananTambahan = scanner.nextLine();
            TiketVIP tiketVIP = new TiketVIP(jenisFilm, hargaTiket, layananTambahan);
            pemesanan.tambahTiket(tiketVIP);
            System.out.println("Tiket VIP berhasil ditambahkan.");
        }
    }

    // Metode untuk menghapus tiket
    public static void hapusTiket(Pemesanan pemesanan, Scanner scanner) {
        int index;
        do {
            System.out.println("Masukkan nomor tiket yang ingin dihapus (mulai dari 0):");
            index = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (index < 0 || index >= pemesanan.getTiketList().size()) {
                System.out.println("Nomor tiket tidak valid, coba lagi.");
            }
        } while (index < 0 || index >= pemesanan.getTiketList().size());

        pemesanan.hapusTiket(pemesanan.getTiketList().get(index));
        System.out.println("Tiket berhasil dihapus.");
    }

    // Metode untuk mengubah tiket
    public static void ubahTiket(Pemesanan pemesanan, Scanner scanner) {
        int index;
        do {
            System.out.println("Masukkan nomor tiket yang ingin diubah (mulai dari 0):");
            index = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (index < 0 || index >= pemesanan.getTiketList().size()) {
                System.out.println("Nomor tiket tidak valid, coba lagi.");
            }
        } while (index < 0 || index >= pemesanan.getTiketList().size());

        int jenisTiket;
        do {
            System.out.println("Pilih jenis tiket baru:");
            System.out.println("1. Tiket Reguler");
            System.out.println("2. Tiket VIP");
            System.out.print("Pilihan: ");
            jenisTiket = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (jenisTiket < 1 || jenisTiket > 2) {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (jenisTiket < 1 || jenisTiket > 2);

        System.out.println("Masukkan jenis film baru:");
        String jenisFilm = scanner.nextLine();
        System.out.println("Masukkan harga tiket baru:");
        double hargaTiket = scanner.nextDouble();
        scanner.nextLine(); // Konsumsi newline

        if (jenisTiket == 1) {
            System.out.println("Masukkan posisi kursi baru:");
            String seatPosition = scanner.nextLine();
            TiketReguler tiketRegulerBaru = new TiketReguler(jenisFilm, hargaTiket, seatPosition);
            pemesanan.ubahTiket(index, tiketRegulerBaru);
            System.out.println("Tiket Reguler berhasil diubah.");
        } else if (jenisTiket == 2) {
            System.out.println("Masukkan layanan tambahan baru:");
            String layananTambahan = scanner.nextLine();
            TiketVIP tiketVIPBaru = new TiketVIP(jenisFilm, hargaTiket, layananTambahan);
            pemesanan.ubahTiket(index, tiketVIPBaru);
            System.out.println("Tiket VIP berhasil diubah.");
        }
    }
}
