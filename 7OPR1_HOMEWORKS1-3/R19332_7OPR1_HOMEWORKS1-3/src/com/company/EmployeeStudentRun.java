package com.company;

import com.company.models.*;

public class EmployeeStudentRun {

    public static void main(String[] args) {

        BirthDate date1 = new BirthDate(28,5,1967);
        BirthDate date2 = new BirthDate(28,5,1987);
        BirthDate date3 = new BirthDate(9,3,1998);
        BirthDate date4 = new BirthDate(21,6,1995);


        Address address1 = new Address("Česká republika","Hradec nad Moravicí","Hlavní 5",74741);
        Address address2 = new Address("Česká republika","Ostrava-Třebovice","Třebovická 13",72200);
        Address address3 = new Address("Česká republika","Opava","Olomouc 27",74601);
        Address address4=  new Address("Česká republika","Opava","Olomouc 27",74601);


        Employee employee1 = new Employee(
                        "Pavla Nová",
                        'F', date1, address1, Position.ADMINISTRATION, new Crowns(25000));


        System.out.println(employee1 + "\n");



        Employee employee2 = new Employee("Petr Novotný", 'M', date2,address2, Position.RESEARCH, new Crowns(56500));

        System.out.println(employee2 + "\n");




        Student student1 = new Student("Jan Sonnek", 'M', address3, date3, "Ostravská Univerzita", "Informatika");

        System.out.println(student1 + "\n");


        Student student2 = new Student("Hana Sonnková", 'F', address4, date4, "VŠE", "Mezinárodní vztahy");

        System.out.println(student2);


    }


}
