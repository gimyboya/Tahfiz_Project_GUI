package Classes;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    public static Stage adminStage = new Stage();
    public static Stage teacherStage = new Stage();
    public static Stage parentStage = new Stage();

    public Hyperlink adminLink;
    public Button tBut;
    public Button pBut;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    public void adminLinkClicked () throws IOException {

        adminStage.initModality(Modality.APPLICATION_MODAL);

        javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Adminlogin.fxml"));
        adminStage.setTitle("Admin Login");
        adminStage.setScene(new Scene(root, 350, 200));
        adminStage.showAndWait();
    }


    public void tLogButClicked () throws IOException {

        teacherStage.initModality(Modality.APPLICATION_MODAL);

        javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Teacherlogin.fxml"));
        teacherStage.setTitle("Teacher Login");
        teacherStage.setScene(new Scene(root, 350, 200));
        teacherStage.showAndWait();
    }

    public void pLogButClicked () throws IOException {

        parentStage.initModality(Modality.APPLICATION_MODAL);

        javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Parentlogin.fxml"));
        parentStage.setTitle("Parent Login");
        parentStage.setScene(new Scene(root, 350, 200));
        parentStage.showAndWait();
    }
}