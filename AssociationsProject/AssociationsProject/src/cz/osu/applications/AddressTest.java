package cz.osu.applications;

import cz.osu.models.Address;
import cz.osu.models.State;

import java.util.Scanner;

public class AddressTest {
    public static void main(String[] args) {
        Address a1 = new Address("Ostrava", "Celní", 668, new State("Česká republika", "cz"));
        Address a2 = new Address(a1);
//
//        System.out.println(a1);
//        System.out.println(a2);
//
//        System.out.println();
//
//        a1.setCity("Opava");
//        a1.getState().setName("Czechia");
//
//        System.out.println(a1);
//        System.out.println(a2);

        if (a1.getCity() == a2.getCity()) System.out.println("Jsou stejné");

        Scanner sc = new Scanner(System.in);
        a2.setCity(sc.nextLine());

        System.out.println();
        System.out.println(a1);
        System.out.println(a2);

        if (a1.getCity() == a2.getCity()) System.out.println("Jsou stejné");
        if (a1.getCity().equals(a2.getCity())) System.out.println("Jsou stejné přes equals");

    }
}
