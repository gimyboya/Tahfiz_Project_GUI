package Classes;

/**
 * Created by gimy on 11/05/2016.
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class FileHandler {

    private Formatter pen;
    private Scanner file;

    public void openAdminFile (){ // to open a file for reading
        try{
            file = new Scanner(new File("Admin.records"));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openAdminFormatter (){ // to open a file for writing

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Admins.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openSectionFile (){
        try{
            file = new Scanner(new File("Sections.records"));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openSectionFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Sections.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openTeacherFile (){
        try{
            file = new Scanner(new File("Teachers.records"));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openTeacherFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Teachers.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openParentFile (){
        try{
            file = new Scanner(new File("Parents.records"));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openParentFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Parents.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openChildrenFile (){
        try{
            file = new Scanner(new File("Children.records"));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openChildrenFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Children.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openMemorizationFile (){
        try{
            file = new Scanner(new File("Memorization.records"));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openMemorizationFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Memorization.records", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }



    public void readAdmin (ArrayList<Admin> admins){

        while(file.hasNext()){
            int counter = 0;
            admins.get(counter).setAdmin_ID(file.nextInt());
            admins.get(counter).setName(file.next());
            admins.get(counter).setPass(file.next());
            counter++;
        }

    }



    public void addSection (Section section) throws NullPointerException{

            pen.format("%s %d %d %d %d %d %d %d\n", section.getName(), section.getSection_number(), section.getNumber_of_student(), section.getRange_age_from(), section.getRange_age_to(), section.getMin_amount_of_hifz(), section.getMin_amount_of_moragah(), section.getteacherID());

    }

    //@Overload
    public void addSection (ArrayList<Section> section) throws NullPointerException{

        for (int i = 0; i < section.size() ; i++){
            pen.format("%s %d %d %d %d %d %d %d\n", section.get(i).getName(), section.get(i).getSection_number(), section.get(i).getNumber_of_student(), section.get(i).getRange_age_from(), section.get(i).getRange_age_to(), section.get(i).getMin_amount_of_hifz(), section.get(i).getMin_amount_of_moragah(), section.get(i).getteacherID());

        }
    }

    public void closeFormatter (){
        pen.close();
    }

    public void closeFile (){
        file.close();
    }





}
