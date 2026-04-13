/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;
// 4.3 import scanner class

/**
 * How many cans needed to paint a room.
 */
public class Paint {

    /**
     * Main method drives the program. 
     * @author Ario Yeganeh
     * @param args
     */
    public static void main(String[] args) {
        final int COVERAGE = 400;
        double gallons = 1;
        double gps;
        Scanner scan = new Scanner(System.in);
        // 4.4 Declare and initialize a Scanner object.
        System.out.print("Enter the length of room in feet: ");
        int length = scan.nextInt();
        // 4.5 Prompt the user for the length of the room in feet
        System.out.print("Enter the width of room in feet: ");
        int width = scan.nextInt();
        // 4.6 Prompt the user for the width of the room in feet
        System.out.print("Enter the height of room in feet: ");
        int height = scan.nextInt();
        // 4.7 Prompt the user for the height of the room in feet
        System.out.print("Enter the number of coats: ");
        int coats = scan.nextInt();
        // 4.8 Prompt the user for the number of coats to enter.
        int surfaceArea = (2 * (length * height + width * height) + (length * width));
        // 4.9 Calculate the total surface area for painting-Sq. Feet
        int coverageNeeded = surfaceArea * coats;
        // 4.10 Multiple surfaceArea by the number of coats to apply and store the result.
        int  cansOfPaintNeeded = coverageNeeded / COVERAGE;
        // 4.11 the amount each can will cover
        gps = COVERAGE / gallons;
        System.out.println("You will need " +  cansOfPaintNeeded + " cans of paint.");
        // 4.12  Print a message the result of calculation. 
        
        scan.close();

    }

}
