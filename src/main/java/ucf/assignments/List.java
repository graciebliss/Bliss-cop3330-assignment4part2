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
    String listTitle;
    ArrayList<Task> Tasks;
    ArrayList<Task> IncompleteTasks;
    ArrayList<Task> CompletedTasks;


    public List(String title) {
        this.listTitle = title;
        Tasks = new ArrayList<Task>();
    }

    public void createList(String title){
        //initialize all three arraylists for the tasks, completed tasks, and incomplete tasks as empty arraylists
        //calls the setTitle function with the string that is taken in as a parameter
        this.listTitle = title;
        Tasks = new ArrayList<Task>();
    }

    public void setTitle(String title){
        //sets the title of the list to a the string taken in as a parameter
        this.listTitle=title;
    }


    public String getTitle(){
        //returns the Title of the list

        //returns null for the purpose of getting rid of errors until code is written
        return listTitle;
    }


    public ArrayList<Task> getTasks(){
        //returns the arraylist of tasks

        //returns null for the purpose of getting rid of errors until code is written
        return Tasks;
    }

    public void addTask(Task task){
        //adds a task that is taken in as a parameter to the tasks arraylist
        Tasks.add(task);
    }
    public void editTask(String task, String title, String date){
        //edits the task that is taken in as a parameter in the tasks arraylist
        //loops and looks for the task and then changes the attributes
        for(int i = 0; i < Tasks.size(); i++)
            if(Tasks.get(i).toString().equals(task)) {
                Tasks.get(i).setDescription(listTitle);
                Tasks.get(i).setDate(date);
            }
    }
    public void removeTask(String task){
        //removes a task that is taken in as a parameter in the tasks arraylist
        //loops through and finds the task then removes it
        for(int i = 0; i < Tasks.size(); i++)
            if(Tasks.get(i).toString().equals(task))
                Tasks.remove(i);
    }
    public void markCompleted(Boolean isCompleted, String task){
        //changes the boolean on a task to the boolean that is passed as a parameter
        for(int i = 0; i < Tasks.size(); i++)
            if(Tasks.get(i).toString().equals(task))
                Tasks.get(i).setIsCompleted(true);

    }
    public ArrayList<Task> displayCompletedTasks(){
        //sets the completedtasks arraylist to the tasks that have a true isCompleted boolean

        for(int i = 0; i < Tasks.size(); i++)
            if(Tasks.get(i).getIsCompleted() == true)
                CompletedTasks.add(Tasks.get(i));

        return CompletedTasks;
    }
    public ArrayList<Task> displayIncompleteTasks(){
        //sets the incompletetasks arraylist to the tasks that have a false isCompleted boolean

        for(int i = 0; i < Tasks.size(); i++)
            if(Tasks.get(i).getIsCompleted() == false)
                IncompleteTasks.add(Tasks.get(i));

        return IncompleteTasks;
    }

    public ArrayList<Task> displayAllTasks(){
        return getTasks();
    }

    @Override
    public String toString(){
        //overrides the tostring method

        return getTitle();
    }


}
