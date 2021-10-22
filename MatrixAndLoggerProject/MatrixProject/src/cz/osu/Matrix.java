package cz.osu;

import javax.swing.*;

public class Matrix {
    private int rowCount;
    private int columnCount;
    private Vector[] rows;

    public Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        rows = new Vector[rowCount];
        for (int i = 0; i < rowCount; i++) {
            rows[i] = new Vector(columnCount);
        }
    }

    public Vector getRow(int index) {
        if (index < 0 || index > rowCount) {
            System.out.println("Mimo rozsah řádků matice.");
            Logger.getInstance().log("Mimo rozsah řádků matice");
            return null;
        }

        return rows[index];
    }

    /**
     * Nastavování hodnoty pro daný prvek matice
     * @param row text1
     * @param column text2
     * @param value <b>text3</b>
     */
    public void setValue(int row, int column, int value) {
        Vector temp = getRow(row);
        if (temp == null) {
            System.out.println("Mimo rozsah řádků matice.");
            Logger.getInstance().log("Mimo rozsah řádků matice");
            return;
        }

        temp.set(column, value);
    }

    /**
     * Co ti vadí
     * @param row text
     * @param column text
     */
    public void setValueFromGUI(int row, int column) {
        String result = JOptionPane.showInputDialog("Vlož hodnotu na souřadnice " + (row + 1) + ", " + (column + 1) + " :");
        if (result.equals("")) return;

        int value = 0;
        //if (tryParseInt(result))  value = Integer.parseInt(result);
        if (result.matches("[0-9]+")) value = Integer.parseInt(result);
        else {
            Logger.getInstance().log("Nepodařilo se převést zadanou hodnotu: " + result);
        }

        setValue(row, column, value);
    }

    /**
     *
     * @param value
     * @return zda se jedná o číslo
     */
    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void fillFromGUI() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                setValueFromGUI(i, j);
            }
        }
    }

    @Override
    public String toString() {
        String output = rows[0].toString();
        if (rowCount > 1) {
            for (int i = 1; i < rowCount; i++) {
                output += "\n" + rows[i];
            }
        }

        return output;
    }
}
