package org.Lexicon.Populus;

public class Test {
    public static void main(String[] args) {
//        addTask("Something completely different", taskList);
        System.out.println(findTask("Do this", taskList));
        addTask("Flemg", taskList);

        System.out.println("Printing entire task list: ");
        for (int i = 0; i < taskList.length; i++){
            System.out.println(taskList[i]);
        }
    }
    public static String[] taskList = {"Do this", "Do that", "Do something else"};

    public static String[] addTask(String taskToAdd, String[] addToArray){
        String[] newArray = new String[addToArray.length + 1];
        for(int i = 0; i < addToArray.length; i++){
            newArray[i] = addToArray[i];
        }
        newArray[newArray.length - 1] = taskToAdd;
        System.out.println("LOG: Added " + "\"" + taskToAdd + "\"" + " to array.");
        return newArray;
    }

    public static String findTask(String taskToFind, String[] source){
        for(String taskToCheck : source){
            if (taskToCheck.equalsIgnoreCase(taskToFind))
                return taskToCheck;
        }
        return "Could not find any matches.";
    }

    public static void printTasks(String[] tasksToPrint){
        String toPrint = "[ ";

        for (int i=0; i < tasksToPrint.length; i++){
            toPrint = toPrint.concat(tasksToPrint[i] + ", ");
        }
        System.out.println(toPrint + "]");
    }

    public static String arrayToString(String[] taskList){

        String tasks = "[ ";

        for (String task : taskList) {
            tasks = tasks.concat(task + ", ");
        }

        return tasks + "]";

    }

}