package Jobsheet2;

public class Karyawan {
    String  id ;
    String nama;
    String jenisKelamin;
    String jabatan;
    double gaji;

    public Karyawan (String id, String nama, String jenisKelamin, String jabatan, double gaji ){
    this.id = id;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.jabatan = jabatan;
    this.gaji= gaji;

    }
    

    public void tampilkanInfo(){
        System.out.println("Nama Karyawan : "+ nama);
        System.out.println("ID Karyawan : "+ id);
        System.out.println("Gender : " +jenisKelamin);

        
       

    }
    public void hitungGaji() {
        System.out.println("Jabatan : " +jabatan);
       System.out.println("Total Gaji: " +gaji);
         
    }
}


