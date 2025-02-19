package controller.subpane;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InventoryManagementFormController {

    @FXML
    private JFXComboBox cmbSelectProduct;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colStockDate;

    @FXML
    private TableColumn colStockPrice;

    @FXML
    private TableColumn colStockProduct;

    @FXML
    private TableColumn colStockQty;

    @FXML
    private DatePicker dtaDate;

    @FXML
    private Label lblStockId;

    @FXML
    private TableView tblStock;

    @FXML
    private JFXTextField txtSearchStock;

    @FXML
    private JFXTextField txtStockPrice;

    @FXML
    private JFXTextField txtStockQty;

    @FXML
    void btnAddStockOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateStockOnAction(ActionEvent event) {

    }

}
