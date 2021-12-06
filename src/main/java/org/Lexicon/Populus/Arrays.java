package org.Lexicon.Populus;

public class Arrays {
    private String[] names = {
            "Nisse", "Olle", "Kalle", "Svenne", "Alma", "Ulf"
    };
    public String findName(String nameToFind){
        for(String name : names) {
            if(name.equalsIgnoreCase(nameToFind)) {
                return name;
            }
        }
        return "Error: No match";
    }
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        System.out.println(arrays.findName("Erik"));
        System.out.println(arrays.findName("Ulf"));
        System.out.println(arrays.findName("Populus"));
    }
}
