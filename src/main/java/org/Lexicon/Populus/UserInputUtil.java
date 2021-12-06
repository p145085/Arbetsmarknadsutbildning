package org.Lexicon.Populus;
import java.text.NumberFormat;
import java.util.Scanner;

public class UserInputUtil {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static int getIntFromuser(String prompt){
        int givenNumber = 0;

        boolean invalidNumber = true;

        while (invalidNumber){
            try {
                System.out.print(prompt);
                String s = SCANNER.nextLine();
                givenNumber = Integer.parseInt(s);
                invalidNumber = false;
            } catch(NumberFormatException ex) {
                System.out.println("Invalid. Try again.");
            }
        }
        return givenNumber;
    }
    public static String getStringFromUser(){
        return SCANNER.nextLine();
    }
}
