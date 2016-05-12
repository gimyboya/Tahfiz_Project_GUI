package Classes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by gimy on 11/05/2016.
 */
public class AdminloginController {

    public Hyperlink goBackA;
    public Button login;
    public TextField adminID;
    public PasswordField pass;



    public void goBack () {

        Stage stage = (Stage) goBackA.getScene().getWindow();
        stage.close();
    }

    public void login(ActionEvent actionEvent) {
        Validator validator = new Validator();

        validator.AdminID(adminID,adminID.getText());
        validator.adminpass(pass,pass.getPromptText(),Arrays.globaladmins);
    }
}
