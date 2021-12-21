package com.company;

public class SqrtExample {

    public static double calcSqrt(double value) {
        if (value < 0)
            throw new ArithmeticException(
                    "Sqrt for negative numbers is undefined!");
        // IllegalArgumentException is also ok here!
        return Math.sqrt(value);
    }
    public static void main(String[] args) {

//        Without exception, the sqrt function returns "NaN"
//        System.out.println(Math.sqrt(-1));

//        Using try-catch, in order to invoke the thrown exception
        try {
            double result = calcSqrt(-1);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage()
                    + " Cause: " + e.getCause());
//           In getMessage() method, we invoke the message we created in the
//             thrown exception
            e.printStackTrace();
        }
    }

}
