package controller.subpane;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OrderDetailsFormController {

    public Label lblProductsTotal;
    @FXML
    private JFXComboBox cmbCustomerMobile;

    @FXML
    private JFXComboBox cmbPaymentMethod;

    @FXML
    private JFXComboBox cmbSelectProduct;

    @FXML
    private JFXComboBox cmbUser;

    @FXML
    private TableColumn colAmount;

    @FXML
    private TableColumn colCustomerMobile;

    @FXML
    private TableColumn colDate;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colPaymentMethod;

    @FXML
    private TableColumn colProduct;

    @FXML
    private TableColumn colQty;

    @FXML
    private TableColumn colUser;

    @FXML
    private DatePicker dateOrder;

    @FXML
    private Label lblUserID;

    @FXML
    private TableView<?> tblOrder;

    @FXML
    private JFXTextField txtAmount;

    @FXML
    private JFXTextField txtOrderSearch;

    @FXML
    private JFXTextField txtQty;

    @FXML
    void btnAddOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOrderOnAction(ActionEvent event) {

    }

}
