package com.abdelmounaim;

/**
 * Main class to demonstrate a simple Java program with improved code quality.
 */
public class Main {

    // Define a constant for the iteration limit
    private static final int ITERATION_LIMIT = 5;

    /**
     * Main entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Greet the user
        printGreeting();

        // Run a simple loop demonstration
        printIterations();
    }

    /**
     * Prints a greeting message to the console.
     */
    private static void printGreeting() {
        System.out.println("Hello, SonarQube!");
    }

    /**
     * Prints iteration numbers up to a predefined limit.
     */
    private static void printIterations() {
        for (int i = 0; i < ITERATION_LIMIT; i++) {
            System.out.printf("Iteration: %d%n", i); // Use printf for better formatting
        }
    }
}
