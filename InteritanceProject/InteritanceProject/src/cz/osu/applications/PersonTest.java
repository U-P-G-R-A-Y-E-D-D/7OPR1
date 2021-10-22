package cz.osu.applications;

import cz.osu.models.Employee;
import cz.osu.models.Person;
import cz.osu.models.Student;
import cz.osu.models.Type;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonTest {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person("Ondřej", "Pektor", LocalDate.of(1993,3,20));
        Student s = new Student("Jakub", "Hruška", LocalDate.of(2000, 4, 11), "Informatika", Type.BACHELOR);
        Employee e = new Employee("Radek", "Huštan", LocalDate.of(1994, 4, 12), "Vrátný", 15000);

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);

        System.out.println();

        ArrayList<Person> people = new ArrayList<>();
        people.add(p);
        people.add(s);
        people.add(e);

        for (Person person : people) {
            System.out.println(person);
            System.out.println(person.getClass().getName());

            if (person.getClass().getName().equals(Student.class.getName())) {
                Student tempStudent = (Student)person;
                System.out.println(tempStudent.getFieldOfStudy());
            }
        }
    }
}
