package com.pluralsight;

public class VariableApp {

    static void main() {
        //        Questions:
        //        1. Declare a variable to store your favorite color
        //        2. Declare a variable to store the year you started this class
        //        3. Declare a variable to store your middle initial
        //        4. Declare a variable to store whether you have pets (yes/no)
        //        5. Declare a variable with a nice message or saying

        //        1. Declare AND initialize variables for:
        //        2. The number of days in a week
        //        3. The price of coffee ($4.99)
        //        4. Your favorite letter
        //        5. Whether it's raining (true/false)
        //        6. Print all values in complete sentences

        // declare variables here
        //Part I
        String favoriteColor;
        int javaClass;
        String middleInitial;
        boolean hasPets;
        String niceMessage;

        // then code solution
        favoriteColor = "blue";
        javaClass = 2026;
        middleInitial = "V";
        hasPets = true;
        niceMessage = "nice";

        //Part II
        int numberDaysOfTheWeek = 7;
        String coffeePrice =  "$4.99";
        char favoriteLetter = 'P';
        boolean isRaining = false;

        // then use System.out.println() to display results
        System.out.println("My favorite color is " + favoriteColor);
        System.out.println("I started " + javaClass + " in this Java class.");
        System.out.println("My middle Initial is " + middleInitial + ".");
        System.out.println("Do I have pets? " + true);
        System.out.println("My nice message: " + niceMessage);
        System.out.println(" ");
        System.out.println("There are " + numberDaysOfTheWeek + " days in a week.");
        System.out.println("The price of the coffee is " + coffeePrice + "!");
        System.out.println("My favorite letter is " + favoriteLetter + "!");
        System.out.println("Is it raining? " + false);
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE


    }
}
