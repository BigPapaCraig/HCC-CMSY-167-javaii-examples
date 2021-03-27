package edu.howardcc.javaii.examples;

/**
 * Demonstrate recursion using a factorial function
 */
public class RecursiveFactorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Recursive %d! = %d", n, factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0) {
            // Base case
            return 1;
        }
        else {
            // Recursive call
            return n * factorial(n - 1);
        }
    }

}
