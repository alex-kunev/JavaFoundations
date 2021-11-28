package arrays;

import java.util.Scanner;

//▪Read an array of integers
//▪Sum all even and odd numbers
//▪Find the difference

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String values = sc.nextLine();
        String[] items = values.split(" ");
        int[] arr = new int[items.length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
        }

        for (int item : arr) {
            System.out.println(item);
        }

        int sumEvens = 0; 
        int sumOdds = 0;

        for (int item : arr) {
            if(item % 2 == 0) {
                sumEvens += item;
            } else {
                sumOdds += item;
            }
        }

        //difference of (even nums) - (odd nums):
        System.out.println(sumEvens - sumOdds);
        
    }
    
}