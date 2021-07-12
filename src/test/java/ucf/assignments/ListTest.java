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

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Check if there is one task in the list.
        assertEquals(1, test.Tasks.size());

    }

    @Test
    void editTask() {
        //creates a test list of tasks
        //checks that the list contains the edited title and the edited date

        //behavior 11 and 12

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Edit the task.
        test.editTask("Test Task || 2021-07-07 || Incomplete", "Test Task 2", "2021-07-08");
        //Make sure that task is in the array with the new information.
        assertEquals("Test Task 2 || 2021-07-08 || Incomplete", test.Tasks.get(0).toString());

    }

    @Test
    void removeTask() {
        //creates a test list of tasks
        //checks that the list does not contain the removed task

        //behavior 10

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Remove the task we just added.
        test.removeTask("Test Task || 2021-07-07 || Incomplete");
        //Check if the array is empty.
        assertEquals(0, test.Tasks.size());
    }

    @Test
    void markCompleted() {
        //creates a test list of tasks
        //checks the the selected tasks have an isCompleted boolean of true

        //behavior 13

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        //Check is its true
        assertEquals(true, test.Tasks.get(0).getIsCompleted());
    }

    @Test
    void displayCompletedTasks() {
        //creates a test list
        //sets the completedtasks list
        //checks that all tasks isCompleted is true

        //behavior 16

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        //Create another task.
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        //Add that task.
        test.addTask(testTask2);
        //Run showCompleteTasks and save the arrayList it returns
        ArrayList<Task> completed = test.displayCompletedTasks();
        //Check if there is one task in that list.
        assertEquals(1, completed.size());
    }

    @Test
    void displayIncompleteTasks() {
        //creates a test list
        //sets the incompletetasks list
        //checks that all tasks isCompleted is false

        //behavior 15


        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        //Create another task.
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        //Add that task.
        test.addTask(testTask2);
        //Run showCompleteTasks and save the arrayList it returns
        ArrayList<Task> incomplete = test.displayIncompleteTasks();
        //Check if there is one task in that list.
        assertEquals(1, incomplete.size());
    }

    @Test
    void displayAllTasks() {
        //creates a test list
        //sets the tasks list
        //checks that all tasks are on the list

        //behavior 14

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markCompleted(true, "Test Task 2021-07-07 Incomplete");
        //Create another task.
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        //Add that task.
        test.addTask(testTask2);
        //Run showCompleteTasks and save the arrayList it returns.
        ArrayList<Task> allTasks = test.displayAllTasks();
        //Check if there is two tasks in the list.
        assertEquals(2, allTasks.size());

    }

    @Test
    void sortByDate() {
        //creates a test list
        //calls the function
        //compares the dates to the correct ordered
    }
}