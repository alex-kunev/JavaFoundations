package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        1. Math Functions: The java.lang.Math Class
//        - for basic numeric operations
        double round = Math.round(13.23); // 14.0
        double pi = Math.PI;
        double max = Math.max(3, 90); // 90
        double min = Math.min(2, 31); // 2
        Math.ceil(13.55); // 14.0
        Math.floor(13.55); // 13.0
        Math.abs(-13); // 13
        Math.pow(2, 4); // 16

        // Math.random's pseudorandom generator
        // number in range [0.0, 1.0)
        double rand = Math.random();
        System.out.println("Pseudorandom number: " + rand);

        // java.util.Random class as Pseudo-Random generator
        // needs to be initialized
        Random randGen = new Random();
        System.out.println("Random[5..10]: " + (randGen.nextInt(6) + 5));



//        5. BigInteger and BigDecimal classes - for large numbers
//        Calculating the factorial using created class below:
        System.out.println("Factorial (with BigInt): " + FactorialCalc(1200));;
        //Without BigInteger:
        int num = 1;
        for (int i = 2; i <= 1200; i++) {
            num*=i;
        }
        System.out.println("Factorial (with int): " + num); //Cannot calculate,
        // prints "0"

//        BigInteger/BigDecimal don't use common +,-,*,/ operators
//        Instead, they use:
//         - add(), subtract(), multiply(), divide(), divideAndRemainder()

//        BigDecimal is very important, because decimals are a challange for
//        most computers.If you put more than 8-10 decimal figures, the
//        digits get lost, and system output with "5.0E9" notation
        double a = 50000.00002322;
        double b = 00000.00000008;
        System.out.println("Trying doubles, 8 decimal digits: " + (a+b));
        double c = 5000000000.00002322;
        double d = 0000000000.00000008;
        System.out.println("Trying doubles, 10 decimal di gits: " + (c+d));
        var e = new BigDecimal("5000000000.00002322");
        var f = new BigDecimal("0000000000.00000008");
        System.out.println("Trying BigDecimal, 8 decimal digits: " + (e.add(f)));

//      BigDecimal gives the user complete control over the rounding
//      behavior, e.g. Banker's rounding (Half_even): rounding quantities
//      to integers, in which numbers which are equidistant from the
//      two nearest integers are rounded to the nearest even integer.
//        0.5 -> 0
//        1.5 -> 2
        BigDecimal g = new BigDecimal("1.0");
        BigDecimal h = new BigDecimal("3.0");
        System.out.println("Trying BigDecimal, no rounding: Non-terminating " +
                "decimal expansion error for 1.0 / 3.0");
        System.out.println("Trying BigDecimal, wkih rounding: " + g.divide(h,
         100, RoundingMode.HALF_EVEN));

//        6. Date and Time - The java.time API
//         - follows the ISO-8601 standard (for date and time)
//         - Package includes following classes: LocalDate, LocalTime,
//         LocalDateTime, DateTimeFormatter
//         - immutable class, cannot use Setters to change data

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2021, 12, 22);
        int year = date2.getYear();
        System.out.println("Today's date: " + date1);
        LocalTime time1 = LocalTime.now();
        System.out.println("Today's time: " + time1);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Today's date and time: " + datetime);

//      Parsing and Formatting date/time
        LocalDate date3 = LocalDate.parse("2021-12-22");
        System.out.println("Date parsed: " + date3);
        System.out.println("Date parsed + 10days: " + date3.plusDays(10));
        Locale es = new Locale("es", "ES");
        System.out.println(date3.format(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL).withLocale(es)));
        Locale.setDefault(Locale.FRANCE);
        System.out.println(date3.format(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM)));


    }

    static BigInteger FactorialCalc (int num) {
        BigInteger factorial = new BigInteger("1");

        for (int i = 2 ; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
