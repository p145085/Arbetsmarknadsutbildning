package org.Lexicon.Populus;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quitSelector = false;

        while(!quitSelector) {
            System.out.println("Options: q, *, /, +, -, %.");
            System.out.print("Enter input: ");
            String menuSelection = scanner.next();

            switch (menuSelection) {
                case "q":
                    System.out.println("You selected quit.");
                    quitSelector = true;
                    break;
                case "+":
                    System.out.println("You selected addition.");
                    System.out.print("Enter the first of two numbers: ");
                    int inputAddition = scanner.nextInt();
                    System.out.print("Enter the second of two numbers: ");
                    int inputAddition2 = scanner.nextInt();
                    int resultAddition = inputAddition + inputAddition2;
                    System.out.println("Your added numbers equal: " + resultAddition);
                    break;
                case "*":
                    System.out.println("You selected multiplication.");
                    System.out.print("Enter the first of two numbers: ");
                    int inputMultiplication = scanner.nextInt();
                    System.out.print("Enter the second of two numbers: ");
                    int inputMultiplication2 = scanner.nextInt();
                    int resultMultiplication = inputMultiplication * inputMultiplication2;
                    System.out.println("Your multiplied numbers equal: " + resultMultiplication);
                    break;
                case "/":
                    System.out.println("You selected division.");
                    System.out.print("Enter the first of two numbers: ");
                    int inputDivision = scanner.nextInt();
                    System.out.print("Enter the second of two numbers: ");
                    int inputDivision2 = scanner.nextInt();
                    int resultDivision = inputDivision / inputDivision2;
                    System.out.println("Your divided numbers equal: " + resultDivision);
                    break;
                case "-":
                    System.out.println("You selected subtraction.");
                    System.out.print("Enter the first of two numbers: ");
                    int inputSubtraction = scanner.nextInt();
                    System.out.print("Enter the second of two numbers: ");
                    int inputSubtraction2 = scanner.nextInt();
                    int resultSubtraction = inputSubtraction - inputSubtraction2;
                    System.out.println("Your subtracted numbers equal: " + resultSubtraction);
                    break;
                case "%":
                    System.out.println("You selected modulus.");
                    System.out.print("Enter the first of two numbers: ");
                    int inputModulus = scanner.nextInt();
                    System.out.print("Enter the second of two numbers: ");
                    int inputModulus2 = scanner.nextInt();
                    int resultModulus = inputModulus % inputModulus2;
                    System.out.println("The remainder of your numbers equal: " + resultModulus);
                    break;
                default:
                    System.out.println("Your selection is not supported.");
            }
        }
    }
}
