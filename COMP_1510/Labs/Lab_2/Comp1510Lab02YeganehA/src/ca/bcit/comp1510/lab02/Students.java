/**
 * 
 */
package ca.bcit.comp1510.lab02;

/**
 * Grade table of 5 students including Lab, Bonus points.
 * @author Ario Yeganeh
 * @version 1.0
 */
public class Students {

    /**
     * Drives the program prints a table of student grades.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\tStudents Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        System.out.println("Name\tLab\tBonus\tTotal");
        System.out.println("----\t---\t-----\t-----");
        System.out.println("Joe\t43\t7\t" + (43+7));
        System.out.println("William\t50\t8\t" + (50+8));
        System.out.println("Marry Sue\t39\t10\t" + (39+10));
        System.out.println("Peng\t87\t6\t" + (87 + 6));
        System.out.println("Kwon\t99\t0\t" + (99 + 0));
        
    }

}
