package Classes;

import java.util.Date;

public class Account {
	private long ID ;
	private String pass; 
	private String name ;
	private String phone ;
	private String e_mail;
	private Date DOB; 
	private String address;
	private char gender ;
	//image
	
	public Account() {
		ID = 00000000;
		pass = null;
		name = null;
		phone = null;
		e_mail = null;
		DOB = null ;
		address = null;
		gender = 'm' ;
	// image = 
	}
	
	
	public Account(long iD, String pass, String name, String phone, String e_mail, Date dOB, String address,
			char gender) {
		ID = iD;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.e_mail = e_mail;
		DOB = dOB;
		this.address = address;
		this.gender = gender;
	}


	public long getID() {
		return ID;
	}
	
	public void setID(long iD) {
		ID = iD;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
