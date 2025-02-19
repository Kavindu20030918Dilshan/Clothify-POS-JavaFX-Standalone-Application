package controller;

import controller.subpane.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class DashboardFormController implements Initializable {

    @FXML
    private AnchorPane ancMain;

    @FXML
    private Label lblDate;

    @FXML
    void btnBackupAndRestoreOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/backupAndRestore.fxml"));
        Parent load = fxmlLoader.load();
        BackupAndRestoreFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    @FXML
    void btnDashboardPaneOnAction(ActionEvent event) throws IOException {
        setDashboardPane();
    }

    @FXML
    void btnInventoryManagementPaneOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/inventoryManagement.fxml"));
        Parent load = fxmlLoader.load();
        InventoryManagementFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    @FXML
    void btnOrderDetailsPaneOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/orderDetails.fxml"));
        Parent load = fxmlLoader.load();
        OrderDetailsFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    @FXML
    void btnProductCatalogPaneOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/productCatalog.fxml"));
        Parent load = fxmlLoader.load();
        ProductCatalogFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    @FXML
    void btnReportsPaneOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/reports.fxml"));
        Parent load = fxmlLoader.load();
        ReportsFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    @FXML
    void btnSupplierManagementPaneOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/supplierManagement.fxml"));
        Parent load = fxmlLoader.load();
        SupplierMgtFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    @FXML
    void btnUserManagementPaneOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/userManagement.fxml"));
        Parent load = fxmlLoader.load();
        UserMgtFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }

    public void setDate(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        lblDate.setText(format);
    }

    private void setDashboardPane() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/subPanes/dashboardPane.fxml"));
        Parent load = fxmlLoader.load();
        DashboardPaneFormController controller = fxmlLoader.getController();

        ancMain.getChildren().clear();
        ancMain.getChildren().add(load);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            setDashboardPane();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setDate();
    }
}
