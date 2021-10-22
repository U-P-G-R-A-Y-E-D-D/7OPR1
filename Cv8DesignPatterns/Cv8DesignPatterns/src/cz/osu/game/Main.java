package cz.osu.game;

import cz.osu.constants.GameConstants;
import cz.osu.gameSystems.CombatSystem;
import cz.osu.gameSystems.Hud;
import cz.osu.gameSystems.PauseMenu;
import cz.osu.model.AppModelSingleton;
import cz.osu.model.CombatResultContainer;
import cz.osu.model.Player;

public class Main {

    public static void main(String[] args) {
        System.out.println(AppModelSingleton.getInstance().getPlayer());
        //AppModelSingleton.getInstance().getPlayer().decreaseHealth(35);
        Hud.printHud();
        System.out.println("Bla bla");

        Player kikimora = new Player("Kikimora", 100, 30);
        CombatResultContainer combatResult = CombatSystem.Fight(kikimora);
        System.out.println(AppModelSingleton.getInstance().getPlayer().getName() + " is " + (combatResult.playerAlive? "alive":"dead"));
        System.out.println("Player lost " + combatResult.playerHealthBalance + "hp");
        System.out.println("Enemy lost " + combatResult.enemyHealthBalance + "hp");
        PauseMenu.printPauseMenu();
    }
}
