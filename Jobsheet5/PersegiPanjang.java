package Jobsheet5;

public class PersegiPanjang extends BangunDatar {
    private float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float luas() {
        return panjang * lebar;
    }


    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
