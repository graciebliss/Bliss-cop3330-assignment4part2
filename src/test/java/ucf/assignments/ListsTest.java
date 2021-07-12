package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListsTest {

    @Test
    void addAList() {
        //creates a test list
        //calls the constructor
        //checks the list before and after
        //checks that a list gets created and added
        //Behavior #6

        //Create an AllLists class.
        Lists test  = new Lists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addAList(testList);
        //Check if the list of lists has one list in it.
        assertEquals(1, test.ProgramLists.size());
    }

    @Test
    void removeAList() {
        //creates a test list
        //checks it before and after removing
        //checks that a list from the list of list objects is removed
        //Behavior 7

        //Create an AllLists class.
        Lists test  = new Lists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addAList(testList);
        //Remove the list we just added.
        test.removeAList("Test List");
        //Check if there are no lists.
        assertEquals(0, test.ProgramLists.size());
    }

    @Test
    void editList() {
        //creates a test list
        //checks that a list from the arryalist of list objects gets edited to the inputted string
        //looks for edited title
        //behavior 8


        //Create an AllLists class.
        Lists test  = new Lists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addAList(testList);
        //Change the list's name to the desired new name.
        test.editList("Test List", "Test List 2");
        //Check if the list has the new name.
        assertEquals("Test List 2", test.ProgramLists.get(0).getTitle());
    }

    @Test
    void loadList() {
        //creates a test list
        //checks that a chosen list gets loaded

        //behavior 19 and 20
    }



    @Test
    void saveList() {
        //creates a test list
        //checks that the correct list is selected and saved

        //behavior 17 and 18

        //Create an AllLists class.
        Lists test  = new Lists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addAList(testList);
        //Create tasks.
        Task testTask = new Task("Test Task", "2021-07-07", true);
        Task testTask2 = new Task("Test Task 2", "2021-07-08", false);
        //Add the task.
        test.ProgramLists.get(0).addTask(testTask);
        test.ProgramLists.get(0).addTask(testTask2);
        //Export it and save return statement to know if it was successful.
        String status = test.saveList("Test List");
        //Compare if both files are the same
        assertEquals("Successful", status);
    }


}