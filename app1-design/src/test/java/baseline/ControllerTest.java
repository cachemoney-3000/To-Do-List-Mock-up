package baseline;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void save() {
        // will run a test if a file is created
        // if the file name is created and have words inside it then it runs correctly
    }

    @Test
    void load() {
        // will run a test to check if it can read a file
        // if it can read a file without a problem, then it works
    }


    @Test
    void today() {
        // will run a test to see if it shows all the item inside this tab
        // will only show all the tasks or items inside it
    }

    @Test
    void completed() {
        // will run a test to see if it will sort out all the completed tasks
        // will only show the completed tasks
    }

    @Test
    void incomplete() {
        // will run a test to see if it will sort out all the incomplete tasks
        // will only show the incomplete items
    }

    @Test
    void addList() {
        // will run a test to see if it will add a new list
        // the new list is supposed to pop up on the sidebar
        // it should have a name
        // the name should be editable
    }

    @Test
    void changeTitle() {
        // will run a test to check if we can edit the title
        // the old title should change into a new title
        // it should show the new title when done
        // it will show the new text when we press "enter" on keyboard
    }

    @Test
    void removeList() {
        // will run a test to check if we can remove a list
        // the list should not show in the sidebar after it is removed
        // all the item inside that list should be removed as well
    }

    @Test
    void editText() {
        // will run a test to check if the task description is editable
        // after the edit, the new text should appear
        // it will show the new text when we press "enter" on keyboard
    }

    @Test
    void changeDate() {
        // will run a test to check if we can change the due date
        // the new due date should show on the task
    }

    @Test
    void deleteItem() {
        // will run a test to check if we can delete a task
        // the deleted task should not appear after it is deleted
    }

    @Test
    void addItem() {
        // will run a test to check if we can add a task
        // the user should be able to see the new task if they press "enter"
        // if there are no text inside the textfield. it will not create the item
    }

    @Test
    void pickDate() {
        // will run a test to check if we can pick a due date
        // the due date should be added on the description after we add an item
    }
}