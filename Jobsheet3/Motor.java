package Jobsheet3;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0 ;
    }

    public void tambahKecepatan(){
        if(kontakOn == true){
            if(kecepatan + 5 > 100){
                kecepatan = 100;  // Set kecepatan ke 100 jika lebih dari 100
                System.out.println("Kecepatan maksimal sudah tercapai! \n");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
            if (kecepatan < 0) {
                kecepatan = 0;  // Pastikan kecepatan tidak negatif
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}

