package Lesson03Arrays;

import java.util.Scanner;

public class ArraysTheory {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] numbers = new int[] {1,2,3};
        String[] words = new String[numbers.length];

        for (int i = 0; i < words.length; i++) {
            words[i] = String.valueOf(numbers[i]);
        }
   
        //Printing out arrays with for loop and String.join()
        // String[] stringsOne = {"one","two"};
        // System.out.println(String.join(" ", stringsOne));


        String commaSeparatedWords = String.join(",", words);
        System.out.println("Here are the numbers: " + commaSeparatedWords);

        String[] strings = scanner.nextLine().split(" ");  

        for (int i = 0; i < strings.length / 2; i++) {
            int leftI = i;
            int rightI = strings.length - 1 - i;
            String emptyIndex;
            emptyIndex = strings[leftI];
            strings[leftI] = strings[rightI];
            strings[rightI] = emptyIndex;
        }

        //The for-each loop:
        System.out.println(String.join(" ", strings));
        String [] stringsTwo = new String [] {"Hello", "Arrays"};
        for (String item : stringsTwo) {
            System.out.println(item);
        }

        int index = 0;
        for (String item : stringsTwo) {
        System.out.println(index + ". " + item);
        }

        //Print all array elements:
        String[] shelf = {"book", "magazine"};
        for (int i = 0; i < shelf.length; i++){
            System.out.printf("shelf[%d] = %s%n", i, shelf[i]);
        }

    }
}