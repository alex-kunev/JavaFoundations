package Lesson04Methods;

import java.util.Scanner;

public class printTriangle {
    //Create a method for printing triangles as shown below: 
    //1 
    //1 2
    //1 2 3
    //1 2
    //1 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        printAll(length);
        
        

    }

    //Single line print: 
    static void printLine(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Side Triangle print:
    static void printAll(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = length-1; i > 0; i--) {
            for(int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    
}
