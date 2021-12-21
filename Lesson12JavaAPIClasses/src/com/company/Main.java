package com.company;

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


    }
}
