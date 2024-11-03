package Praktikumjs9;

// Kelas utama untuk menguji dynamic method dispatch
public class Main2 {
    public static void main(String[] args) {
        Manusia manusia;  // Deklarasi referensi superclass
        
        // Dynamic dispatch ke objek Dosen
        manusia = new Dosen();
        manusia.bernafas();
        manusia.makan();  // 
        
        // Dynamic dispatch ke objek Mahasiswa
        manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan();  // 
    }
}

