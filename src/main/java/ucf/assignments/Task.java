package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gracie Bliss
 */

public class Task {

    //taken from the diagram

    //creates the attributed for each task
    String descript;
    String date;
    Boolean isCompleted;

    public Task(String text, String format, boolean b) {
        this.descript = text;
        this.date = format;
        this.isCompleted = b;
    }

    public void createTask(String descript, String date, Boolean isCompleted){
        //initializes the task with the description passed as a parameter the date passed as a parameter anf the boolean passed as a parameter
        //calls setDescription setDate and setIsCompleted
        this.descript = descript;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public void setDescription(String descript){
        //sets the description to the string passed as a parameter
        this.descript=descript;
    }

    public void setDate(String date){
        //sets the date to the string passed as a parameter
        this.date=date;
    }

    public void setIsCompleted(Boolean isCompleted){
        //sets isCompleted to a boolean passed as a parameter
        this.isCompleted=isCompleted;
    }

    public String getDescription(){
        //returns the string that is the description
        return this.descript;
    }

    public String getDate(){
        //returns the string that is the date

        return this.date;
    }

    public Boolean getIsCompleted(){
        //returns the boolean that is if the task is completed

        return this.isCompleted;
    }


    @Override
    public String toString(){
        //overrides the tostring method and returns a string

        String completed;
        if(getIsCompleted() == true)
            completed = "Complete";
        else
            completed = "Incomplete";

        return getDescription() + " " + getDate() + " " + completed;
    }

}
