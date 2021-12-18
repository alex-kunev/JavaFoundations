package com.company;

import java.util.Scanner;

public class SquareRoot {

    public static double calcRoot(int value) {
        if(value < 0)
            throw new IllegalArgumentException("Sqrt for negative number is " +
                    "undefined");
        return Math.sqrt(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        try {
            int num = Integer.parseInt(sc.nextLine());
            double result = calcRoot(num);
            System.out.printf("%.2f\n", result);
        } catch (Exception e) {
            System.out.println("Invalid ");
        } finally {
            System.out.println("Goodbye");
        }

    }
}
