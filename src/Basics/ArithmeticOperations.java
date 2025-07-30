package Basics;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculations
        double sum = num1 + num2;
        double product = num1 * num2;
        double average = (num1 + num2) / 2;

        // For quotient and remainder, we check if the second number is not zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            double remainder = num1 % num2;

            // Output
            System.out.println("Results:");
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
            System.out.println("Average: " + average);
        } else {
            System.out.println("\nDivision by zero is not allowed.");
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
        }

        scanner.close();
    }
}
