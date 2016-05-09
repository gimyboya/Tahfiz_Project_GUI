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
	public Teacher(long iD, String pass, String name, String phone, String e_mail, Date dOB, String address,
			char gender,boolean ijaza) {
		super(pass, name, phone, e_mail, dOB, address, gender);
		if(iD % 100000000 == 2)this.ID = iD;
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
	public void setID(long iD) {
		if(iD % 100000000 == 2)super.ID = iD;
		}
	
	
}
