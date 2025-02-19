package controller.subpane;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SupplierMgtFormController {

    @FXML
    private JFXComboBox cmbCompany;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colSupplierCompany;

    @FXML
    private TableColumn colSupplierEmail;

    @FXML
    private TableColumn colSupplierName;

    @FXML
    private Label lblSupplierID;

    @FXML
    private TableView tblSupplier;

    @FXML
    private JFXTextField txtSearchSupplier;

    @FXML
    private JFXTextField txtSupplierEmail;

    @FXML
    private JFXTextField txtSupplierName;

    @FXML
    void btnAddStockOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateStockOnAction(ActionEvent event) {

    }

    @FXML
    void btnclearOnAction(ActionEvent event) {

    }

}
