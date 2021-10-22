package cz.osu.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    @BeforeEach
    void setUp() {
        State state = new State("Česká republika", "cz");
        Address address = new Address("Ostrava", "Prodloužená", 77, state);
        person = new Person("Ondřej Pektor", LocalDate.of(1993, 10, 6), address);
    }

    @Test
    void depositCrowns() {
        Crowns crowns = new Crowns(15000.7);
        person.deposit(crowns);
        assertEquals(crowns.getHallers(), person.getBalance().getHallers());
    }

    @Test
    void depositDouble() {
        double amount = 44009.6;
        person.deposit(amount);
        assertEquals(new Crowns(amount).getHallers(), person.getBalance().getHallers());
    }

    @Test
    void withdrawCrowns() {
        double amount = 7000;
        Crowns crowns = new Crowns(amount);
        person.withdraw(crowns);
        assertEquals((new Crowns(-amount)).getHallers(), person.getBalance().getHallers());
    }

    @Test
    void withdrawDouble() {
        double amount = 689900.4;
        person.withdraw(amount);
        assertEquals((new Crowns(-amount)).getHallers(), person.getBalance().getHallers());
    }
}