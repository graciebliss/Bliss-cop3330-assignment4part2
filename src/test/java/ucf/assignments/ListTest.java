package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void addTask() {
        //creates a test list of tasks
        //checks that the tasks gets added to the list

        //behavior 9

        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        assertEquals(1, test.Tasks.size());

    }

    @Test
    void editTask() {
        //creates a test list of tasks
        //checks that the list contains the edited title and the edited date

        //behavior 11 and 12

        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        test.editTask("Test Task || 2021-07-07 || Incomplete", "Test Task 2", "2021-07-08");
        assertEquals("Test Task 2 || 2021-07-08 || Incomplete", test.Tasks.get(0).toString());

    }

    @Test
    void removeTask() {
        //creates a test list of tasks
        //checks that the list does not contain the removed task

        //behavior 10

        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        test.removeTask("Test Task || 2021-07-07 || Incomplete");
        assertEquals(0, test.Tasks.size());
    }

    @Test
    void markCompleted() {
        //creates a test list of tasks
        //checks the the selected tasks have an isCompleted boolean of true

        //behavior 13

        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        assertEquals(true, test.Tasks.get(0).getIsCompleted());
    }

    @Test
    void displayCompletedTasks() {
        //creates a test list
        //sets the completedtasks list
        //checks that all tasks isCompleted is true

        //behavior 16

        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        test.addTask(testTask2);
        ArrayList<Task> completed = test.displayCompletedTasks();
        assertEquals(1, completed.size());
    }

    @Test
    void displayIncompleteTasks() {
        //creates a test list
        //sets the incompletetasks list
        //checks that all tasks isCompleted is false

        //behavior 15


        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        test.addTask(testTask2);
        ArrayList<Task> incomplete = test.displayIncompleteTasks();
        assertEquals(1, incomplete.size());
    }

    @Test
    void displayAllTasks() {
        //creates a test list
        //sets the tasks list
        //checks that all tasks are on the list

        //behavior 14

        List test = new List("Test List");
        Task testTask = new Task("Test Task", "2021-07-07", false);
        test.addTask(testTask);
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        test.addTask(testTask2);
        ArrayList<Task> allTasks = test.displayAllTasks();
        assertEquals(2, allTasks.size());

    }

    @Test
    void sortByDate() {
        //creates a test list
        //calls the function
        //compares the dates to the correct ordered
    }
}