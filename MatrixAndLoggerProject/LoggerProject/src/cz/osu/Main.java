package cz.osu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger.getInstance().delete();
        Logger.getInstance().log("Ahoj");
        Logger.getInstance().log("Čau");
        Logger.getInstance().setLogPath("./logs2.txt");
        Logger.getInstance().log("Dobrý večer");
    }
}
