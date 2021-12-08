package org.Lexicon.Populus;

public class Onsdag {
    public static void main(String[] args) {
        String[] names = {
                "Johansson",
                "Svensson",
                "Eriksson",
                "Andersson",
                "Klint"
        };

        for(int i = 0; i < names.length; i++){
            if (names[i].endsWith("sson")) {// how to add ignoreCase also?
                System.out.println(i + " ends in \"sson\"");
            }
            }
        }

    }

