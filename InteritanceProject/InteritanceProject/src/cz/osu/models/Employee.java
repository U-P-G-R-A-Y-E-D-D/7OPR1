package cz.osu.models;

import java.time.LocalDate;

public class Employee extends Person {
    private String jobTitle;
    private int salary;

    public Employee(String name, String surname, LocalDate birthDate, String jobTitle, int salary) {
        super(name, surname, birthDate);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return String.format("%s, pozice: %s, příjem v hrubém: %d Kč", super.toString(), jobTitle, salary);
    }
}
