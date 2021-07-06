package ucf.assignments;


/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.io.File;
import java.util.ArrayList;

public class Lists {
    //taken from the diagram
    //Create an Arraylist of list objects to hold the to do lists
    //ArrayList<List> Lists;

   public static void createLists(){
        //initializes the arraylist of list objects as an empty arraylist
    }

    public static void addAList(List list){
        //adds a list that is taken in as a parameter to the arraylist of list objects
    }


    public static void removeAList(List list){
        //removes a list that is taken in as a parameter from the arraylist of list objects
    }


    public static void editList(List list){
       //edits the title of a list that is taken in as a parameter
    }

    public static void loadList(File file){
       //loads a singular list that was previously saved from a file taken as a parameter
    }


    public static void loadLists(File file){
       //loads multiple lists that were previously saved from a file taken as a parameter
    }


    public static void saveList(File file, List list){
       //saves a singular list that was taken in as a parameter to a file taken in as a parameter
    }


    public static void saveLists(File file, ArrayList<List> savelist){
     //saves multiple lists that were taken in as a parameter to a file taken in as a parameter
    }
}
