/**
 * 
 */
package ca.bcit.comp1510.lab02; 

import java.util.Scanner;

/**
 * 
 * @author Ario Yeganeh
 * @version 2021
 */ 

public class Circle {

    /**
     * the circle class: "Drives the program".
     * @param args unused
     */
    public static void main(String[] args) {
        final double PI = 3.14159;
        // 2.2 Declare a constant PI 
        double radius; 
        // 2.3 Declare a variable called radius 
       // 2.3 The value of the local variable radius is not 
       // used
        Scanner myScanner = new Scanner(System.in);
        // 2.5 Declare and initialize scanner
        System.out.println("enter a radius value for the Circle: ");
        // 2.6 a prompt massage for user
        radius = myScanner.nextDouble();
        // 2.7 acquire the user’s input
        double circumference= 2 * PI * radius;
        // 2.8 double is a primitive data type used to represent decimal  numbers with double-precision
        double area= PI * radius * radius; 
        // 2.9 calculate the area
        
        // For Fun
        double doubleRadius= 2 * radius; 
        double doubleArea= PI * doubleRadius * doubleRadius;
        double doubleCircumference= 2 * PI * doubleRadius;
       //2.10 doubled the radius and doubled the circumference
        
        double circumferenceIncreaseFactor = doubleCircumference / circumference;
        double areaIncreaseFactor = doubleArea / area;
        
        System.out.println("Original circumference: " + circumference);
        System.out.println("Original area: " + area);
        System.out.println("Circumference with doubled radius: " + doubleCircumference);
        System.out.println("Area with doubled radius: " + doubleArea);
        System.out.println("Circumference increase factor: " + circumferenceIncreaseFactor);
        System.out.println("Area increase factor: " + areaIncreaseFactor);
        // This is Output results
        // Close the scanner
        myScanner.close();

       
    }

}

// Data type is constant.
// Constant data are upper case.
// No. it doesn't compile. 
// to fix the data should be used by a proper code in next line. 
// 