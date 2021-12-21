package com.company;

import java.util.Date;
import java.util.Scanner;

public class NumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputLine = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(inputLine[0]);
        int num2 = Integer.parseInt(inputLine[1]);
        System.out.printf("Range: [%d...%d]\n", num1, num2);


        int num = readNumber(sc, num1, num2);
        System.out.println("Valid number: " + num);


//        Date date  = new Date();
//        System.out.printf("%tT%n", date)

    }

    private static int readNumber(Scanner sc, int num1, int num2) {
        while (true) {
            String numString = sc.nextLine();
            try {
                int num = Integer.parseInt(numString);
                if (num >= num1 && num <= num2)
                    return num;
            } catch (Exception e) {

            }
            System.out.println("Invalid number: " + numString);
        }

    }
}
