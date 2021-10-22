package cz.osu;

public class Bod {
    private int x;
    private int y;

    public Bod(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bod{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public Bod soucet(Bod bod) {
        return new Bod(getX() + bod.getX(), getY() + bod.getY());
    }

    public void posun(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public void print() {
        System.out.println(this);
    }
}
