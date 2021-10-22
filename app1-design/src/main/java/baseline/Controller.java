package baseline;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

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

}
