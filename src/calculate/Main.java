package calculate;

import java.util.Scanner;

/**
 * Write a “main” method into the main class. It has a scanner that takes user input.
 * Also write the logic that it ask user to “Enter first Number:”, “Enter second Number:”
 * “Please enter one of symbol +,-,*, /:” if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective forother symbols
 * With the result it’s also print one more message “Would you like to do more calculation
 * Please enter “Y” or “N” :” (Hint use while loop if user enter Y program asking the user to enter First Number, and if user enterN programme should terminate)
 */

public class Main {

    public static void main(String[] args) {

        calculatorForTwoNumbers();
    }

    public static void calculatorForTwoNumbers() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;
        do {
            // Take user input for the first number
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            // Take user input for the second number
            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            // Take user input for the operation symbol
            System.out.print("Please enter one of the symbols (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            // Calculate and display the result based on the symbol
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            // Ask user if they want to perform another calculation
            System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'Y' || continueCalculation == 'y');

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}



