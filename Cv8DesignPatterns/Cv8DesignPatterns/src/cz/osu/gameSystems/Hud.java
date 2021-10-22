package cz.osu.gameSystems;

import cz.osu.constants.GameConstants;
import cz.osu.model.AppModelSingleton;

public class Hud {
    public static void printHud(){
        int currentHealth = AppModelSingleton.getInstance().getPlayer().getHealth();
        int normHealth = currentHealth / 10;
        StringBuilder healthBar = new StringBuilder();
        for (int i = 0; i < normHealth; i++) {
            healthBar.append(GameConstants.HEALTH_BAR_SYMBOL);
        }
        System.out.println(GameConstants.ANSI_BLACK + "Health: " + GameConstants.ANSI_RED + healthBar + GameConstants.ANSI_BLACK);
    }
}
