package cz.osu;

public class VectorTest {

    public static void main(String[] args) {
	// write your code here
        Vector v1 = new Vector(3);
        System.out.println(v1.get(2));
        v1.set(5, 1);
        v1.set(0, 10);

        System.out.println(v1);
    }
}
