package Classes;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gimy on 12/05/2016.
 */
public class Validator {

    public boolean AdminID (TextField field, String id){

        if (id.matches("[1]\\d{4}")){
            return true;
        }
        else{
            field.setBackground(Color.red);
            return false;
        }

    }

    public boolean TeacherID (TextField field, String id){

        if (id.matches("[2]\\d{4}")){
            return true;
        }
        else{
            field.setBackground(Color.red);
            return false;
        }

    }

    public boolean ParentID (TextField field, String id){

        if (id.matches("[3]\\d{4}")){
            return true;
        }
        else{
            field.setBackground(Color.red);
            return false;
        }

    }
    
    public boolean adminpass (TextField field, String pass, ArrayList<Admin> admins){
        
        boolean result = false;
        
        for(int i = 0; i < admins.size(); i++){
          result = pass.matches(admins.get(i).getPass());
            if(result){break;}
            
        }
        return result;
    }


    public boolean teacherpass (TextField field, String pass, ArrayList<Teacher> teachers){

        boolean result = false;

        for(int i = 0; i < teachers.size(); i++){
          result = pass.matches(teachers.get(i).getPass());
            if(result){break;}

        }
        return result;
    }


    public boolean Parentpass (TextField field, String pass, ArrayList<Parent> parents){

        boolean result = false;

        for(int i = 0; i < parents.size(); i++){

            if(pass.matches(parents.get(i).getPass())){
                result = true;
                break;
            }
        }

        if (!result){
            field.setBackground(Color.red);
        }
        return result;
    }




}
