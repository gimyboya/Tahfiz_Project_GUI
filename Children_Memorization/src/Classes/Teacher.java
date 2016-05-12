package Classes;

import java.util.Date;

public class Teacher extends Account{
	
	private boolean ijaza ;
	private Section [] classes_in_charge ;

	public Teacher() {
		super();
		ijaza= false ;
		classes_in_charge = null ;
	}
	public Teacher(String iD, String pass, String name, String phone, String e_mail, String address,boolean ijaza) {
		super(pass, name, phone, e_mail, address);
		if(checkTeacherID(ID)){
			this.ID = ID;
		}
		else {
			OkAlert.display("Error", "Teacher account can't be created check ID");
			throw new IllegalArgumentException();

		}
		this.ijaza = ijaza;
		
	}
	
	public boolean isIjaza() {
		return ijaza;
	}
	public void setIjaza(boolean ijaza) {
		this.ijaza = ijaza;
	}
	public Section[] getClasses_in_charge() {
		return classes_in_charge;
	}
	public void setClasses_in_charge(Section[] classes_in_charge) {
		this.classes_in_charge = classes_in_charge;
	}
	
	//overriding
	public void setID(int iD) {
		if(checkTeacherID(ID)){
			super.ID = ID;
		}
		else {
			OkAlert.display("Error", "Wrong ID, ID should start with 3");
			throw new IllegalArgumentException();

		}
	}

	public boolean checkTeacherID (String id){

		return id.matches("[2]\\d{4}");
	}
}
