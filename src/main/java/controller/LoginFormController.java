package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private JFXCheckBox chkCheckbox1;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXTextField txtUsername;

    private String username = "admin";
    private String password = "1234";

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {

        if(txtUsername.getText().isEmpty()){
            new Alert(Alert.AlertType.WARNING,"Please Enter Username").show();
        }else if (txtPassword.getText().isEmpty()){
            new Alert(Alert.AlertType.WARNING,"Please Enter Password").show();

        }else{

            if(this.username.equals(txtUsername.getText()) && this.password.equals(txtPassword.getText())){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dashboard.fxml"));
                Parent load = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(load));
                stage.setTitle("Clothify System | Dashboard");
                stage.setResizable(false);
                stage.show();

                Stage window = (Stage)txtPassword.getScene().getWindow();
                window.close();
            }else{
                new Alert(Alert.AlertType.ERROR,"Username or Password").show();
            }
        }



    }

    @FXML
    void hyperRegisterOnAction(ActionEvent event) {

    }

    @FXML
    void showPswOnMousePressed(MouseEvent event) {

    }

    @FXML
    void showPswOnMouseReleased(MouseEvent event) {

    }

}
