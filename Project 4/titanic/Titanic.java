package titanic;

/*
* File: Titanic.java
* Author: William Crutchfield
* Date: March 3, 2016
* Purpose: This program will make the Titanic class and also 
* provide information about the passengers on the Titanic
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class Titanic {
    
//// Variables ////
    
    //Arg Variables
    private String fileName = "";
    
    //Timer Variables
    private final long tStart;
    private long tEnd;
    private long tDelta;
    private long elapsedSeconds;
    
    //Array Variables
    private BufferedReader br;
    private String[][] array;
    private int row;
    private int col;
    private String thisLine;
    private String[] temp;
    //private String arrayPrint;

    
    
//// End of Variables ////


//// Constructors ////
    
    public Titanic() {
        this.tStart = System.currentTimeMillis();
        this.fileName = "";
    }
    public Titanic(String fileName) throws IOException {
        this.tStart = System.currentTimeMillis();
        this.fileName = fileName;
        br = new BufferedReader(new FileReader(fileName));
        array = new String[1309][6];
        
        for (row = 0; row < array.length; row++) {
            thisLine = br.readLine();
            temp = thisLine.split("\t", -1);
            for (col = 0; col < array[row].length; col++) {
                array[row][col] = temp[col];
            }
        }
    }

//// End of Constructors ////


//// Array Methods ////
    
    //getArray Method
    public String[][] getArray() throws IOException {
        for (row = 0; row < array.length; row++){
            for (col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + "  ");
            }
        System.out.println();
        }
        br.close();
        String[][] noReturn = {{"End of Titanic Array"}};
        return noReturn;
    }
    
    //getTotalPassengers Method
    public int getTotalPassengers() {
        int getTotalPassengers = array.length;
        return getTotalPassengers;
    }
    //getPerishedPassengers Method
    public double getPerishedPassengers() {
        int alive = 0;
        for (row = 0; row < array.length; row++){
            if(array[row][1].equals("1")){
                alive++;
            }
        }
        int total = array.length;
        int decrease = total - alive;
        double percent1 = ((double)decrease) / total;
        double percent2  = percent1 * 100;
        double getPerishedPassengers = percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getPerishedPassengers));
    }
    //getSurvivedPassengers Method
    public double getSurvivedPassengers() {
        int dead = 0;
        for (row = 0; row < array.length; row++){
            if(array[row][1].equals("0")){
                dead++;
            }
        }
        int total = array.length;
        int decrease = total - dead;
        double percent1 = ((double)decrease) / total;
        double percent2  = percent1 * 100;
        double getSurvivedPassengers = percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedPassengers));
    }
    
    //// getSurvivedClasses Methods ////
    //getSurvivedClass1 Method
    public double getSurvivedClass1() {
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
        double class1Percent2  = class1Percent1 * 100;
        double getSurvivedClass1 = class1Percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedClass1));
    }
    //getSurvivedClass2 Method
    public double getSurvivedClass2() {
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
        double class2Percent2  = class2Percent1 * 100;
        double getSurvivedClass2 = class2Percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedClass2));
    }
    //getSurvivedClass1 Method
    public double getSurvivedClass3() {
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
        double class3Percent2  = class3Percent1 * 100;
        double getSurvivedClass3 = class3Percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getSurvivedClass3));
    }

    //getMenSurvived Method
    public double getMenSurvived() {
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
        double percent2  = percent1 * 100;
        double getMenSurvived = percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getMenSurvived));
    }
    //getWomenSurvived Method
    public double getWomenSurvived() {
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
        double percent2  = percent1 * 100;
        double getWomenSurvived = percent2;
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(getWomenSurvived));
    }
    
    //get10yrSurvived Method
    public String get10yrSurvived() {
        String name = "";
        for (row = 0; row < array.length; row++) {
            if (array[row].length >= 6 && array[row][4].length() > 0) {
                double pAge = Double.parseDouble(array[row][4]);
                if (array[row][1].equals("1")){
                    if (pAge < 10) {
                    name += "\n" + array[row][2];
                    }
                }
            }
        }
        return name;
    }
    
    //getFirstLetterLastName Method
    public int getFirstLetterLastName(char ch) {
        int count = 0;
        for (row = 0; row < array.length; row++) {
            char first = array[row][2].charAt(0);
            if (Character.toUpperCase(ch) == Character.toUpperCase(first)) {
                count++;
            }
        }
        return count;
    }
    
//// End of Array Methods ////
    
    
//// Graphics User Interface Methods ////
    
    //getHeader Method
    public String getHeader() {
        String getHeader = ("********** Welcome to the Titanic Statistical Application **************************");
        return getHeader;
    }
    //getMenu Method
    public String getMenu() {
        String getMenu = ("\n" +
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
        return getMenu;
    }
    //getExit Method
    public String getExit() {
        String getExit = ("Thank you for trying the Titanic Program!");
        return getExit;
    }
    //getTimer Method
    public String getTimer() {
        String getTimer = ("\n" +
                "\nElapsed time in seconds was: ");
        return getTimer;
    }
    //getNoArgs Method
    public String getNoArgs() {
        String getNoArgs = ("\n" + 
                "\n There was an Error!" + 
                "\n" +
                "\n You must have use a commandline argument when launching this program.");
        return getNoArgs;
    }
    
//// End of Graphics User Interface Methods ////


//// Timer Methods ////

    //getElapsedTime Method
    public long getElapsedTime() {
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000;
        long getElapsedTime = elapsedSeconds;
        return getElapsedTime;
    }
    
//// End of Timer Methods ////


  
}
