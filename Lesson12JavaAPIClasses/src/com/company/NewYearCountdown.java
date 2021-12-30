package com.company;

import java.time.LocalDateTime;

public class NewYearCountdown {
//      ▪ Create a program to calculate the time left until the new year
//      ▪ Use the LocalDateTime class
//      ▪ Make the solution universal, so that it would work regardless
//          the current year
    public static void main(String[] args) {
        //LocalDateTime's time now: 2021-12-22T12:35:31.399214100

        LocalDateTime now = LocalDateTime.now();
        int dayOfYear = now.getDayOfYear();
        int year = now.getYear();
        int timeLeft;

        if (year % 4 == 0) {
            timeLeft = 366 - dayOfYear;
        } else {
            timeLeft = 365 - dayOfYear;
        }

        System.out.println(timeLeft + " days until the end of this year! " +
                "Hooorayyy!");


    }
}
