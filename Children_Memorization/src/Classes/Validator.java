package Classes;

import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.util.ArrayList;

/**
 * Created by gimy on 12/05/2016.
 */
public class Validator {

    public boolean AdminID (TextField field, String id, ArrayList<Admin> admins) {

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;

        if (id.matches("[1]\\d{4}")) {

            for (int i = 0; i < admins.size(); i++) {
                if (id.equals(admins.get(i).getAdmin_ID())) {
                    System.out.println("True");
                    result = true;
                }
            }
            System.out.println(result);
            return result;
        } else {
            field.setStyle("-fx-control-inner-background: #FA5064");
            System.out.println("False");
            return false;
        }

    }

    public boolean TeacherID (TextField field, String id){

        if (id.matches("[2]\\d{4}")){
            return true;
        }
        else{
            field.setStyle("-fx-control-inner-background: #FA5064");
            return false;
        }

    }

    public boolean ParentID (TextField field, String id){

        if (id.matches("[3]\\d{4}")){
            return true;
        }
        else{
            field.setStyle("-fx-control-inner-background: #FA5064");
            return false;
        }

    }
    
    public boolean adminpass (PasswordField field, String pass, ArrayList<Admin> admins){
        
        boolean result = false;
        
        for(int i = 0; i < admins.size(); i++){

            if(pass.equals(admins.get(i).getPass())){
                result = true;
                break;
            }
            
        }
        if (!result){
            field.setStyle("-fx-control-inner-background: #FA5064");
        }
        return result;
    }


    public boolean teacherpass (PasswordField field, String pass, ArrayList<Teacher> teachers){

        boolean result = false;

        for(int i = 0; i < teachers.size(); i++){

            if(pass.matches(teachers.get(i).getPass())){
                result = true;
                break;
            }

        }
        if (!result){
            field.setStyle("-fx-control-inner-background: #FA5064");
        }
        return result;
    }


    public boolean Parentpass (PasswordField field, String pass, ArrayList<Parent> parents){

        boolean result = false;

        for(int i = 0; i < parents.size(); i++){

            if(pass.matches(parents.get(i).getPass())){
                result = true;
                break;
            }
        }

        if (!result){
            field.setStyle("-fx-control-inner-background: #FA5064");
        }
        return result;
    }




}
