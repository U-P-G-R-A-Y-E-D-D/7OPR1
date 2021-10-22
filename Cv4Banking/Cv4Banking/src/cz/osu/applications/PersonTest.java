package cz.osu.applications;

import cz.osu.models.Address;
import cz.osu.models.BankAccount;
import cz.osu.models.Person;
import cz.osu.models.State;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//
//        System.out.println(bankAccount);
        State s1 = new State("Česká republika", "cz");
        Address a1 = new Address("Ostrava", "Celní", 668, s1);
        Person p1 = new Person("Ondřej Pektor", LocalDate.of(1992, 5, 12), a1);
        Person p2 = new Person("Martin Prášek", LocalDate.of(1992, 4, 21), a1);
        System.out.println(p1);

        p1.deposit(500);
        System.out.println(p1);
        p1.withdraw(300);
        System.out.println(p1);

    }
}
