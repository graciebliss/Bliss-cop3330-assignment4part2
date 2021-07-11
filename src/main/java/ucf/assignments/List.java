package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.ArrayList;

public class List {

    //Taken from diagrams
    //create the attributes for a list to hols the title and the tasks and the separate completed tasks and incomplete tasks
    //creates lists to display in the textareas
    //String listTitle;
    //ArrayList<Task> Tasks;
    //ArrayList<Task> CompletedTasks;
    //ArrayList<Task> IncompleteTasks;

    public static void createList(String title){
        //initialize all three arraylists for the tasks, completed tasks, and incomplete tasks as empty arraylists
        //calls the setTitle function with the string that is taken in as a parameter
    }

    public static void setTitle(String title){
        //sets the title of the list to a the string taken in as a parameter
    }


    public static String getTitle(){
        //returns the Title of the list

        //returns null for the purpose of getting rid of errors until code is written
        return null;
    }


    public static ArrayList<Task> getTasks(){
        //returns the arraylist of tasks

        //returns null for the purpose of getting rid of errors until code is written
        return null;
    }

    public static void addTask(Task task){
        //adds a task that is taken in as a parameter to the tasks arraylist
    }
    public static void editTask(Task task){
        //edits the task that is taken in as a parameter in the tasks arraylist
    }
    public static void removeTask(Task task){
        //removes a task that is taken in as a parameter in the tasks arraylist
    }
    public static void markCompleted(Boolean isCompleted){
        //changes the boolean on a task to the boolean that is passed as a parameter
    }
    public static void displayCompletedTasks(){
        //sets the completedtasks arraylist to the tasks that have a true isCompleted boolean
    }
    public static void displayIncompleteTasks(){
        //sets the incompletetasks arraylist to the tasks that have a false isCompleted boolean

    }

    public static void sortByDate(List list){
        //takes the arraylist pf the current list passed as a parameter and loops through the dates finding the earliest and sorting from earliest to latest
    }

    @Override
    public String toString(){
        //overrides the tostring method

        //returns an empty string to get rid of errors
        return "";


    }


}
