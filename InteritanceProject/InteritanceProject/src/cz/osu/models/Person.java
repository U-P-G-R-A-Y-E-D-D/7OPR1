package cz.osu.models;

import java.text.Normalizer;
import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthDate;
    protected String email;

    public Person(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = createEmail();
    }
    //vytváří email ve formátu "name.surname@osu.cz"
    protected String createEmail() {
        String email = name.toLowerCase() + "." + surname.toLowerCase() + "@osu.cz";
        email = Normalizer.normalize(email, Normalizer.Form.NFD);
        email = email.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        return email;
    }

    @Override
    public String toString() {
        return String.format("%s %s, email: %s, datum narození: %s", name, surname, email, birthDate);
    }
}
