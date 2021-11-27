package org.Lexicon.Populus;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        //Print greeting to user with option to end
        //program or do a calculation
        //• Ask user for input
        //• Get input from user
        //• Make selection based on input
        //• Ask user for a number
        //• Get a number as userinput
        //• Ask user for an operator
        //• Get operator as userinput
        //• Validate user input
        //• Ask user for a number
        //• Get a number as userinput
        //• Make selection based on operator
        //• Calculate and store the result in a variable
        //• Show the result of the calculation
        //Practice:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String menuSelection = scanner.nextLine();

        switch (menuSelection) {
            case "1":
                System.out.println("You selected \"1\".");
                break;
            case "*":
                System.out.println("You selected multiplication.");
                System.out.print("Enter the first of two numbers: ");
                int inputMultiplication = scanner.nextInt();
                System.out.print("Enter the second of two numbers: ");
                int inputMultiplication2 = scanner.nextInt();
                int resultMultiplication = inputMultiplication * inputMultiplication2;
                System.out.print("Your multiplied numbers equal: " + resultMultiplication);
                break;
            case "/":
                System.out.println("You selected division.");
                System.out.print("Enter the first of two numbers: ");
                int inputDivision = scanner.nextInt();
                System.out.print("Enter the second of two numbers: ");
                int inputDivision2 = scanner.nextInt();
                int resultDivision = inputDivision / inputDivision2;
                System.out.print("Your divided numbers equal: " + resultDivision);
                break;
            case "+":
                System.out.println("You selected addition.");
                System.out.print("Enter the first of two numbers: ");
                int inputAddition = scanner.nextInt();
                System.out.print("Enter the second of two numbers: ");
                int inputAddition2 = scanner.nextInt();
                int resultAddition = inputAddition + inputAddition2;
                System.out.print("Your added numbers equal: " + resultAddition);
                break;
            case "-":
                System.out.println("You selected subtraction.");
                System.out.print("Enter the first of two numbers: ");
                int inputSubtraction = scanner.nextInt();
                System.out.print("Enter the second of two numbers: ");
                int inputSubtraction2 = scanner.nextInt();
                int resultSubtraction = inputSubtraction - inputSubtraction2;
                System.out.print("Your subtracted numbers equal: " + resultSubtraction);
                break;
            case "%":
                System.out.println("You selected modulus.");
                System.out.print("Enter the first of two numbers: ");
                int inputModulus = scanner.nextInt();
                System.out.print("Enter the second of two numbers: ");
                int inputModulus2 = scanner.nextInt();
                int resultModulus = inputModulus % inputModulus2;
                System.out.print("The remainder of your numbers equal: " + resultModulus);
                break;
            default:
                System.out.println("Your selection is not supported.");
        }
    }
}