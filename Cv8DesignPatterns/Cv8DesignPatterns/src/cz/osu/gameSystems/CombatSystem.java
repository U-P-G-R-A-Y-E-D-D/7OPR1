package cz.osu.gameSystems;

import cz.osu.model.AppModelSingleton;
import cz.osu.model.CombatResultContainer;
import cz.osu.model.Player;

import java.util.Random;

public class CombatSystem {
    public static CombatResultContainer Fight(Player enemy){
        Player mainPlayer = AppModelSingleton.getInstance().getPlayer();
        CombatResultContainer ret = new CombatResultContainer(mainPlayer.getHealth(), enemy.getHealth(), mainPlayer.isAlive());
        Random rnd = new Random();
        boolean mainPlayerAttackFirst = rnd.nextBoolean();
        while (mainPlayer.isAlive() && enemy.isAlive()){
            if(mainPlayerAttackFirst){
                enemy.decreaseHealth(mainPlayer.getDamage());
                if(enemy.isAlive()){
                    mainPlayer.decreaseHealth(enemy.getDamage());
                }
            }
            else {
                mainPlayer.decreaseHealth(enemy.getDamage());
                if(mainPlayer.isAlive()){
                    enemy.decreaseHealth(mainPlayer.getDamage());
                }
            }
            mainPlayerAttackFirst = rnd.nextBoolean();
        }
        ret.playerAlive = mainPlayer.isAlive();
        ret.playerHealthBalance = mainPlayer.getHealth() - ret.playerHealthBalance;
        ret.enemyHealthBalance = enemy.getHealth() - ret.enemyHealthBalance;
        return ret;
    }
}
