package Classes;/**
 * Created by gimy on 11/05/2016.
 */



public class Main  {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        fileHandler.openAdminFile();
        fileHandler.readAdmin(Arrays.globaladmins);
        fileHandler.closeFile();

        fileHandler.openSectionFile();
        fileHandler.readSection(Arrays.globalsections);
        fileHandler.closeFile();


        fileHandler.openTeacherFile();
        fileHandler.readTeacher(Arrays.globalteachers);
        fileHandler.closeFile();

        fileHandler.openParentFile();
        fileHandler.readParent(Arrays.globalparents);
        fileHandler.closeFile();

        fileHandler.openChildrenFile();
        fileHandler.readChild(Arrays.globalchildren);
        fileHandler.closeFile();

        System.out.println(Arrays.globaladmins.size());
        System.out.println(Arrays.globalteachers.size());
        System.out.println(Arrays.globalsections.size());
        System.out.println(Arrays.globalchildren.size());
        System.out.println(Arrays.globalparents.size());

        for(int i = 0; i < Arrays.globaladmins.size(); i++){

            String id = Arrays.globaladmins.get(i).getAdmin_ID();
            String name = Arrays.globaladmins.get(i).getName();
            String pass = Arrays.globaladmins.get(i).getPass();
            System.out.println( id + " " + name + " " + pass );
        }



        for(int i = 0; i < Arrays.globalteachers.size(); i++){

            String id = Arrays.globalteachers.get(i).getID();
            String pass = Arrays.globalteachers.get(i).getName();
            String name = Arrays.globalteachers.get(i).getPass();
            String phone = Arrays.globalteachers.get(i).getPhone();
            String email = Arrays.globalteachers.get(i).getE_mail();
            String addres = Arrays.globalteachers.get(i).getAddress();
            Boolean ijaza = Arrays.globalteachers.get(i).isIjaza();
            int sections = Arrays.globalteachers.get(i).getClasses_in_charge();
            System.out.println( id + " " + name + " " + pass + " " + phone + " " + email + " " + addres + " " + ijaza + " " + sections );
        }


    }




}
