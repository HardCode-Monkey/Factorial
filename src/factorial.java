import java.util.Scanner;

/**
 * This Algorithm will calculate the factorial of a number.
 * @author Deniz Meral
 */
public class factorial {
    /**
     * This is the method which calculate the factorial.
     * @param n Is the given number which we calculate of it.
     * @return Returns the result of n!.
     */
    public int fact(int n) {
        if (n == 1) {
            // base case of the recursion
            return 1;
        }
        // recursive call
        return n * fact(n -1);
    }

    /**
     * This is the main function to call the method.
     * @param args contains the command-line arguments passed to the Java program upon invocation.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        factorial number = new factorial();
        int result;

        System.out.println("Write a number to find out the factorial of it.");
        result = number.fact(scan.nextInt());

        System.out.println("The factorial of your number is: " + result);
    }
}
