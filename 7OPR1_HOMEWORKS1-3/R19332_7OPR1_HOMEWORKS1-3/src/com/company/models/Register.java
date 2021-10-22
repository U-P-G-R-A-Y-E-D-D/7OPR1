package com.company.models;

import com.company.interfaces.Payable;

import java.util.ArrayList;

public class Register {
    private ArrayList<Payable> payables;

    public Register(){
        this.payables = new ArrayList<>();
    }


    public Register(ArrayList<Payable> payables) {
        this.payables = payables;
    }

    public Register(Register register){
        this.payables = register.getPayables();
    }

    public void addToRegister(Payable payable){
        this.payables.add(payable);
    }

    public void listAllItems(){

        payables.forEach((Payable i) -> {
            System.out.println(i + "\n");
        });
    }

    public ArrayList<Payable> getPayables() {
        return payables;
    }

    public void setPayables(ArrayList<Payable> payables) {
        this.payables = payables;
    }
}
