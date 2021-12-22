package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class InterestCalculator {
//    ▪ Create a program to calculate the total amount a person owes
//    after an applied interest rate
//    ▪ Read the total amount first, then the interest rate from the console
//    ▪ Print the result to the console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal initial = new BigDecimal(sc.nextLine());
        BigDecimal interestRate = new BigDecimal(sc.nextLine());

        //Need to multiply "initial" with "(100+interestRate)/100"
        // or initial * (1 + interestRate/100)
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal totalInterest =
                initial.add(initial.multiply(interestRate.divide(hundred)));

        System.out.println(totalInterest);
    }
}
