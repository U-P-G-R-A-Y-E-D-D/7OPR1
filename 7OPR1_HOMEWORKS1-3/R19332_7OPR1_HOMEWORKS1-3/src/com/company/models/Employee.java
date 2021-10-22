package com.company.models;

import com.company.interfaces.Payable;

public class Employee extends Person implements Payable {
    private Position position;
    public Crowns salary;

   public Employee(String name, char sex, BirthDate birthDate, Address address, Position position, Crowns salary) {
        super(name, sex, address, birthDate);
        this.position = position;
        this.salary = salary;
    }



    public Position getPosition() {
        return position;
    }

    public Crowns getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return String.format("\nEmployee:\n%s\nPosition: %s\nSalary: %s",
                super.toString(), getPosition(), getSalary());
    }

    @Override
    public Crowns getPayableAmount() {
        return salary;
    }
}

