package controller.subpane;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserMgtFormController {

    @FXML
    private JFXComboBox cmbUserType;

    @FXML
    private TableColumn colCompany;

    @FXML
    private TableColumn colEmail;

    @FXML
    private TableColumn colFullName;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colPassword;

    @FXML
    private TableColumn colUserType;

    @FXML
    private Label lblUserID;

    @FXML
    private TableView tblUser;

    @FXML
    private JFXTextField txtCompany;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtFullName;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXTextField txtUserSearch;

    @FXML
    void btnAddUserOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateUserOnAction(ActionEvent event) {

    }

}
