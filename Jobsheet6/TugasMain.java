package Jobsheet6;

public class TugasMain {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(3);

        Dosen dosen1 = new Dosen("111", "Putri", "Jl ahmad yani");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("222", "Heru", "jl ikan piranha");
        dosen2.setSKS(9); 

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}

