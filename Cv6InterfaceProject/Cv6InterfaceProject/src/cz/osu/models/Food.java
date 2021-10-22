package cz.osu.models;

public class Food extends InventoryItem{
    private int healthRestore;

    public Food(String name, int weight, int healthRestore) {
        super(name, weight);
        this.healthRestore = healthRestore;
    }

    public int getHealthRestore() {
        return healthRestore;
    }

    public void setHealthRestore(int healthRestore) {
        this.healthRestore = healthRestore;
    }

    @Override
    public String toString() {
        return String.format("%s, health restore: %d hp", super.toString(), getHealthRestore());
    }
}
