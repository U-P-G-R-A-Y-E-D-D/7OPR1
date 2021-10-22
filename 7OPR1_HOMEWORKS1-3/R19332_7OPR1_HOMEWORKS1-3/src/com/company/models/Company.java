package com.company.models;

import com.company.interfaces.Payable;

public class Company {
    private String name;
    private Address address;
    private Register register;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
        this.register = new Register();
    }


     public Company(Company company) {
        this.name = company.getName();
        this.address = company.getAddress();
        this.register = company.getRegister();
    }

    public void addToRegister(Payable item){
        this.register.addToRegister(item);
    }


    public void addToRegister(Payable... items){
        for (Payable item: items) {
            this.register.addToRegister(item);
        }
    }

    public void printRegister(){
        this.register.listAllItems();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        this.address = new Address(address);
    }

    public Register getRegister() {
        return new Register(register);
    }

    public void setRegister(Register register) {
        this.register = new Register(register);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + getName() + '\n' +
                ", address=" + getAddress() +'\n' +
                ", register=" + getRegister() +'\n';
    }
}

