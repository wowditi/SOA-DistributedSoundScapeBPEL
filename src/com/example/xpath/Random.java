package com.example.xpath;

/**
 * Returns a random number
 */
public class Random {
    public static int random() {
        java.util.Random randomizer = new java.util.Random();
        int number = randomizer.nextInt();
        return Math.abs(number);
    }
}