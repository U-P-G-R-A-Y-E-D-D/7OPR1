package com.company.models;

import java.time.YearMonth;

public class BirthDate {
    private int day;
    private int month;
    private int year;

    private static YearMonth yearMonth;

    public BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public BirthDate(BirthDate birthDate) {
        this.day = birthDate.getDay();
        this.month = birthDate.getMonth();
        this.year = birthDate.getYear();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        YearMonth ym = YearMonth.of(this.year, this.month);
        int daysInMonth = ym.lengthOfMonth();
        if(!(day >= 1 && day <= daysInMonth)){
            throw new IllegalArgumentException("Den musí být mezi 1 a " + daysInMonth + "!");
        } else {
            this.day = day;
        }


    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(!(month >= 1 && month <= 12)){
            throw new IllegalArgumentException("Měsíc musí být mezi 1 a 12!");
        }else{
            this.month = month;
        }


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(String.valueOf(year).length() != 4){
            throw new IllegalArgumentException("Rok musí mít 4 číslice!");
        }else{
            this.year = year;
        }


    }

    @Override
    public String toString() {
        return "BirthDate{" +
                "day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear()+"}";
    }
}
