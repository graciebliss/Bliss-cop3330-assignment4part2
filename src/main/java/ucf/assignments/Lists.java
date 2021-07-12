package ucf.assignments;


/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lists {
    //taken from the diagram
    //Create an Arraylist of list objects to hold the to do lists
    ArrayList<List> ProgramLists;

   public Lists(){
        //initializes the arraylist of list objects as an empty arraylist
        ProgramLists = new ArrayList<List>();
    }

    public void addAList(List list){
        //adds a list that is taken in as a parameter to the arraylist of list objects
     //adds the list
        ProgramLists.add(list);
    }


    public void removeAList(String list){
        //removes a list that is taken in as a parameter from the arraylist of list objects
     //Loop through to find the list and then remove it if it is found
       for(int i = 0; i < ProgramLists.size(); i++) {
         if (ProgramLists.get(i).toString().equals(list)) {
           ProgramLists.remove(i);
         }
      }

    }


    public void editList(String list, String title){
       //edits the title of a list that is taken in as a parameter
       //Loop through looking for a list and if it is found change the name
       for(int i = 0; i < ProgramLists.size(); i++) {
        if (ProgramLists.get(i).toString().equals(list)) {
         ProgramLists.get(i).setTitle(title);
        }
       }
    }

    public static void loadList(String list){
       //loads a singular list that was previously saved from a file taken as a parameter
    }


    public static void loadLists(File file){
       //loads multiple lists that were previously saved from a file taken as a parameter
    }


    public String saveList(String list){
       //loop through all lists and find the correct name
        for(int i = 0; i < ProgramLists.size(); i++) {
            if (ProgramLists.get(i).toString().equals(list)) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home")+"\\Desktop\\" + ProgramLists.get(i).toString() + ".txt"));
                    bw.write(ProgramLists.get(i).toString() + "\n");
                    for(int j = 0; j < ProgramLists.get(i).Tasks.size(); j++)
                        bw.write(ProgramLists.get(i).Tasks.get(j).toString() + "\n");
                    bw.close();
                    return "Successful";
                } catch (IOException e){

                    return "Failure";
                }

            }
        }

        return "failure";
    }


    public static void saveLists(File file, ArrayList<List> savelist){
     //saves multiple lists that were taken in as a parameter to a file taken in as a parameter
    }
}
