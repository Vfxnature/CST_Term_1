/**
 * 
 */
package ca.bcit.comp1510.lab01;

/**
 *  Prints a Hello World message.
 *  
 *  @author BCIT
 *  @version 2022
 */
public class Hello {

    /**
     * Prints the greeting.
     * 
     * @param args
     *      unused
     */
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

}

//a) the public type Helo must be defined in its own file.
//b) because changing the string literal are arbitrary and could be just a misspelling dictation fault. in fact it is not compiler fault.Running the program it shows "Helo world!" in the result.
//c) String literal is not properly closed by a double-quote.
//d) four errors happened. syntax error, syntax error token, ...
//e) Syntax error, insert "," to complete BlockStatements.