package pl.sda.Homework;


import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        var total = new ArrayList<Integer>();

        boolean isNumberZero = true;

        int a;

        int sum = 0;

        System.out.println("Input a value or 0 to exit:");

        do{
            a = number.nextInt();


            sum += a;

            if (a == 0){
                isNumberZero = false;
            }

            total.add(sum);

        } while(isNumberZero);
        System.out.println("The result of adding:");
        System.out.println(sum);
    }
}


