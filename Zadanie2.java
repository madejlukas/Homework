package pl.sda.Homework;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner liczba = new Scanner(System.in);

        System.out.println("Podaj pierszą liczbę:");

        int liczba1 = liczba.nextInt();

        System.out.println("Podaj drugą liczbę:");

        int liczba2 = liczba.nextInt();

        System.out.println("Podaj trzecią liczbę:");

        int liczba3 = liczba.nextInt();

        String text = "Najwyższa liczba to: ";
        String l1 = " liczba pierwsza";
        String l2 = " liczba druga";
        String l3 = " liczba trzecia";

        if(liczba1 == liczba2 && liczba1 == liczba3){
            System.out.println("Wszystkie liczby są takie same i równają się " + liczba1);

        } else if(liczba1 > liczba2 && liczba1 == liczba3) {
            System.out.println(text + liczba1 + " i jest to" + l1+ " i" + l3);

        } else if(liczba1 < liczba2 && liczba2 == liczba3){
            System.out.println(text + liczba2 + " i jest to" + l2 + " i" + l3);

        } else if(liczba1 > liczba2 && liczba1 > liczba3){
            System.out.println(text + liczba1 + " i jest to" + l1);

        } else if(liczba2 > liczba1 && liczba2 > liczba3){
            System.out.println(text + liczba2 + " i jest to" + l2);

        } else if(liczba3 > liczba1){
            System.out.println(text + liczba3 + " i jest to" + l3);

        } else {
            System.out.println(text + liczba1 + "i jest to" + l1 + " i" + l2);
        }

        }

}

