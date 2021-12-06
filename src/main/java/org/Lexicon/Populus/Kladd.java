package org.Lexicon.Populus;

public class Kladd {
    public class Car {
        String brand;
        String model;
        String owner;
        int productionYear;
        public void getOwner(){
            System.out.println("Owner: " + owner);
        }
    }

    //private - reachable only from within the same class or nested inner class
    //public - reachable from everywhere in the application
    //default - reachable from within same package
    //protected - Reachable from within same package and from subclasses outside of the package.

    private static void printMessage(String group){
        System.out.println("Hello " + group);
    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }


    public static void main(String [] args){
        //Kladd.Car.getOwner();
        printMessage("G40");
        System.out.println(addition(10,25));
    }
}
