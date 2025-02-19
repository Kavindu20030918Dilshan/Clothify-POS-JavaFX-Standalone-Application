package controller.subpane;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductCatalogFormController {

    @FXML
    private JFXComboBox cmbSize;

    @FXML
    private JFXComboBox cmbSupplier;

    @FXML
    private JFXComboBox cmdCategory;

    @FXML
    private TableColumn colCategory;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colPrice;

    @FXML
    private TableColumn colProductName;

    @FXML
    private TableColumn colQty;

    @FXML
    private TableColumn colSize;

    @FXML
    private TableColumn colSupplier;

    @FXML
    private Label lblProductId;

    @FXML
    private TableView tblProduct;

    @FXML
    private JFXTextField txtPrice;

    @FXML
    private JFXTextField txtProductname;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtSearchProduct;

    @FXML
    void btnAddProductOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateProductOnAction(ActionEvent event) {

    }

}
