package titanic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
* File: Titanic.java
* Author: William Crutchfield
* Date: March 3, 2016
* Purpose: This program will test the Titanic class
*/

public class TestTitanic {
    public static void main(String[] args) throws IOException {
        
        //Variables
        String input;
        int i = 0;
        Scanner scannerIn = new Scanner(System.in);
        
        //Commandline Argument Check
        if (args.length == 1) {
            Titanic titanic = new Titanic(args[0]);
            System.out.print(titanic.getHeader());
        
            //Main Loop
            while (i <= 0) {
                System.out.print(titanic.getMenu());
                input = scannerIn.next();
                input = input.toUpperCase();
                System.out.println("");
                
        
                if (input.equals("1")) {
                    System.out.print("There were " + titanic.getTotalPassengers() + " Passengers on the Titanic.");
                    System.out.println("");
                    System.out.println("");
                }
                else if (input.equals("2")) {
                    System.out.print(titanic.getPerishedPassengers() + "% of the Passengers on the Titanic Perished.");
                    System.out.println("");
                    System.out.println("");
                }
                else if (input.equals("3")) {
                    System.out.print(titanic.getSurvivedPassengers() + "% of the Passengers on the Titanic Survived.");
                    System.out.println("");
                    System.out.println("");
                }
                else if (input.equals("4")) {
                    System.out.print(titanic.getSurvivedClass1() + "% of the Passengers in 1st class Survived.");
                    System.out.print("\n" + titanic.getSurvivedClass2() + "% of the Passengers in 2nd class Survived.");
                    System.out.print("\n" + titanic.getSurvivedClass3() + "% of the Passengers in 3rd class Survived.");
                    System.out.println("");
                    System.out.println("");
                }
                else if (input.equals("5")) {
                    System.out.println("A list of passengers under the age of 10 that Survived the sinking of the Titanic.");
                    System.out.print(titanic.get10yrSurvived());
                    System.out.println("");
                    System.out.println("");
                }
                else if (input.equals("6")) {
                    System.out.print("Enter a letter: ");
                    input = scannerIn.next();
                    char ch = input.charAt(0);
                    System.out.println("Count: " + titanic.getFirstLetterLastName(ch));
                    System.out.println("");
                }
                else if (input.equals("7")) {
                    System.out.print(titanic.getMenSurvived() + "% of the Men on the Titanic Survived.");
                    System.out.println("");
                    System.out.println("");                    
                }
                else if (input.equals("8")) {
                    System.out.print(titanic.getWomenSurvived() + "% of the Women on the Titanic Survived.");
                    System.out.println("");
                    System.out.println("");
                }
                else if (input.equals("Q")) {
                    i++;
                }
            }
            System.out.print(titanic.getExit());
            System.out.print(titanic.getTimer());
            System.out.println(titanic.getElapsedTime());
            System.exit(0);
        }
        else {
            Titanic titanic = new Titanic();
            System.out.print(titanic.getHeader());
            System.out.print(titanic.getNoArgs());
            System.exit(0);
        }
    }
}
//System.out.print(Arrays.deepToString(titanic.getArray()));