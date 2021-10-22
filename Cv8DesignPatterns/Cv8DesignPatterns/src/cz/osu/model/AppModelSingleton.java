package cz.osu.model;

import cz.osu.constants.GameConstants;

public class AppModelSingleton {
    private static AppModelSingleton instance;
    public static AppModelSingleton getInstance(){
        if(instance == null){
            instance = new AppModelSingleton();
        }
        return instance;
    }

    private AppModelSingleton(){
        player = new Player(GameConstants.PLAYER_NAME, GameConstants.PLAYER_MAX_HEALTH, GameConstants.PLAYER_DAMAGE);
        System.out.print(GameConstants.ANSI_BLACK);
    }


    private Player player;

    public Player getPlayer() {
        return player;
    }
}
