package cz.osu.models;

import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private Crowns balance;

    public BankAccount() {
        Random rnd = new Random();
        this.accountNumber = rnd.nextInt(Integer.MAX_VALUE);
        this.balance = new Crowns(0);
    }

    public void deposit(Crowns amount) {
        balance = balance.plus(amount);
    }

    public void deposit(double amount) {
        deposit(new Crowns(amount));
    }

    public Crowns withdraw(Crowns amount) {
        return balance = balance.minus(amount);
    }

    public Crowns withdraw(double amount) {
        return withdraw(new Crowns(amount));
    }

    @Override
    public String toString() {
        return String.format("Číslo účtu: %d, zůstatek: %s", accountNumber, balance);
    }
}
