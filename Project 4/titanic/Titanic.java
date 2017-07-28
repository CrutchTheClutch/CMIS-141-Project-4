package titanic;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

/**
 * File: Titanic.java
 * Author: William Crutchfield
 * Date: March 3, 2016
 * Description: Reads in data from a text file with information about the Titanic. Then, processes that data
 * to gather various statistics about the Titanic.
 */
class Titanic {

    // Variables
    private final long tStart;  // timer start variable, used to calculate elapsed time
    private String[][] array;   // used to store data from txt file
    private int row;            // counter variable for the amount of rows in the txt file

    /**
     * Default Constructor for Titanic
     */
    Titanic() {
        this.tStart = System.currentTimeMillis();
    }

    /**
     * Constructor that takes a fileName as an argument. Designed to be used with the included Titanic.txt file.
     * @param fileName name of the text file to be read in (Titanic.txt)
     * @throws IOException is thrown if file is not found
     */
    Titanic(String fileName) throws IOException {
        this.tStart = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        array = new String[1309][6];
        
        for (row = 0; row < array.length; row++) {
            String thisLine = br.readLine();
            String[] temp = thisLine.split("\t", -1);
            System.arraycopy(temp, 0, array[row], 0, array[row].length);
        }
    }

    /**
     * Calculates the total number of passengers on the Titanic
     * @return number of passengers
     */
    int getTotalPassengers() {
        return array.length;
    }

    /**
     * Calculates the total number of passengers that perished on the Titanic
     * @return number of perished passengers
     */
    double getPerishedPassengers() {
        int alive = 0;
        for (row = 0; row < array.length; row++){
            if(array[row][1].equals("1")){
                alive++;
            }
        }
        int total = array.length;
        int decrease = total - alive;
        double percent1 = ((double)decrease) / total;
        double getPerishedPassengers = percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getPerishedPassengers));
    }

    /**
     * Calculates the total number of passengers that survived on the Titanic
     * @return number of survived passengers
     */
    double getSurvivedPassengers() {
        int dead = 0;
        for (row = 0; row < array.length; row++){
            if(array[row][1].equals("0")){
                dead++;
            }
        }
        int total = array.length;
        int decrease = total - dead;
        double percent1 = ((double)decrease) / total;
        double getSurvivedPassengers = percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedPassengers));
    }

    /**
     * Calculates the total number of passengers that survived on the Titanic that were in Class 1
     * @return number of class 1 survived passengers
     */
    double getSurvivedClass1() {
        int class1Dead = 0;
        int class1Total = 0;        
        for (row = 0; row < array.length; row++){
            if(array[row][0].equals("1")) {
                if(array[row][1].equals("0")){
                    class1Dead++;
                }
            }
            if(array[row][0].equals("1")){
                class1Total++;
            }
        }    
        int class1Decrease = class1Total - class1Dead;
        double class1Percent1 = ((double)class1Decrease) / class1Total;
        double getSurvivedClass1 = class1Percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedClass1));
    }

    /**
     * Calculates the total number of passengers that survived on the Titanic that were in Class 2
     * @return number of class 2 survived passengers
     */
    double getSurvivedClass2() {
        int class2Dead = 0;
        int class2Total = 0;        
        for (row = 0; row < array.length; row++){
            if(array[row][0].equals("2")) {
                if(array[row][1].equals("0")){
                    class2Dead++;
                }
            }
            if(array[row][0].equals("2")){
                class2Total++;
            }
        }    
        int class2Decrease = class2Total - class2Dead;
        double class2Percent1 = ((double)class2Decrease) / class2Total;
        double getSurvivedClass2 = class2Percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedClass2));
    }

    /**
     * Calculates the total number of passengers that survived on the Titanic that were in Class 3
     * @return number of class 3 survived passengers
     */
    double getSurvivedClass3() {
        int class3Dead = 0;
        int class3Total = 0;        
        for (row = 0; row < array.length; row++){
            if(array[row][0].equals("3")) {
                if(array[row][1].equals("0")){
                    class3Dead++;
                }
            }
            if(array[row][0].equals("3")){
                class3Total++;
            }
        }    
        int class3Decrease = class3Total - class3Dead;
        double class3Percent1 = ((double)class3Decrease) / class3Total;
        double getSurvivedClass3 = class3Percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedClass3));
    }

    /**
     * Calculates the total number of men that survived on the Titanic
     * @return number of men survived
     */
    double getMenSurvived() {
        int dead = 0;
        int total = 0;        
        for (row = 0; row < array.length; row++){
            if(array[row][3].equals("male")) {
                if(array[row][1].equals("0")){
                    dead++;
                }
            }
            if(array[row][3].equals("male")){
                total++;
            }
        }    
        int decrease = total - dead;
        double percent1 = ((double)decrease) / total;
        double getMenSurvived = percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getMenSurvived));
    }

    /**
     * Calculates the total number of women that survived on the Titanic
     * @return number of women survived
     */
    double getWomenSurvived() {
        int dead = 0;
        int total = 0;        
        for (row = 0; row < array.length; row++){
            if(array[row][3].equals("female")) {
                if(array[row][1].equals("0")){
                    dead++;
                }
            }
            if(array[row][3].equals("female")){
                total++;
            }
        }    
        int decrease = total - dead;
        double percent1 = ((double)decrease) / total;
        double getWomenSurvived = percent1 * 100;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getWomenSurvived));
    }

    /**
     * Calculates the total number of children under the age of 10 that survived on the Titanic
     * @return number of children under the age of 10 survived
     */
    String get10yrSurvived() {
        StringBuilder name = new StringBuilder();
        for (row = 0; row < array.length; row++) {
            if (array[row].length >= 6 && array[row][4].length() > 0) {
                double pAge = Double.parseDouble(array[row][4]);
                if (array[row][1].equals("1")){
                    if (pAge < 10) {
                    name.append("\n").append(array[row][2]);
                    }
                }
            }
        }
        return name.toString();
    }

    /**
     * Calculates the total number of passengers on the Titanic that has
     * the char entered as the first letter in their last name
     * @param ch first letter in last name
     * @return number of passengers with the char as the first letter in last name
     */
    int getFirstLetterLastName(char ch) {
        int count = 0;
        for (row = 0; row < array.length; row++) {
            char first = array[row][2].charAt(0);
            if (Character.toUpperCase(ch) == Character.toUpperCase(first)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Header String for program, used for formatting purposes
     * @return header string
     */
    String getHeader() {
        return ("********** Welcome to the Titanic Statistical Application **************************");
    }

    /**
     * Menu toString method, is called so the user knows which input will answer which question
     * @return menu string
     */
    String getMenu() {
        return ("\n" +
                "\nEnter the number of the question you want answered. Enter 'Q' to quit the program :" +
                "\n" +
                "\n1.\tHow many passengers were on the Titanic?" +
                "\n2.\tWhat percentage of passengers perished on the Titanic?" +
                "\n3.\tWhat percentage of passengers survived the sinking of the Titanic?" +
                "\n4.\tWhat percentage of passengers survived for each of the three classes?" +
                "\n5.\tWhat specific passengers who were less than 10 years old survived the sinking of the Titanic?" +
                "\n6.\tFor each letter in the alphabet, how many passengers last names started with that letter?" +
                "\n7.\tWhat percentage of Men survived the sinking of the Titanic?" +
                "\n8.\tWhat percentage of Women survived the sinking of the Titanic?" +
                "\nQ.\tQuit the program" +
                "\n" +
                "\nEnter your selection: ");
    }

    /**
     * Is called if the program is run without a commandline argument
     * @return String alerting the user to use a commandline argument
     */
    String getNoArgs() {
        return ("\n" +
                "\n There was an Error!" +
                "\n" +
                "\n You must have use a commandline argument when launching this program.");
    }

    /**
     * Displays the exit message along with the elapsed time
     * @return exit message
     */
    String getExit() {
        return ("Thank you for trying the Titanic Program!" +
                "\nElapsed time in seconds was: " + getElapsedTime());
    }

    /**
     * Tracks the amount of time, in seconds the program is running
     * @return elapsed time in seconds
     */
    private long getElapsedTime() {
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        return tDelta / 1000;
    }
}
