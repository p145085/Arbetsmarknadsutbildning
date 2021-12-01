package org.Lexicon.Populus;

import java.util.Scanner;

public class exercisesweek1 {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void one(){
        //1. Write a Java program to print 'Hello' on screen and then print your name on
        //a separate line.
        //Expected result:
        //Hello
        //Ali!
        System.out.println("Hello");
        String name = "Emil" + "!";
        System.out.println(name);
    }
    public static void two() {
        //2. Create a program that takes a year as input from user and print if it’s leap
        //year or not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int userInput = scanner.nextInt();
        int leapYear = 4;

        if (userInput % leapYear >= 1) {
            System.out.println("Your year was not divisible by four.");
        } else {
            System.out.println("Your year is a leapyear!");
        }
    }
    public static void three() {
        //3. Write a Java program to print the sum/multiplication/division and
        //subtraction of two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("1, *, /, +, -, %.");
        System.out.print("Enter input: ");
        //TODO why is it not stopping for an input here?
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
    public static void four() {
        //4. Write a Java program that prints the average of three numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int avg1 = scanner.nextInt();
        int avg2 = scanner.nextInt();
        int avg3 = scanner.nextInt();

        int res = (avg1 + avg2 + avg3) / 3;
        System.out.println("The average of those 3 numbers is: " + res);
    }
    public static void five() {
        //5. Create a program that asks user to input his/her name and store it in a
        //variable instead of having fixed name. Then print ‘Hello username’ where
        //username is what you got from user as input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name2 = scanner.nextLine();
        System.out.println("Hello " + name2);
    }
    public static void seven() {
        //7. Create a program that converts seconds to hours, minutes and seconds
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int entry = scanner.nextInt();
        int seconds = entry % 60;
        int minutes = (entry / 60) % 60;
        int hours = (entry / 60) / 60;
        System.out.println(entry + " - " + hours + ":" + minutes + ":" + seconds);
    }
    public static void eight() {
        //8. Write a program that first generates a random number between 1 and 500
        //and stores it into a variable (see the Random class). Then let the user make a
        //guess for which number it is. If the user types the correct number, he should be
        //presented with a message (including the number of guesses he has made). If he
        //types a number that is greater or smaller than the given number, display either
        //“Your guess was too small” or “Your guess was too big”. The program should
        //keep executing until the user input the correct guess.
        Scanner scanner = new Scanner(System.in);
        int winningNumber = getRandomNumber(0, 500);

        System.out.println("Time for a guessing game.");
        System.out.println("Enter your guess (0-500): ");
        //System.out.println(winningNumber);
        double guess = scanner.nextInt();

        do {
            if (guess > winningNumber) {
                System.out.println("Your guess was greater than the correct number.");
                guess = scanner.nextInt();
                continue;
            } else if (guess < winningNumber) {
                System.out.println("Your guess was lower than the correct number.");
                guess = scanner.nextInt();
                continue;
            }
        } while (guess != winningNumber);
        if (guess == winningNumber) {
            System.out.println("Your guess was correct. Winner!");
        }
    }
    public static void main(String[] args) {
        //6. Create a program that asks user to input two numbers and print the
        //sum/multiplication/division and subtraction of given numbers
        //See #3.

        one();
        two();
        three();
        four();
        five();
        //six();
        seven();
        eight();
    }
}
