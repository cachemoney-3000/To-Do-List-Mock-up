package baseline;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Button newPlan ;

    @FXML
    private Button delete ;

    @FXML
    private Button search ;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField searchField;

    @FXML
    private TextField textField;

    @FXML
    private TextArea planName;

    @FXML
    private TitledPane today;

    @FXML
    private TitledPane important;

    @FXML
    private TitledPane reminders;

}