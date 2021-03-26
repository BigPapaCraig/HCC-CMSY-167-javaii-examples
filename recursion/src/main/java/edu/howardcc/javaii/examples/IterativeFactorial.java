package edu.howardcc.javaii.examples;

/**
 * Demonstrate an iterative factorial function
 */
public class IterativeFactorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Iterative %d! = %d", n, factorial(n));
    }

    private static int factorial(int n) {
        int total = 1;
        for (int i = 2; i < n; i ++) {
            total *= i;
        }
        return total;
    }

}
