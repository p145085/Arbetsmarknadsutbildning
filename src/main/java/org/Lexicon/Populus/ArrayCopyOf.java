package org.Lexicon.Populus;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {
        String[] names = new String[0]; //Empty Array
        names = addNameToArray(names, "Fredrik");//[Fredrik]
            for(int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
    }
    public static String[] addNameToArray(final String[] source, String name) {
        String[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[newArray.length-1] = name; //Adding the name to last index of newArray
        return newArray;
    }
}
