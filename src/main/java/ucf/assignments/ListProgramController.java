package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gracie Bliss
 */


import javafx.event.ActionEvent;

public class ListProgramController {
    public void addListClick(ActionEvent actionEvent) {
        //when add list is clicked add a list to the arraylist of list objects in lists
        //call add list in lists
    }

    public void removeListClick(ActionEvent actionEvent) {
        //when remove is clicked on the list side remove the list from the list of list objects
        //call remove list in lists
    }

    public void addClick(ActionEvent actionEvent) {
        //when add is clicked on the tasks side a new task will be created and added to the current list
        //call addtask
        //information will be taken from the date and description text field
    }

    public void removeClick(ActionEvent actionEvent) {
        //when remove is clicked on the tasks side the task that matches the description will be removed from the current list
        //call remove list
    }

    public void editListClick(ActionEvent actionEvent) {
        //when edit on the list side is clicked the information will be taken from the title text field and the current list will be changed
        //editList will be called
    }

    public void editClick(ActionEvent actionEvent) {
        //when edit on the task side is clicked the information will be taken from the description and the date text fields and the current task will be edited
        //editTask will be called
    }

    public void markCompleteClick(ActionEvent actionEvent) {
        //when mark complete is clicked the current task will be passed to markIsCompleted and the boolean will be passed
        //the look of the task in the list will change
    }

    public void displayAll(ActionEvent actionEvent) {
        //when display all is clicked all tasks will be displayed to the field will be filled with the tasks arraylist
    }

    public void SaveOneClick(ActionEvent actionEvent) {
        //when save one is clicked the current list will be saved to a file
        //saveList will be called
    }

    public void saveAllClick(ActionEvent actionEvent) {
        //when saveall is clicked all lists will be saved to a file
        //saveLists will be called
    }

    public void loadOneClick(ActionEvent actionEvent) {
        //when load is clicked the selected file will be loaded to the lists list
        //loadList will be called
    }

    public void displayComplete(ActionEvent actionEvent) {
        //When display complete is clicked the completedTasks will be updated and the arraylist will be shown on the field
        //displayCompletedTasks will be called
    }

    public void displayIncomplete(ActionEvent actionEvent) {
        //When display incomplete is clicked the incompleteTasks will be updated and the arraylist will be shown in the field
        //displayIncompleteTasks will be called
    }

    public void loadMultipleClick(ActionEvent actionEvent) {
        //when load multiple is clicked the selected files will be loaded to the lists list
        //loadLists will be called
    }

    public void sortByDateClick(ActionEvent actionEvent) {
        //sorts the arraylist of tasks by date
        //calls sort by date
    }
}
