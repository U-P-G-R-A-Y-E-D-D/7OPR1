package com.company.models;


import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Person {
    private String name;
    private char sex;
    private String birthID;
    private Address address;
    private BirthDate birthDate;

    private static Random rnd = new Random();

    public Person(String name, char sex, Address address, BirthDate birthDate) {
        this.name = name;
        sex = Character.toUpperCase(sex);
        if(!(sex == 'M' || sex == 'F'))
            throw new IllegalArgumentException("Pohlaví musí být 'M' nebo 'F'!");
        this.sex = Character.toUpperCase(sex);
        this.address = new Address(address);
        this.birthDate = new BirthDate(birthDate);
        this.birthID = generateBirthID();
    }

    public Person(Person person){
        this.name = person.getName();
        this.sex = person.getSex();
        this.address = person.getAddress();
        this.birthDate = person.getBirthDate();
        this.birthID = person.getBirthID();
    }

    private String generateBirthID(){
        String year = Integer.toString(birthDate.getYear()).substring(2);
        String month = String.format("%02d", birthDate.getMonth());
        String day = String.format("%02d", birthDate.getDay());
        String rndNum = String.format("%02d", rnd.nextInt(100));
        return completeBirthID(year, month, day, rndNum);
    }

    //varargs
    private String completeBirthID(String... values){
        StringBuilder temp = new StringBuilder();
        for (String s: values) { temp.append(s); }
        long num = 1;
        for (int i = 0; num % 11 != 0; i++){
            num = Long.parseLong((temp.toString() + String.format("%02d", i)));
        }
        return Long.toString(num);
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDay());
        Period difference =  Period.between(birthday, today);

        return difference.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        this.address = new Address(address);
    }

    public BirthDate getBirthDate() {
        return new BirthDate(birthDate);
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = new BirthDate(birthDate);
    }

    public String getBirthID() {
        return birthID;
    }




    @Override
    public String toString() {
        return String.format("\nName:%s\nAge: %s let,\nSex: %s\nBirthdate: %s. %s. %s\nAddress: %s, %s , %s, %s\nBirthId: %s",
                getName(), getAge(), getSex(),
                birthDate.getDay(), birthDate.getMonth(), birthDate.getYear(),
                address.getStreet(), address.getCity(), address.getZIP(),address.getState(),
                getBirthID());
    }
}
