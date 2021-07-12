package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gracie Bliss
 */


import javafx.event.ActionEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;


public class ListProgramController {

    Lists lists = new Lists();

    ObservableList listLists = FXCollections.observableArrayList();
    ObservableList listTasks = FXCollections.observableArrayList();

    @FXML
    private ListView<String> mainListView;
    @FXML
    private ListView<String> taskListView;

    @FXML
    private TextField newListName;
    @FXML
    private TextField editListName;
    @FXML
    private TextField newTaskName;
    @FXML
    private TextField editTaskName;

    @FXML
    private DatePicker addDatePicker;
    @FXML
    private DatePicker editTaskDatePicker;

    @FXML
    private Button addList;
    @FXML
    private Button addTask;
    @FXML
    private Button editList;
    @FXML
    private Button editTask;
    @FXML
    private Button removeList;
    @FXML
    private Button removeTask;
    @FXML
    private Button markComplete;
    @FXML
    private Button allTasks;
    @FXML
    private Button completeTasks;
    @FXML
    private Button incompleteTasks;
    @FXML
    private Button saveOne;
    @FXML
    private Button loadOne;


    @FXML
    private void updateTasks() {

        //removes everything and clears
        listTasks.removeAll();
        taskListView.getItems().clear();

        String listName = mainListView.getSelectionModel().getSelectedItem();

        //selects the selected list and updates the list
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            if(lists.ProgramLists.get(i).getTitle().equals(listName)) {
                for (int j = 0; j < lists.ProgramLists.get(i).Tasks.size(); j++)
                    listTasks.add(lists.ProgramLists.get(i).Tasks.get(j).toString());
                taskListView.setItems(listTasks);
            }

        markComplete.setDisable(false);
        editTask.setDisable(false);
        removeTask.setDisable(false);
    }



    @FXML
    private void addListClick(Event e) {
        if(newListName.getText().isEmpty())
            return;

        //adds the inputted text to the list
        String title = newListName.getText();
        listLists.add(title);
        mainListView.setItems(listLists);

        List temp = new List(title);
        lists.addAList(temp);
        //sets the input back to blank
        newListName.setText("");

        updateTasks();

    }


    @FXML
    private void removeListClick(Event e) {

        String listName = mainListView.getSelectionModel().getSelectedItem();


        //looks for the right list and removes it and clears the items from that list
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            if(lists.ProgramLists.get(i).getTitle().equals(listName)) {
                lists.ProgramLists.remove(lists.ProgramLists.get(i));
            }

        listLists.remove(listName);
        taskListView.getItems().clear();
        updateTasks();

    }

    @FXML
    private void addClick(Event e) {

        //checks if the data is entered
        if(newTaskName.getText().isEmpty() || editTaskName.getText().length() > 256)
            return;


        addDatePicker.setValue(Optional.ofNullable(addDatePicker.getValue()).orElse(LocalDate.now()));

        String listName = mainListView.getSelectionModel().getSelectedItem();

        //adds a task by getting the date and description creating a temporary task and adding it
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            if(lists.ProgramLists.get(i).getTitle().equals(listName)) {
                Task temp = new Task(newTaskName.getText(), addDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), false);
                lists.ProgramLists.get(i).addTask(temp);
            }
        //resets the textarea and updates the tasks
        updateTasks();
        newTaskName.setText("");
        addDatePicker.setValue(null);

    }

    @FXML
    private void removeClick(Event e) {


        String taskName = taskListView.getSelectionModel().getSelectedItem();

        //goes through all the lists in the main view and finds the correct list then goes through that list finds the correct task and removes it
        for(int i = 0; i < lists.ProgramLists.size(); i++) {
            for(int j = 0; j < lists.ProgramLists.get(i).Tasks.size(); j++) {
                if(lists.ProgramLists.get(i).Tasks.get(j).toString().equals(taskName)) {
                    lists.ProgramLists.get(i).Tasks.remove(lists.ProgramLists.get(i).Tasks.get(j));

                    break;
                }
            }
        }

        listTasks.remove(taskName);
        updateTasks();
    }


    @FXML
    private void editListClick(Event e) {

        //does nothing if the input is empty
        if(editListName.getText().isEmpty())
            return;

        String listName = mainListView.getSelectionModel().getSelectedItem();

        //looks for the list that has the previous title and changes it
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            if(lists.ProgramLists.get(i).getTitle().equals(listName)) {
                lists.ProgramLists.get(i).setTitle(editListName.getText());

                break;
            }

        listLists.clear();
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            listLists.add(lists.ProgramLists.get(i).toString());

        //resets the input
        editListName.setText("");

    }

    @FXML
    private void editClick(Event e) {

        //checks if the task name is empty or too long
        if(editTaskName.getText().isEmpty() || editTaskName.getText().length() > 256)
            return;

        editTaskDatePicker.setValue(Optional.ofNullable(editTaskDatePicker.getValue()).orElse(LocalDate.now()));

        String taskName = taskListView.getSelectionModel().getSelectedItem();

        String date = editTaskDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        List temp = new List("a");

        //looks for the correct list and then the correct task and edits the task
        for(int i = 0; i < lists.ProgramLists.size(); i++) {
            for(int j = 0; j < lists.ProgramLists.get(i).Tasks.size(); j++) {
                if(lists.ProgramLists.get(i).Tasks.get(j).toString().equals(taskName)) {
                    lists.ProgramLists.get(i).Tasks.get(j).setDescription(editTaskName.getText());
                    lists.ProgramLists.get(i).Tasks.get(j).setDate(date);

                    temp = lists.ProgramLists.get(i);

                    break;
                }
            }
        }

        listTasks.clear();
        for(int i = 0; i < temp.Tasks.size(); i++)
            listTasks.add(temp.Tasks.get(i));

        editTaskName.setText("");
        editTaskDatePicker.setValue(null);

        updateTasks();


    }

    @FXML
    private void markCompleteClick(Event e) {

        String taskName = taskListView.getSelectionModel().getSelectedItem();

        List temp = new List("a");


        //goes through each list in ProgramLists and then finds the correct task and calls setIsCompleted to change the boolean
        for(int i = 0; i < lists.ProgramLists.size(); i++) {
            for(int j = 0; j < lists.ProgramLists.get(i).Tasks.size(); j++) {
                if(lists.ProgramLists.get(i).Tasks.get(j).toString().equals(taskName)) {
                    if(lists.ProgramLists.get(i).Tasks.get(j).getIsCompleted() == false)
                        lists.ProgramLists.get(i).Tasks.get(j).setIsCompleted(true);
                    else
                        lists.ProgramLists.get(i).Tasks.get(j).setIsCompleted(false);

                    temp = lists.ProgramLists.get(i);

                    break;
                }
            }
        }
        //clears the tasks and then adds them back to update the listview
        listTasks.clear();
        for(int i = 0; i < temp.Tasks.size(); i++)
            listTasks.add(temp.Tasks.get(i));

        updateTasks();
    }

    @FXML
    private void displayAll(Event e) {
        updateTasks();
    }


    @FXML
    private void SaveOneClick(Event e) {

        //Saves the name and the list
        String listName = mainListView.getSelectionModel().getSelectedItem();
        lists.saveList(listName);

    }

    public void saveAllClick(ActionEvent actionEvent) {
        //when saveall is clicked all lists will be saved to a file
        //saveLists will be called
    }

    @FXML
    private void loadOneClick(Event e) {

        //Save the name of the list selected by the user.
        String listName = mainListView.getSelectionModel().getSelectedItem();
        //Export the list.
        lists.loadList(listName);

    }

    @FXML
    private void displayComplete(Event e) {

        markComplete.setDisable(true);
        editTask.setDisable(true);
        removeTask.setDisable(true);

        String listName = mainListView.getSelectionModel().getSelectedItem();

        //loops through the lists and checks for the correct list then sets the list view to all the completed tasks by checking the IsCompleted boolean
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            if(lists.ProgramLists.get(i).getTitle().equals(listName)) {
                ArrayList<Task> completed = lists.ProgramLists.get(i).displayCompletedTasks();
                listTasks.clear();
                for(int j = 0; j < completed.size(); j++)
                    listTasks.add(completed.get(j));
            }

    }


    @FXML
    private void displayIncomplete(Event e) {

        markComplete.setDisable(true);
        editTask.setDisable(true);
        removeTask.setDisable(true);

        String listName = mainListView.getSelectionModel().getSelectedItem();
        //loops through the lists and finds the right list and then checks the tasks that have a false boolean and adds them to the listview after clearing it
        for(int i = 0; i < lists.ProgramLists.size(); i++)
            if(lists.ProgramLists.get(i).getTitle().equals(listName)) {
                ArrayList<Task> incomplete = lists.ProgramLists.get(i).displayIncompleteTasks();
                listTasks.clear();
                for(int j = 0; j < incomplete.size(); j++)
                    listTasks.add(incomplete.get(j));
            }
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
