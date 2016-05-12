package Classes;/**
 * Created by gimy on 11/05/2016.
 */

import java.io.File;
import java.util.ArrayList;

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
        ArrayList<Admin> admin = new ArrayList<>();
        ArrayList<Section> section = new ArrayList<>();
        ArrayList<Teacher> teacher = new ArrayList<>();
        ArrayList<Parent> parent = new ArrayList<>();
        ArrayList<Child> child = new ArrayList<>();
        ArrayList<Memorazation> memo = new ArrayList<>();

        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 650, 300));

        primaryStage.show();
    }


}
