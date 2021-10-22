package com.company;
import com.company.interfaces.Payable;
import com.company.models.*;

public class CompanyRun {

    public static void main(String[] args) {
        Company company = new Company("MODEL Obaly a.s.",
                new Address("Česká republika", "Opava", "Nádražní okruh 23 671", 74601)
        );

        BirthDate date1 = new BirthDate(9,3,1998);
        BirthDate date2 = new BirthDate(28,5,1999);

        Address address1 = new Address("Česká republika","Olomouc","Hlavní 5",77900);
        Address address2 = new Address("Česká republika","Opava","Olomoucká",74601);

        Employee employee0 = new Employee("Jan Sonnek", 'M', date1, address1, Position.ADMINISTRATION, new Crowns(35000));
        Employee employee1 = new Employee("Jana Nováková", 'F', date2, address2, Position.PRODUCTION, new Crowns(28000));



        Invoice invoice0 = new Invoice("43006", "Bag-in-Box 5 litrů - RETRO tisk - krabice, střed.", 5, new Crowns(12));
        Invoice invoice1 = new Invoice("93005", "Výplňový papír Speedman Box", 10, new Crowns(1077));

        company.addToRegister(employee0, employee1, invoice0, invoice1);

        for (Payable item: company.getRegister().getPayables()) {
            System.out.println(item);

        }
    }
}
