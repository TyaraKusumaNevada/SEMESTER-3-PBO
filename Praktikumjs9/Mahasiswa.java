package Praktikumjs9;

// subclass Mahasiswa yang meng-override method makan
public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan untuk mengisi tenaga belajar.");
    }
    
    public void tidur() {
        System.out.println("Mahasiswa tidur untuk beristirahat.");
    }
}

