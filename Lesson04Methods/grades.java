package Lesson04Methods;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade: ");
        printGrade(Double.parseDouble(sc.nextLine()));
    }

    private static void printGrade(double num) {
        String grade;

        if (num >= 2.00 && num < 3.00 ) {
            grade = "Fail";
        }
        else if (num >= 3.00 && num < 3.50) {
            grade = "Poor";
        }
        else if (num >= 3.50 && num < 4.50) {
            grade = "Good";
        }
        else if (num >= 4.50 && num < 5.50) {
            grade = "Very good";
        }
        else if (num >= 5.50 && num < 6.00) {
            grade = "Excellent";
        } else {
            grade = "Not a valid number between 2.00 and 6.00";
        }
        System.out.println(grade);;
    }
}
