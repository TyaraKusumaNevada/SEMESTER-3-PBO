package Tugasjs12;

public class JumpingZombie implements Zombie {
    private int health;
    private int level;

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.3; // Level 1: tambah 30%
            case 2 -> health += health * 0.4; // Level 2: tambah 40%
            case 3 -> health += health * 0.5; // Level 3: tambah 50%
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.01; // Kurangi 1% dari health
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie - Health: " + health + ", Level: " + level;
    }
}

