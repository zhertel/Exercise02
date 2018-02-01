package com.hertel.exercise02;

public class Main {

    public static void main(String[] args) {
        int[] highTemps = {45, 29, 10, 22, 41, 28, 33};
        int[] probOfPrecipitation = {95, 60, 25, 5, 0, 75, 90};

        System.out.println("Here are the days likely to snow:");

        for (int i=0; i<highTemps.length; i++) {
            if((highTemps[i] <= 32) && (probOfPrecipitation[i] > 50))
                System.out.println("Day " + (i + 1) + ": high of " + highTemps[i] + " with " + probOfPrecipitation[i]
                                    + "% chance of precipitation.");
        }
    }
}
