package Praktikumjs9;

// subclass Dosen yang meng-override method makan
public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan untuk tetap bertenaga mengajar.");
    }
    
    public void lembur() {
        System.out.println("Dosen lembur untuk mempersiapkan materi.");
    }
}

