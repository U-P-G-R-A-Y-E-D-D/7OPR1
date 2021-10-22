package cz.osu.models;

import java.util.Random;

public class BankAccountSingleton {
    private int accountNumber;
    private Crowns balance;

    private static BankAccountSingleton instance;

    private BankAccountSingleton() {
        Random rnd = new Random();
        this.accountNumber = rnd.nextInt(Integer.MAX_VALUE);
        this.balance = new Crowns(0);
    }

    public static BankAccountSingleton getInstance(){
        if(instance == null){
            instance = new BankAccountSingleton();
        }
        return instance;
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

    public Crowns getBalance() {
        return new Crowns(balance);
    }

    @Override
    public String toString() {
        return String.format("Číslo účtu: %d, zůstatek: %s", accountNumber, balance);
    }
}
