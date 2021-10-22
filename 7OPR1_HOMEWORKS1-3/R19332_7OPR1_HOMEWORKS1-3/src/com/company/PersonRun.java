package com.company;

import com.company.models.Address;
import com.company.models.BirthDate;
import com.company.models.Person;

public class PersonRun {
    public static void main(String[] args) {


        BirthDate date1 = new BirthDate(14,6,1926);
        BirthDate date2 = new BirthDate(9,3,1998);
        BirthDate date3 = new BirthDate(28,5,1999);

        Address address1 = new Address("Česká republika","Olomouc","Hlavní 5",77900);
        Address address2 = new Address("Česká republika","Opava","Olomoucká 27",74601);
        Address address3 = new Address("Česká republika","Ostrava","30 dubna 5",70200);

        Person person1 = new Person("Michal Novotný",'M', address1, date1);
        Person person2 = new Person("Jan Sonnek",'M', address2, date2);
        Person person3 = new Person("Hana Nováková",'F', address3, date3);


        System.out.println(person1 + "\n");
        System.out.println(person2 + "\n");
        System.out.println(person3);

    }

}
