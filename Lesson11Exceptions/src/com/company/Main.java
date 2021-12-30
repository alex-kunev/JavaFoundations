package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Checked (Compile-time) exceptions - must be obligatory handled (using
//        // try-catch):
        File file = new File ("non-existing-file.txt");
        //FileReader fr = new FileReader(file);
        //this code throws a compile error since the file does not exist

//        They are checked at compile-time. For example, IOException,
//        InterruptedException, etc.
        try {
            throw new IOException("Failed to divide by 0");
        } catch (IOException  e) {
            e.printStackTrace();
        }

//        2. Unchecked (Runtime) exceptions - we don't need to handle them
//        They are not checked at compile-time but at run-time.
//        For example: ArithmeticException, NullPointerException,
//          ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
        try {
            int x = Integer.parseInt("invalid number");
            System.out.println("Parsed number is " + x);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Failed to parse the number");
        }


//        3. Try-finally statement
//          - it ensures execution of a block in all cases, usually for
//          releasing of resources (e.g. closing filereader)

//        Example - potential parsing issue:
        try {
            String str = sc.nextLine();
            Integer.parseInt(str);
            System.out.println("Parsing successful!");
            return;
            //Exits from current method -> executes the "finally"
            // block before exiting
        } catch (NumberFormatException e) {
            System.out.println("Parsing failed!");
        } finally {
            System.out.println("Cleanup code executed here (ALWAYS)");
        }
        System.out.println("Code after the try-finally block");

//        4. Throwing exceptions
//         - used to notify the calling code for an error or unusual situation
//         - when exception is thrown, execution stops
//         - after throw, exception travels over the stack, until a matching
//         catch block is found

        //ex. 1:
/*        public static double calcSqrt(double value) {
            if (value < 0)
                throw new ArithmeticException(
                        "Sqrt for negative numbers is undefined!");
            return Math.sqrt(value);
        }*/

        //ex. 2
  /*      try {
            Integer.parseInt("some string");
        } catch (NumberFormatException ex) {
            System.out.println("Parse failed!");
            throw ex; // Re-throw the caught exception
        }*/


//        5. "Throw" in method declarations
//          - exception invoked in method declaration MUST be handled


    }
//        6. Custom Exceptions
//         - custom exceptions inherit an exception class, typically Exception
    public class FileParseException extends Exception {
        private int lineNum;

        public FileParseException(String msg, int lineNum) {
            super(msg + " (at line " + lineNum + ")");
            this.lineNum = lineNum;
        }

        public int getLineNum() {
            return lineNum;
        }
    }
}
