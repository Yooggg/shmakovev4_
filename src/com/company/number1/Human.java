package com.company.number1;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private static int currentYear = 2022;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void infoPrint(){
        System.out.println("Имя - " + this.name +"\tФамилия - " + this.surname + "\t Возраст - " + (currentYear - this.birthYear));
    }
}
