package Classes;

/**
 * Created by gimy on 11/05/2016.
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class FileHandler {

    private Formatter pen;

    public void openAdmin (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Admins.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openSection (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Sections.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }



    public void openTeacher (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Teachers.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openParent (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Parents.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openChildren (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Children.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openMemorization (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Memorization.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }





    public void addSection (Section section) throws NullPointerException{

            pen.format("%s %d %d %d %d %d %d %d\n", section.getName(), section.getSection_number(), section.getNumber_of_student(), section.getRange_age_from(), section.getRange_age_to(), section.getMin_amount_of_hifz(), section.getMin_amount_of_moragah(), section.getteacherID());

    }

    public void closeFile (){
        pen.close();
    }


}
