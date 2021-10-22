package cz.osu.applications;

import cz.osu.models.BankAccount;
import cz.osu.models.BankAccountSingleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program spuštěn");

        System.out.println(BankAccountSingleton.getInstance());
        BankAccountSingleton account = BankAccountSingleton.getInstance();

        account.deposit(70000);
        System.out.println(account);

        BankAccountSingleton.getInstance().withdraw(3000);

        System.out.println(account);
    }
}
