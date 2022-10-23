package com.company;

import com.company.number1.Human;
import com.company.number2.RightTriangle;
import com.company.number3.PotentialEnergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //1.     Человек
        Scanner scanner = new Scanner(System.in);
        Human pers1 = new Human();
        System.out.println("Введите имя");
        pers1.setName(scanner.next());
        System.out.println("Введите фамилию");
        pers1.setSurname(scanner.next());
        System.out.println("Введите дату рождения");
        pers1.setBirthYear(scanner.nextInt());
        pers1.infoPrint();
    //2.     Прямоугольный треугольник
        RightTriangle tri1 = new RightTriangle(3,4);
        System.out.println(tri1.calcHypotenuse());
    //3.     Потенциальная энергия
        PotentialEnergy sub1 = new PotentialEnergy();
        System.out.println("Введите массу объекта - ");
        sub1.setMass(scanner.nextInt());
        System.out.println("Введите высоту, на которой находится объект - ");
        sub1.setHeight(scanner.nextInt());
        System.out.println(sub1.potentialEnergy());
    }
}