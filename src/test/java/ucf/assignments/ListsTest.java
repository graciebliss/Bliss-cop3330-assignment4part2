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

        Lists test  = new Lists();
        List testList = new List("Test List");
        test.addAList(testList);
        assertEquals(1, test.ProgramLists.size());
    }

    @Test
    void removeAList() {
        //creates a test list
        //checks it before and after removing
        //checks that a list from the list of list objects is removed
        //Behavior 7

        Lists test  = new Lists();
        List testList = new List("Test List");
        test.addAList(testList);
        test.removeAList("Test List");
        assertEquals(0, test.ProgramLists.size());
    }

    @Test
    void editList() {
        //creates a test list
        //checks that a list from the arryalist of list objects gets edited to the inputted string
        //looks for edited title
        //behavior 8


        Lists test  = new Lists();
        List testList = new List("Test List");
        test.addAList(testList);
        test.editList("Test List", "Test List 2");
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

        Lists test  = new Lists();
        List testList = new List("Test List");
        test.addAList(testList);
        Task testTask = new Task("Test Task", "2021-07-07", true);
        Task testTask2 = new Task("Test Task 2", "2021-07-08", false);
        test.ProgramLists.get(0).addTask(testTask);
        test.ProgramLists.get(0).addTask(testTask2);
        String status = test.saveList("Test List");
        assertEquals("Successful", status);
    }


}