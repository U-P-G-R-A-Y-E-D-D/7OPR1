package cz.osu;

public class Student extends Person {
    String fieldOfStudy;

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int birthYear, String fieldOfStudy) {
        super(name, birthYear);
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("fieldOfStudy='").append(fieldOfStudy).append('\'');
        sb.append(super.toString());
        return sb.toString();
    }
}
