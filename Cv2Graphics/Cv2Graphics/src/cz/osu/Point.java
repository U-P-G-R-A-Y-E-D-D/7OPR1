package cz.osu;

import java.awt.*;

public class Point implements Shape {
    private int x;
    private int y;
    private Color color;

    public Point(){
        this(0, 0, Color.BLACK);
    }

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void shiftCoordinates(int shiftX, int shiftY){
        setX(getX() + shiftX);
        setY(getY() + shiftY);
    }

    public void draw(Gui gui){
        gui.putPixel(getX(), getY(), getColor());
    }

    public void erase(Gui gui){
        gui.putPixel(getX(), getY(), gui.getBackground());
    }

    @Override
    public String toString() {
        return String.format("Point (%d,%d) - %s", getX(), getY(), getColor().toString());
    }
}
