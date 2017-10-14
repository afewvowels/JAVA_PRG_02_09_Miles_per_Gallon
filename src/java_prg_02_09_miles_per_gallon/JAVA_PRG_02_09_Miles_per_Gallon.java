/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_09_miles_per_gallon;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * A car's miles-per-gallon(MPG) can be calculated with the following formula:
 *  
 *  MPG = Miles drive / Gallons of gas used
 * 
 * Write a program that asks the user for the number of miles driven and the
 * gallons of gas used. It should calculate the car's miles-per-gallon and
 * display the results on the screen.
 */
public class JAVA_PRG_02_09_Miles_per_Gallon {

    /**
     * @param args the command line arguments
     * This method asks the user for miles and gallons as inputs and calculates
     * and outputs a miles-per-gallon result.
     */
    public static void main(String[] args) {
        // Declare float variables
        float fltMiles;
        float fltGallons;
        float fltMPG;
        
        // Declare strings for user inputs
        String strMiles;
        String strGallons;
        
        // Create new keyboard
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt user for miles driveable and get user input
        System.out.print("Please enter the number of miles\n" +
                            "your car can travel on a tank of gas: ");
        strMiles = scrKeyboard.nextLine();
        
        // Prompt user for gallons of gas per tank and get user input
        System.out.print("\nPlease enter the number of gallons\n" +
                            "of gas that your car can hold: ");
        strGallons = scrKeyboard.nextLine();
        
        // Convert strings to floats, just because I need practice doing this
        fltMiles = Float.parseFloat(strMiles);
        fltGallons = Float.parseFloat(strGallons);
        
        // Calculate MPG from converted miles and gallons values
        fltMPG = fltMiles / fltGallons;
        
        // Print out to console the user's inputs and calculated MPG value
        System.out.println("\nWith a total range of " + strMiles + " miles" +
                            "\nAnd a gas tank that hold " + strGallons + " gallon(s),\n" +
                            "your MPG ratio is " + fltMPG + " MPG.");
    }
    
}
