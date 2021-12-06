package org.Lexicon.Populus.done;
import java.util.Scanner;

public class Java_Fundamentals
{
    public static void one() {
        //Create a String with your first name as content. Print out the String object to the console.
        //Create two Strings. One with your first name and the other with your last name. Print out both Strings to the console with a " " separating them.
        //Create two variables with decimal values. Create a third decimal variable called result. Assign the sum of the two first variables to result.
        String name = "Populus";
        name = name.concat(" the Great");

        double dec1 = 1.5;
        double dec2 = 2.2;
        double dec3 = dec1 + dec2;

        System.out.println(name);
        System.out.println(dec3);
    }
    public static void two() {
        //Create a class called Car. The class should contain the following
        //information. Car brand, registration number, max speed, owner name
        //and one more attribute of your choice. Instantiate an Object of the
        //class and assign values to the object.

        class Car {
            String brand;
            String registrationNumber;
            int maxSpeed;
            String owner;
            String fuelType;
        }

        Car shoop = new Car();
        shoop.brand = "Tesla";
        shoop.registrationNumber = "SEX420";
        shoop.maxSpeed = 250;
        shoop.owner = "Populus";
        shoop.fuelType = "Dark Matter";

    }
    public static void three() {
        //Being a developer you need to learn how to search for information on
        //the Internet. Open up a web browser and search for ”java input from
        //user”.
        //• Use your new knowledge to take a String as input from the user and store it in
        //a String object.

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter score:");
    }
    public static void four() {
        //Make an integer called score and assign a value to it.
        //Create an if-statement that should print out ”Hurray, You passed!”
        //if the score is above or equals to 65.
        //If the score is Equal or between 55 and 64 it should print ”You are
        //almost there.”.
        //If score is below 55 it should print ”Sorry, You did not pass.”.
        Scanner userInput = new Scanner(System.in);

        int score = userInput.nextInt();

        if (score >= 65) {
            System.out.println("You passed!");
        } else if (score < 65 && score >= 55) {
            System.out.println("You are almost there.");
        } else if (score < 55) {
            System.out.println("You FAILED.");
        }
    }
    public static void main( String[] args )
    {
//        one();
//        two();
//        three();
//        four();
    }
}
