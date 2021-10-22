package cz.osu;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2,2);
        System.out.println(m1);

        m1.setValue(1,1,5);
        System.out.println();
        System.out.println(m1);

        //m1.setValueFromGUI(0,0);
        m1.fillFromGUI();
        System.out.println();

        System.out.println(m1);

        m1.setValue(3,3,5);
    }
}
