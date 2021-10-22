package cz.osu.model;

public class CombatResultContainer {
    public int playerHealthBalance;
    public int enemyHealthBalance;
    public boolean playerAlive;

    public CombatResultContainer(int playerHealthBalance, int enemyHealthBalance, boolean playerAlive) {
        this.playerHealthBalance = playerHealthBalance;
        this.enemyHealthBalance = enemyHealthBalance;
        this.playerAlive = playerAlive;
    }
}
