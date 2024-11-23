package Tugasjs12;

public class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        strength -= strength * 0.1; 
    }

    public String getBarrierInfo() {
        return "Barrier - Strength: " + strength;
    }
}

