package cz.osu.models;

import java.time.LocalDate;
import java.util.Random;

public class Student extends Person {
    private String id;
    private String fieldOfStudy;
    private Type type;

    public Student(String name, String surname, LocalDate birthDate, String fieldOfStudy, Type type) {
        super(name, surname, birthDate);
        this.fieldOfStudy = fieldOfStudy;
        this.type = type;
        this.id = createId();
        this.email = createEmail();
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    private String createId() {
        Random rnd = new Random();
        String id = type == Type.BACHELOR ? "R" : "P";
        id += "20" + (rnd.nextInt(900) + 100);

        return id;
    }

    @Override
    protected String createEmail() {
        return id + "@student.osu.cz";
    }

    @Override
    public String toString() {
        return String.format("%s, id: %s, obor: %s, typ studia: %s", super.toString(), id, fieldOfStudy, type);
    }
}
