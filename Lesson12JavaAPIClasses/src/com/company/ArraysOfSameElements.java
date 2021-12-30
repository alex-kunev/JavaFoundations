package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfSameElements {
//      ▪ Create a Java program which checks whether two given arrays
//      consist of the same elements
//      ▪ Arrays will come as two input lines of space-separated integers
//      ▪ Print "Yes" or "No" according the outcome

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        Arrays.sort(line1);
        Arrays.sort(line2);
        System.out.println(Arrays.equals(line1, line2) ? "Yes" : "No" );

    }
}
