package UTS;

public class PerawatanHewan {
    private  double hargaGrooming = 50000; 
    private  double hargaPerawatanKesehatan = 100000; 
    private  double hargaPelatihan = 75000;
    private  double hargaSesiPemotretan = 150000; 
    private  double hargaMakanan = 25000; 

    public void grooming() {
        System.out.println("Melakukan grooming: mandi, potong rambut, dan perawatan kuku.");
    }

    public double getHargaGrooming() {
        return hargaGrooming;
    }

    public void perawatanKesehatan() {
        System.out.println("Melakukan perawatan kesehatan: vaksinasi, pemeriksaan kesehatan, dan pemberian obat.");
    }

    public double getHargaPerawatanKesehatan() {
        return hargaPerawatanKesehatan;
    }

    public void pelatihan() {
        System.out.println("Menawarkan sesi pelatihan untuk hewan peliharaan.");
    }

    public double getHargaPelatihan() {
        return hargaPelatihan;
    }

    public void sesiPemotretan() {
        System.out.println("Menawarkan sesi pemotretan profesional untuk hewan peliharaan.");
    }

    public double getHargaSesiPemotretan() {
        return hargaSesiPemotretan;
    }

    public void pembelianMakanan() {
        System.out.println("Membeli makanan hewan.");
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }
}


