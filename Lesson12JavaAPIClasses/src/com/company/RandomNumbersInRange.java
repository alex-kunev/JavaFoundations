package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersInRange {
//      ▪ Create a program that generates a random number in given
//      range (inclusively)
//      ▪ Read the start and the end of the range from the console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randGen = new Random();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(randGen.nextInt(end-start+1)+start);
    }
}
