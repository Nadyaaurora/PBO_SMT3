public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 9; // Berdasarkan contoh output gambar 6, kekuatan berkurang konstan
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}