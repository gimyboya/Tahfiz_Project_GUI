package Classes;/**
 * Created by gimy on 11/05/2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 650, 300));
        primaryStage.show();
    }


}
