package titanic;

import java.io.IOException;
import java.util.Scanner;

/**
 * File: Titanic.java
 * Author: William Crutchfield
 * Date: March 3, 2016
 * Description: Opens the "Titanic.txt" file and reads all of the data into the program.
 * Then, allows the user to get various statics about the Titanic based on this data.
 */
public class TestTitanic {
    public static void main(String[] args) throws IOException {
        
        // Variables
        String input;
        int i = 0;
        Scanner scannerIn = new Scanner(System.in);
        
        // Commandline Argument Check
        if (args.length == 1) {
            Titanic titanic = new Titanic(args[0]);
            System.out.print(titanic.getHeader());
        
            // Main Loop
            while (i <= 0) {
                System.out.print(titanic.getMenu());
                input = scannerIn.next();
                input = input.toUpperCase();
                System.out.println("");

                // Prints response based on input
                switch (input) {
                    case "1":
                        System.out.println("There were " + titanic.getTotalPassengers() + " Passengers on the Titanic.");
                        break;
                    case "2":
                        System.out.println(titanic.getPerishedPassengers() + "% of the Passengers on the Titanic Perished.");
                        break;
                    case "3":
                        System.out.println(titanic.getSurvivedPassengers() + "% of the Passengers on the Titanic Survived.");
                        break;
                    case "4":
                        System.out.println(titanic.getSurvivedClass1() + "% of the Passengers in 1st class Survived.");
                        System.out.println(titanic.getSurvivedClass2() + "% of the Passengers in 2nd class Survived.");
                        System.out.println(titanic.getSurvivedClass3() + "% of the Passengers in 3rd class Survived.");
                        break;
                    case "5":
                        System.out.println("A list of passengers under the age of 10 that Survived the sinking of the Titanic.");
                        System.out.println(titanic.get10yrSurvived());
                        break;
                    case "6":
                        System.out.print("Enter a letter: ");
                        input = scannerIn.next();
                        char ch = input.charAt(0);
                        System.out.println("Count: " + titanic.getFirstLetterLastName(ch));
                        break;
                    case "7":
                        System.out.println(titanic.getMenSurvived() + "% of the Men on the Titanic Survived.");
                        break;
                    case "8":
                        System.out.println(titanic.getWomenSurvived() + "% of the Women on the Titanic Survived.");
                        break;
                    case "Q":
                        i++;
                        break;
                }
            }
            System.out.print(titanic.getExit());
            System.exit(0);
        }

        // Prints this if no commandline arguments
        Titanic titanic = new Titanic();
        System.out.print(titanic.getHeader());
        System.out.print(titanic.getNoArgs());
        System.exit(0);
    }
}