package baseline;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextArea addTask;

    @FXML
    private ListView<?> checkBox;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button deleteList;

    @FXML
    private Button enter;

    @FXML
    private Button important;

    @FXML
    private Button newList;

    @FXML
    private Button search;

    @FXML
    private TextField searchField;

    @FXML
    private Text taskDate;

    @FXML
    private TextField taskName;

    @FXML
    private Button today;

    @FXML
    private Button upcoming;

}
