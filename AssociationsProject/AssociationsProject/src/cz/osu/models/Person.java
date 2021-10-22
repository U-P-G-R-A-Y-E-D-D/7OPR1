package cz.osu.models;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private Address address;
    private BankAccount bankAccount;

    public Person(String name, LocalDate birthDate, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.bankAccount = new BankAccount();
    }

    public void deposit(Crowns amount) {
        bankAccount.deposit(amount);
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    public Crowns withdraw(Crowns amount) {
        return bankAccount.withdraw(amount);
    }

    public Crowns withdraw(double amount) {
        return bankAccount.withdraw(amount);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
