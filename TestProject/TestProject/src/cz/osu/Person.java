package cz.osu;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthYear=").append(birthYear);
        sb.append('}');
        return sb.toString();
    }

    public void print() {
        System.out.println(this);
    }
}
