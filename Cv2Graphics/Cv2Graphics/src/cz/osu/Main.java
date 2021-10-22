package cz.osu;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    Point p = new Point();
	    Point p1 = new Point(50, 50, Color.BLUE);
        System.out.println(p);
        System.out.println(p1);
        Gui gui = new Gui();
        Rectangle r1 = new Rectangle(50, 50, 50, 50, Color.RED);
        Rectangle r2 = new Rectangle(200, 100, 100, 50, Color.BLUE);
        gui.addShape(r1);
        gui.addShape(r2);
        gui.printEnvironment();
        System.out.println(gui.getPixel(0, 0));
        System.out.println(gui.getPixel(55, 55));
    }
}
