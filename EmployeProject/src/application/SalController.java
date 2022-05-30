package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SalController {

    @FXML
    private AnchorPane btnListeTout;

    @FXML
    private TextField Nom;

    @FXML
    private TextField email;

    @FXML
    private TextField recut;

    @FXML
    private TextField salaire;

    @FXML
    private TextField mat;

    @FXML
    private RadioButton btnE;

    @FXML
    private RadioButton BtnV;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> matColmn;

    @FXML
    private TableColumn<?, ?> nameColmn;

    @FXML
    private TableColumn<?, ?> emailColmn;

    @FXML
    private TableColumn<?, ?> recColmn;

    @FXML
    private TableColumn<?, ?> salColmn;

    @FXML
    private Button btnDelet;

    @FXML
    private Button BtnLister;

    @FXML
    private Button BtnQuite;

    @FXML
    private Button btnMax;

    @FXML
    private Button btnMix;

    @FXML
    private Button BTNDet;

    @FXML
    private Button BtnExport;

    @FXML
    private Button BtnListeAn;

    @FXML
    private TextField first;

    @FXML
    private TextField last;

    @FXML
    private Button BtnBetwwen;

    @FXML
    void Add(ActionEvent event) {

    }

    @FXML
    void Delete(ActionEvent event) {

    }

    @FXML
    void Details(ActionEvent event) {

    }

    @FXML
    void Export(ActionEvent event) {

    }

    @FXML
    void ListAnn(ActionEvent event) {

    }

    @FXML
    void ListerBetw(ActionEvent event) {

    }

    @FXML
    void ListerCat(ActionEvent event) {

    }

    @FXML
    void ListerMax(ActionEvent event) {

    }

    @FXML
    void ListerMin(ActionEvent event) {

    }

    @FXML
    void Quite(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }
}