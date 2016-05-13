package Classes;

import java.util.ArrayList;

/**
 * Created by gimy on 12/05/2016.
 */
public class Validator {

    
    public static int userIndex;


    public boolean AdminID (String id, ArrayList<Admin> admins) {

        boolean result = false;

        if (id.matches("[1]\\d{4}")) {

            for (int i = 0; i < admins.size(); i++) {
                if (id.equals(admins.get(i).getAdmin_ID())) {
                    result = true;
                }
            }
            return result;
        } else {
            return false;
        }

    }


    public boolean TeacherID ( String id, ArrayList<Teacher> teachers){

        boolean result = false;

        if (id.matches("[2]\\d{4}")) {

            for (int i = 0; i < teachers.size(); i++) {
                if (id.equals(teachers.get(i).getID())) {
                    result = true;
                }
            }
            return result;
        } else {
            return false;
        }

    }

    public boolean ParentID (String id, ArrayList<Parent> parents){

        boolean result = false;

        if (id.matches("[3]\\d{4}")) {

            for (int i = 0; i < parents.size(); i++) {
                if (id.equals(parents.get(i).getID())) {
                    result = true;
                }
            }
            return result;
        } else {
            return false;
        }

    }
    
    public boolean adminpass ( String pass, ArrayList<Admin> admins, int index){

        boolean result = false;


            if(pass.equals(admins.get(index).getPass())) {
                result = true;
            }
            else{
                result = false;
            }

        return result;
    }


    public boolean teacherpass (String pass, ArrayList<Teacher> teachers, int index){

        boolean result = false;


        if(pass.equals(teachers.get(index).getPass())) {
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }


    public boolean parentpass (String pass, ArrayList<Parent> parents, int index){

        boolean result = false;


        if(pass.equals(parents.get(index).getPass())) {
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }

    public static int throwAdminIndex(String id, ArrayList<Admin> admins){

        int index = 0;

        for (int i = 0; i < admins.size(); i++) {
            if (id.equals(admins.get(i).getAdmin_ID())) {
                index = i;
            }
        }

        return index;
    }

    public static int throwTeacherIndex(String id, ArrayList<Teacher> teachers){

        int index = 0;

        for (int i = 0; i < teachers.size(); i++) {
            if (id.equals(teachers.get(i).getID())) {
                index = i;
            }
        }

        return index;
    }

    public static int throwParentIndex(String id, ArrayList<Parent> parents){

        int index = 0;

        for (int i = 0; i < parents.size(); i++) {
            if (id.equals(parents.get(i).getID())) {
                index = i;
            }
        }

        return index;
    }



}
