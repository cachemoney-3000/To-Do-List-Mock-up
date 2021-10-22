/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Joshua Samontanez
 */
package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField addNote;

    @FXML
    private CheckBox checkBox;

    @FXML
    private ImageView dateChange;

    @FXML
    private ImageView dueDate;

    @FXML
    private TextField itemDesc;

    @FXML
    private TextField listTitle;

    @FXML
    private MenuItem menuClose;

    @FXML
    private MenuItem menuLoad;

    @FXML
    private MenuItem menuSave;

    @FXML
    private ImageView removeItem;

    @FXML
    private ImageView removeList;

    @FXML
    private TextField search;

    @FXML
    private Label showDate;

    @FXML
    private Button tabCompleted;

    @FXML
    private Button tabIncomplete;

    @FXML
    private Button tabNew;

    @FXML
    private Button tabToday;

    @FXML
    private Button tabUpcoming;

    public void save(ActionEvent actionEvent) {
        // save the listed items in the notes
        // save it into the docs folder
        System.out.println("file saved");
    }

    public void load(ActionEvent actionEvent) {
        // load a previously saved list
        System.out.println("file is loaded");
    }

    public void close(ActionEvent actionEvent) {
        // method that will exit the application
        System.out.println("exited");
    }

    public void searchTask(KeyEvent keyEvent) {
        // perform search
        // compare characters from the key that is entered in the search bar
        // to the characters that are listed on the list
        System.out.println("searching....");
    }

    public void today(MouseEvent mouseEvent) {
        // clicked the today's tab
        // will show the list on today's tab
        System.out.println("today's tab is clicked");
    }

    public void upcoming(MouseEvent mouseEvent) {
        // clicked the upcoming tab
        // will show the list on the upcoming tab
        System.out.println("upcoming tab is clicked");
    }

    public void completed(MouseEvent mouseEvent) {
        // clicked the completed tab
        // will show all the completed tasks
        System.out.println("completed tab is clicked");
    }

    public void incomplete(MouseEvent mouseEvent) {
        // clicked the incomplete tab
        // will show all the incomplete tasks
        System.out.println("incomplete tab is clicked");
    }

    public void addList(MouseEvent mouseEvent) {
        // will add a new list
        // prompt user to enter a name for the list
        // the new created list will show up in the sidebar
        System.out.println("list added");
    }

    public void changeTitle(KeyEvent keyEvent) {
        // will change the title of a list that was created by the user
        // when entered, the new title will display
        System.out.println("title changed");
    }

    public void removeList(MouseEvent mouseEvent) {
        // will remove the list when clicked
        System.out.println("list removed");
    }

    public void editText(KeyEvent keyEvent) {
        // will edit the text inside an item
        // when entered, it will show the new text
        System.out.println("text edited");
    }

    public void changeDate(MouseEvent mouseEvent) {
        // a date picker will prompt when clicked
        // store the new date, and display it in (MMMM-YY-DD) format
        System.out.println("date changed");
    }

    public void deleteItem(MouseEvent mouseEvent) {
        // will delete an item inside the list
        System.out.println("item deleted");
    }

    public void addItem(KeyEvent keyEvent) {
        // will add am item in the list
        // picking a due date is not mandatory
            //if no due date, the label will show blank
        // when entered it will show the description and due date
        System.out.println("new item added");
    }

    public void pickDate(MouseEvent mouseEvent) {
        // date picker will pop up
        // the user can select a due date
        // after its done a new item will be added with a due date
        System.out.println("date picked");
    }
}
