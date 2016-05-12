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

        Stages.Window = primaryStage;

        FileHandler fileHandler = new FileHandler();

        fileHandler.openAdminFile();
        fileHandler.readAdmin(Arrays.globaladmins);
        fileHandler.closeFile();



        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 650, 300));
        primaryStage.show();

        int size = Arrays.globaladmins.size();
        System.out.println("the size is " + size);

        for(int i = 0; i < Arrays.globaladmins.size(); i++){

            String id = Arrays.globaladmins.get(i).getAdmin_ID();
            String name = Arrays.globaladmins.get(i).getName();
            String pass = Arrays.globaladmins.get(i).getPass();
            System.out.println( id + " " + name + " " + pass );
        }




    }


}
