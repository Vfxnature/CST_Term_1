/**
 * 
 */
package ca.bcit.comp1510.lab01;

/**
 *
 *Demonstrates the different behaviours of the + operator.
 *
 *@author BCIT
 *@version 2021
 */
public class Plus {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
            System.out.println("This is a long string that is the" +
            " concatenation of two shorter strings.");
            System.out.println("The first computer was invented about " + 70 +
            " years ago");
            System.out.println ("8 plus 5 is " + 8 + 5);
            System.out.println ("8 plus 5 is " + (8 + 5)) ;
            System.out.println (8 + 5 + " equals 8 plus 5.");
    }

}
//a) In the first line we have "8 plus 5" and also "+ 8 + 5" are meant as concatenation.
//b) In the second line we have "8 plus 5" is meant as a concatenation but "+ (8 + 5)" is addition.
//c) In the third line 8 + 5 is addition and + " equals 8 plus 5 is concatenation.