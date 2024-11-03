package Jobsheet9_overidding;

public class TestKepegawaian {
    public static void main(String[] args) {
        // Membuat objek dari kelas Manager, Supervisor, dan SalesManager
        Manager man = new Manager("Bill Gates", 5000000);
        Supervisor spv = new Supervisor("Susanto", 1000000);
        SalesManager slman = new SalesManager("Jessica", "IT", 2000000);

        // Menaikkan gaji untuk masing-masing objek
        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();

        // Mencetak status untuk masing-masing objek
        man.cetakStatus();
        System.out.println(); // pemisah antar output
        spv.cetakStatus();
        System.out.println();
        slman.cetakStatus(); // ini akan memanggil metode cetakStatus yang di-override di SalesManager
    }
}

