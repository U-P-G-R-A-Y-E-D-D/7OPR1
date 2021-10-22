package cz.osu;

public class Vector {
    private int size;
    private int[] numbers;

    public Vector(int size) {
        this.size = size;
        this.numbers = new int[size];
    }

    public int get(int index) {
        if (!checkVectorBounds(index)) {
            System.out.println("Index mimo rozsah.");
            Logger.getInstance().log("Index je mimo rozsah vektoru");
            return Integer.MIN_VALUE;
        }
        return numbers[index];
    }

    public void set(int index, int value) {
        if (!checkVectorBounds(index)) {
            System.out.println("Index mimo rozsah.");
            Logger.getInstance().log("Index je mimo rozsah vektoru");
        }
        else numbers[index] = value;
    }

    private boolean checkVectorBounds(int index) {
         if (index < 0 || index > size) return false;
         return true;
    }

    @Override
    public String toString() {
        String output = Integer.toString(numbers[0]);
        if (size > 1) {
            for (int i = 1; i < size; i++) {
                output += " " + numbers[i];
            }
        }

        return output;
    }
}
