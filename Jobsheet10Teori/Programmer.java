package Jobsheet10Teori;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return gaji; // Kembalikan gaji dasar saja
    }

    public int getBonus() {
        return bonus;
    }
}
