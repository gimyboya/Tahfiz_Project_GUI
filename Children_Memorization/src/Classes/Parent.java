package Classes;

import java.util.Date;

public class Parent extends Account{
	
	private String relationship;
	private Child [] his_children ;
	public Parent() {
		super();
		relationship = null ;
		his_children = null ;
	}
	public Parent(long iD, String pass, String name, String phone, String e_mail, Date dOB, String address,
			char gender,String ralationship) {
		super(pass, name, phone, e_mail, dOB, address, gender);
		if(iD % 100000000 == 2)super.ID = iD;
		this.relationship = ralationship;
		
	}
	
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Child[] getHis_children() {
		return his_children;
	}
	public void setHis_children(Child[] his_children) {
		this.his_children = his_children;
	}
	
	//overriding 
	public void setID(long iD) {
		if(iD % 100000000 == 2)super.ID = iD;
		
		}

}
