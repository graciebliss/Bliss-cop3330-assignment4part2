package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void addTask() {
        //creates a test list of tasks
        //checks that the tasks gets added to the list

        //behavior 9
    }

    @Test
    void editTask() {
        //creates a test list of tasks
        //checks that the list contains the edited title and the edited date

        //behavior 11 and 12
    }

    @Test
    void removeTask() {
        //creates a test list of tasks
        //checks that the list does not contain the removed task

        //behavior 10
    }

    @Test
    void markCompleted() {
        //creates a test list of tasks
        //checks the the selected tasks have an isCompleted boolean of true

        //behavior 13
    }

    @Test
    void displayCompletedTasks() {
        //creates a test list
        //sets the completedtasks list
        //checks that all tasks isCompleted is true

        //behavior 16
    }

    @Test
    void displayIncompleteTasks() {
        //creates a test list
        //sets the incompletetasks list
        //checks that all tasks isCompleted is false

        //behavior 15
    }

    @Test
    void displayAllTasks() {
        //creates a test list
        //sets the tasks list
        //checks that all tasks are on the list

        //behavior 14
    }

    @Test
    void sortByDate() {
        //creates a test list
        //calls the function
        //compares the dates to the correct ordered
    }
}