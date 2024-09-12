package Jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim=1011;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia no 1A";
        mhs1.tampilBiodata();
        
        System.out.println("==============================");

        // Instansiasi objek kedua
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Adam";
        mhs2.alamat = "Jl.ikan tengiri no 3";
        mhs2.tampilBiodata();

        System.out.println("==============================");

        // Instansiasi objek ketiga
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Ali";
        mhs3.alamat = "Jl.ikan piranha no 22";
        mhs3.tampilBiodata();
    }

}
