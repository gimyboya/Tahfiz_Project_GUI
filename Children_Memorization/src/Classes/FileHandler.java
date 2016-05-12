package Classes;

/**
 * Created by gimy on 11/05/2016.
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class FileHandler {

    private Formatter pen;
    private Scanner scanner;
    private File file;

    public void openAdminFile (){ // to open a file for reading
        try{
            file = new File("Admin.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
                OkAlert.display("Missing File", "The File you are trying to open doesn't exist but have been created");
            }else{
                System.out.println("Admin file already exists.");
            }

            scanner = new Scanner(file);
        }
        catch (IOException e){




        }
    }

    public void openAdminFormatter (){ // to open a file for writing

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Admins.txt", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openSectionFile (){
        try{
            file = new File("Sections.txt");
            scanner = new Scanner(file);
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openSectionFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Sections.txt", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openTeacherFile (){
        try{
            file = new File("Teachers.txt");
            scanner = new Scanner(file);
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openTeacherFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Teachers.txt", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openParentFile (){
        try{
            file = new File("Parents.txt");
            scanner = new Scanner(file);
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openParentFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Parents.txt", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openChildrenFile (){
        try{
            file = new File("Children.txt");
            scanner = new Scanner(file);
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openChildrenFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Children.txt", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }

    public void openMemorizationFile (){
        try{
            file = new File("Memorization.txt");
            scanner = new Scanner(file);
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");

        }
    }

    public void openMemorizationFormatter (){

        try{
            pen = new Formatter(new BufferedWriter(new FileWriter("Memorization.txt", true)));
        }
        catch (Exception e){

            OkAlert.display("Missing File", "The File you are trying to open doesn't exist and have been created");
        }
    }



    public void readAdmin (ArrayList<Admin> admins){

        int counter = 0;
        while(scanner.hasNext()){

            try{
                Admin temp = new Admin(Integer.parseInt(scanner.next()), scanner.next(),scanner.next());
                admins.add(temp);


            }
            catch (IndexOutOfBoundsException e){

            }
            System.out.println("Iteration " + counter);
            counter++;
        }

    }

    public void addAdmin (Admin admin) throws NullPointerException{

        pen.format("%d %s %s\n", admin.getAdmin_ID(), admin.getName(), admin.getPass());

    }

    //@Overload
    public void addAdmin (ArrayList<Admin> admin) throws NullPointerException{

        for (int i = 0; i < admin.size() ; i++) {
            pen.format("%d %s %s\n", admin.get(i).getAdmin_ID(), admin.get(i).getName(), admin.get(i).getPass());
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
        scanner.close();
    }





}
