package org.Lexicon.Populus;
import java.util.Scanner;

public class App {
    private static void ifPass() {
        int score = 55;

        if (score >= 65) {
            System.out.println("Hurray, you passed!");
        } else if (score >= 55 && score <= 64) {
            System.out.println("You're are almost there.");
        } else {
            System.out.println("Sorry, you did not pass.");
        }
    }
    private static void scannerPlay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = scanner.nextLine();
        System.out.println(message);
    }
    public static void main(String [] args){
//        System.out.println(Kladd.addition(10,255));
//        int foo = UserInputUtil.getIntFromuser("Enter your int: ");
//        ifPass();
//        scannerPlay();

    }
}
